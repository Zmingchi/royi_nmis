package com.ydl.qc.mapper;

import java.util.List;
import com.ydl.qc.domain.NmisQcChkPaperItemDetail;

/**
 * 护理质量检查项目评分细则Mapper接口
 * 
 * @author ydl
 * @date 2025-05-07
 */
public interface NmisQcChkPaperItemDetailMapper 
{
    /**
     * 查询护理质量检查项目评分细则
     * 
     * @param id 护理质量检查项目评分细则主键
     * @return 护理质量检查项目评分细则
     */
    public NmisQcChkPaperItemDetail selectNmisQcChkPaperItemDetailById(String id);

    /**
     * 查询护理质量检查项目评分细则列表
     * 
     * @param nmisQcChkPaperItemDetail 护理质量检查项目评分细则
     * @return 护理质量检查项目评分细则集合
     */
    public List<NmisQcChkPaperItemDetail> selectNmisQcChkPaperItemDetailList(NmisQcChkPaperItemDetail nmisQcChkPaperItemDetail);

    /**
     * 新增护理质量检查项目评分细则
     * 
     * @param nmisQcChkPaperItemDetail 护理质量检查项目评分细则
     * @return 结果
     */
    public int insertNmisQcChkPaperItemDetail(NmisQcChkPaperItemDetail nmisQcChkPaperItemDetail);

    /**
     * 修改护理质量检查项目评分细则
     * 
     * @param nmisQcChkPaperItemDetail 护理质量检查项目评分细则
     * @return 结果
     */
    public int updateNmisQcChkPaperItemDetail(NmisQcChkPaperItemDetail nmisQcChkPaperItemDetail);

    /**
     * 删除护理质量检查项目评分细则
     * 
     * @param id 护理质量检查项目评分细则主键
     * @return 结果
     */
    public int deleteNmisQcChkPaperItemDetailById(String id);

    /**
     * 批量删除护理质量检查项目评分细则
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteNmisQcChkPaperItemDetailByIds(String[] ids);
}
