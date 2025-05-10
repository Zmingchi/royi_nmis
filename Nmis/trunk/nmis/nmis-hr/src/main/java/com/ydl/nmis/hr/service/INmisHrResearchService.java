package com.ydl.nmis.hr.service;


import com.ydl.nmis.hr.domain.NmisHrResearch;

import java.util.List;

/**
 * 护理人员科研信息Service接口
 *
 * @author ydl
 * @date 2025-03-12
 */
public interface INmisHrResearchService
{
    /**
     * 查询护理人员科研信息
     *
     * @param id 护理人员科研信息主键
     * @return 护理人员科研信息
     */
    public NmisHrResearch selectNmisHrResearchById(Long id);

    /**
     * 查询护理人员科研信息列表
     *
     * @param nmisHrResearch 护理人员科研信息
     * @return 护理人员科研信息集合
     */
    public List<NmisHrResearch> selectNmisHrResearchList(NmisHrResearch nmisHrResearch);

    /**
     * 新增护理人员科研信息
     *
     * @param nmisHrResearch 护理人员科研信息
     * @return 结果
     */
    public int insertNmisHrResearch(NmisHrResearch nmisHrResearch);

    /**
     * 修改护理人员科研信息
     *
     * @param nmisHrResearch 护理人员科研信息
     * @return 结果
     */
    public int updateNmisHrResearch(NmisHrResearch nmisHrResearch);

    /**
     * 批量删除护理人员科研信息
     *
     * @param ids 需要删除的护理人员科研信息主键集合
     * @return 结果
     */
    public int deleteNmisHrResearchByIds(Long[] ids);

    /**
     * 删除护理人员科研信息信息
     *
     * @param id 护理人员科研信息主键
     * @return 结果
     */
    public int deleteNmisHrResearchById(Long id);
}

