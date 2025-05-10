package com.ydl.nmis.schedule.service.impl;


import java.util.List;

import com.ydl.nmis.schedule.domain.NmisScheUsers;
import com.ydl.nmis.schedule.mapper.NmisScheUsersMapper;
import com.ydl.nmis.schedule.service.INmisScheUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 参与排班用户Service业务层处理
 *
 * @author ydl
 * @date 2025-03-29
 */
@Service
public class NmisScheUsersServiceImpl implements INmisScheUsersService
{
    @Autowired
    private NmisScheUsersMapper nmisScheUsersMapper;

    /**
     * 查询参与排班用户
     *
     * @param id 参与排班用户主键
     * @return 参与排班用户
     */
    @Override
    public NmisScheUsers selectNmisScheUsersById(String id)
    {
        return nmisScheUsersMapper.selectNmisScheUsersById(id);
    }

    /**
     * 查询参与排班用户列表
     *
     * @param nmisScheUsers 参与排班用户
     * @return 参与排班用户
     */
    @Override
    public List<NmisScheUsers> selectNmisScheUsersList(NmisScheUsers nmisScheUsers)
    {
        return nmisScheUsersMapper.selectNmisScheUsersList(nmisScheUsers);
    }

    /**
     * 新增参与排班用户
     *
     * @param nmisScheUsers 参与排班用户
     * @return 结果
     */
    @Override
    public int insertNmisScheUsers(NmisScheUsers nmisScheUsers)
    {
        return nmisScheUsersMapper.insertNmisScheUsers(nmisScheUsers);
    }

    /**
     * 修改参与排班用户
     *
     * @param nmisScheUsers 参与排班用户
     * @return 结果
     */
    @Override
    public int updateNmisScheUsers(NmisScheUsers nmisScheUsers)
    {
        return nmisScheUsersMapper.updateNmisScheUsers(nmisScheUsers);
    }

    /**
     * 批量删除参与排班用户
     *
     * @param ids 需要删除的参与排班用户主键
     * @return 结果
     */
    @Override
    public int deleteNmisScheUsersByIds(String[] ids)
    {
        return nmisScheUsersMapper.deleteNmisScheUsersByIds(ids);
    }

    /**
     * 删除参与排班用户信息
     *
     * @param id 参与排班用户主键
     * @return 结果
     */
    @Override
    public int deleteNmisScheUsersById(String id)
    {
        return nmisScheUsersMapper.deleteNmisScheUsersById(id);
    }
}
