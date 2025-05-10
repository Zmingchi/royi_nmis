package com.ydl.qc.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ydl.qc.mapper.NmisQcStdMapper;
import com.ydl.qc.domain.NmisQcStd;
import com.ydl.qc.service.INmisQcStdService;

/**
 * 护理质量标准Service业务层处理
 * 
 * @author ydl
 * @date 2025-05-07
 */
@Service
public class NmisQcStdServiceImpl implements INmisQcStdService 
{
    @Autowired
    private NmisQcStdMapper nmisQcStdMapper;

    /**
     * 查询护理质量标准
     * 
     * @param id 护理质量标准主键
     * @return 护理质量标准
     */
    @Override
    public NmisQcStd selectNmisQcStdById(String id)
    {
        return nmisQcStdMapper.selectNmisQcStdById(id);
    }

    /**
     * 查询护理质量标准列表
     * 
     * @param nmisQcStd 护理质量标准
     * @return 护理质量标准
     */
    @Override
    public List<NmisQcStd> selectNmisQcStdList(NmisQcStd nmisQcStd)
    {
        return nmisQcStdMapper.selectNmisQcStdList(nmisQcStd);
    }

    /**
     * 新增护理质量标准
     * 
     * @param nmisQcStd 护理质量标准
     * @return 结果
     */
    @Override
    public int insertNmisQcStd(NmisQcStd nmisQcStd)
    {
        return nmisQcStdMapper.insertNmisQcStd(nmisQcStd);
    }

    /**
     * 修改护理质量标准
     * 
     * @param nmisQcStd 护理质量标准
     * @return 结果
     */
    @Override
    public int updateNmisQcStd(NmisQcStd nmisQcStd)
    {
        return nmisQcStdMapper.updateNmisQcStd(nmisQcStd);
    }

    /**
     * 批量删除护理质量标准
     * 
     * @param ids 需要删除的护理质量标准主键
     * @return 结果
     */
    @Override
    public int deleteNmisQcStdByIds(String[] ids)
    {
        return nmisQcStdMapper.deleteNmisQcStdByIds(ids);
    }

    /**
     * 删除护理质量标准信息
     * 
     * @param id 护理质量标准主键
     * @return 结果
     */
    @Override
    public int deleteNmisQcStdById(String id)
    {
        return nmisQcStdMapper.deleteNmisQcStdById(id);
    }
}
