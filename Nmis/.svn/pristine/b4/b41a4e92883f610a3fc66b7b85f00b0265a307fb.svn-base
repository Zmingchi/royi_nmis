package com.ydl.nmis.schedule.service.impl;


import java.util.List;

import com.ydl.nmis.schedule.domain.NmisSchePlan;
import com.ydl.nmis.schedule.mapper.NmisSchePlanMapper;
import com.ydl.nmis.schedule.service.INmisSchePlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 护理排班计划Service业务层处理
 *
 * @author ydl
 * @date 2025-03-28
 */
@Service
public class NmisSchePlanServiceImpl implements INmisSchePlanService
{
    @Autowired
    private NmisSchePlanMapper nmisSchePlanMapper;

    /**
     * 查询护理排班计划
     *
     * @param id 护理排班计划主键
     * @return 护理排班计划
     */
    @Override
    public NmisSchePlan selectNmisSchePlanById(String id)
    {
        return nmisSchePlanMapper.selectNmisSchePlanById(id);
    }

    /**
     * 查询护理排班计划列表
     *
     * @param nmisSchePlan 护理排班计划
     * @return 护理排班计划
     */
    @Override
    public List<NmisSchePlan> selectNmisSchePlanList(NmisSchePlan nmisSchePlan)
    {
        return nmisSchePlanMapper.selectNmisSchePlanList(nmisSchePlan);
    }

    /**
     * 新增护理排班计划
     *
     * @param nmisSchePlan 护理排班计划
     * @return 结果
     */
    @Override
    public int insertNmisSchePlan(NmisSchePlan nmisSchePlan)
    {
        return nmisSchePlanMapper.insertNmisSchePlan(nmisSchePlan);
    }

    /**
     * 修改护理排班计划
     *
     * @param nmisSchePlan 护理排班计划
     * @return 结果
     */
    @Override
    public int updateNmisSchePlan(NmisSchePlan nmisSchePlan)
    {
        return nmisSchePlanMapper.updateNmisSchePlan(nmisSchePlan);
    }

    /**
     * 批量删除护理排班计划
     *
     * @param ids 需要删除的护理排班计划主键
     * @return 结果
     */
    @Override
    public int deleteNmisSchePlanByIds(String[] ids)
    {
        return nmisSchePlanMapper.deleteNmisSchePlanByIds(ids);
    }

    /**
     * 删除护理排班计划信息
     *
     * @param id 护理排班计划主键
     * @return 结果
     */
    @Override
    public int deleteNmisSchePlanById(String id)
    {
        return nmisSchePlanMapper.deleteNmisSchePlanById(id);
    }

    @Override
    public int publishSchedule(String id){
        return nmisSchePlanMapper.publishSchedule(id);
    }
}

