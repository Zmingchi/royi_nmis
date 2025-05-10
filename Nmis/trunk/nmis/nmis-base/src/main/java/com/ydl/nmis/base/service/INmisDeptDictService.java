package com.ydl.nmis.base.service;


import com.ydl.nmis.base.domain.NmisDeptDict;

import java.util.List;

/**
 * 护理科室信息Service接口
 *
 * @author ydl
 * @date 2025-03-07
 */
public interface INmisDeptDictService
{
    /**
     * 查询护理科室信息
     *
     * @param id 护理科室信息主键
     * @return 护理科室信息
     */
    public NmisDeptDict selectNmisDeptDictById(Long id);

    public NmisDeptDict selectNmisDeptDictByCode(String deptCode);
    /**
     * 查询护理科室信息列表
     *
     * @param nmisDeptDict 护理科室信息
     * @return 护理科室信息集合
     */
    public List<NmisDeptDict> selectNmisDeptDictList(NmisDeptDict nmisDeptDict);

    /**
     * 新增护理科室信息
     *
     * @param nmisDeptDict 护理科室信息
     * @return 结果
     */
    public int insertNmisDeptDict(NmisDeptDict nmisDeptDict);

    /**
     * 修改护理科室信息
     *
     * @param nmisDeptDict 护理科室信息
     * @return 结果
     */
    public int updateNmisDeptDict(NmisDeptDict nmisDeptDict);

    /**
     * 批量删除护理科室信息
     *
     * @param ids 需要删除的护理科室信息主键集合
     * @return 结果
     */
    public int deleteNmisDeptDictByIds(Long[] ids);

    /**
     * 删除护理科室信息信息
     *
     * @param id 护理科室信息主键
     * @return 结果
     */
    public int deleteNmisDeptDictById(Long id);
}
