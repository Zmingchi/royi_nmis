package com.ydl.nmis.schedule.service.impl;


import java.util.List;

import com.ydl.nmis.schedule.domain.NmisScheDetail;
import com.ydl.nmis.schedule.mapper.NmisScheDetailMapper;
import com.ydl.nmis.schedule.service.INmisScheDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 护理排班Service业务层处理
 *
 * @author ydl
 * @date 2025-03-28
 */
@Service
public class NmisScheDetailServiceImpl implements INmisScheDetailService
{
    @Autowired
    private NmisScheDetailMapper nmisScheDetailMapper;

    /**
     * 查询护理排班
     *
     * @param id 护理排班主键
     * @return 护理排班
     */
    @Override
    public NmisScheDetail selectNmisScheDetailById(String id)
    {
        return nmisScheDetailMapper.selectNmisScheDetailById(id);
    }

    /**
     * 查询护理排班列表
     *
     * @param nmisScheDetail 护理排班
     * @return 护理排班
     */
    @Override
    public List<NmisScheDetail> selectNmisScheDetailList(NmisScheDetail nmisScheDetail)
    {
        return nmisScheDetailMapper.selectNmisScheDetailList(nmisScheDetail);
    }

    /**
     * 新增护理排班
     *
     * @param nmisScheDetail 护理排班
     * @return 结果
     */
    @Override
    public int insertNmisScheDetail(NmisScheDetail nmisScheDetail)
    {
        return nmisScheDetailMapper.insertNmisScheDetail(nmisScheDetail);
    }

    /**
     * 修改护理排班
     *
     * @param nmisScheDetail 护理排班
     * @return 结果
     */
    @Override
    public int updateNmisScheDetail(NmisScheDetail nmisScheDetail)
    {
        return nmisScheDetailMapper.updateNmisScheDetail(nmisScheDetail);
    }

    /**
     * 批量删除护理排班
     *
     * @param ids 需要删除的护理排班主键
     * @return 结果
     */
    @Override
    public int deleteNmisScheDetailByIds(String[] ids)
    {
        return nmisScheDetailMapper.deleteNmisScheDetailByIds(ids);
    }

    /**
     * 删除护理排班信息
     *
     * @param id 护理排班主键
     * @return 结果
     */
    @Override
    public int deleteNmisScheDetailById(String id)
    {
        return nmisScheDetailMapper.deleteNmisScheDetailById(id);
    }
}
