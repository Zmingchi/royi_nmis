package com.ydl.nmis.hr.service.impl;


import java.util.List;

import com.ydl.nmis.hr.domain.NmisHrExpatriate;
import com.ydl.nmis.hr.mapper.NmisHrExpatriateMapper;
import com.ydl.nmis.hr.service.INmisHrExpatriateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * 护理人员外派信息Service业务层处理
 *
 * @author ydl
 * @date 2025-03-12
 */
@Service
public class NmisHrExpatriateServiceImpl implements INmisHrExpatriateService
{
    @Autowired
    private NmisHrExpatriateMapper nmisHrExpatriateMapper;

    /**
     * 查询护理人员外派信息
     *
     * @param id 护理人员外派信息主键
     * @return 护理人员外派信息
     */
    @Override
    public NmisHrExpatriate selectNmisHrExpatriateById(Long id)
    {
        return nmisHrExpatriateMapper.selectNmisHrExpatriateById(id);
    }

    /**
     * 查询护理人员外派信息列表
     *
     * @param nmisHrExpatriate 护理人员外派信息
     * @return 护理人员外派信息
     */
    @Override
    public List<NmisHrExpatriate> selectNmisHrExpatriateList(NmisHrExpatriate nmisHrExpatriate)
    {
        return nmisHrExpatriateMapper.selectNmisHrExpatriateList(nmisHrExpatriate);
    }

    /**
     * 新增护理人员外派信息
     *
     * @param nmisHrExpatriate 护理人员外派信息
     * @return 结果
     */
    @Override
    public int insertNmisHrExpatriate(NmisHrExpatriate nmisHrExpatriate)
    {
        return nmisHrExpatriateMapper.insertNmisHrExpatriate(nmisHrExpatriate);
    }

    /**
     * 修改护理人员外派信息
     *
     * @param nmisHrExpatriate 护理人员外派信息
     * @return 结果
     */
    @Override
    public int updateNmisHrExpatriate(NmisHrExpatriate nmisHrExpatriate)
    {
        return nmisHrExpatriateMapper.updateNmisHrExpatriate(nmisHrExpatriate);
    }

    /**
     * 批量删除护理人员外派信息
     *
     * @param ids 需要删除的护理人员外派信息主键
     * @return 结果
     */
    @Override
    public int deleteNmisHrExpatriateByIds(Long[] ids)
    {
        return nmisHrExpatriateMapper.deleteNmisHrExpatriateByIds(ids);
    }

    /**
     * 删除护理人员外派信息信息
     *
     * @param id 护理人员外派信息主键
     * @return 结果
     */
    @Override
    public int deleteNmisHrExpatriateById(Long id)
    {
        return nmisHrExpatriateMapper.deleteNmisHrExpatriateById(id);
    }
}

