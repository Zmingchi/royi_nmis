package com.ydl.nmis.schedule.mapper;


import com.ydl.nmis.schedule.domain.NmisScheMaster;

import java.util.List;



/**
 * 护理排班主Mapper接口
 *
 * @author ydl
 * @date 2025-03-28
 */
public interface NmisScheMasterMapper
{
    /**
     * 查询护理排班主
     *
     * @param id 护理排班主主键
     * @return 护理排班主
     */
    public NmisScheMaster selectNmisScheMasterById(String id);

    /**
     * 查询护理排班主列表
     *
     * @param nmisScheMaster 护理排班主
     * @return 护理排班主集合
     */
    public List<NmisScheMaster> selectNmisScheMasterList(NmisScheMaster nmisScheMaster);

    /**
     * 新增护理排班主
     *
     * @param nmisScheMaster 护理排班主
     * @return 结果
     */
    public int insertNmisScheMaster(NmisScheMaster nmisScheMaster);

    /**
     * 修改护理排班主
     *
     * @param nmisScheMaster 护理排班主
     * @return 结果
     */
    public int updateNmisScheMaster(NmisScheMaster nmisScheMaster);

    /**
     * 删除护理排班主
     *
     * @param id 护理排班主主键
     * @return 结果
     */
    public int deleteNmisScheMasterById(String id);

    /**
     * 批量删除护理排班主
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteNmisScheMasterByIds(String[] ids);

    /**
     * 删除护理排班主信息
     *
     * @param PlanId 护理排班主主键
     * @return 结果
     */
    public int deleteNmisScheMasterByPlanId(String PlanId);
}

