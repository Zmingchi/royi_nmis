package com.ydl.qc.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ydl.qc.mapper.NmisQcChkAnalyzeMapper;
import com.ydl.qc.domain.NmisQcChkAnalyze;
import com.ydl.qc.service.INmisQcChkAnalyzeService;

/**
 * 护理质量检查分析改进记录Service业务层处理
 * 
 * @author ydl
 * @date 2025-05-08
 */
@Service
public class NmisQcChkAnalyzeServiceImpl implements INmisQcChkAnalyzeService 
{
    @Autowired
    private NmisQcChkAnalyzeMapper nmisQcChkAnalyzeMapper;

    /**
     * 查询护理质量检查分析改进记录
     * 
     * @param id 护理质量检查分析改进记录主键
     * @return 护理质量检查分析改进记录
     */
    @Override
    public NmisQcChkAnalyze selectNmisQcChkAnalyzeById(String id)
    {
        return nmisQcChkAnalyzeMapper.selectNmisQcChkAnalyzeById(id);
    }

    /**
     * 查询护理质量检查分析改进记录列表
     * 
     * @param nmisQcChkAnalyze 护理质量检查分析改进记录
     * @return 护理质量检查分析改进记录
     */
    @Override
    public List<NmisQcChkAnalyze> selectNmisQcChkAnalyzeList(NmisQcChkAnalyze nmisQcChkAnalyze)
    {
        return nmisQcChkAnalyzeMapper.selectNmisQcChkAnalyzeList(nmisQcChkAnalyze);
    }

    /**
     * 新增护理质量检查分析改进记录
     * 
     * @param nmisQcChkAnalyze 护理质量检查分析改进记录
     * @return 结果
     */
    @Override
    public int insertNmisQcChkAnalyze(NmisQcChkAnalyze nmisQcChkAnalyze)
    {
        return nmisQcChkAnalyzeMapper.insertNmisQcChkAnalyze(nmisQcChkAnalyze);
    }

    /**
     * 修改护理质量检查分析改进记录
     * 
     * @param nmisQcChkAnalyze 护理质量检查分析改进记录
     * @return 结果
     */
    @Override
    public int updateNmisQcChkAnalyze(NmisQcChkAnalyze nmisQcChkAnalyze)
    {
        return nmisQcChkAnalyzeMapper.updateNmisQcChkAnalyze(nmisQcChkAnalyze);
    }

    /**
     * 批量删除护理质量检查分析改进记录
     * 
     * @param ids 需要删除的护理质量检查分析改进记录主键
     * @return 结果
     */
    @Override
    public int deleteNmisQcChkAnalyzeByIds(String[] ids)
    {
        return nmisQcChkAnalyzeMapper.deleteNmisQcChkAnalyzeByIds(ids);
    }

    /**
     * 删除护理质量检查分析改进记录信息
     * 
     * @param id 护理质量检查分析改进记录主键
     * @return 结果
     */
    @Override
    public int deleteNmisQcChkAnalyzeById(String id)
    {
        return nmisQcChkAnalyzeMapper.deleteNmisQcChkAnalyzeById(id);
    }
}
