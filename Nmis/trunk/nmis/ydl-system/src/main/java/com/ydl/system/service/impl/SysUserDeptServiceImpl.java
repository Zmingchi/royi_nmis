package com.ydl.system.service.impl;

import java.util.List;

import com.ydl.system.domain.vo.SysDeptUserDisplay;
import com.ydl.system.domain.vo.SysUserDeptDisplay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ydl.system.mapper.SysUserDeptMapper;
import com.ydl.system.domain.SysUserDept;
import com.ydl.system.service.ISysUserDeptService;

/**
 * 用户与科室对应Service业务层处理
 * 
 * @author ydl
 * @date 2025-03-27
 */
@Service
public class SysUserDeptServiceImpl implements ISysUserDeptService 
{
    @Autowired
    private SysUserDeptMapper sysUserDeptMapper;

    /**
     * 查询用户与科室对应
     * 
     * @param id 用户与科室对应主键
     * @return 用户与科室对应
     */
    @Override
    public SysUserDept selectSysUserDeptById(String id)
    {
        return sysUserDeptMapper.selectSysUserDeptById(id);
    }

    public List<SysUserDeptDisplay> selectSysUserDeptListByUserId(String userId){
        return sysUserDeptMapper.selectSysUserDeptListByUserId(userId);
    }

    public List<SysDeptUserDisplay> getUserListByDeptCode(String deptCode){
        return sysUserDeptMapper.getUserListByDeptCode(deptCode);
    }


    /**
     * 查询用户与科室对应列表
     * 
     * @param sysUserDept 用户与科室对应
     * @return 用户与科室对应
     */
    @Override
    public List<SysUserDept> selectSysUserDeptList(SysUserDept sysUserDept)
    {
        return sysUserDeptMapper.selectSysUserDeptList(sysUserDept);
    }

    /**
     * 新增用户与科室对应
     * 
     * @param sysUserDept 用户与科室对应
     * @return 结果
     */
    @Override
    public int insertSysUserDept(SysUserDept sysUserDept)
    {
        return sysUserDeptMapper.insertSysUserDept(sysUserDept);
    }

    /**
     * 修改用户与科室对应
     * 
     * @param sysUserDept 用户与科室对应
     * @return 结果
     */
    @Override
    public int updateSysUserDept(SysUserDept sysUserDept)
    {
        return sysUserDeptMapper.updateSysUserDept(sysUserDept);
    }

    /**
     * 批量删除用户与科室对应
     * 
     * @param ids 需要删除的用户与科室对应主键
     * @return 结果
     */
    @Override
    public int deleteSysUserDeptByIds(String[] ids)
    {
        return sysUserDeptMapper.deleteSysUserDeptByIds(ids);
    }

    /**
     * 删除用户与科室对应信息
     * 
     * @param id 用户与科室对应主键
     * @return 结果
     */
    @Override
    public int deleteSysUserDeptById(String id)
    {
        return sysUserDeptMapper.deleteSysUserDeptById(id);
    }
}
