package com.ydl.qc.mapper;

import java.util.List;
import com.ydl.qc.domain.NmisQcChkPlanPaper;

/**
 * 护理质量检查计划-试卷Mapper接口
 * 
 * @author ydl
 * @date 2025-05-08
 */
public interface NmisQcChkPlanPaperMapper 
{
    /**
     * 查询护理质量检查计划-试卷
     * 
     * @param id 护理质量检查计划-试卷主键
     * @return 护理质量检查计划-试卷
     */
    public NmisQcChkPlanPaper selectNmisQcChkPlanPaperById(String id);

    /**
     * 查询护理质量检查计划-试卷列表
     * 
     * @param nmisQcChkPlanPaper 护理质量检查计划-试卷
     * @return 护理质量检查计划-试卷集合
     */
    public List<NmisQcChkPlanPaper> selectNmisQcChkPlanPaperList(NmisQcChkPlanPaper nmisQcChkPlanPaper);

    /**
     * 新增护理质量检查计划-试卷
     * 
     * @param nmisQcChkPlanPaper 护理质量检查计划-试卷
     * @return 结果
     */
    public int insertNmisQcChkPlanPaper(NmisQcChkPlanPaper nmisQcChkPlanPaper);

    /**
     * 修改护理质量检查计划-试卷
     * 
     * @param nmisQcChkPlanPaper 护理质量检查计划-试卷
     * @return 结果
     */
    public int updateNmisQcChkPlanPaper(NmisQcChkPlanPaper nmisQcChkPlanPaper);

    /**
     * 删除护理质量检查计划-试卷
     * 
     * @param id 护理质量检查计划-试卷主键
     * @return 结果
     */
    public int deleteNmisQcChkPlanPaperById(String id);

    /**
     * 批量删除护理质量检查计划-试卷
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteNmisQcChkPlanPaperByIds(String[] ids);
}
