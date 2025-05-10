package com.ydl.nmis.base.service.impl;

import java.util.List;

import com.ydl.nmis.base.domain.NmisDutyDict;
import com.ydl.nmis.base.mapper.NmisDutyDictMapper;
import com.ydl.nmis.base.service.INmisDutyDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 护理人员职务字典Service业务层处理
 * 
 * @author ydl
 * @date 2024-04-09
 */
@Service
public class NmisDutyDictServiceImpl implements INmisDutyDictService
{
    @Autowired
    private NmisDutyDictMapper nmisDutyDictMapper;

    /**
     * 查询护理人员职务字典
     * 
     * @param id 护理人员职务字典主键
     * @return 护理人员职务字典
     */
    @Override
    public NmisDutyDict selectNmisDutyDictById(Long id)
    {
        return nmisDutyDictMapper.selectNmisDutyDictById(id);
    }

    /**
     * 查询护理人员职务字典列表
     * 
     * @param nmisDutyDict 护理人员职务字典
     * @return 护理人员职务字典
     */
    @Override
    public List<NmisDutyDict> selectNmisDutyDictList(NmisDutyDict nmisDutyDict)
    {
        return nmisDutyDictMapper.selectNmisDutyDictList(nmisDutyDict);
    }

    /**
     * 新增护理人员职务字典
     * 
     * @param nmisDutyDict 护理人员职务字典
     * @return 结果
     */
    @Override
    public int insertNmisDutyDict(NmisDutyDict nmisDutyDict)
    {
        return nmisDutyDictMapper.insertNmisDutyDict(nmisDutyDict);
    }

    /**
     * 修改护理人员职务字典
     * 
     * @param nmisDutyDict 护理人员职务字典
     * @return 结果
     */
    @Override
    public int updateNmisDutyDict(NmisDutyDict nmisDutyDict)
    {
        return nmisDutyDictMapper.updateNmisDutyDict(nmisDutyDict);
    }

    /**
     * 批量删除护理人员职务字典
     * 
     * @param ids 需要删除的护理人员职务字典主键
     * @return 结果
     */
    @Override
    public int deleteNmisDutyDictByIds(Long[] ids)
    {
        return nmisDutyDictMapper.deleteNmisDutyDictByIds(ids);
    }

    /**
     * 删除护理人员职务字典信息
     * 
     * @param id 护理人员职务字典主键
     * @return 结果
     */
    @Override
    public int deleteNmisDutyDictById(Long id)
    {
        return nmisDutyDictMapper.deleteNmisDutyDictById(id);
    }
}
