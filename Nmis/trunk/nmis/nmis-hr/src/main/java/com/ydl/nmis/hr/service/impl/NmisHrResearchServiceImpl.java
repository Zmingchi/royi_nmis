package com.ydl.nmis.hr.service.impl;


import java.util.List;

import com.ydl.nmis.hr.domain.NmisHrResearch;
import com.ydl.nmis.hr.mapper.NmisHrResearchMapper;
import com.ydl.nmis.hr.service.INmisHrResearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 护理人员科研信息Service业务层处理
 *
 * @author ydl
 * @date 2025-03-12
 */
@Service
public class NmisHrResearchServiceImpl implements INmisHrResearchService
{
    @Autowired
    private NmisHrResearchMapper nmisHrResearchMapper;

    /**
     * 查询护理人员科研信息
     *
     * @param id 护理人员科研信息主键
     * @return 护理人员科研信息
     */
    @Override
    public NmisHrResearch selectNmisHrResearchById(Long id)
    {
        return nmisHrResearchMapper.selectNmisHrResearchById(id);
    }

    /**
     * 查询护理人员科研信息列表
     *
     * @param nmisHrResearch 护理人员科研信息
     * @return 护理人员科研信息
     */
    @Override
    public List<NmisHrResearch> selectNmisHrResearchList(NmisHrResearch nmisHrResearch)
    {
        return nmisHrResearchMapper.selectNmisHrResearchList(nmisHrResearch);
    }

    /**
     * 新增护理人员科研信息
     *
     * @param nmisHrResearch 护理人员科研信息
     * @return 结果
     */
    @Override
    public int insertNmisHrResearch(NmisHrResearch nmisHrResearch)
    {
        return nmisHrResearchMapper.insertNmisHrResearch(nmisHrResearch);
    }

    /**
     * 修改护理人员科研信息
     *
     * @param nmisHrResearch 护理人员科研信息
     * @return 结果
     */
    @Override
    public int updateNmisHrResearch(NmisHrResearch nmisHrResearch)
    {
        return nmisHrResearchMapper.updateNmisHrResearch(nmisHrResearch);
    }

    /**
     * 批量删除护理人员科研信息
     *
     * @param ids 需要删除的护理人员科研信息主键
     * @return 结果
     */
    @Override
    public int deleteNmisHrResearchByIds(Long[] ids)
    {
        return nmisHrResearchMapper.deleteNmisHrResearchByIds(ids);
    }

    /**
     * 删除护理人员科研信息信息
     *
     * @param id 护理人员科研信息主键
     * @return 结果
     */
    @Override
    public int deleteNmisHrResearchById(Long id)
    {
        return nmisHrResearchMapper.deleteNmisHrResearchById(id);
    }
}
