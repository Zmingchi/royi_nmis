package com.ydl.plan.mapper;

import java.util.List;
import com.ydl.plan.domain.NmisWorkPlan;

/**
 * 工作计划Mapper接口
 * 
 * @author ydl
 * @date 2025-03-25
 */
public interface NmisWorkPlanMapper 
{
    /**
     * 查询工作计划
     * 
     * @param id 工作计划主键
     * @return 工作计划
     */
    public NmisWorkPlan selectNmisWorkPlanById(Long id);

    /**
     * 查询工作计划列表
     * 
     * @param nmisWorkPlan 工作计划
     * @return 工作计划集合
     */
    public List<NmisWorkPlan> selectNmisWorkPlanList(NmisWorkPlan nmisWorkPlan);

    /**
     * 新增工作计划
     * 
     * @param nmisWorkPlan 工作计划
     * @return 结果
     */
    public int insertNmisWorkPlan(NmisWorkPlan nmisWorkPlan);

    /**
     * 修改工作计划
     * 
     * @param nmisWorkPlan 工作计划
     * @return 结果
     */
    public int updateNmisWorkPlan(NmisWorkPlan nmisWorkPlan);

    /**
     * 删除工作计划
     * 
     * @param id 工作计划主键
     * @return 结果
     */
    public int deleteNmisWorkPlanById(Long id);

    /**
     * 批量删除工作计划
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteNmisWorkPlanByIds(Long[] ids);
}
