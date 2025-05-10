package com.ydl.qc.mapper;

import java.util.List;

import com.ydl.qc.domain.NmisQcChkPaperItem;

/**
 * 护理质量检查项目Mapper接口
 * 
 * @author ydl
 * @date 2025-05-07
 */
public interface NmisQcChkPaperItemMapper 
{
    /**
     * 查询护理质量检查项目
     * 
     * @param id 护理质量检查项目主键
     * @return 护理质量检查项目
     */
    public NmisQcChkPaperItem selectNmisQcChkPaperItemById(String id);

    /**
     * 查询护理质量检查项目列表
     * 
     * @param nmisQcChkPaperItem 护理质量检查项目
     * @return 护理质量检查项目集合
     */
    public List<NmisQcChkPaperItem> selectNmisQcChkPaperItemList(NmisQcChkPaperItem nmisQcChkPaperItem);

    /**
     * 新增护理质量检查项目
     * 
     * @param nmisQcChkPaperItem 护理质量检查项目
     * @return 结果
     */
    public int insertNmisQcChkPaperItem(NmisQcChkPaperItem nmisQcChkPaperItem);

    /**
     * 修改护理质量检查项目
     * 
     * @param nmisQcChkPaperItem 护理质量检查项目
     * @return 结果
     */
    public int updateNmisQcChkPaperItem(NmisQcChkPaperItem nmisQcChkPaperItem);

    /**
     * 删除护理质量检查项目
     * 
     * @param id 护理质量检查项目主键
     * @return 结果
     */
    public int deleteNmisQcChkPaperItemById(String id);

    /**
     * 批量删除护理质量检查项目
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteNmisQcChkPaperItemByIds(String[] ids);
}
