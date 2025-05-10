package com.ydl.nmis.hr.service.impl;


import java.util.List;

import com.ydl.nmis.hr.domain.NmisHrTraining;
import com.ydl.nmis.hr.mapper.NmisHrTrainingMapper;
import com.ydl.nmis.hr.service.INmisHrTrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 护理人员院内培训考试Service业务层处理
 *
 * @author ydl
 * @date 2025-03-12
 */
@Service
public class NmisHrTrainingServiceImpl implements INmisHrTrainingService
{
    @Autowired
    private NmisHrTrainingMapper nmisHrTrainingMapper;

    /**
     * 查询护理人员院内培训考试
     *
     * @param id 护理人员院内培训考试主键
     * @return 护理人员院内培训考试
     */
    @Override
    public NmisHrTraining selectNmisHrTrainingById(Long id)
    {
        return nmisHrTrainingMapper.selectNmisHrTrainingById(id);
    }

    /**
     * 查询护理人员院内培训考试列表
     *
     * @param nmisHrTraining 护理人员院内培训考试
     * @return 护理人员院内培训考试
     */
    @Override
    public List<NmisHrTraining> selectNmisHrTrainingList(NmisHrTraining nmisHrTraining)
    {
        return nmisHrTrainingMapper.selectNmisHrTrainingList(nmisHrTraining);
    }

    /**
     * 新增护理人员院内培训考试
     *
     * @param nmisHrTraining 护理人员院内培训考试
     * @return 结果
     */
    @Override
    public int insertNmisHrTraining(NmisHrTraining nmisHrTraining)
    {
        return nmisHrTrainingMapper.insertNmisHrTraining(nmisHrTraining);
    }

    /**
     * 修改护理人员院内培训考试
     *
     * @param nmisHrTraining 护理人员院内培训考试
     * @return 结果
     */
    @Override
    public int updateNmisHrTraining(NmisHrTraining nmisHrTraining)
    {
        return nmisHrTrainingMapper.updateNmisHrTraining(nmisHrTraining);
    }

    /**
     * 批量删除护理人员院内培训考试
     *
     * @param ids 需要删除的护理人员院内培训考试主键
     * @return 结果
     */
    @Override
    public int deleteNmisHrTrainingByIds(Long[] ids)
    {
        return nmisHrTrainingMapper.deleteNmisHrTrainingByIds(ids);
    }

    /**
     * 删除护理人员院内培训考试信息
     *
     * @param id 护理人员院内培训考试主键
     * @return 结果
     */
    @Override
    public int deleteNmisHrTrainingById(Long id)
    {
        return nmisHrTrainingMapper.deleteNmisHrTrainingById(id);
    }
}

