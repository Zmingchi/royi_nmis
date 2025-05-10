package com.ydl.qc.mapper;

import java.util.List;
import com.ydl.qc.domain.NmisQcStdItem;

/**
 * 护理质量标准项目Mapper接口
 * 
 * @author ydl
 * @date 2025-05-07
 */
public interface NmisQcStdItemMapper 
{
    /**
     * 查询护理质量标准项目
     * 
     * @param id 护理质量标准项目主键
     * @return 护理质量标准项目
     */
    public NmisQcStdItem selectNmisQcStdItemById(String id);

    /**
     * 查询护理质量标准项目列表
     * 
     * @param nmisQcStdItem 护理质量标准项目
     * @return 护理质量标准项目集合
     */
    public List<NmisQcStdItem> selectNmisQcStdItemList(NmisQcStdItem nmisQcStdItem);

    /**
     * 新增护理质量标准项目
     * 
     * @param nmisQcStdItem 护理质量标准项目
     * @return 结果
     */
    public int insertNmisQcStdItem(NmisQcStdItem nmisQcStdItem);

    /**
     * 修改护理质量标准项目
     * 
     * @param nmisQcStdItem 护理质量标准项目
     * @return 结果
     */
    public int updateNmisQcStdItem(NmisQcStdItem nmisQcStdItem);

    /**
     * 删除护理质量标准项目
     * 
     * @param id 护理质量标准项目主键
     * @return 结果
     */
    public int deleteNmisQcStdItemById(String id);

    /**
     * 批量删除护理质量标准项目
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteNmisQcStdItemByIds(String[] ids);
}
