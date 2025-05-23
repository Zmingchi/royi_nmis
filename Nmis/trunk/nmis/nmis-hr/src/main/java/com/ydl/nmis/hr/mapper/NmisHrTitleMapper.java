package com.ydl.nmis.hr.mapper;


import com.ydl.nmis.hr.domain.NmisHrTitle;
import com.ydl.nmis.hr.dto.NmisHrTitleWithDept;

import java.util.List;

/**
 * 护理人员职称信息Mapper接口
 *
 * @author ydl
 * @date 2025-03-04
 */

public interface NmisHrTitleMapper
{
    /**
     * 查询护理人员职称信息
     *
     * @param id 护理人员职称信息主键
     * @return 护理人员职称信息
     */
    public NmisHrTitle selectNmisHrTitleById(Long id);

    /**
     * 通过科室查询护理人员职称信息
     *
     * @param  nmisHrTitleWithDept 护理人员职称信息主键
     * @return 护理人员职称信息
     */
    public List<Long> selectNmisHrTitleBydeptId(NmisHrTitleWithDept nmisHrTitleWithDept);


    /**
     * 查询护理人员职称信息列表
     *
     * @param nmisHrTitle 护理人员职称信息
     * @return 护理人员职称信息集合
     */
    public List<NmisHrTitle> selectNmisHrTitleList(NmisHrTitle nmisHrTitle);

    /**
     * 新增护理人员职称信息
     *
     * @param nmisHrTitle 护理人员职称信息
     * @return 结果
     */
    public int insertNmisHrTitle(NmisHrTitle nmisHrTitle);

    /**
     * 修改护理人员职称信息
     *
     * @param nmisHrTitle 护理人员职称信息
     * @return 结果
     */
    public int updateNmisHrTitle(NmisHrTitle nmisHrTitle);

    /**
     * 删除护理人员职称信息
     *
     * @param id 护理人员职称信息主键
     * @return 结果
     */
    public int deleteNmisHrTitleById(Long id);

    /**
     * 批量删除护理人员职称信息
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteNmisHrTitleByIds(Long[] ids);
}

