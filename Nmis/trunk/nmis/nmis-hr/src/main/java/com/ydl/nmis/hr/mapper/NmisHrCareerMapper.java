package com.ydl.nmis.hr.mapper;


import com.ydl.nmis.hr.domain.NmisHrCareer;

import java.util.List;

/**
 * 护理人员工作经历Mapper接口
 *
 * @author ydl
 * @date 2025-03-05
 */
public interface NmisHrCareerMapper
{
    /**
     * 查询护理人员工作经历
     *
     * @param id 护理人员工作经历主键
     * @return 护理人员工作经历
     */
    public NmisHrCareer selectNmisHrCareerById(Long id);

    /**
     * 查询护理人员工作经历列表
     *
     * @param nmisHrCareer 护理人员工作经历
     * @return 护理人员工作经历集合
     */
    public List<NmisHrCareer> selectNmisHrCareerList(NmisHrCareer nmisHrCareer);

    /**
     * 新增护理人员工作经历
     *
     * @param nmisHrCareer 护理人员工作经历
     * @return 结果
     */
    public int insertNmisHrCareer(NmisHrCareer nmisHrCareer);

    /**
     * 修改护理人员工作经历
     *
     * @param nmisHrCareer 护理人员工作经历
     * @return 结果
     */
    public int updateNmisHrCareer(NmisHrCareer nmisHrCareer);

    /**
     * 删除护理人员工作经历
     *
     * @param id 护理人员工作经历主键
     * @return 结果
     */
    public int deleteNmisHrCareerById(Long id);

    /**
     * 批量删除护理人员工作经历
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteNmisHrCareerByIds(Long[] ids);
}
