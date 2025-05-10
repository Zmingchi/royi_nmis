package com.ydl.nmis.hr.service.impl;

import java.util.List;

import com.ydl.nmis.hr.domain.NmisHrTransfer;
import com.ydl.nmis.hr.mapper.NmisHrTransferMapper;
import com.ydl.nmis.hr.service.INmisHrTransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 护理人员调科信息Service业务层处理
 *
 * @author ydl
 * @date 2025-03-05
 */
@Service
public class NmisHrTransferServiceImpl implements INmisHrTransferService
{
    @Autowired
    private NmisHrTransferMapper nmisHrTransferMapper;

    /**
     * 查询护理人员调科信息
     *
     * @param id 护理人员调科信息主键
     * @return 护理人员调科信息
     */
    @Override
    public NmisHrTransfer selectNmisHrTransferById(Long id)
    {
        return nmisHrTransferMapper.selectNmisHrTransferById(id);
    }

    /**
     * 查询护理人员调科信息列表
     *
     * @param nmisHrTransfer 护理人员调科信息
     * @return 护理人员调科信息
     */
    @Override
    public List<NmisHrTransfer> selectNmisHrTransferList(NmisHrTransfer nmisHrTransfer)
    {
        return nmisHrTransferMapper.selectNmisHrTransferList(nmisHrTransfer);
    }

    /**
     * 新增护理人员调科信息
     *
     * @param nmisHrTransfer 护理人员调科信息
     * @return 结果
     */
    @Override
    public int insertNmisHrTransfer(NmisHrTransfer nmisHrTransfer)
    {
        return nmisHrTransferMapper.insertNmisHrTransfer(nmisHrTransfer);
    }

    /**
     * 修改护理人员调科信息
     *
     * @param nmisHrTransfer 护理人员调科信息
     * @return 结果
     */
    @Override
    public int updateNmisHrTransfer(NmisHrTransfer nmisHrTransfer)
    {
        return nmisHrTransferMapper.updateNmisHrTransfer(nmisHrTransfer);
    }

    /**
     * 批量删除护理人员调科信息
     *
     * @param ids 需要删除的护理人员调科信息主键
     * @return 结果
     */
    @Override
    public int deleteNmisHrTransferByIds(Long[] ids)
    {
        return nmisHrTransferMapper.deleteNmisHrTransferByIds(ids);
    }

    /**
     * 删除护理人员调科信息信息
     *
     * @param id 护理人员调科信息主键
     * @return 结果
     */
    @Override
    public int deleteNmisHrTransferById(Long id)
    {
        return nmisHrTransferMapper.deleteNmisHrTransferById(id);
    }
}

