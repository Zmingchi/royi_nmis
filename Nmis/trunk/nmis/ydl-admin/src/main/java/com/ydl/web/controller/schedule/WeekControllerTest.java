package com.ydl.web.controller.schedule;


import com.ydl.common.core.controller.BaseController;
import com.ydl.common.exception.ServiceException;
import com.ydl.common.utils.DateUtils;
import com.ydl.nmis.base.domain.NmisDeptDict;
import com.ydl.nmis.base.service.INmisDeptDictService;
import com.ydl.nmis.schedule.domain.NmisSchePlan;
import com.ydl.nmis.schedule.dto.DeptScheGroupUser;
import com.ydl.nmis.schedule.dto.ScheGroupKey;
import com.ydl.nmis.schedule.dto.SchePlan;
import com.ydl.nmis.schedule.dto.ScheUserGroup;
import com.ydl.nmis.schedule.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Weekdetial/text")
public class WeekControllerTest extends BaseController {

    @Autowired
    private INmisSchePlanService schePlanService;
    @Autowired
    private INmisScheMasterService scheMasterService;
    @Autowired
    private INmisScheDetailService scheDetailService;
    @Autowired
    private INmisScheGroupUserService scheGroupUserService;
    @Autowired
    private INmisDeptDictService deptDictService;

    @GetMapping("/list")
    public SchePlan test(@RequestParam(required = true ) String deptId,
                         @RequestParam(required = false ) String startDate,
                         @RequestParam(required = false ) String endDate) {

        if (deptId == null || deptId.isEmpty()) {
            throw new ServiceException("科室ID不能为空！");
        }
        NmisDeptDict deptDict = deptDictService.selectNmisDeptDictByCode(deptId) ;
        NmisSchePlan query = new NmisSchePlan() ;
        query.setDeptId(deptId) ;
        query.setBeginDate(startDate) ;
        query.setEndDate(endDate) ;
        List<NmisSchePlan> planList = schePlanService.selectNmisSchePlanList(query) ;
        if (planList == null || planList.isEmpty()) {
            SchePlan schePlan = new SchePlan();
            schePlan.setDeptId(deptId);
            schePlan.setBeginDate(startDate);
            schePlan.setEndDate(endDate);
            schePlan.setDeptName(deptDict.getDeptName());

            schePlan.setPeriodId(String.valueOf(DateUtils.getWeekNo(startDate)));
            List<DeptScheGroupUser> deptGroupUsers = scheGroupUserService.selectDeptScheGroupUserList(deptId);
            Map<ScheGroupKey, List<DeptScheGroupUser>> groupedResult = deptGroupUsers.stream()
                    .collect(Collectors.groupingBy(
                            item ->new ScheGroupKey(item.getGroupId(), item.getGroupName())
                    ));

            //对分组结果按 groupId 正序排列
            List<Map.Entry<ScheGroupKey, List<DeptScheGroupUser>>> sortedResult = groupedResult.entrySet().stream()
                    .sorted(Map.Entry.comparingByKey()).collect(Collectors.toList()); //按照groupkey顺序排列
            List<ScheUserGroup> groups = new ArrayList<>();


        }
        return null;
    }
}
