package com.ydl.nmis.base.service;

import org.apache.ibatis.annotations.Param;
import com.ydl.nmis.base.domain.NmisCommDict;

import java.util.List;

/**
 * 护理通用字典Service接口
 *
 * @author ydl
 * @date 2025-03-06
 */
public interface INmisCommDictService
{
    /**
     * 查询护理通用字典
     *
     * @param id 护理通用字典主键
     * @return 护理通用字典
     */
    public NmisCommDict selectNmisCommDictById(Long id);



    /**
     * 查询护理通用字典列表
     *
     * @param nmisCommDict 护理通用字典
     * @return 护理通用字典集合
     */
    public List<NmisCommDict> selectNmisCommDictList(NmisCommDict nmisCommDict);

    public List<NmisCommDict> selectNmisCommDictByTypeCode(@Param("typeCode") String typeCode);



    /**
     * 新增护理通用字典
     *
     * @param nmisCommDict 护理通用字典
     * @return 结果
     */
    public int insertNmisCommDict(NmisCommDict nmisCommDict);

    /**
     * 修改护理通用字典
     *
     * @param nmisCommDict 护理通用字典
     * @return 结果
     */
    public int updateNmisCommDict(NmisCommDict nmisCommDict);

    /**
     * 批量删除护理通用字典
     *
     * @param ids 需要删除的护理通用字典主键集合
     * @return 结果
     */
    public int deleteNmisCommDictByIds(Long[] ids);

    /**
     * 删除护理通用字典信息
     *
     * @param id 护理通用字典主键
     * @return 结果
     */
    public int deleteNmisCommDictById(Long id);
}

