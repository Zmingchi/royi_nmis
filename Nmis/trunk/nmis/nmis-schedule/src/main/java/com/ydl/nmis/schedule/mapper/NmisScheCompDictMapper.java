package com.ydl.nmis.schedule.mapper;


import com.ydl.nmis.schedule.domain.NmisScheCompDict;

import java.util.List;

/**
 * 护理排班组合班次Mapper接口
 *
 * @author ydl
 * @date 2025-03-19
 */
public interface NmisScheCompDictMapper
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
     * 查询护理排班组合班次对照列表
     *
     * @param nmisScheCompDict 护理排班组合班次
     * @return 护理排班组合班次集合
     */
    public List<NmisScheCompDict> selectNmisScheCompDictList2(NmisScheCompDict nmisScheCompDict);

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
     * 删除护理排班组合班次
     *
     * @param id 护理排班组合班次主键
     * @return 结果
     */
    public int deleteNmisScheCompDictById(String id);

    /**
     * 批量删除护理排班组合班次
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteNmisScheCompDictByIds(String[] ids);
}

