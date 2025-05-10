package com.ydl.nmis.schedule.mapper;


import com.ydl.nmis.schedule.domain.NmisSchePlan;

import java.util.List;

/**
 * 护理排班计划Mapper接口
 *
 * @author ydl
 * @date 2025-03-28
 */
public interface NmisSchePlanMapper
{
    /**
     * 查询护理排班计划
     *
     * @param id 护理排班计划主键
     * @return 护理排班计划
     */
    public NmisSchePlan selectNmisSchePlanById(String id);

    /**
     * 查询护理排班计划列表
     *
     * @param nmisSchePlan 护理排班计划
     * @return 护理排班计划集合
     */
    public List<NmisSchePlan> selectNmisSchePlanList(NmisSchePlan nmisSchePlan);

    /**
     * 新增护理排班计划
     *
     * @param nmisSchePlan 护理排班计划
     * @return 结果
     */
    public int insertNmisSchePlan(NmisSchePlan nmisSchePlan);

    /**
     * 修改护理排班计划
     *
     * @param nmisSchePlan 护理排班计划
     * @return 结果
     */
    public int updateNmisSchePlan(NmisSchePlan nmisSchePlan);

    /**
     * 删除护理排班计划
     *
     * @param id 护理排班计划主键
     * @return 结果
     */
    public int deleteNmisSchePlanById(String id);

    /**
     * 批量删除护理排班计划
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteNmisSchePlanByIds(String[] ids);

    /**
     * 发布排班计划
     * @param id
     */
    public int publishSchedule(String id);
}
