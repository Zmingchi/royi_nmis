package com.ydl.nmis.schedule.service.impl;


import java.util.List;

import com.ydl.nmis.schedule.domain.NmisScheGroupUser;
import com.ydl.nmis.schedule.dto.DeptScheGroupUser;
import com.ydl.nmis.schedule.mapper.NmisScheGroupUserMapper;
import com.ydl.nmis.schedule.service.INmisScheGroupUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 护理排班组用户Service业务层处理
 *
 * @author ydl
 * @date 2025-03-19
 */
@Service
public class NmisScheGroupUserServiceImpl implements INmisScheGroupUserService
{
    @Autowired
    private NmisScheGroupUserMapper nmisScheGroupUserMapper;

    /**
     * 查询护理排班组用户
     *
     * @param id 护理排班组用户主键
     * @return 护理排班组用户
     */
    @Override
    public NmisScheGroupUser selectNmisScheGroupUserById(String id)
    {
        return nmisScheGroupUserMapper.selectNmisScheGroupUserById(id);
    }

    /**
     * 查询护理排班组用户列表
     *
     * @param nmisScheGroupUser 护理排班组用户
     * @return 护理排班组用户
     */
    @Override
    public List<NmisScheGroupUser> selectNmisScheGroupUserList(NmisScheGroupUser nmisScheGroupUser)
    {
        return nmisScheGroupUserMapper.selectNmisScheGroupUserList(nmisScheGroupUser);
    }

    public List<DeptScheGroupUser> selectDeptScheGroupUserList(String deptId){
        return nmisScheGroupUserMapper.selectDeptScheGroupUserList(deptId);
    }
    /**
     * 新增护理排班组用户
     *
     * @param nmisScheGroupUser 护理排班组用户
     * @return 结果
     */
    @Override
    public int insertNmisScheGroupUser(NmisScheGroupUser nmisScheGroupUser)
    {
        return nmisScheGroupUserMapper.insertNmisScheGroupUser(nmisScheGroupUser);
    }

    /**
     * 修改护理排班组用户
     *
     * @param nmisScheGroupUser 护理排班组用户
     * @return 结果
     */
    @Override
    public int updateNmisScheGroupUser(NmisScheGroupUser nmisScheGroupUser)
    {
        return nmisScheGroupUserMapper.updateNmisScheGroupUser(nmisScheGroupUser);
    }

    /**
     * 批量删除护理排班组用户
     *
     * @param ids 需要删除的护理排班组用户主键
     * @return 结果
     */
    @Override
    public int deleteNmisScheGroupUserByIds(String[] ids)
    {
        return nmisScheGroupUserMapper.deleteNmisScheGroupUserByIds(ids);
    }

    /**
     * 删除护理排班组用户信息
     *
     * @param id 护理排班组用户主键
     * @return 结果
     */
    @Override
    public int deleteNmisScheGroupUserById(String id)
    {
        return nmisScheGroupUserMapper.deleteNmisScheGroupUserById(id);
    }
}

