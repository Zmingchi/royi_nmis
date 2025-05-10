package com.ydl.qc.mapper;

import java.util.List;
import com.ydl.qc.domain.NmisQcChkPlan;

/**
 * 护理质量检查计划Mapper接口
 * 
 * @author ydl
 * @date 2025-05-08
 */
public interface NmisQcChkPlanMapper 
{
    /**
     * 查询护理质量检查计划
     * 
     * @param id 护理质量检查计划主键
     * @return 护理质量检查计划
     */
    public NmisQcChkPlan selectNmisQcChkPlanById(String id);

    /**
     * 查询护理质量检查计划列表
     * 
     * @param nmisQcChkPlan 护理质量检查计划
     * @return 护理质量检查计划集合
     */
    public List<NmisQcChkPlan> selectNmisQcChkPlanList(NmisQcChkPlan nmisQcChkPlan);

    /**
     * 新增护理质量检查计划
     * 
     * @param nmisQcChkPlan 护理质量检查计划
     * @return 结果
     */
    public int insertNmisQcChkPlan(NmisQcChkPlan nmisQcChkPlan);

    /**
     * 修改护理质量检查计划
     * 
     * @param nmisQcChkPlan 护理质量检查计划
     * @return 结果
     */
    public int updateNmisQcChkPlan(NmisQcChkPlan nmisQcChkPlan);

    /**
     * 删除护理质量检查计划
     * 
     * @param id 护理质量检查计划主键
     * @return 结果
     */
    public int deleteNmisQcChkPlanById(String id);

    /**
     * 批量删除护理质量检查计划
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteNmisQcChkPlanByIds(String[] ids);
}
