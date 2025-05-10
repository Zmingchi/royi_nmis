package com.ydl.nmis.schedule.service;


import com.ydl.nmis.schedule.domain.NmisScheUsers;

import java.util.List;

/**
 * 参与排班用户Service接口
 *
 * @author ydl
 * @date 2025-03-29
 */
public interface INmisScheUsersService
{
    /**
     * 查询参与排班用户
     *
     * @param id 参与排班用户主键
     * @return 参与排班用户
     */
    public NmisScheUsers selectNmisScheUsersById(String id);

    /**
     * 查询参与排班用户列表
     *
     * @param nmisScheUsers 参与排班用户
     * @return 参与排班用户集合
     */
    public List<NmisScheUsers> selectNmisScheUsersList(NmisScheUsers nmisScheUsers);

    /**
     * 新增参与排班用户
     *
     * @param nmisScheUsers 参与排班用户
     * @return 结果
     */
    public int insertNmisScheUsers(NmisScheUsers nmisScheUsers);

    /**
     * 修改参与排班用户
     *
     * @param nmisScheUsers 参与排班用户
     * @return 结果
     */
    public int updateNmisScheUsers(NmisScheUsers nmisScheUsers);

    /**
     * 批量删除参与排班用户
     *
     * @param ids 需要删除的参与排班用户主键集合
     * @return 结果
     */
    public int deleteNmisScheUsersByIds(String[] ids);

    /**
     * 删除参与排班用户信息
     *
     * @param id 参与排班用户主键
     * @return 结果
     */
    public int deleteNmisScheUsersById(String id);
}

