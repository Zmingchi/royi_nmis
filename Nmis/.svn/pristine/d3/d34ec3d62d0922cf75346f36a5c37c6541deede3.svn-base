package com.ydl.nmis.schedule.service.impl;



import java.util.List;

import com.ydl.nmis.schedule.domain.NmisScheCombItemDict;
import com.ydl.nmis.schedule.mapper.NmisScheCombItemDictMapper;
import com.ydl.nmis.schedule.service.INmisScheCombItemDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 护理排班组合班与普通班次对应Service业务层处理
 *
 * @author ydl
 * @date 2025-03-19
 */
@Service
public class NmisScheCombItemDictServiceImpl implements INmisScheCombItemDictService
{
    @Autowired
    private NmisScheCombItemDictMapper nmisScheCombItemDictMapper;

    /**
     * 查询护理排班组合班与普通班次对应
     *
     * @param id 护理排班组合班与普通班次对应主键
     * @return 护理排班组合班与普通班次对应
     */
    @Override
    public NmisScheCombItemDict selectNmisScheCombItemDictById(String id)
    {
        return nmisScheCombItemDictMapper.selectNmisScheCombItemDictById(id);
    }

    /**
     * 查询护理排班组合班与普通班次对应列表
     *
     * @param nmisScheCombItemDict 护理排班组合班与普通班次对应
     * @return 护理排班组合班与普通班次对应
     */
    @Override
    public List<NmisScheCombItemDict> selectNmisScheCombItemDictList(NmisScheCombItemDict nmisScheCombItemDict)
    {
        return nmisScheCombItemDictMapper.selectNmisScheCombItemDictList(nmisScheCombItemDict);
    }

    /**
     * 新增护理排班组合班与普通班次对应
     *
     * @param nmisScheCombItemDict 护理排班组合班与普通班次对应
     * @return 结果
     */
    @Override
    public int insertNmisScheCombItemDict(NmisScheCombItemDict nmisScheCombItemDict)
    {
        return nmisScheCombItemDictMapper.insertNmisScheCombItemDict(nmisScheCombItemDict);
    }

    /**
     * 修改护理排班组合班与普通班次对应
     *
     * @param nmisScheCombItemDict 护理排班组合班与普通班次对应
     * @return 结果
     */
    @Override
    public int updateNmisScheCombItemDict(NmisScheCombItemDict nmisScheCombItemDict)
    {
        return nmisScheCombItemDictMapper.updateNmisScheCombItemDict(nmisScheCombItemDict);
    }

    /**
     * 批量删除护理排班组合班与普通班次对应
     *
     * @param ids 需要删除的护理排班组合班与普通班次对应主键
     * @return 结果
     */
    @Override
    public int deleteNmisScheCombItemDictByIds(String[] ids)
    {
        return nmisScheCombItemDictMapper.deleteNmisScheCombItemDictByIds(ids);
    }

    /**
     * 删除护理排班组合班与普通班次对应信息
     *
     * @param id 护理排班组合班与普通班次对应主键
     * @return 结果
     */
    @Override
    public int deleteNmisScheCombItemDictById(String id)
    {
        return nmisScheCombItemDictMapper.deleteNmisScheCombItemDictById(id);
    }
}

