package com.ydl.qc.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ydl.qc.mapper.NmisQcStdItemDetailMapper;
import com.ydl.qc.domain.NmisQcStdItemDetail;
import com.ydl.qc.service.INmisQcStdItemDetailService;

/**
 * 护理质量标准项目细则Service业务层处理
 * 
 * @author ydl
 * @date 2025-05-07
 */
@Service
public class NmisQcStdItemDetailServiceImpl implements INmisQcStdItemDetailService 
{
    @Autowired
    private NmisQcStdItemDetailMapper nmisQcStdItemDetailMapper;

    /**
     * 查询护理质量标准项目细则
     * 
     * @param id 护理质量标准项目细则主键
     * @return 护理质量标准项目细则
     */
    @Override
    public NmisQcStdItemDetail selectNmisQcStdItemDetailById(String id)
    {
        return nmisQcStdItemDetailMapper.selectNmisQcStdItemDetailById(id);
    }

    /**
     * 查询护理质量标准项目细则列表
     * 
     * @param nmisQcStdItemDetail 护理质量标准项目细则
     * @return 护理质量标准项目细则
     */
    @Override
    public List<NmisQcStdItemDetail> selectNmisQcStdItemDetailList(NmisQcStdItemDetail nmisQcStdItemDetail)
    {
        return nmisQcStdItemDetailMapper.selectNmisQcStdItemDetailList(nmisQcStdItemDetail);
    }

    /**
     * 新增护理质量标准项目细则
     * 
     * @param nmisQcStdItemDetail 护理质量标准项目细则
     * @return 结果
     */
    @Override
    public int insertNmisQcStdItemDetail(NmisQcStdItemDetail nmisQcStdItemDetail)
    {
        return nmisQcStdItemDetailMapper.insertNmisQcStdItemDetail(nmisQcStdItemDetail);
    }

    /**
     * 修改护理质量标准项目细则
     * 
     * @param nmisQcStdItemDetail 护理质量标准项目细则
     * @return 结果
     */
    @Override
    public int updateNmisQcStdItemDetail(NmisQcStdItemDetail nmisQcStdItemDetail)
    {
        return nmisQcStdItemDetailMapper.updateNmisQcStdItemDetail(nmisQcStdItemDetail);
    }

    /**
     * 批量删除护理质量标准项目细则
     * 
     * @param ids 需要删除的护理质量标准项目细则主键
     * @return 结果
     */
    @Override
    public int deleteNmisQcStdItemDetailByIds(String[] ids)
    {
        return nmisQcStdItemDetailMapper.deleteNmisQcStdItemDetailByIds(ids);
    }

    /**
     * 删除护理质量标准项目细则信息
     * 
     * @param id 护理质量标准项目细则主键
     * @return 结果
     */
    @Override
    public int deleteNmisQcStdItemDetailById(String id)
    {
        return nmisQcStdItemDetailMapper.deleteNmisQcStdItemDetailById(id);
    }
}
