package com.ydl.nmis.base.service.impl;


import java.util.List;


import com.ydl.nmis.base.domain.NmisDeptDict;
import com.ydl.nmis.base.mapper.NmisDeptDictMapper;
import com.ydl.nmis.base.service.INmisDeptDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 护理科室信息Service业务层处理
 *
 * @author ydl
 * @date 2025-03-07
 */
@Service
public class NmisDeptDictServiceImpl implements INmisDeptDictService
{
    @Autowired
    private NmisDeptDictMapper nmisDeptDictMapper;

    /**
     * 查询护理科室信息
     *
     * @param id 护理科室信息主键
     * @return 护理科室信息
     */
    @Override
    public NmisDeptDict selectNmisDeptDictById(Long id)
    {
        return nmisDeptDictMapper.selectNmisDeptDictById(id);
    }

    public NmisDeptDict selectNmisDeptDictByCode(String deptCode){
        return nmisDeptDictMapper.selectNmisDeptDictByCode(deptCode);
    }
    /**
     * 查询护理科室信息列表
     *
     * @param nmisDeptDict 护理科室信息
     * @return 护理科室信息
     */
    @Override
    public List<NmisDeptDict> selectNmisDeptDictList(NmisDeptDict nmisDeptDict)
    {
        return nmisDeptDictMapper.selectNmisDeptDictList(nmisDeptDict);
    }

    /**
     * 新增护理科室信息
     *
     * @param nmisDeptDict 护理科室信息
     * @return 结果
     */
    @Override
    public int insertNmisDeptDict(NmisDeptDict nmisDeptDict)
    {
        return nmisDeptDictMapper.insertNmisDeptDict(nmisDeptDict);
    }

    /**
     * 修改护理科室信息
     *
     * @param nmisDeptDict 护理科室信息
     * @return 结果
     */
    @Override
    public int updateNmisDeptDict(NmisDeptDict nmisDeptDict)
    {
        return nmisDeptDictMapper.updateNmisDeptDict(nmisDeptDict);
    }

    /**
     * 批量删除护理科室信息
     *
     * @param ids 需要删除的护理科室信息主键
     * @return 结果
     */
    @Override
    public int deleteNmisDeptDictByIds(Long[] ids)
    {
        return nmisDeptDictMapper.deleteNmisDeptDictByIds(ids);
    }

    /**
     * 删除护理科室信息信息
     *
     * @param id 护理科室信息主键
     * @return 结果
     */
    @Override
    public int deleteNmisDeptDictById(Long id)
    {
        return nmisDeptDictMapper.deleteNmisDeptDictById(id);
    }
}

