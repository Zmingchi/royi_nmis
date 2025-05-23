package com.ydl.nmis.schedule.service.impl;


import java.util.*;

import com.ydl.nmis.schedule.domain.NmisScheClassDict;
import com.ydl.nmis.schedule.domain.NmisScheDict;
import com.ydl.nmis.schedule.mapper.NmisScheClassDictMapper;
import com.ydl.nmis.schedule.mapper.NmisScheDictMapper;
import com.ydl.nmis.schedule.service.INmisScheDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 护理班次字典Service业务层处理
 *
 * @author ydl
 * @date 2025-03-18
 */
@Service
public class NmisScheDictServiceImpl implements INmisScheDictService
{
    @Autowired
    private NmisScheClassDictMapper nmisScheClassDictMapper;
    @Autowired
    private NmisScheDictMapper nmisScheDictMapper;


    /**
     * 班次类别字典与班次对照
     */
    @Override
    public List<Map<String, Object>> getScheClassDictWithScheDict(String deptId) {
        List<Map<String, Object>> result = new ArrayList<>();

        // 查询所有班次类别
        List<NmisScheClassDict> classDictList = nmisScheClassDictMapper.selectAllScheClassDict();

        for (NmisScheClassDict classDict : classDictList) {
            Map<String, Object> classItem = new HashMap<>();
            classItem.put("className", classDict.getClassName());
            classItem.put("classCode", classDict.getInputCode());


            // 查询该类别下的所有班次
            Map<String, Object> params = new HashMap<>();
            params.put("classId", classDict.getId());
            params.put("deptId", deptId);
            List<NmisScheDict> scheDictList = nmisScheDictMapper.selectScheDictByClassId(params);
            List<Map<String, Object>> dataList = new ArrayList<>();

            for (NmisScheDict scheDict : scheDictList) {
                Map<String, Object> dataItem = new HashMap<>();
                dataItem.put("className", classDict.getClassName());
                dataItem.put("scheName", scheDict.getScheName());
                dataItem.put("scheItemId", scheDict.getId());
                if (scheDict.getHours() != null) {
                }else{
                    scheDict.setHours(0L);
                }
                dataItem.put("scheHours", scheDict.getHours());
                dataList.add(dataItem);
            }

            classItem.put("data", dataList);
            result.add(classItem);
        }

        return result;
    }

    /**
     * 查询护理班次字典
     *
     * @param id 护理班次字典主键
     * @return 护理班次字典
     */
    @Override
    public NmisScheDict selectNmisScheDictById(String id)
    {
        return nmisScheDictMapper.selectNmisScheDictById(id);
    }

    /**
     * 查询护理班次字典列表
     *
     * @param nmisScheDict 护理班次字典
     * @return 护理班次字典
     */
    @Override
    public List<NmisScheDict> selectNmisScheDictList(NmisScheDict nmisScheDict)
    {
        return nmisScheDictMapper.selectNmisScheDictList(nmisScheDict);
    }

    /**
     * 数据校验护理班次字典列表
     *
     * @param nmisScheDict 护理班次字典
     * @return 护理班次字典集合
     */

    @Override
    public List<NmisScheDict> selectNmisScheDictList2(NmisScheDict nmisScheDict)
    {
        return nmisScheDictMapper.selectNmisScheDictList2(nmisScheDict);
    }

    /**
     * 新增护理班次字典
     *
     * @param nmisScheDict 护理班次字典
     * @return 结果
     */
    @Override
    public int insertNmisScheDict(NmisScheDict nmisScheDict)
    {
        return nmisScheDictMapper.insertNmisScheDict(nmisScheDict);
    }

    /**
     * 修改护理班次字典
     *
     * @param nmisScheDict 护理班次字典
     * @return 结果
     */
    @Override
    public int updateNmisScheDict(NmisScheDict nmisScheDict)
    {
        return nmisScheDictMapper.updateNmisScheDict(nmisScheDict);
    }

    /**
     * 批量删除护理班次字典
     *
     * @param ids 需要删除的护理班次字典主键
     * @return 结果
     */
    @Override
    public int deleteNmisScheDictByIds(String[] ids)
    {
        return nmisScheDictMapper.deleteNmisScheDictByIds(ids);
    }

    /**
     * 删除护理班次字典信息
     *
     * @param id 护理班次字典主键
     * @return 结果
     */
    @Override
    public int deleteNmisScheDictById(String id)
    {
        return nmisScheDictMapper.deleteNmisScheDictById(id);
    }
}

