package com.ydl.nmis.hr.service.impl;


import java.util.List;

import com.ydl.nmis.hr.domain.NmisHrCareer;
import com.ydl.nmis.hr.mapper.NmisHrCareerMapper;
import com.ydl.nmis.hr.service.INmisHrCareerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 护理人员工作经历Service业务层处理
 *
 * @author ydl
 * @date 2025-03-05
 */
@Service
public class NmisHrCareerServiceImpl implements INmisHrCareerService
{
    @Autowired
    private NmisHrCareerMapper nmisHrCareerMapper;

    /**
     * 查询护理人员工作经历
     *
     * @param id 护理人员工作经历主键
     * @return 护理人员工作经历
     */
    @Override
    public NmisHrCareer selectNmisHrCareerById(Long id)
    {
        return nmisHrCareerMapper.selectNmisHrCareerById(id);
    }

    /**
     * 查询护理人员工作经历列表
     *
     * @param nmisHrCareer 护理人员工作经历
     * @return 护理人员工作经历
     */
    @Override
    public List<NmisHrCareer> selectNmisHrCareerList(NmisHrCareer nmisHrCareer)
    {
        return nmisHrCareerMapper.selectNmisHrCareerList(nmisHrCareer);
    }

    /**
     * 新增护理人员工作经历
     *
     * @param nmisHrCareer 护理人员工作经历
     * @return 结果
     */
    @Override
    public int insertNmisHrCareer(NmisHrCareer nmisHrCareer)
    {
        return nmisHrCareerMapper.insertNmisHrCareer(nmisHrCareer);
    }

    /**
     * 修改护理人员工作经历
     *
     * @param nmisHrCareer 护理人员工作经历
     * @return 结果
     */
    @Override
    public int updateNmisHrCareer(NmisHrCareer nmisHrCareer)
    {
        return nmisHrCareerMapper.updateNmisHrCareer(nmisHrCareer);
    }

    /**
     * 批量删除护理人员工作经历
     *
     * @param ids 需要删除的护理人员工作经历主键
     * @return 结果
     */
    @Override
    public int deleteNmisHrCareerByIds(Long[] ids)
    {
        return nmisHrCareerMapper.deleteNmisHrCareerByIds(ids);
    }

    /**
     * 删除护理人员工作经历信息
     *
     * @param id 护理人员工作经历主键
     * @return 结果
     */
    @Override
    public int deleteNmisHrCareerById(Long id)
    {
        return nmisHrCareerMapper.deleteNmisHrCareerById(id);
    }
}

