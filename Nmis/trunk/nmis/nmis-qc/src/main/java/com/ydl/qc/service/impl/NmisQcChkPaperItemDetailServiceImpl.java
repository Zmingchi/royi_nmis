package com.ydl.qc.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ydl.qc.mapper.NmisQcChkPaperItemDetailMapper;
import com.ydl.qc.domain.NmisQcChkPaperItemDetail;
import com.ydl.qc.service.INmisQcChkPaperItemDetailService;

/**
 * 护理质量检查项目评分细则Service业务层处理
 * 
 * @author ydl
 * @date 2025-05-07
 */
@Service
public class NmisQcChkPaperItemDetailServiceImpl implements INmisQcChkPaperItemDetailService 
{
    @Autowired
    private NmisQcChkPaperItemDetailMapper nmisQcChkPaperItemDetailMapper;

    /**
     * 查询护理质量检查项目评分细则
     * 
     * @param id 护理质量检查项目评分细则主键
     * @return 护理质量检查项目评分细则
     */
    @Override
    public NmisQcChkPaperItemDetail selectNmisQcChkPaperItemDetailById(String id)
    {
        return nmisQcChkPaperItemDetailMapper.selectNmisQcChkPaperItemDetailById(id);
    }

    /**
     * 查询护理质量检查项目评分细则列表
     * 
     * @param nmisQcChkPaperItemDetail 护理质量检查项目评分细则
     * @return 护理质量检查项目评分细则
     */
    @Override
    public List<NmisQcChkPaperItemDetail> selectNmisQcChkPaperItemDetailList(NmisQcChkPaperItemDetail nmisQcChkPaperItemDetail)
    {
        return nmisQcChkPaperItemDetailMapper.selectNmisQcChkPaperItemDetailList(nmisQcChkPaperItemDetail);
    }

    /**
     * 新增护理质量检查项目评分细则
     * 
     * @param nmisQcChkPaperItemDetail 护理质量检查项目评分细则
     * @return 结果
     */
    @Override
    public int insertNmisQcChkPaperItemDetail(NmisQcChkPaperItemDetail nmisQcChkPaperItemDetail)
    {
        return nmisQcChkPaperItemDetailMapper.insertNmisQcChkPaperItemDetail(nmisQcChkPaperItemDetail);
    }

    /**
     * 修改护理质量检查项目评分细则
     * 
     * @param nmisQcChkPaperItemDetail 护理质量检查项目评分细则
     * @return 结果
     */
    @Override
    public int updateNmisQcChkPaperItemDetail(NmisQcChkPaperItemDetail nmisQcChkPaperItemDetail)
    {
        return nmisQcChkPaperItemDetailMapper.updateNmisQcChkPaperItemDetail(nmisQcChkPaperItemDetail);
    }

    /**
     * 批量删除护理质量检查项目评分细则
     * 
     * @param ids 需要删除的护理质量检查项目评分细则主键
     * @return 结果
     */
    @Override
    public int deleteNmisQcChkPaperItemDetailByIds(String[] ids)
    {
        return nmisQcChkPaperItemDetailMapper.deleteNmisQcChkPaperItemDetailByIds(ids);
    }

    /**
     * 删除护理质量检查项目评分细则信息
     * 
     * @param id 护理质量检查项目评分细则主键
     * @return 结果
     */
    @Override
    public int deleteNmisQcChkPaperItemDetailById(String id)
    {
        return nmisQcChkPaperItemDetailMapper.deleteNmisQcChkPaperItemDetailById(id);
    }
}
