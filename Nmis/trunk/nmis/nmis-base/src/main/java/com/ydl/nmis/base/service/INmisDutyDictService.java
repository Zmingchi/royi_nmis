package com.ydl.nmis.base.service;


import com.ydl.nmis.base.domain.NmisDutyDict;

import java.util.List;

/**
 * 护理人员职务字典Service接口
 * 
 * @author ydl
 * @date 2024-04-09
 */
public interface INmisDutyDictService 
{
    /**
     * 查询护理人员职务字典
     * 
     * @param id 护理人员职务字典主键
     * @return 护理人员职务字典
     */
    public NmisDutyDict selectNmisDutyDictById(Long id);

    /**
     * 查询护理人员职务字典列表
     * 
     * @param nmisDutyDict 护理人员职务字典
     * @return 护理人员职务字典集合
     */
    public List<NmisDutyDict> selectNmisDutyDictList(NmisDutyDict nmisDutyDict);

    /**
     * 新增护理人员职务字典
     * 
     * @param nmisDutyDict 护理人员职务字典
     * @return 结果
     */
    public int insertNmisDutyDict(NmisDutyDict nmisDutyDict);

    /**
     * 修改护理人员职务字典
     * 
     * @param nmisDutyDict 护理人员职务字典
     * @return 结果
     */
    public int updateNmisDutyDict(NmisDutyDict nmisDutyDict);

    /**
     * 批量删除护理人员职务字典
     * 
     * @param ids 需要删除的护理人员职务字典主键集合
     * @return 结果
     */
    public int deleteNmisDutyDictByIds(Long[] ids);

    /**
     * 删除护理人员职务字典信息
     * 
     * @param id 护理人员职务字典主键
     * @return 结果
     */
    public int deleteNmisDutyDictById(Long id);
}
