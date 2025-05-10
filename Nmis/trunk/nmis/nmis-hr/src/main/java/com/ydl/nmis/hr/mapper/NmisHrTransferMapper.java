package com.ydl.nmis.hr.mapper;


import com.ydl.nmis.hr.domain.NmisHrTransfer;

import java.util.List;

/**
 * 护理人员调科信息Mapper接口
 *
 * @author ydl
 * @date 2025-03-05
 */
public interface NmisHrTransferMapper
{
    /**
     * 查询护理人员调科信息
     *
     * @param id 护理人员调科信息主键
     * @return 护理人员调科信息
     */
    public NmisHrTransfer selectNmisHrTransferById(Long id);

    /**
     * 查询护理人员调科信息列表
     *
     * @param nmisHrTransfer 护理人员调科信息
     * @return 护理人员调科信息集合
     */
    public List<NmisHrTransfer> selectNmisHrTransferList(NmisHrTransfer nmisHrTransfer);

    /**
     * 新增护理人员调科信息
     *
     * @param nmisHrTransfer 护理人员调科信息
     * @return 结果
     */
    public int insertNmisHrTransfer(NmisHrTransfer nmisHrTransfer);

    /**
     * 修改护理人员调科信息
     *
     * @param nmisHrTransfer 护理人员调科信息
     * @return 结果
     */
    public int updateNmisHrTransfer(NmisHrTransfer nmisHrTransfer);

    /**
     * 删除护理人员调科信息
     *
     * @param id 护理人员调科信息主键
     * @return 结果
     */
    public int deleteNmisHrTransferById(Long id);

    /**
     * 批量删除护理人员调科信息
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteNmisHrTransferByIds(Long[] ids);
}

