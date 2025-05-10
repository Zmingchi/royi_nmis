package com.ydl.nmis.hr.mapper;


import com.ydl.nmis.hr.domain.NmisHrTraining;

import java.util.List;

/**
 * 护理人员院内培训考试Mapper接口
 *
 * @author ydl
 * @date 2025-03-12
 */
public interface NmisHrTrainingMapper
{
    /**
     * 查询护理人员院内培训考试
     *
     * @param id 护理人员院内培训考试主键
     * @return 护理人员院内培训考试
     */
    public NmisHrTraining selectNmisHrTrainingById(Long id);

    /**
     * 查询护理人员院内培训考试列表
     *
     * @param nmisHrTraining 护理人员院内培训考试
     * @return 护理人员院内培训考试集合
     */
    public List<NmisHrTraining> selectNmisHrTrainingList(NmisHrTraining nmisHrTraining);

    /**
     * 新增护理人员院内培训考试
     *
     * @param nmisHrTraining 护理人员院内培训考试
     * @return 结果
     */
    public int insertNmisHrTraining(NmisHrTraining nmisHrTraining);

    /**
     * 修改护理人员院内培训考试
     *
     * @param nmisHrTraining 护理人员院内培训考试
     * @return 结果
     */
    public int updateNmisHrTraining(NmisHrTraining nmisHrTraining);

    /**
     * 删除护理人员院内培训考试
     *
     * @param id 护理人员院内培训考试主键
     * @return 结果
     */
    public int deleteNmisHrTrainingById(Long id);

    /**
     * 批量删除护理人员院内培训考试
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteNmisHrTrainingByIds(Long[] ids);
}

