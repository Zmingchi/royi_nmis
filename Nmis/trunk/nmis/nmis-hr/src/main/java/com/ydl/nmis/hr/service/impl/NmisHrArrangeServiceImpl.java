package com.ydl.nmis.hr.service.impl;


import java.time.LocalDateTime;
import java.util.List;

import com.ydl.nmis.hr.domain.NmisHrArrange;
import com.ydl.nmis.hr.mapper.NmisHrArrangeMapper;
import com.ydl.nmis.hr.service.INmisHrArrangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 护理人员临时借调信息Service业务层处理
 *
 * @author ydl
 * @date 2025-03-05
 */
@Service
public class NmisHrArrangeServiceImpl implements INmisHrArrangeService
{
    @Autowired
    private NmisHrArrangeMapper nmisHrArrangeMapper;

    /**
     * 查询护理人员临时借调信息
     *
     * @param id 护理人员临时借调信息主键
     * @return 护理人员临时借调信息
     */
    @Override
    public NmisHrArrange selectNmisHrArrangeById(Long id)
    {
        return nmisHrArrangeMapper.selectNmisHrArrangeById(id);
    }

    /**
     * 查询护理人员临时借调信息列表
     *
     * @param nmisHrArrange 护理人员临时借调信息
     * @return 护理人员临时借调信息
     */
    @Override
    public List<NmisHrArrange> selectNmisHrArrangeList(NmisHrArrange nmisHrArrange)
    {
        return nmisHrArrangeMapper.selectNmisHrArrangeList(nmisHrArrange);
    }

    /**
     * 新增护理人员临时借调信息
     *
     * @param nmisHrArrange 护理人员临时借调信息
     * @return 结果
     */
    @Override
    public int insertNmisHrArrange(NmisHrArrange nmisHrArrange)
    {
        return nmisHrArrangeMapper.insertNmisHrArrange(nmisHrArrange);
    }

    /**
     * 修改护理人员临时借调信息
     *
     * @param nmisHrArrange 护理人员临时借调信息
     * @return 结果
     */
    @Override
    public int updateNmisHrArrange(NmisHrArrange nmisHrArrange)
    {
        return nmisHrArrangeMapper.updateNmisHrArrange(nmisHrArrange);
    }

    /**
     * 批量删除护理人员临时借调信息
     *
     * @param ids 需要删除的护理人员临时借调信息主键
     * @return 结果
     */
    @Override
    public int deleteNmisHrArrangeByIds(Long[] ids)
    {
        return nmisHrArrangeMapper.deleteNmisHrArrangeByIds(ids);
    }

    /**
     * 删除护理人员临时借调信息信息
     *
     * @param id 护理人员临时借调信息主键
     * @return 结果
     */
    @Override
    public int deleteNmisHrArrangeById(Long id)
    {
        return nmisHrArrangeMapper.deleteNmisHrArrangeById(id);
    }
}
