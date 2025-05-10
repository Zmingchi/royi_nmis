package com.ydl.qc.service;

import java.util.List;
import com.ydl.qc.domain.NmisQcChkAnalyze;

/**
 * 护理质量检查分析改进记录Service接口
 * 
 * @author ydl
 * @date 2025-05-08
 */
public interface INmisQcChkAnalyzeService 
{
    /**
     * 查询护理质量检查分析改进记录
     * 
     * @param id 护理质量检查分析改进记录主键
     * @return 护理质量检查分析改进记录
     */
    public NmisQcChkAnalyze selectNmisQcChkAnalyzeById(String id);

    /**
     * 查询护理质量检查分析改进记录列表
     * 
     * @param nmisQcChkAnalyze 护理质量检查分析改进记录
     * @return 护理质量检查分析改进记录集合
     */
    public List<NmisQcChkAnalyze> selectNmisQcChkAnalyzeList(NmisQcChkAnalyze nmisQcChkAnalyze);

    /**
     * 新增护理质量检查分析改进记录
     * 
     * @param nmisQcChkAnalyze 护理质量检查分析改进记录
     * @return 结果
     */
    public int insertNmisQcChkAnalyze(NmisQcChkAnalyze nmisQcChkAnalyze);

    /**
     * 修改护理质量检查分析改进记录
     * 
     * @param nmisQcChkAnalyze 护理质量检查分析改进记录
     * @return 结果
     */
    public int updateNmisQcChkAnalyze(NmisQcChkAnalyze nmisQcChkAnalyze);

    /**
     * 批量删除护理质量检查分析改进记录
     * 
     * @param ids 需要删除的护理质量检查分析改进记录主键集合
     * @return 结果
     */
    public int deleteNmisQcChkAnalyzeByIds(String[] ids);

    /**
     * 删除护理质量检查分析改进记录信息
     * 
     * @param id 护理质量检查分析改进记录主键
     * @return 结果
     */
    public int deleteNmisQcChkAnalyzeById(String id);
}
