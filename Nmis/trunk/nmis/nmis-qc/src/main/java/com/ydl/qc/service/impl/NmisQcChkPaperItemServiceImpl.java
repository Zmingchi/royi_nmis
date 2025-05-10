package com.ydl.qc.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ydl.qc.mapper.NmisQcChkPaperItemMapper;
import com.ydl.qc.domain.NmisQcChkPaperItem;
import com.ydl.qc.service.INmisQcChkPaperItemService;

/**
 * 护理质量检查项目Service业务层处理
 * 
 * @author ydl
 * @date 2025-05-07
 */
@Service
public class NmisQcChkPaperItemServiceImpl implements INmisQcChkPaperItemService 
{
    @Autowired
    private NmisQcChkPaperItemMapper nmisQcChkPaperItemMapper;

    /**
     * 查询护理质量检查项目
     * 
     * @param id 护理质量检查项目主键
     * @return 护理质量检查项目
     */
    @Override
    public NmisQcChkPaperItem selectNmisQcChkPaperItemById(String id)
    {
        return nmisQcChkPaperItemMapper.selectNmisQcChkPaperItemById(id);
    }

    /**
     * 查询护理质量检查项目列表
     * 
     * @param nmisQcChkPaperItem 护理质量检查项目
     * @return 护理质量检查项目
     */
    @Override
    public List<NmisQcChkPaperItem> selectNmisQcChkPaperItemList(NmisQcChkPaperItem nmisQcChkPaperItem)
    {
        return nmisQcChkPaperItemMapper.selectNmisQcChkPaperItemList(nmisQcChkPaperItem);
    }

    /**
     * 新增护理质量检查项目
     * 
     * @param nmisQcChkPaperItem 护理质量检查项目
     * @return 结果
     */
    @Override
    public int insertNmisQcChkPaperItem(NmisQcChkPaperItem nmisQcChkPaperItem)
    {
        return nmisQcChkPaperItemMapper.insertNmisQcChkPaperItem(nmisQcChkPaperItem);
    }

    /**
     * 修改护理质量检查项目
     * 
     * @param nmisQcChkPaperItem 护理质量检查项目
     * @return 结果
     */
    @Override
    public int updateNmisQcChkPaperItem(NmisQcChkPaperItem nmisQcChkPaperItem)
    {
        return nmisQcChkPaperItemMapper.updateNmisQcChkPaperItem(nmisQcChkPaperItem);
    }

    /**
     * 批量删除护理质量检查项目
     * 
     * @param ids 需要删除的护理质量检查项目主键
     * @return 结果
     */
    @Override
    public int deleteNmisQcChkPaperItemByIds(String[] ids)
    {
        return nmisQcChkPaperItemMapper.deleteNmisQcChkPaperItemByIds(ids);
    }

    /**
     * 删除护理质量检查项目信息
     * 
     * @param id 护理质量检查项目主键
     * @return 结果
     */
    @Override
    public int deleteNmisQcChkPaperItemById(String id)
    {
        return nmisQcChkPaperItemMapper.deleteNmisQcChkPaperItemById(id);
    }
}
