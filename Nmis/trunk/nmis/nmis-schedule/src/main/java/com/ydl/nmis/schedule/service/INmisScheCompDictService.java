package com.ydl.nmis.schedule.service;


import com.ydl.nmis.schedule.domain.NmisScheCompDict;

import java.util.List;

/**
 * 护理排班组合班次Service接口
 *
 * @author ydl
 * @date 2025-03-19
 */
public interface INmisScheCompDictService
{
    /**
     * 查询护理排班组合班次
     *
     * @param id 护理排班组合班次主键
     * @return 护理排班组合班次
     */
    public NmisScheCompDict selectNmisScheCompDictById(String id);


    /**
     * 查询护理排班组合班次列表
     *
     * @param nmisScheCompDict 护理排班组合班次
     * @return 护理排班组合班次集合
     */
    public List<NmisScheCompDict> selectNmisScheCompDictList(NmisScheCompDict nmisScheCompDict);


    /**
     * 新增护理排班组合班次
     *
     * @param nmisScheCompDict 护理排班组合班次
     * @return 结果
     */
    public int insertNmisScheCompDict(NmisScheCompDict nmisScheCompDict);

    /**
     * 修改护理排班组合班次
     *
     * @param nmisScheCompDict 护理排班组合班次
     * @return 结果
     */
    public int updateNmisScheCompDict(NmisScheCompDict nmisScheCompDict);

    /**
     * 批量删除护理排班组合班次
     *
     * @param ids 需要删除的护理排班组合班次主键集合
     * @return 结果
     */
    public int deleteNmisScheCompDictByIds(String[] ids);

    /**
     * 删除护理排班组合班次信息
     *
     * @param id 护理排班组合班次主键
     * @return 结果
     */
    public int deleteNmisScheCompDictById(String id);
}
