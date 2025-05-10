package com.ydl.qc.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ydl.qc.mapper.NmisQcChkAppealMapper;
import com.ydl.qc.domain.NmisQcChkAppeal;
import com.ydl.qc.service.INmisQcChkAppealService;

/**
 * 护理质量检查申诉记录Service业务层处理
 * 
 * @author ydl
 * @date 2025-05-08
 */
@Service
public class NmisQcChkAppealServiceImpl implements INmisQcChkAppealService 
{
    @Autowired
    private NmisQcChkAppealMapper nmisQcChkAppealMapper;

    /**
     * 查询护理质量检查申诉记录
     * 
     * @param id 护理质量检查申诉记录主键
     * @return 护理质量检查申诉记录
     */
    @Override
    public NmisQcChkAppeal selectNmisQcChkAppealById(String id)
    {
        return nmisQcChkAppealMapper.selectNmisQcChkAppealById(id);
    }

    /**
     * 查询护理质量检查申诉记录列表
     * 
     * @param nmisQcChkAppeal 护理质量检查申诉记录
     * @return 护理质量检查申诉记录
     */
    @Override
    public List<NmisQcChkAppeal> selectNmisQcChkAppealList(NmisQcChkAppeal nmisQcChkAppeal)
    {
        return nmisQcChkAppealMapper.selectNmisQcChkAppealList(nmisQcChkAppeal);
    }

    /**
     * 新增护理质量检查申诉记录
     * 
     * @param nmisQcChkAppeal 护理质量检查申诉记录
     * @return 结果
     */
    @Override
    public int insertNmisQcChkAppeal(NmisQcChkAppeal nmisQcChkAppeal)
    {
        return nmisQcChkAppealMapper.insertNmisQcChkAppeal(nmisQcChkAppeal);
    }

    /**
     * 修改护理质量检查申诉记录
     * 
     * @param nmisQcChkAppeal 护理质量检查申诉记录
     * @return 结果
     */
    @Override
    public int updateNmisQcChkAppeal(NmisQcChkAppeal nmisQcChkAppeal)
    {
        return nmisQcChkAppealMapper.updateNmisQcChkAppeal(nmisQcChkAppeal);
    }

    /**
     * 批量删除护理质量检查申诉记录
     * 
     * @param ids 需要删除的护理质量检查申诉记录主键
     * @return 结果
     */
    @Override
    public int deleteNmisQcChkAppealByIds(String[] ids)
    {
        return nmisQcChkAppealMapper.deleteNmisQcChkAppealByIds(ids);
    }

    /**
     * 删除护理质量检查申诉记录信息
     * 
     * @param id 护理质量检查申诉记录主键
     * @return 结果
     */
    @Override
    public int deleteNmisQcChkAppealById(String id)
    {
        return nmisQcChkAppealMapper.deleteNmisQcChkAppealById(id);
    }
}
