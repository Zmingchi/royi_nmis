package com.ydl.qc.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ydl.qc.mapper.NmisQcChkDetailMapper;
import com.ydl.qc.domain.NmisQcChkDetail;
import com.ydl.qc.service.INmisQcChkDetailService;

/**
 * 护理质量检查明细记录Service业务层处理
 * 
 * @author ydl
 * @date 2025-05-08
 */
@Service
public class NmisQcChkDetailServiceImpl implements INmisQcChkDetailService 
{
    @Autowired
    private NmisQcChkDetailMapper nmisQcChkDetailMapper;

    /**
     * 查询护理质量检查明细记录
     * 
     * @param id 护理质量检查明细记录主键
     * @return 护理质量检查明细记录
     */
    @Override
    public NmisQcChkDetail selectNmisQcChkDetailById(String id)
    {
        return nmisQcChkDetailMapper.selectNmisQcChkDetailById(id);
    }

    /**
     * 查询护理质量检查明细记录列表
     * 
     * @param nmisQcChkDetail 护理质量检查明细记录
     * @return 护理质量检查明细记录
     */
    @Override
    public List<NmisQcChkDetail> selectNmisQcChkDetailList(NmisQcChkDetail nmisQcChkDetail)
    {
        return nmisQcChkDetailMapper.selectNmisQcChkDetailList(nmisQcChkDetail);
    }

    /**
     * 新增护理质量检查明细记录
     * 
     * @param nmisQcChkDetail 护理质量检查明细记录
     * @return 结果
     */
    @Override
    public int insertNmisQcChkDetail(NmisQcChkDetail nmisQcChkDetail)
    {
        return nmisQcChkDetailMapper.insertNmisQcChkDetail(nmisQcChkDetail);
    }

    /**
     * 修改护理质量检查明细记录
     * 
     * @param nmisQcChkDetail 护理质量检查明细记录
     * @return 结果
     */
    @Override
    public int updateNmisQcChkDetail(NmisQcChkDetail nmisQcChkDetail)
    {
        return nmisQcChkDetailMapper.updateNmisQcChkDetail(nmisQcChkDetail);
    }

    /**
     * 批量删除护理质量检查明细记录
     * 
     * @param ids 需要删除的护理质量检查明细记录主键
     * @return 结果
     */
    @Override
    public int deleteNmisQcChkDetailByIds(String[] ids)
    {
        return nmisQcChkDetailMapper.deleteNmisQcChkDetailByIds(ids);
    }

    /**
     * 删除护理质量检查明细记录信息
     * 
     * @param id 护理质量检查明细记录主键
     * @return 结果
     */
    @Override
    public int deleteNmisQcChkDetailById(String id)
    {
        return nmisQcChkDetailMapper.deleteNmisQcChkDetailById(id);
    }
}
