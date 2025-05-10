package com.ydl.nmis.base.service.impl;

import java.util.List;

import com.ydl.nmis.base.domain.NmisCommDict;
import com.ydl.nmis.base.mapper.NmisCommDictMapper;
import com.ydl.nmis.base.service.INmisCommDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 护理通用字典Service业务层处理
 *
 * @author ydl
 * @date 2025-03-06
 */
@Service
public class NmisCommDictServiceImpl implements INmisCommDictService
{
    @Autowired
    private NmisCommDictMapper nmisCommDictMapper;

    /**
     * 查询护理通用字典
     *
     * @param id 护理通用字典主键
     * @return 护理通用字典
     */
    @Override
    public NmisCommDict selectNmisCommDictById(Long id)
    {
        return nmisCommDictMapper.selectNmisCommDictById(id);
    }

    /**
     * 查询护理通用字典列表
     *
     * @param nmisCommDict 护理通用字典
     * @return 护理通用字典
     */
    @Override
    public List<NmisCommDict> selectNmisCommDictList(NmisCommDict nmisCommDict)
    {
        return nmisCommDictMapper.selectNmisCommDictList(nmisCommDict);
    }

    @Override
    public List<NmisCommDict> selectNmisCommDictByTypeCode(String typeCode) {
        return nmisCommDictMapper.selectNmisCommDictByTypeCode(typeCode);
    }



    /**
     * 新增护理通用字典
     *
     * @param nmisCommDict 护理通用字典
     * @return 结果
     */
    @Override
    public int insertNmisCommDict(NmisCommDict nmisCommDict)
    {
        return nmisCommDictMapper.insertNmisCommDict(nmisCommDict);
    }

    /**
     * 修改护理通用字典
     *
     * @param nmisCommDict 护理通用字典
     * @return 结果
     */
    @Override
    public int updateNmisCommDict(NmisCommDict nmisCommDict)
    {
        return nmisCommDictMapper.updateNmisCommDict(nmisCommDict);
    }

    /**
     * 批量删除护理通用字典
     *
     * @param ids 需要删除的护理通用字典主键
     * @return 结果
     */
    @Override
    public int deleteNmisCommDictByIds(Long[] ids)
    {
        return nmisCommDictMapper.deleteNmisCommDictByIds(ids);
    }

    /**
     * 删除护理通用字典信息
     *
     * @param id 护理通用字典主键
     * @return 结果
     */
    @Override
    public int deleteNmisCommDictById(Long id)
    {
        return nmisCommDictMapper.deleteNmisCommDictById(id);
    }
}

