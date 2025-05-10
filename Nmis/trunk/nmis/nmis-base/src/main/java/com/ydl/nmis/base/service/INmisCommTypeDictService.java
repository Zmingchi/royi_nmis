package com.ydl.nmis.base.service;

import java.util.List;
import com.ydl.nmis.base.domain.NmisCommTypeDict;

/**
 * 护理通用字典Service接口
 * 
 * @author ydl
 * @date 2024-04-24
 */
public interface INmisCommTypeDictService 
{
    /**
     * 查询护理通用字典
     * 
     * @param id 护理通用字典主键
     * @return 护理通用字典
     */
    public NmisCommTypeDict selectNmisCommTypeDictById(Long id);

    /**
     * 查询护理通用字典列表
     * 
     * @param nmisCommTypeDict 护理通用字典
     * @return 护理通用字典集合
     */
    public List<NmisCommTypeDict> selectNmisCommTypeDictList(NmisCommTypeDict nmisCommTypeDict);

    /**
     * 新增护理通用字典
     * 
     * @param nmisCommTypeDict 护理通用字典
     * @return 结果
     */
    public int insertNmisCommTypeDict(NmisCommTypeDict nmisCommTypeDict);

    NmisCommTypeDict selectByTypeName(String typeName);

    /**
     * 修改护理通用字典
     * 
     * @param nmisCommTypeDict 护理通用字典
     * @return 结果
     */
    public int updateNmisCommTypeDict(NmisCommTypeDict nmisCommTypeDict);

    /**
     * 批量删除护理通用字典
     * 
     * @param ids 需要删除的护理通用字典主键集合
     * @return 结果
     */
    public int deleteNmisCommTypeDictByIds(Long[] ids);

    /**
     * 删除护理通用字典信息
     * 
     * @param id 护理通用字典主键
     * @return 结果
     */
    public int deleteNmisCommTypeDictById(Long id);
}
