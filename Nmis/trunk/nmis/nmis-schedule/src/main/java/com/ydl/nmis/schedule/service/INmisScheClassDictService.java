package com.ydl.nmis.schedule.service;


import com.ydl.nmis.schedule.domain.NmisScheClassDict;

import java.util.List;
import java.util.Map;

/**
 * 班次类别字典Service接口
 *
 * @author ydl
 * @date 2025-03-18
 */
public interface INmisScheClassDictService
{


    List<Map<String, Object>> getScheClassDictWithScheDict();

    /**
     * 查询班次类别字典
     *
     * @param id 班次类别字典主键
     * @return 班次类别字典
     */
    public NmisScheClassDict selectNmisScheClassDictById(String id);

    /**
     * 查询班次类别字典列表
     *
     * @param nmisScheClassDict 班次类别字典
     * @return 班次类别字典集合
     */
    public List<NmisScheClassDict> selectNmisScheClassDictList(NmisScheClassDict nmisScheClassDict);

    /**
     * 新增班次类别字典
     *
     * @param nmisScheClassDict 班次类别字典
     * @return 结果
     */
    public int insertNmisScheClassDict(NmisScheClassDict nmisScheClassDict);

    /**
     * 通过user_id查询user_name
     *
     * @param createId 班次类别字典
     * @return 结果
     */

    public String selectNmisScheClassDictBycreateId(String createId);

    /**
     * 修改班次类别字典
     *
     * @param nmisScheClassDict 班次类别字典
     * @return 结果
     */
    public int updateNmisScheClassDict(NmisScheClassDict nmisScheClassDict);

    /**
     * 批量删除班次类别字典
     *
     * @param ids 需要删除的班次类别字典主键集合
     * @return 结果
     */
    public int deleteNmisScheClassDictByIds(String[] ids);

    /**
     * 删除班次类别字典信息
     *
     * @param id 班次类别字典主键
     * @return 结果
     */
    public int deleteNmisScheClassDictById(String id);
}
