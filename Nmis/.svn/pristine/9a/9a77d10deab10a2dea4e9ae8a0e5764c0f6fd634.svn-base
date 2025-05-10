package com.ydl.qc.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ydl.qc.mapper.NmisQcChkPaperMapper;
import com.ydl.qc.domain.NmisQcChkPaper;
import com.ydl.qc.service.INmisQcChkPaperService;

/**
 * 护理质量检查试卷Service业务层处理
 * 
 * @author ydl
 * @date 2025-05-07
 */
@Service
public class NmisQcChkPaperServiceImpl implements INmisQcChkPaperService 
{
    @Autowired
    private NmisQcChkPaperMapper nmisQcChkPaperMapper;

    /**
     * 查询护理质量检查试卷
     * 
     * @param id 护理质量检查试卷主键
     * @return 护理质量检查试卷
     */
    @Override
    public NmisQcChkPaper selectNmisQcChkPaperById(String id)
    {
        return nmisQcChkPaperMapper.selectNmisQcChkPaperById(id);
    }

    /**
     * 查询护理质量检查试卷列表
     * 
     * @param nmisQcChkPaper 护理质量检查试卷
     * @return 护理质量检查试卷
     */
    @Override
    public List<NmisQcChkPaper> selectNmisQcChkPaperList(NmisQcChkPaper nmisQcChkPaper)
    {
        return nmisQcChkPaperMapper.selectNmisQcChkPaperList(nmisQcChkPaper);
    }

    /**
     * 新增护理质量检查试卷
     * 
     * @param nmisQcChkPaper 护理质量检查试卷
     * @return 结果
     */
    @Override
    public int insertNmisQcChkPaper(NmisQcChkPaper nmisQcChkPaper)
    {
        return nmisQcChkPaperMapper.insertNmisQcChkPaper(nmisQcChkPaper);
    }

    /**
     * 修改护理质量检查试卷
     * 
     * @param nmisQcChkPaper 护理质量检查试卷
     * @return 结果
     */
    @Override
    public int updateNmisQcChkPaper(NmisQcChkPaper nmisQcChkPaper)
    {
        return nmisQcChkPaperMapper.updateNmisQcChkPaper(nmisQcChkPaper);
    }

    /**
     * 批量删除护理质量检查试卷
     * 
     * @param ids 需要删除的护理质量检查试卷主键
     * @return 结果
     */
    @Override
    public int deleteNmisQcChkPaperByIds(String[] ids)
    {
        return nmisQcChkPaperMapper.deleteNmisQcChkPaperByIds(ids);
    }

    /**
     * 删除护理质量检查试卷信息
     * 
     * @param id 护理质量检查试卷主键
     * @return 结果
     */
    @Override
    public int deleteNmisQcChkPaperById(String id)
    {
        return nmisQcChkPaperMapper.deleteNmisQcChkPaperById(id);
    }
}
