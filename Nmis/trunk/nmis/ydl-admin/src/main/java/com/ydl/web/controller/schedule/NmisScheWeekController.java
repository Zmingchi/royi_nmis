package com.ydl.web.controller.schedule;

import com.ydl.common.core.controller.BaseController;
import com.ydl.common.core.domain.AjaxResult;
import com.ydl.common.exception.ServiceException;
import com.ydl.common.utils.DateUtils;
import com.ydl.common.utils.bean.BeanUtils;
import com.ydl.common.utils.uuid.IdUtils;
import com.ydl.nmis.base.domain.NmisDeptDict;
import com.ydl.nmis.base.service.INmisDeptDictService;
import com.ydl.nmis.hr.domain.NmisHrUser;
import com.ydl.nmis.hr.service.INmisHrUserService;
import com.ydl.nmis.schedule.domain.NmisScheDetail;
import com.ydl.nmis.schedule.domain.NmisScheMaster;
import com.ydl.nmis.schedule.domain.NmisSchePlan;
import com.ydl.nmis.schedule.dto.*;
import com.ydl.nmis.schedule.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/schedule/week")
public class NmisScheWeekController extends BaseController
{
    @Autowired
    private INmisScheMasterService scheMasterService;
    @Autowired
    private INmisSchePlanService schePlanService;
    @Autowired
    private INmisScheDetailService scheDetailService;
    @Autowired
    private INmisScheGroupUserService scheGroupUserService;
    @Autowired
    private INmisDeptDictService deptDictService;
    @Autowired
    private INmisHrUserService hrUserService;

    @GetMapping("/list")
    public SchePlan getSchedule(
            @RequestParam(required = true) String deptId, //传入查询科室
            @RequestParam(required = false) String startDate,  //排版开始时间
            @RequestParam(required = false) String endDate,  //排班终止时间
            @RequestParam(required = false) String status  //nmis_sche_plan状态 1.已保存 2.已发布
    ) {
       if(deptId == null || deptId.isEmpty()){
           throw new ServiceException("科室ID不能为空！");
       }
        NmisDeptDict deptDict = deptDictService.selectNmisDeptDictByCode(deptId);
       //新建护士排班对象，将get值传入对象  再进行查找
        NmisSchePlan query = new NmisSchePlan();
        query.setDeptId(deptId);
        query.setBeginDate(startDate);
        query.setEndDate(endDate);
        query.setStatus(status);
       List<NmisSchePlan> planList = schePlanService.selectNmisSchePlanList(query);
       //判断planList是否为空 ，如果为空，创建planList空对象，
        // 包括plan下的List<ScheUserGroup> groups（人员分组），
        // ScheUserGroup下的List<ScheUser> groupUsers
       if(CollectionUtils.isEmpty(planList)){

           SchePlan schePlan = new SchePlan();  //创建schePlan空对象
           if("2".equals(status)){
               return schePlan;
           }
           schePlan.setDeptId(deptId);
           schePlan.setDeptName(deptDict.getDeptName());
           schePlan.setBeginDate(startDate);
           schePlan.setEndDate(endDate);
           schePlan.setScheduleType("1");  //排班类型定义为 1.科室排班 2.全院排班
           schePlan.setPeriodType("1");   //排班周期定义为 1.周排班 2.月排班

           schePlan.setPeriodId(String.valueOf(DateUtils.getWeekNo(startDate)));  //周期ID,周排班时代表第几周/

           //根据科室查询该科室下的排班组用户
           List<DeptScheGroupUser> deptGroupUsers = scheGroupUserService.selectDeptScheGroupUserList(deptId);
           //根据GroupId 进行人员分组
           Map<ScheGroupKey, List<DeptScheGroupUser>> groupedResult = deptGroupUsers.stream()
                   .collect(Collectors.groupingBy(
                           item -> new ScheGroupKey(item.getGroupId(), item.getGroupName())
                   ));

           // 对分组结果按 groupId 正序排序
           List<Map.Entry<ScheGroupKey, List<DeptScheGroupUser>>> sortedResult = groupedResult.entrySet().stream()
                   .sorted(Map.Entry.comparingByKey()) // 按照 GroupKey 的自然顺序排序
                   .collect(Collectors.toList());
           //新建一个 人员分组对象 列表
           List<ScheUserGroup> groups = new ArrayList<>();
           //将空对象赋给护士排班
           schePlan.setGroups(groups);
           //遍历分组结果，将分组结果赋给人员分组对象 
           //ScheGroupKey（包含 groupId + groupName）
           //该分组下的护士成员集合（List<DeptScheGroupUser>）
           for (Map.Entry<ScheGroupKey, List<DeptScheGroupUser>> entry : sortedResult) {
               ScheGroupKey key = entry.getKey();  //获取分组标识
               //新建一个人员分组对象
               ScheUserGroup group = new ScheUserGroup();
               //将分组标识赋给人员分组对象
               group.setGroupId(key.getGroupId());
               group.setGroupName(key.getGroupName());
               List<ScheUser> groupUsers = new ArrayList<>();
               //遍历该分组下的护士成员集合，将其赋给人员分组对象 130行group.setGroupUsers(groupUsers);
               //同时新建一个 排班详情对象 列表，将其赋给人员分组对象
               int p = 1;
               for (DeptScheGroupUser master : entry.getValue()) {
                   ScheUser scheUser = new ScheUser();

                   master.setSeqNo(String.valueOf(p++));

                   //将该分组下的护士成员集合中的nurseId，nurseName，nurseLevel，enterDate元素赋给排班详情对象
                   BeanUtils.copyBeanProp(scheUser, master);
                   //将附过值得scheUser对象赋给人员分组对象
                   groupUsers.add(scheUser);
                   Date beginDate = DateUtils.parseDate(startDate);
                   for (int i = 1; i <= 7; i++)  {
                       ScheDetail detailTmp = new ScheDetail();
                       detailTmp.setScheDate(DateUtils.addDays(beginDate, i-1));
                       if(i == 1){
                           scheUser.setDay1(detailTmp);
                       }else if(i == 2){
                           scheUser.setDay2(detailTmp);
                       }else if(i == 3){
                           scheUser.setDay3(detailTmp);
                       }else if(i == 4){
                           scheUser.setDay4(detailTmp);
                       }else if(i == 5){
                           scheUser.setDay5(detailTmp);
                       }else if(i == 6){
                           scheUser.setDay6(detailTmp);
                       }else{
                           scheUser.setDay7(detailTmp);
                       }
                   }
               }
               group.setGroupUsers(groupUsers);
               groups.add(group);
           }
           return schePlan;
       }else{
           //如果planList不为空，根据planList中的planId查询nmis_sche_master，nmis_sche_detail
           //将查询结果赋给schePlan对象 get(0)是因为planList中只有一个元素
           NmisSchePlan plan = planList.get(0);

           //新建sche_master对象，将planId赋给sche_master对象
           NmisScheMaster masterQuery = new NmisScheMaster();
           masterQuery.setPlanId(plan.getId());

           //根据planId查询nmis_sche_master，nmis_sche_detail
           //将planId查询到的护士 赋给scheMasterList  --人员本周排班详情
           List<NmisScheMaster> masterList = scheMasterService.selectNmisScheMasterList(masterQuery);
/*           for(NmisScheMaster master : masterList) {
               String pp = master.getNurseId();
               NmisHrUser hrUser = hrUserService.selectNmisHrUserById(Long.valueOf(pp));
               master.setNurseLevel(hrUser.getNurseLevel());
           }*/
           NmisScheDetail detailQuery = new NmisScheDetail();
           detailQuery.setPlanId(plan.getId());
           //将planId查询到的排班详情 赋给scheDetailList  --人员当天排班详情 
           List<NmisScheDetail> detailList = scheDetailService.selectNmisScheDetailList(detailQuery);

           SchePlan schePlan = new SchePlan();
           BeanUtils.copyBeanProp(schePlan, plan);

           Map<ScheGroupKey, List<NmisScheMaster>> groupedResult = masterList.stream()
                   .collect(Collectors.groupingBy(
                           item -> new ScheGroupKey(item.getGroupId(), item.getGroupName())
                   ));

           // 对分组结果按 groupId 正序排序
           List<Map.Entry<ScheGroupKey, List<NmisScheMaster>>> sortedResult = groupedResult.entrySet().stream()
                   .sorted(Map.Entry.comparingByKey()) // 按照 GroupKey 的自然顺序排序
                   .collect(Collectors.toList());

           List<ScheUserGroup> groups = new ArrayList<>();
           schePlan.setGroups(groups);
           for (Map.Entry<ScheGroupKey, List<NmisScheMaster>> entry : sortedResult) {
               ScheGroupKey key = entry.getKey();

               ScheUserGroup group = new ScheUserGroup();
               group.setGroupId(key.getGroupId());
               group.setGroupName(key.getGroupName());

               List<ScheUser> groupUsers = new ArrayList<>();
               int i = 1;
               for (NmisScheMaster master : entry.getValue()) {
                   ScheUser scheUser = new ScheUser();

                   /*从实体对象NmisScheMaster到DTO对象ScheUser的转换
                   **省去了创建ScheUser dao的过程，直接调用NmisScheMaster的dao方法，
                   */
                   String pp = master.getNurseId();
                   NmisHrUser hrUser = hrUserService.selectNmisHrUserById(Long.valueOf(pp));
                   master.setNurseLevel(hrUser.getNurseLevel());
                   BeanUtils.copyBeanProp(scheUser, master);
                   scheUser.setSeqNo(String.valueOf(i++));
                   groupUsers.add(scheUser);
                   // scheUser中添加day1到day7
                   List<NmisScheDetail> filterDetailList = detailList.stream().filter(x->scheUser.getId().equals(x.getSheduleId()))
                                    .sorted(Comparator.comparing(NmisScheDetail::getScheDate))
                                   .collect(Collectors.toList());
                   int idx = 1;
                   for (NmisScheDetail detail : filterDetailList) {
                       ScheDetail detailTmp = new ScheDetail();
                       BeanUtils.copyBeanProp(detailTmp, detail);
                       if(idx == 1){
                           scheUser.setDay1(detailTmp);
                       }else if(idx == 2){
                           scheUser.setDay2(detailTmp);
                       }else if(idx == 3){
                           scheUser.setDay3(detailTmp);
                       }else if(idx == 4){
                           scheUser.setDay4(detailTmp);
                       }else if(idx == 5){
                           scheUser.setDay5(detailTmp);
                       }else if(idx == 6){
                           scheUser.setDay6(detailTmp);
                       }else if(idx == 7){
                           scheUser.setDay7(detailTmp);
                       }
                       idx++;
                   }
               }
               group.setGroupUsers(groupUsers);
               groups.add(group);
           }
           return schePlan;
       }
    }

    @PutMapping("/publish/{id}")
    public AjaxResult publishSchedule(@PathVariable("id") String id) {

        NmisSchePlan plan = schePlanService.selectNmisSchePlanById(id);
        if(plan == null){
            throw  new ServiceException("排班记录不存在，无法进行发布操作！");
        }
        if("2".equals(plan.getStatus())){
            throw  new ServiceException("排班记录已发布，无法进行修改操作！");
        }
        //将nmis_sche_plan的status设置为2，即已发布
        int affectedRows = schePlanService.publishSchedule(id);
        if(affectedRows == 0){
            throw  new ServiceException("仅保存状态的排班才能发布！");
        }
        return AjaxResult.success();
    }

/**
 * 新增排班信息
 * @param schePlan
 * @return
 */
    @PostMapping("/add")
    @Transactional
    public AjaxResult SaveScheduleWeek(@RequestBody SchePlan schePlan){
        String planId = schePlan.getId();
        if(planId == null || planId.isEmpty()){
            addScheduleWeek(schePlan);
        }else{
            updateScheduleWeek(schePlan);
        }
        return AjaxResult.success();
    }

    private void addScheduleWeek(SchePlan schePlan) {
        NmisSchePlan plan = new NmisSchePlan();
        BeanUtils.copyBeanProp(plan, schePlan);
        // 生成一个 8 位的 UUID 作为计划 ID
        String id = IdUtils.fastSimpleUUID().substring(0, 8);
        plan.setId(id);
        plan.setStatus("1");
        List<NmisScheMaster> masterList = new ArrayList<>();
        List<NmisScheDetail> detailList = new ArrayList<>();
        List<ScheUserGroup> groups = schePlan.getGroups();
        for(ScheUserGroup group : groups){
            List<ScheUser> groupUsers = group.getGroupUsers();
            for(ScheUser user : groupUsers)
            {
                NmisScheMaster master = new NmisScheMaster();
                BeanUtils.copyBeanProp(master, user);
                master.setPlanId(plan.getId());
                master.setId(IdUtils.fastSimpleUUID().substring(0, 8));
                master.setGroupId(group.getGroupId());
                master.setGroupName(group.getGroupName());
                masterList.add(master);
                for(int i = 0; i < 7; i++){
                    NmisScheDetail detail = new NmisScheDetail();
                    // 用于存储用户每天的排班详情
                    ScheDetail day = null;
                    if(i == 0){
                        day = user.getDay1();
                    }else if(i == 1){
                        day = user.getDay2();
                    }else if(i == 2){
                        day = user.getDay3();
                    }else if(i == 3){
                        day = user.getDay4();
                    }else if(i == 4){
                        day = user.getDay5();
                    }else if(i == 5){
                        day = user.getDay6();
                    }else {
                        day = user.getDay7();
                    }
                    BeanUtils.copyBeanProp(detail,day);
                    detail.setSheduleId(master.getId());
                    detail.setPlanId(plan.getId());
                    detail.setNurseId(master.getNurseId());
                    detail.setNurseName(master.getNurseName());
                    // 生成一个 8 位的 UUID 作为 NmisScheDetail 实体对象的 ID
                    detail.setId(IdUtils.fastSimpleUUID().substring(0, 8));
                    detailList.add(detail);
                }
            }
        }
        String userId = getUserId().toString();
        String userName = getUsername();
//        String userId = "333";
//        String userName = "测试";
        Date now = new Date();
        plan.setDeptName(plan.getDeptName());
        plan.setCreateId(userId);
        plan.setCreator(userName);
        plan.setCreateDate(now);
        plan.setModifyId(userId);
        plan.setModifier(userName);
        plan.setModifyDate(now);
        schePlanService.insertNmisSchePlan(plan);
        for(NmisScheMaster master : masterList)
        {
            master.setDeptId(plan.getDeptId());
            master.setDeptName(plan.getDeptName());
            master.setCreateId(userId);
            master.setCreator(userName);
            master.setCreateDate(now);
            master.setModifyId(userId);
            master.setModifier(userName);
            master.setModifyDate(now);
            scheMasterService.insertNmisScheMaster(master);
        }
        for (NmisScheDetail detail : detailList)
        {
            detail.setDeptId(plan.getDeptId());
            detail.setDeptName(plan.getDeptName());
            detail.setCreateId(userId);
            detail.setCreator(userName);
            detail.setCreateDate(now);
            detail.setModifyId(userId);
            detail.setModifier(userName);
            detail.setModifyDate(now);
            scheDetailService.insertNmisScheDetail(detail);
        }
    }

    /**
     * 更新排版信息
     * @param schePlan
     */
    private void updateScheduleWeek(SchePlan schePlan) {
        String planId = schePlan.getId();
        NmisSchePlan plan = schePlanService.selectNmisSchePlanById(planId);
        BeanUtils.copyBeanProp(plan, schePlan);
        List<NmisScheMaster> masterList = new ArrayList<>();
        List<NmisScheDetail> detailList = new ArrayList<>();
        List<ScheUserGroup> groups = schePlan.getGroups();
        for(ScheUserGroup group : groups){
            List<ScheUser> groupUsers = group.getGroupUsers();
            for(ScheUser user : groupUsers)
            {
                NmisScheMaster master = scheMasterService.selectNmisScheMasterById(user.getId());
                BeanUtils.copyBeanProp(master, user);
                masterList.add(master);
                for(int i = 0; i < 7; i++){
                    ScheDetail day = null;
                    if(i == 0){
                        day = user.getDay1();
                    }else if(i == 1){
                        day = user.getDay2();
                    }else if(i == 2){
                        day = user.getDay3();
                    }else if(i == 3){
                        day = user.getDay4();
                    }else if(i == 4){
                        day = user.getDay5();
                    }else if(i == 5){
                        day = user.getDay6();
                    }else {
                        day = user.getDay7();
                    }
                    NmisScheDetail detail = scheDetailService.selectNmisScheDetailById(day.getId());
                    BeanUtils.copyBeanProp(detail,day);
                    detailList.add(detail);
                }
            }
        }
        String userId = getUserId().toString();
        String userName = getUsername();
//        String userId = "333";
//        String userName = "测试";
        Date now = new Date();
        plan.setModifyId(userId);
        plan.setModifier(userName);
        plan.setModifyDate(now);
        schePlanService.updateNmisSchePlan(plan);
        for(NmisScheMaster master : masterList)
        {
            master.setModifyId(userId);
            master.setModifier(userName);
            master.setModifyDate(now);
            scheMasterService.updateNmisScheMaster(master);
        }
        for (NmisScheDetail detail : detailList)
        {
            detail.setModifyId(userId);
            detail.setModifier(userName);
            detail.setModifyDate(now);
            scheDetailService.updateNmisScheDetail(detail);
        }
    }
}
