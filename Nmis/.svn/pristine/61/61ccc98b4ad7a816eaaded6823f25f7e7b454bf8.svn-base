package com.ydl.qc.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ydl.qc.mapper.NmisQcChkPlanGrpMapper;
import com.ydl.qc.domain.NmisQcChkPlanGrp;
import com.ydl.qc.service.INmisQcChkPlanGrpService;

/**
 * 质量检查计划用户分组Service业务层处理
 * 
 * @author ydl
 * @date 2025-05-08
 */
@Service
public class NmisQcChkPlanGrpServiceImpl implements INmisQcChkPlanGrpService 
{
    @Autowired
    private NmisQcChkPlanGrpMapper nmisQcChkPlanGrpMapper;

    /**
     * 查询质量检查计划用户分组
     * 
     * @param id 质量检查计划用户分组主键
     * @return 质量检查计划用户分组
     */
    @Override
    public NmisQcChkPlanGrp selectNmisQcChkPlanGrpById(String id)
    {
        return nmisQcChkPlanGrpMapper.selectNmisQcChkPlanGrpById(id);
    }

    /**
     * 查询质量检查计划用户分组列表
     * 
     * @param nmisQcChkPlanGrp 质量检查计划用户分组
     * @return 质量检查计划用户分组
     */
    @Override
    public List<NmisQcChkPlanGrp> selectNmisQcChkPlanGrpList(NmisQcChkPlanGrp nmisQcChkPlanGrp)
    {
        return nmisQcChkPlanGrpMapper.selectNmisQcChkPlanGrpList(nmisQcChkPlanGrp);
    }

    /**
     * 新增质量检查计划用户分组
     * 
     * @param nmisQcChkPlanGrp 质量检查计划用户分组
     * @return 结果
     */
    @Override
    public int insertNmisQcChkPlanGrp(NmisQcChkPlanGrp nmisQcChkPlanGrp)
    {
        return nmisQcChkPlanGrpMapper.insertNmisQcChkPlanGrp(nmisQcChkPlanGrp);
    }

    /**
     * 修改质量检查计划用户分组
     * 
     * @param nmisQcChkPlanGrp 质量检查计划用户分组
     * @return 结果
     */
    @Override
    public int updateNmisQcChkPlanGrp(NmisQcChkPlanGrp nmisQcChkPlanGrp)
    {
        return nmisQcChkPlanGrpMapper.updateNmisQcChkPlanGrp(nmisQcChkPlanGrp);
    }

    /**
     * 批量删除质量检查计划用户分组
     * 
     * @param ids 需要删除的质量检查计划用户分组主键
     * @return 结果
     */
    @Override
    public int deleteNmisQcChkPlanGrpByIds(String[] ids)
    {
        return nmisQcChkPlanGrpMapper.deleteNmisQcChkPlanGrpByIds(ids);
    }

    /**
     * 删除质量检查计划用户分组信息
     * 
     * @param id 质量检查计划用户分组主键
     * @return 结果
     */
    @Override
    public int deleteNmisQcChkPlanGrpById(String id)
    {
        return nmisQcChkPlanGrpMapper.deleteNmisQcChkPlanGrpById(id);
    }
}
