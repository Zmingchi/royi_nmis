package com.ydl.qc.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ydl.qc.mapper.NmisQcChkPlanPaperMapper;
import com.ydl.qc.domain.NmisQcChkPlanPaper;
import com.ydl.qc.service.INmisQcChkPlanPaperService;

/**
 * 护理质量检查计划-试卷Service业务层处理
 * 
 * @author ydl
 * @date 2025-05-08
 */
@Service
public class NmisQcChkPlanPaperServiceImpl implements INmisQcChkPlanPaperService 
{
    @Autowired
    private NmisQcChkPlanPaperMapper nmisQcChkPlanPaperMapper;

    /**
     * 查询护理质量检查计划-试卷
     * 
     * @param id 护理质量检查计划-试卷主键
     * @return 护理质量检查计划-试卷
     */
    @Override
    public NmisQcChkPlanPaper selectNmisQcChkPlanPaperById(String id)
    {
        return nmisQcChkPlanPaperMapper.selectNmisQcChkPlanPaperById(id);
    }

    /**
     * 查询护理质量检查计划-试卷列表
     * 
     * @param nmisQcChkPlanPaper 护理质量检查计划-试卷
     * @return 护理质量检查计划-试卷
     */
    @Override
    public List<NmisQcChkPlanPaper> selectNmisQcChkPlanPaperList(NmisQcChkPlanPaper nmisQcChkPlanPaper)
    {
        return nmisQcChkPlanPaperMapper.selectNmisQcChkPlanPaperList(nmisQcChkPlanPaper);
    }

    /**
     * 新增护理质量检查计划-试卷
     * 
     * @param nmisQcChkPlanPaper 护理质量检查计划-试卷
     * @return 结果
     */
    @Override
    public int insertNmisQcChkPlanPaper(NmisQcChkPlanPaper nmisQcChkPlanPaper)
    {
        return nmisQcChkPlanPaperMapper.insertNmisQcChkPlanPaper(nmisQcChkPlanPaper);
    }

    /**
     * 修改护理质量检查计划-试卷
     * 
     * @param nmisQcChkPlanPaper 护理质量检查计划-试卷
     * @return 结果
     */
    @Override
    public int updateNmisQcChkPlanPaper(NmisQcChkPlanPaper nmisQcChkPlanPaper)
    {
        return nmisQcChkPlanPaperMapper.updateNmisQcChkPlanPaper(nmisQcChkPlanPaper);
    }

    /**
     * 批量删除护理质量检查计划-试卷
     * 
     * @param ids 需要删除的护理质量检查计划-试卷主键
     * @return 结果
     */
    @Override
    public int deleteNmisQcChkPlanPaperByIds(String[] ids)
    {
        return nmisQcChkPlanPaperMapper.deleteNmisQcChkPlanPaperByIds(ids);
    }

    /**
     * 删除护理质量检查计划-试卷信息
     * 
     * @param id 护理质量检查计划-试卷主键
     * @return 结果
     */
    @Override
    public int deleteNmisQcChkPlanPaperById(String id)
    {
        return nmisQcChkPlanPaperMapper.deleteNmisQcChkPlanPaperById(id);
    }
}
