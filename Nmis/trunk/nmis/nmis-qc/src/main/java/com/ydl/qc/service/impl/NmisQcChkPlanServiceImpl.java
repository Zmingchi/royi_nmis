package com.ydl.qc.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ydl.qc.mapper.NmisQcChkPlanMapper;
import com.ydl.qc.domain.NmisQcChkPlan;
import com.ydl.qc.service.INmisQcChkPlanService;

/**
 * 护理质量检查计划Service业务层处理
 * 
 * @author ydl
 * @date 2025-05-08
 */
@Service
public class NmisQcChkPlanServiceImpl implements INmisQcChkPlanService 
{
    @Autowired
    private NmisQcChkPlanMapper nmisQcChkPlanMapper;

    /**
     * 查询护理质量检查计划
     * 
     * @param id 护理质量检查计划主键
     * @return 护理质量检查计划
     */
    @Override
    public NmisQcChkPlan selectNmisQcChkPlanById(String id)
    {
        return nmisQcChkPlanMapper.selectNmisQcChkPlanById(id);
    }

    /**
     * 查询护理质量检查计划列表
     * 
     * @param nmisQcChkPlan 护理质量检查计划
     * @return 护理质量检查计划
     */
    @Override
    public List<NmisQcChkPlan> selectNmisQcChkPlanList(NmisQcChkPlan nmisQcChkPlan)
    {
        return nmisQcChkPlanMapper.selectNmisQcChkPlanList(nmisQcChkPlan);
    }

    /**
     * 新增护理质量检查计划
     * 
     * @param nmisQcChkPlan 护理质量检查计划
     * @return 结果
     */
    @Override
    public int insertNmisQcChkPlan(NmisQcChkPlan nmisQcChkPlan)
    {
        return nmisQcChkPlanMapper.insertNmisQcChkPlan(nmisQcChkPlan);
    }

    /**
     * 修改护理质量检查计划
     * 
     * @param nmisQcChkPlan 护理质量检查计划
     * @return 结果
     */
    @Override
    public int updateNmisQcChkPlan(NmisQcChkPlan nmisQcChkPlan)
    {
        return nmisQcChkPlanMapper.updateNmisQcChkPlan(nmisQcChkPlan);
    }

    /**
     * 批量删除护理质量检查计划
     * 
     * @param ids 需要删除的护理质量检查计划主键
     * @return 结果
     */
    @Override
    public int deleteNmisQcChkPlanByIds(String[] ids)
    {
        return nmisQcChkPlanMapper.deleteNmisQcChkPlanByIds(ids);
    }

    /**
     * 删除护理质量检查计划信息
     * 
     * @param id 护理质量检查计划主键
     * @return 结果
     */
    @Override
    public int deleteNmisQcChkPlanById(String id)
    {
        return nmisQcChkPlanMapper.deleteNmisQcChkPlanById(id);
    }
}
