package com.ydl.nmis.base.mapper;

import java.util.List;
import com.ydl.nmis.base.domain.NmisCommTypeDict;
import com.ydl.nmis.base.domain.NmisCommDict;

/**
 * 护理通用字典Mapper接口
 * 
 * @author ydl
 * @date 2024-04-24
 */
public interface NmisCommTypeDictMapper 
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
     * 删除护理通用字典
     * 
     * @param id 护理通用字典主键
     * @return 结果
     */
    public int deleteNmisCommTypeDictById(Long id);

    /**
     * 批量删除护理通用字典
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteNmisCommTypeDictByIds(Long[] ids);

    /**
     * 批量删除护理通用字典
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteNmisCommDictByTypeIds(Long[] ids);
    
    /**
     * 批量新增护理通用字典
     * 
     * @param nmisCommDictList 护理通用字典列表
     * @return 结果
     */
    public int batchNmisCommDict(List<NmisCommDict> nmisCommDictList);
    

    /**
     * 通过护理通用字典主键删除护理通用字典信息
     * 
     * @param id 护理通用字典ID
     * @return 结果
     */
    public int deleteNmisCommDictByTypeId(Long id);
}
