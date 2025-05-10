package com.ydl.system.service;

import java.util.List;
import com.ydl.system.domain.SysUserDept;
import com.ydl.system.domain.vo.SysDeptUserDisplay;
import com.ydl.system.domain.vo.SysUserDeptDisplay;

/**
 * 用户与科室对应Service接口
 * 
 * @author ydl
 * @date 2025-03-27
 */
public interface ISysUserDeptService 
{
    /**
     * 查询用户与科室对应
     * 
     * @param id 用户与科室对应主键
     * @return 用户与科室对应
     */
    public SysUserDept selectSysUserDeptById(String id);

    /**
     * 查询用户与科室对应列表
     * 
     * @param sysUserDept 用户与科室对应
     * @return 用户与科室对应集合
     */
    public List<SysUserDept> selectSysUserDeptList(SysUserDept sysUserDept);

    /**
     * 新增用户与科室对应
     * 
     * @param sysUserDept 用户与科室对应
     * @return 结果
     */
    public int insertSysUserDept(SysUserDept sysUserDept);

    /**
     * 修改用户与科室对应
     * 
     * @param sysUserDept 用户与科室对应
     * @return 结果
     */
    public int updateSysUserDept(SysUserDept sysUserDept);

    /**
     * 批量删除用户与科室对应
     * 
     * @param ids 需要删除的用户与科室对应主键集合
     * @return 结果
     */
    public int deleteSysUserDeptByIds(String[] ids);

    /**
     * 删除用户与科室对应信息
     * 
     * @param id 用户与科室对应主键
     * @return 结果
     */
    public int deleteSysUserDeptById(String id);


    List<SysUserDeptDisplay> selectSysUserDeptListByUserId(String userId);

    List<SysDeptUserDisplay> getUserListByDeptCode(String deptCode);
}
