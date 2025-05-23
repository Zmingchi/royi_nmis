package com.ydl.quartz.cronjob;


import com.ydl.common.core.domain.entity.DeptDict;
import com.ydl.common.core.domain.entity.StaffDict;
import com.ydl.common.core.domain.entity.SysDept;
import com.ydl.common.core.domain.entity.SysUser;
import com.ydl.common.utils.SecurityUtils;
import com.ydl.system.mapper.DeptDictMapper;
import com.ydl.system.mapper.StaffDictMapper;
import com.ydl.system.mapper.SysDeptMapper;
import com.ydl.system.mapper.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.Filter;
import java.util.*;
import java.util.stream.Collectors;

@RestController
@Component("cronJob")
public class RyCronJob {
    @Qualifier("springSecurityFilterChain")
    @Autowired
    private Filter springSecurityFilterChain;

    @Autowired
    private StaffDictMapper staffDictMapper;
    @Autowired
    private SysUserMapper sysUserMapper;
    @Autowired
    private DeptDictMapper deptDictMapper;
    @Autowired
    private SysDeptMapper sysDeptMapper;


    public void userUpdateJob()
    {

        // 1. 查询staff_dict表中所有数据
        List<StaffDict> allStaff = staffDictMapper.selectStaffList(new StaffDict());

        // 2. 查询sys_user表中所有userId
        List<SysUser> allUsers = sysUserMapper.selectUserList(new SysUser());
        Set<Long> existingUserIds = allUsers.stream()
                .map(SysUser::getUserId)
                .collect(Collectors.toSet());

        // 3. 找出staff_dict中存在但sys_user中不存在的记录
        List<StaffDict> newStaffs = allStaff.stream()
                .filter(staff -> !existingUserIds.contains(staff.getId()))
                .collect(Collectors.toList());

        // 4. 根据时间查询，更新经过his更改的人员数据
        for(StaffDict staff : allStaff){
            boolean isValueExist1 = allUsers.stream().anyMatch(obj-> obj.getUserId().equals(staff.getId()));
            if(isValueExist1){
                SysUser newUser2 = sysUserMapper.selectUserById(staff.getId());
                //判断更新时间是否为空//更新时间是否大于his更新时间
                if(newUser2.getUpdateTime() ==null || newUser2.getUpdateTime().getTime()<staff.getUpdateTime().getTime()){
                    SysUser newUser1 = convertStaffToUser(staff);
                    newUser1.setUpdateTime(staff.getUpdateTime());
                    sysUserMapper.updateUser(newUser1);
                }
            }
        }
        // 5. 将新增的staff数据转换为sys_user并保存
        for (StaffDict staff : newStaffs) {
            SysUser newUser = convertStaffToUser(staff);
            try {
                sysUserMapper.insertUser(newUser);
                System.out.println(newUser.getUserId());
            } catch (Exception e) {
                // 记录日志，继续处理下一条
                System.err.println("插入用户失败: " + staff.getId() + ", 错误: " + e.getMessage());
            }
        }
    }


    public void deptUpdateJob(){

        // 1. 查询dept_dict表中所有数据
        List<DeptDict> allDept = deptDictMapper.selectDeptDict(new DeptDict());


        // 2. 查询sys_dept表中所有deptId
        List<SysDept> allDepts = sysDeptMapper.selectDeptList(new SysDept());
        Set<String> existingDeptIds = allDepts.stream()
                .map(SysDept::getDeptId)
                .collect(Collectors.toSet());

        Integer maxNum = allDepts.stream()
                .mapToInt(SysDept::getOrderNum)
                .max().getAsInt();

        // 3. 根据时间查询，更新经过his更改的科室数据
        for(DeptDict dept : allDept){
            boolean isValueExist2 = allDepts.stream().anyMatch(obj-> obj.getDeptId().equals(dept.getDeptCode()));
            if(isValueExist2){
                SysDept newDept2 = sysDeptMapper.selectDeptById(dept.getDeptCode());
                if(newDept2.getUpdateTime()==null || newDept2.getUpdateTime().getTime() < dept.getModifyDate().getTime()){
                    SysDept newDept1 = convertHisDeptToDept(dept);
                    newDept1.setUpdateTime(dept.getModifyDate());
                    sysDeptMapper.updateDept(newDept1);
                }
            }
        }

        // 4. 找出dept_dict中存在但sys_dept中不存在的记录
        List<DeptDict> newDepts = allDept.stream()
                .filter(dept -> !existingDeptIds.contains(dept.getDeptCode()))
                .collect(Collectors.toList());

        // 5. 将新增的dept数据转换为sys_dept并保存
        for(DeptDict dept : newDepts) {
            maxNum++;
            dept.setOrderNum(maxNum);
            SysDept newDept = convertHisDeptToDept(dept);
            try {
                sysDeptMapper.insertDept2(newDept);
                System.out.println(newDept.getDeptId());
            } catch (Exception e) {
                // 记录日志，继续处理下一条
                System.err.println("插入用户失败: " + dept.getDeptCode() + ", 错误: " + e.getMessage());
            }
        }

    }

    /**
     * 将StaffDict对象转换为SysUser对象
     * @param staff StaffDict对象
     * @return 转换后的SysUser对象
     */
    private SysUser convertStaffToUser(StaffDict staff) {
        SysUser user = new SysUser();
        user.setUserId(staff.getId());      // id对应userId
        user.setPassword(staff.getPassword() != null ? SecurityUtils.encryptPassword(staff.getPassword()) : SecurityUtils.encryptPassword("admin123"));
        if ("女".equals(staff.getSex())){
            user.setSex("1");
        } else{
            user.setSex("0");
        }      // sex对应
        user.setEmail(staff.getEmail() != null ? staff.getEmail() : "");
        user.setNickName(staff.getName() != null ? staff.getName() : "");
        user.setDeptId(staff.getDeptCode() != null ? staff.getDeptCode() : null);
        user.setUserName(staff.getUserName() != null ? staff.getUserName() : String.valueOf(staff.getId()));
        user.setCreateTime(staff.getCreateTime() != null ? staff.getCreateTime() : new Date());
        user.setUpdateTime(new Date());    // 设置更新时间
        user.setStatus("1");              // 假设1表示活跃用户

        return user;
    }

    /**
     * 将DeptDict对象转换为SysDept对象
     * @param dept DeptDict
     * @return 转换后的DeptDict对象
     */

    private SysDept convertHisDeptToDept(DeptDict dept) {
        SysDept sdept = new SysDept();
        sdept.setDeptId(dept.getDeptCode());
        sdept.setDeptName(dept.getDeptName());
        if(dept.getModifyDate()==null){
            sdept.setCreateTime(new Date());
        }
        sdept.setParentId("101");
        sdept.setAncestors("0,100,101");
        sdept.setCreateBy("admin");
        sdept.setOrderNum(dept.getOrderNum());
        return sdept;
    }
}
