package com.ydl.plan.service;

import java.util.List;
import com.ydl.plan.domain.NmisWorkPlan;

/**
 * 工作计划Service接口
 * 
 * @author ydl
 * @date 2025-03-25
 */
public interface INmisWorkPlanService 
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
     * 批量删除工作计划
     * 
     * @param ids 需要删除的工作计划主键集合
     * @return 结果
     */
    public int deleteNmisWorkPlanByIds(Long[] ids);

    /**
     * 删除工作计划信息
     * 
     * @param id 工作计划主键
     * @return 结果
     */
    public int deleteNmisWorkPlanById(Long id);

    /**
     * 提交工作计划
     * @param nmisWorkPlan
     * @return
     */
    int commitNmisWorkPlan(NmisWorkPlan nmisWorkPlan);

    /**
     * 撤销提交工作计划
     * @param nmisWorkPlan
     * @return
     */
    int uncommitNmisWorkPlan(NmisWorkPlan nmisWorkPlan);

    /**
     * 审批提交工作计划
     * @param nmisWorkPlan
     * @return
     */
    int approveNmisWorkPlan(NmisWorkPlan nmisWorkPlan);

    /**
     * 取消审批提交工作计划
     * @param nmisWorkPlan
     * @return
     */
    int unApproveNmisWorkPlan(NmisWorkPlan nmisWorkPlan);
}
