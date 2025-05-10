package com.ydl.nmis.base.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import com.ydl.common.utils.StringUtils;
import org.springframework.transaction.annotation.Transactional;
import com.ydl.nmis.base.domain.NmisCommDict;
import com.ydl.nmis.base.mapper.NmisCommTypeDictMapper;
import com.ydl.nmis.base.domain.NmisCommTypeDict;
import com.ydl.nmis.base.service.INmisCommTypeDictService;

/**
 * 护理通用字典Service业务层处理
 * 
 * @author ydl
 * @date 2024-04-24
 */
@Service
public class NmisCommTypeDictServiceImpl implements INmisCommTypeDictService
{
    @Autowired
    private NmisCommTypeDictMapper nmisCommTypeDictMapper;

    /**
     * 查询护理通用字典
     * 
     * @param id 护理通用字典主键
     * @return 护理通用字典
     */
    @Override
    public NmisCommTypeDict selectNmisCommTypeDictById(Long id)
    {
        return nmisCommTypeDictMapper.selectNmisCommTypeDictById(id);
    }

    /**
     * 查询护理通用字典列表
     * 
     * @param nmisCommTypeDict 护理通用字典
     * @return 护理通用字典
     */
    @Override
    public List<NmisCommTypeDict> selectNmisCommTypeDictList(NmisCommTypeDict nmisCommTypeDict)
    {
        return nmisCommTypeDictMapper.selectNmisCommTypeDictList(nmisCommTypeDict);
    }

    /**
     * 新增护理通用字典
     *
     * @param nmisCommTypeDict 护理通用字典
     * @return 结果
     */
    @Transactional
    @Override
    public int insertNmisCommTypeDict(NmisCommTypeDict nmisCommTypeDict)
    {
        // 根据 typeName 查询是否已存在记录
        NmisCommTypeDict existingRecord = nmisCommTypeDictMapper.selectByTypeName(nmisCommTypeDict.getTypeName());
        if (existingRecord != null) {
            // 如果已存在，只插入 nmis_comm_dict 中不存在的数据
            Long typeId = existingRecord.getId();
            List<NmisCommDict> nmisCommDictList = nmisCommTypeDict.getNmisCommDictList();
            if (nmisCommDictList != null && !nmisCommDictList.isEmpty()) {
                for (NmisCommDict nmisCommDict : nmisCommDictList) {
                    nmisCommDict.setTypeId(Long.valueOf(typeId.toString())); // 设置 typeId
                }
                nmisCommTypeDictMapper.batchNmisCommDict(nmisCommDictList);
            }
        }else {
            // 如果不存在，插入 nmis_comm_type_dict 表 insertNmisCommTypeDict
            nmisCommTypeDictMapper.insertNmisCommTypeDict(nmisCommTypeDict);

            // 获取插入后的主键 ID
            Long typeId = nmisCommTypeDict.getId();

            // 插入 nmis_comm_dict 表
            List<NmisCommDict> nmisCommDictList = nmisCommTypeDict.getNmisCommDictList();
            if (nmisCommDictList != null && !nmisCommDictList.isEmpty()) {
                for (NmisCommDict nmisCommDict : nmisCommDictList) {
                    nmisCommDict.setTypeId(Long.valueOf(typeId.toString())); // 设置 typeId
                }
                nmisCommTypeDictMapper.batchNmisCommDict(nmisCommDictList);
            }
        }
        //int rows = nmisCommTypeDictMapper.insertNmisCommTypeDict(nmisCommTypeDict);
        return 0;
    }

    @Override
    public NmisCommTypeDict selectByTypeName(String typeName) {
        return null;
    }

    /**
     * 修改护理通用字典
     * 
     * @param nmisCommTypeDict 护理通用字典
     * @return 结果
     */
    @Transactional
    @Override
    public int updateNmisCommTypeDict(NmisCommTypeDict nmisCommTypeDict)
    {
        nmisCommTypeDictMapper.deleteNmisCommDictByTypeId(nmisCommTypeDict.getId());
        insertNmisCommDict(nmisCommTypeDict);
        return nmisCommTypeDictMapper.updateNmisCommTypeDict(nmisCommTypeDict);
    }

    /**
     * 批量删除护理通用字典
     * 
     * @param ids 需要删除的护理通用字典主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteNmisCommTypeDictByIds(Long[] ids)
    {
        nmisCommTypeDictMapper.deleteNmisCommDictByTypeIds(ids);
        return nmisCommTypeDictMapper.deleteNmisCommTypeDictByIds(ids);
    }

    /**
     * 删除护理通用字典信息
     * 
     * @param id 护理通用字典主键
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteNmisCommTypeDictById(Long id)
    {
        nmisCommTypeDictMapper.deleteNmisCommDictByTypeId(id);
        return nmisCommTypeDictMapper.deleteNmisCommTypeDictById(id);
    }

    /**
     * 新增护理通用字典信息
     * 
     * @param nmisCommTypeDict 护理通用字典对象
     */
    public void insertNmisCommDict(NmisCommTypeDict nmisCommTypeDict)
    {
        List<NmisCommDict> nmisCommDictList = nmisCommTypeDict.getNmisCommDictList();
        Long id = nmisCommTypeDict.getId();
        if (StringUtils.isNotNull(nmisCommDictList))
        {
            List<NmisCommDict> list = new ArrayList<NmisCommDict>();
            for (NmisCommDict nmisCommDict : nmisCommDictList)
            {
                nmisCommDict.setTypeId(id);
                list.add(nmisCommDict);
            }
            if (list.size() > 0)
            {
                nmisCommTypeDictMapper.batchNmisCommDict(list);
            }
        }
    }
}
