package com.ydl.nmis.hr.service.impl;


import java.util.List;

import com.ydl.nmis.hr.domain.NmisHrUserEdu;
import com.ydl.nmis.hr.mapper.NmisHrUserEduMapper;
import com.ydl.nmis.hr.service.INmisHrUserEduService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 护理人员教育信息Service业务层处理
 *
 * @author ydl
 * @date 2025-03-05
 */
@Service
public class NmisHrUserEduServiceImpl implements INmisHrUserEduService
{
    @Autowired
    private NmisHrUserEduMapper nmisHrUserEduMapper;

    /**
     * 查询护理人员教育信息
     *
     * @param id 护理人员教育信息主键
     * @return 护理人员教育信息
     */
    @Override
    public NmisHrUserEdu selectNmisHrUserEduById(Long id)
    {
        return nmisHrUserEduMapper.selectNmisHrUserEduById(id);
    }

    /**
     * 查询护理人员教育信息列表
     *
     * @param nmisHrUserEdu 护理人员教育信息
     * @return 护理人员教育信息
     */
    @Override
    public List<NmisHrUserEdu> selectNmisHrUserEduList(NmisHrUserEdu nmisHrUserEdu)
    {
        return nmisHrUserEduMapper.selectNmisHrUserEduList(nmisHrUserEdu);
    }

    /**
     * 新增护理人员教育信息
     *
     * @param nmisHrUserEdu 护理人员教育信息
     * @return 结果
     */
    @Override
    public int insertNmisHrUserEdu(NmisHrUserEdu nmisHrUserEdu)
    {
        return nmisHrUserEduMapper.insertNmisHrUserEdu(nmisHrUserEdu);
    }

    /**
     * 修改护理人员教育信息
     *
     * @param nmisHrUserEdu 护理人员教育信息
     * @return 结果
     */
    @Override
    public int updateNmisHrUserEdu(NmisHrUserEdu nmisHrUserEdu)
    {
        return nmisHrUserEduMapper.updateNmisHrUserEdu(nmisHrUserEdu);
    }

    /**
     * 批量删除护理人员教育信息
     *
     * @param ids 需要删除的护理人员教育信息主键
     * @return 结果
     */
    @Override
    public int deleteNmisHrUserEduByIds(Long[] ids)
    {
        return nmisHrUserEduMapper.deleteNmisHrUserEduByIds(ids);
    }

    /**
     * 删除护理人员教育信息信息
     *
     * @param id 护理人员教育信息主键
     * @return 结果
     */
    @Override
    public int deleteNmisHrUserEduById(Long id)
    {
        return nmisHrUserEduMapper.deleteNmisHrUserEduById(id);
    }
}
