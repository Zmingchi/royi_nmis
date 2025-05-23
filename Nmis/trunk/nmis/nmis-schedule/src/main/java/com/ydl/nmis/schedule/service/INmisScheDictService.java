package com.ydl.nmis.schedule.service;


import com.ydl.nmis.schedule.domain.NmisScheDict;

import java.util.List;
import java.util.Map;

/**
 * 护理班次字典Service接口
 *
 * @author ydl
 * @date 2025-03-18
 */
public interface INmisScheDictService
{

    /**
     * 查询班次字典与班次对照
     */
    List<Map<String, Object>> getScheClassDictWithScheDict(String deptId);


    /**
     * 查询护理班次字典
     *
     * @param id 护理班次字典主键
     * @return 护理班次字典
     */
    public NmisScheDict selectNmisScheDictById(String id);

    /**
     * 查询护理班次字典列表
     *
     * @param nmisScheDict 护理班次字典
     * @return 护理班次字典集合
     */
    public List<NmisScheDict> selectNmisScheDictList(NmisScheDict nmisScheDict);

    /**
     * 数据校验护理班次字典列表
     *
     * @param nmisScheDict 护理班次字典
     * @return 护理班次字典集合
     */
    public List<NmisScheDict> selectNmisScheDictList2(NmisScheDict nmisScheDict);


    /**
     * 新增护理班次字典
     *
     * @param nmisScheDict 护理班次字典
     * @return 结果
     */
    public int insertNmisScheDict(NmisScheDict nmisScheDict);

    /**
     * 修改护理班次字典
     *
     * @param nmisScheDict 护理班次字典
     * @return 结果
     */
    public int updateNmisScheDict(NmisScheDict nmisScheDict);

    /**
     * 批量删除护理班次字典
     *
     * @param ids 需要删除的护理班次字典主键集合
     * @return 结果
     */
    public int deleteNmisScheDictByIds(String[] ids);

    /**
     * 删除护理班次字典信息
     *
     * @param id 护理班次字典主键
     * @return 结果
     */
    public int deleteNmisScheDictById(String id);
}

