package com.ydl.nmis.schedule.service.impl;


import java.util.List;

import com.ydl.nmis.schedule.domain.NmisScheUserGroup;
import com.ydl.nmis.schedule.mapper.NmisScheUserGroupMapper;
import com.ydl.nmis.schedule.service.INmisScheUserGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 护理排班分组Service业务层处理
 *
 * @author ydl
 * @date 2025-03-19
 */
@Service
public class NmisScheUserGroupServiceImpl implements INmisScheUserGroupService
{
    @Autowired
    private NmisScheUserGroupMapper nmisScheUserGroupMapper;

    /**
     * 查询护理排班分组
     *
     * @param id 护理排班分组主键
     * @return 护理排班分组
     */
    @Override
    public NmisScheUserGroup selectNmisScheUserGroupById(String id)
    {
        return nmisScheUserGroupMapper.selectNmisScheUserGroupById(id);
    }

    /**
     * 查询护理排班分组列表
     *
     * @param nmisScheUserGroup 护理排班分组
     * @return 护理排班分组
     */
    @Override
    public List<NmisScheUserGroup> selectNmisScheUserGroupList(NmisScheUserGroup nmisScheUserGroup)
    {
        return nmisScheUserGroupMapper.selectNmisScheUserGroupList(nmisScheUserGroup);
    }

    /**
     * 新增护理排班分组
     *
     * @param nmisScheUserGroup 护理排班分组
     * @return 结果
     */
    @Override
    public int insertNmisScheUserGroup(NmisScheUserGroup nmisScheUserGroup)
    {
        return nmisScheUserGroupMapper.insertNmisScheUserGroup(nmisScheUserGroup);
    }

    /**
     * 修改护理排班分组
     *
     * @param nmisScheUserGroup 护理排班分组
     * @return 结果
     */
    @Override
    public int updateNmisScheUserGroup(NmisScheUserGroup nmisScheUserGroup)
    {
        return nmisScheUserGroupMapper.updateNmisScheUserGroup(nmisScheUserGroup);
    }

    /**
     * 批量删除护理排班分组
     *
     * @param ids 需要删除的护理排班分组主键
     * @return 结果
     */
    @Override
    public int deleteNmisScheUserGroupByIds(String[] ids)
    {
        return nmisScheUserGroupMapper.deleteNmisScheUserGroupByIds(ids);
    }

    /**
     * 删除护理排班分组信息
     *
     * @param id 护理排班分组主键
     * @return 结果
     */
    @Override
    public int deleteNmisScheUserGroupById(String id)
    {
        return nmisScheUserGroupMapper.deleteNmisScheUserGroupById(id);
    }
}

