package com.ydl.nmis.hr.service;

import com.ydl.nmis.hr.domain.NmisHrArrange;

import java.util.List;

/**
 * 护理人员临时借调信息Service接口
 *
 * @author ydl
 * @date 2025-03-05
 */
public interface INmisHrArrangeService
{
    /**
     * 查询护理人员临时借调信息
     *
     * @param id 护理人员临时借调信息主键
     * @return 护理人员临时借调信息
     */
    public NmisHrArrange selectNmisHrArrangeById(Long id);

    /**
     * 查询护理人员临时借调信息列表
     *
     * @param nmisHrArrange 护理人员临时借调信息
     * @return 护理人员临时借调信息集合
     */
    public List<NmisHrArrange> selectNmisHrArrangeList(NmisHrArrange nmisHrArrange);

    /**
     * 新增护理人员临时借调信息
     *
     * @param nmisHrArrange 护理人员临时借调信息
     * @return 结果
     */
    public int insertNmisHrArrange(NmisHrArrange nmisHrArrange);

    /**
     * 修改护理人员临时借调信息
     *
     * @param nmisHrArrange 护理人员临时借调信息
     * @return 结果
     */
    public int updateNmisHrArrange(NmisHrArrange nmisHrArrange);

    /**
     * 批量删除护理人员临时借调信息
     *
     * @param ids 需要删除的护理人员临时借调信息主键集合
     * @return 结果
     */
    public int deleteNmisHrArrangeByIds(Long[] ids);

    /**
     * 删除护理人员临时借调信息信息
     *
     * @param id 护理人员临时借调信息主键
     * @return 结果
     */
    public int deleteNmisHrArrangeById(Long id);
}
