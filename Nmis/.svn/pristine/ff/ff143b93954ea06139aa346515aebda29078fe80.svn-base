package com.ydl.qc.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ydl.qc.mapper.NmisQcChkMasterMapper;
import com.ydl.qc.domain.NmisQcChkMaster;
import com.ydl.qc.service.INmisQcChkMasterService;

/**
 * 护理质量检查主记录Service业务层处理
 * 
 * @author ydl
 * @date 2025-05-08
 */
@Service
public class NmisQcChkMasterServiceImpl implements INmisQcChkMasterService 
{
    @Autowired
    private NmisQcChkMasterMapper nmisQcChkMasterMapper;

    /**
     * 查询护理质量检查主记录
     * 
     * @param id 护理质量检查主记录主键
     * @return 护理质量检查主记录
     */
    @Override
    public NmisQcChkMaster selectNmisQcChkMasterById(String id)
    {
        return nmisQcChkMasterMapper.selectNmisQcChkMasterById(id);
    }

    /**
     * 查询护理质量检查主记录列表
     * 
     * @param nmisQcChkMaster 护理质量检查主记录
     * @return 护理质量检查主记录
     */
    @Override
    public List<NmisQcChkMaster> selectNmisQcChkMasterList(NmisQcChkMaster nmisQcChkMaster)
    {
        return nmisQcChkMasterMapper.selectNmisQcChkMasterList(nmisQcChkMaster);
    }

    /**
     * 新增护理质量检查主记录
     * 
     * @param nmisQcChkMaster 护理质量检查主记录
     * @return 结果
     */
    @Override
    public int insertNmisQcChkMaster(NmisQcChkMaster nmisQcChkMaster)
    {
        return nmisQcChkMasterMapper.insertNmisQcChkMaster(nmisQcChkMaster);
    }

    /**
     * 修改护理质量检查主记录
     * 
     * @param nmisQcChkMaster 护理质量检查主记录
     * @return 结果
     */
    @Override
    public int updateNmisQcChkMaster(NmisQcChkMaster nmisQcChkMaster)
    {
        return nmisQcChkMasterMapper.updateNmisQcChkMaster(nmisQcChkMaster);
    }

    /**
     * 批量删除护理质量检查主记录
     * 
     * @param ids 需要删除的护理质量检查主记录主键
     * @return 结果
     */
    @Override
    public int deleteNmisQcChkMasterByIds(String[] ids)
    {
        return nmisQcChkMasterMapper.deleteNmisQcChkMasterByIds(ids);
    }

    /**
     * 删除护理质量检查主记录信息
     * 
     * @param id 护理质量检查主记录主键
     * @return 结果
     */
    @Override
    public int deleteNmisQcChkMasterById(String id)
    {
        return nmisQcChkMasterMapper.deleteNmisQcChkMasterById(id);
    }
}
