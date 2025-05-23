package com.ydl.nmis.schedule.service.impl;


import java.util.List;

import com.ydl.nmis.schedule.domain.NmisScheCompDict;
import com.ydl.nmis.schedule.mapper.NmisScheCompDictMapper;
import com.ydl.nmis.schedule.service.INmisScheCompDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 护理排班组合班次Service业务层处理
 *
 * @author ydl
 * @date 2025-03-19
 */
@Service
public class NmisScheCompDictServiceImpl implements INmisScheCompDictService
{
    @Autowired
    private NmisScheCompDictMapper nmisScheCompDictMapper;

    /**
     * 查询护理排班组合班次
     *
     * @param id 护理排班组合班次主键
     * @return 护理排班组合班次
     */
    @Override
    public NmisScheCompDict selectNmisScheCompDictById(String id)
    {
        return nmisScheCompDictMapper.selectNmisScheCompDictById(id);
    }


    /**
     * 查询护理排班组合班次列表
     *
     * @param nmisScheCompDict 护理排班组合班次
     * @return 护理排班组合班次
     */
    @Override
    public List<NmisScheCompDict> selectNmisScheCompDictList(NmisScheCompDict nmisScheCompDict)
    {
        return nmisScheCompDictMapper.selectNmisScheCompDictList(nmisScheCompDict);
    }

    /**
     * 查询护理排班组合班次对照列表
     *
     * @param nmisScheCompDict 护理排班组合班次
     * @return 护理排班组合班次集合
     */
    public List<NmisScheCompDict> selectNmisScheCompDictList2(NmisScheCompDict nmisScheCompDict){
        return nmisScheCompDictMapper.selectNmisScheCompDictList2(nmisScheCompDict);
    };

    /**
     * 新增护理排班组合班次
     *
     * @param nmisScheCompDict 护理排班组合班次
     * @return 结果
     */
    @Override
    public int insertNmisScheCompDict(NmisScheCompDict nmisScheCompDict)
    {
        return nmisScheCompDictMapper.insertNmisScheCompDict(nmisScheCompDict);
    }

    /**
     * 修改护理排班组合班次
     *
     * @param nmisScheCompDict 护理排班组合班次
     * @return 结果
     */
    @Override
    public int updateNmisScheCompDict(NmisScheCompDict nmisScheCompDict)
    {
        return nmisScheCompDictMapper.updateNmisScheCompDict(nmisScheCompDict);
    }

    /**
     * 批量删除护理排班组合班次
     *
     * @param ids 需要删除的护理排班组合班次主键
     * @return 结果
     */
    @Override
    public int deleteNmisScheCompDictByIds(String[] ids)
    {
        return nmisScheCompDictMapper.deleteNmisScheCompDictByIds(ids);
    }

    /**
     * 删除护理排班组合班次信息
     *
     * @param id 护理排班组合班次主键
     * @return 结果
     */
    @Override
    public int deleteNmisScheCompDictById(String id)
    {
        return nmisScheCompDictMapper.deleteNmisScheCompDictById(id);
    }
}

