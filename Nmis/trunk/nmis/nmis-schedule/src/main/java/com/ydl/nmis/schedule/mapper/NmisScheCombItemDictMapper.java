package com.ydl.nmis.schedule.mapper;


import com.ydl.nmis.schedule.domain.NmisScheCombItemDict;

import java.util.List;

/**
 * 护理排班组合班与普通班次对应Mapper接口
 *
 * @author ydl
 * @date 2025-03-19
 */
public interface NmisScheCombItemDictMapper
{
    /**
     * 查询护理排班组合班与普通班次对应
     *
     * @param id 护理排班组合班与普通班次对应主键
     * @return 护理排班组合班与普通班次对应
     */
    public NmisScheCombItemDict selectNmisScheCombItemDictById(String id);

    /**
     * 查询护理排班组合班与普通班次对应列表
     *
     * @param nmisScheCombItemDict 护理排班组合班与普通班次对应
     * @return 护理排班组合班与普通班次对应集合
     */
    public List<NmisScheCombItemDict> selectNmisScheCombItemDictList(NmisScheCombItemDict nmisScheCombItemDict);

    /**
     * 新增护理排班组合班与普通班次对应
     *
     * @param nmisScheCombItemDict 护理排班组合班与普通班次对应
     * @return 结果
     */
    public int insertNmisScheCombItemDict(NmisScheCombItemDict nmisScheCombItemDict);

    /**
     * 修改护理排班组合班与普通班次对应
     *
     * @param nmisScheCombItemDict 护理排班组合班与普通班次对应
     * @return 结果
     */
    public int updateNmisScheCombItemDict(NmisScheCombItemDict nmisScheCombItemDict);

    /**
     * 删除护理排班组合班与普通班次对应
     *
     * @param id 护理排班组合班与普通班次对应主键
     * @return 结果
     */
    public int deleteNmisScheCombItemDictById(String id);

    /**
     * 批量删除护理排班组合班与普通班次对应
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteNmisScheCombItemDictByIds(String[] ids);
}
