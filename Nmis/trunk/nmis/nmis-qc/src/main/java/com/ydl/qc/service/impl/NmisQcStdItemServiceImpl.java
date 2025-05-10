package com.ydl.qc.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ydl.qc.mapper.NmisQcStdItemMapper;
import com.ydl.qc.domain.NmisQcStdItem;
import com.ydl.qc.service.INmisQcStdItemService;

/**
 * 护理质量标准项目Service业务层处理
 * 
 * @author ydl
 * @date 2025-05-07
 */
@Service
public class NmisQcStdItemServiceImpl implements INmisQcStdItemService 
{
    @Autowired
    private NmisQcStdItemMapper nmisQcStdItemMapper;

    /**
     * 查询护理质量标准项目
     * 
     * @param id 护理质量标准项目主键
     * @return 护理质量标准项目
     */
    @Override
    public NmisQcStdItem selectNmisQcStdItemById(String id)
    {
        return nmisQcStdItemMapper.selectNmisQcStdItemById(id);
    }

    /**
     * 查询护理质量标准项目列表
     * 
     * @param nmisQcStdItem 护理质量标准项目
     * @return 护理质量标准项目
     */
    @Override
    public List<NmisQcStdItem> selectNmisQcStdItemList(NmisQcStdItem nmisQcStdItem)
    {
        return nmisQcStdItemMapper.selectNmisQcStdItemList(nmisQcStdItem);
    }

    /**
     * 新增护理质量标准项目
     * 
     * @param nmisQcStdItem 护理质量标准项目
     * @return 结果
     */
    @Override
    public int insertNmisQcStdItem(NmisQcStdItem nmisQcStdItem)
    {
        return nmisQcStdItemMapper.insertNmisQcStdItem(nmisQcStdItem);
    }

    /**
     * 修改护理质量标准项目
     * 
     * @param nmisQcStdItem 护理质量标准项目
     * @return 结果
     */
    @Override
    public int updateNmisQcStdItem(NmisQcStdItem nmisQcStdItem)
    {
        return nmisQcStdItemMapper.updateNmisQcStdItem(nmisQcStdItem);
    }

    /**
     * 批量删除护理质量标准项目
     * 
     * @param ids 需要删除的护理质量标准项目主键
     * @return 结果
     */
    @Override
    public int deleteNmisQcStdItemByIds(String[] ids)
    {
        return nmisQcStdItemMapper.deleteNmisQcStdItemByIds(ids);
    }

    /**
     * 删除护理质量标准项目信息
     * 
     * @param id 护理质量标准项目主键
     * @return 结果
     */
    @Override
    public int deleteNmisQcStdItemById(String id)
    {
        return nmisQcStdItemMapper.deleteNmisQcStdItemById(id);
    }
}
