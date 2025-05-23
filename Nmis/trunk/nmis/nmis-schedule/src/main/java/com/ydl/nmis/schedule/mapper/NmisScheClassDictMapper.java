package com.ydl.nmis.schedule.mapper;

import com.ydl.nmis.schedule.domain.NmisScheClassDict;
import com.ydl.nmis.schedule.domain.NmisScheDict;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 班次类别字典Mapper接口
 *
 * @author ydl
 * @date 2025-03-18
 */
public interface NmisScheClassDictMapper
{

    // 查询所有班次类别
    List<NmisScheClassDict> selectAllScheClassDict();

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
     * 删除班次类别字典
     *
     * @param id 班次类别字典主键
     * @return 结果
     */
    public int deleteNmisScheClassDictById(String id);

    /**
     * 批量删除班次类别字典
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteNmisScheClassDictByIds(String[] ids);

    /**
     * 根据类别id查询班次
     */

}
