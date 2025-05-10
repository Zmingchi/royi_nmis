package com.ydl.nmis.schedule.service.impl;


import java.util.List;

import com.ydl.nmis.schedule.domain.NmisScheMaster;
import com.ydl.nmis.schedule.mapper.NmisScheMasterMapper;
import com.ydl.nmis.schedule.service.INmisScheMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * 护理排班主Service业务层处理
 *
 * @author ydl
 * @date 2025-03-28
 */
@Service
public class NmisScheMasterServiceImpl implements INmisScheMasterService
{
    @Autowired
    private NmisScheMasterMapper nmisScheMasterMapper;

    /**
     * 查询护理排班主
     *
     * @param id 护理排班主主键
     * @return 护理排班主
     */
    @Override
    public NmisScheMaster selectNmisScheMasterById(String id)
    {
        return nmisScheMasterMapper.selectNmisScheMasterById(id);
    }

    /**
     * 查询护理排班主列表
     *
     * @param nmisScheMaster 护理排班主
     * @return 护理排班主
     */
    @Override
    public List<NmisScheMaster> selectNmisScheMasterList(NmisScheMaster nmisScheMaster)
    {
        return nmisScheMasterMapper.selectNmisScheMasterList(nmisScheMaster);
    }

    /**
     * 新增护理排班主
     *
     * @param nmisScheMaster 护理排班主
     * @return 结果
     */
    @Override
    public int insertNmisScheMaster(NmisScheMaster nmisScheMaster)
    {
        return nmisScheMasterMapper.insertNmisScheMaster(nmisScheMaster);
    }

    /**
     * 修改护理排班主
     *
     * @param nmisScheMaster 护理排班主
     * @return 结果
     */
    @Override
    public int updateNmisScheMaster(NmisScheMaster nmisScheMaster)
    {
        return nmisScheMasterMapper.updateNmisScheMaster(nmisScheMaster);
    }

    /**
     * 批量删除护理排班主
     *
     * @param ids 需要删除的护理排班主主键
     * @return 结果
     */
    @Override
    public int deleteNmisScheMasterByIds(String[] ids)
    {
        return nmisScheMasterMapper.deleteNmisScheMasterByIds(ids);
    }

    /**
     * 删除护理排班主信息
     *
     * @param id 护理排班主主键
     * @return 结果
     */
    @Override
    public int deleteNmisScheMasterById(String id)
    {
        return nmisScheMasterMapper.deleteNmisScheMasterById(id);
    }

    /**
     * 删除护理排班主信息
     *
     * @param PlanId 护理排班主主键
     * @return 结果
     */
    @Override
    public int deleteNmisScheMasterByPlanId(String PlanId) {
        return nmisScheMasterMapper.deleteNmisScheMasterByPlanId(PlanId);
    }
}
