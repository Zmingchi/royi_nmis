package com.ydl.nmis.schedule.mapper;


import com.ydl.nmis.schedule.domain.NmisScheDetail;

import java.util.List;

/**
 * 护理排班Mapper接口
 *
 * @author ydl
 * @date 2025-03-28
 */
public interface NmisScheDetailMapper
{
    /**
     * 查询护理排班
     *
     * @param id 护理排班主键
     * @return 护理排班
     */
    public NmisScheDetail selectNmisScheDetailById(String id);

    /**
     * 查询护理排班列表
     *
     * @param nmisScheDetail 护理排班
     * @return 护理排班集合
     */
    public List<NmisScheDetail> selectNmisScheDetailList(NmisScheDetail nmisScheDetail);

    /**
     * 新增护理排班
     *
     * @param nmisScheDetail 护理排班
     * @return 结果
     */
    public int insertNmisScheDetail(NmisScheDetail nmisScheDetail);

    /**
     * 修改护理排班
     *
     * @param nmisScheDetail 护理排班
     * @return 结果
     */
    public int updateNmisScheDetail(NmisScheDetail nmisScheDetail);

    /**
     * 删除护理排班
     *
     * @param id 护理排班主键
     * @return 结果
     */
    public int deleteNmisScheDetailById(String id);

    /**
     * 批量删除护理排班
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteNmisScheDetailByIds(String[] ids);
}

