package com.ydl.nmis.schedule.service.impl;


import java.util.*;

import com.ydl.nmis.schedule.domain.NmisScheClassDict;
import com.ydl.nmis.schedule.domain.NmisScheDict;
import com.ydl.nmis.schedule.mapper.NmisScheClassDictMapper;
import com.ydl.nmis.schedule.mapper.NmisScheDictMapper;
import com.ydl.nmis.schedule.service.INmisScheClassDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 班次类别字典Service业务层处理
 *
 * @author ydl
 * @date 2025-03-18
 */
@Service
public class NmisScheClassDictServiceImpl implements INmisScheClassDictService
{
    @Autowired
    private NmisScheClassDictMapper nmisScheClassDictMapper;


    @Override
    public List<Map<String, Object>> getScheClassDictWithScheDict() {
        return Collections.emptyList();
    }

    /**
     * 查询班次类别字典
     *
     * @param id 班次类别字典主键
     * @return 班次类别字典
     */
    @Override
    public NmisScheClassDict selectNmisScheClassDictById(String id)
    {
        return nmisScheClassDictMapper.selectNmisScheClassDictById(id);
    }

    /**
     * 查询班次类别字典列表
     *
     * @param nmisScheClassDict 班次类别字典
     * @return 班次类别字典
     */
    @Override
    public List<NmisScheClassDict> selectNmisScheClassDictList(NmisScheClassDict nmisScheClassDict)
    {
        return nmisScheClassDictMapper.selectNmisScheClassDictList(nmisScheClassDict);
    }

    /**
     * 新增班次类别字典
     *
     * @param nmisScheClassDict 班次类别字典
     * @return 结果
     */
    @Override
    public int insertNmisScheClassDict(NmisScheClassDict nmisScheClassDict)
    {
        return nmisScheClassDictMapper.insertNmisScheClassDict(nmisScheClassDict);
    }

    /**
     * 通过user_id查询user_name
     *
     * @param createId 班次类别字典
     * @return 结果
     */

    public String selectNmisScheClassDictBycreateId(String createId){
        return nmisScheClassDictMapper.selectNmisScheClassDictBycreateId(createId);
    };


    /**
     * 修改班次类别字典
     *
     * @param nmisScheClassDict 班次类别字典
     * @return 结果
     */
    @Override
    public int updateNmisScheClassDict(NmisScheClassDict nmisScheClassDict)
    {
        return nmisScheClassDictMapper.updateNmisScheClassDict(nmisScheClassDict);
    }

    /**
     * 批量删除班次类别字典
     *
     * @param ids 需要删除的班次类别字典主键
     * @return 结果
     */
    @Override
    public int deleteNmisScheClassDictByIds(String[] ids)
    {
        return nmisScheClassDictMapper.deleteNmisScheClassDictByIds(ids);
    }

    /**
     * 删除班次类别字典信息
     *
     * @param id 班次类别字典主键
     * @return 结果
     */
    @Override
    public int deleteNmisScheClassDictById(String id)
    {
        return nmisScheClassDictMapper.deleteNmisScheClassDictById(id);
    }
}
