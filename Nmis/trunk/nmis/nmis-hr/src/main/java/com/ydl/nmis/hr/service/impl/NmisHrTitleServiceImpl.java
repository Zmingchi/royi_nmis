package com.ydl.nmis.hr.service.impl;


import java.util.List;

import com.github.pagehelper.PageHelper;
import com.ydl.nmis.hr.domain.NmisHrTitle;
import com.ydl.nmis.hr.dto.NmisHrTitleWithDept;
import com.ydl.nmis.hr.mapper.NmisHrTitleMapper;
import com.ydl.nmis.hr.service.INmisHrTitleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 护理人员职称信息Service业务层处理
 *
 * @author ydl
 * @date 2025-03-04
 */
@Service
public class NmisHrTitleServiceImpl implements INmisHrTitleService
{
    @Autowired
    private NmisHrTitleMapper nmisHrTitleMapper;

    /**
     * 查询护理人员职称信息
     *
     * @param id 护理人员职称信息主键
     * @return 护理人员职称信息
     */
    @Override
    public NmisHrTitle selectNmisHrTitleById(Long id)
    {
        return nmisHrTitleMapper.selectNmisHrTitleById(id);
    }

    /**
     * 通过科室查询护理人员职称信息
     *
     * @param  nmisHrTitleWithDept 护理人员职称信息主键
     * @return 护理人员职称信息
     */
    public List<Long> selectNmisHrTitleBydeptId(NmisHrTitleWithDept nmisHrTitleWithDept) {
        // 开启分页
        PageHelper.startPage(1, 10); // 第一页，每页 10 条
        return nmisHrTitleMapper.selectNmisHrTitleBydeptId(nmisHrTitleWithDept);
    }
    /**
     * 查询护理人员职称信息列表
     *
     * @param nmisHrTitle 护理人员职称信息
     * @return 护理人员职称信息
     */
    @Override
    public List<NmisHrTitle> selectNmisHrTitleList(NmisHrTitle nmisHrTitle)
    {
        return nmisHrTitleMapper.selectNmisHrTitleList(nmisHrTitle);
    }

    /**
     * 新增护理人员职称信息
     *
     * @param nmisHrTitle 护理人员职称信息
     * @return 结果
     */
    @Override
    public int insertNmisHrTitle(NmisHrTitle nmisHrTitle)
    {
        return nmisHrTitleMapper.insertNmisHrTitle(nmisHrTitle);
    }

    /**
     * 修改护理人员职称信息
     *
     * @param nmisHrTitle 护理人员职称信息
     * @return 结果
     */
    @Override
    public int updateNmisHrTitle(NmisHrTitle nmisHrTitle)
    {
        return nmisHrTitleMapper.updateNmisHrTitle(nmisHrTitle);
    }

    /**
     * 批量删除护理人员职称信息
     *
     * @param ids 需要删除的护理人员职称信息主键
     * @return 结果
     */
    @Override
    public int deleteNmisHrTitleByIds(Long[] ids)
    {
        return nmisHrTitleMapper.deleteNmisHrTitleByIds(ids);
    }

    /**
     * 删除护理人员职称信息信息
     *
     * @param id 护理人员职称信息主键
     * @return 结果
     */
    @Override
    public int deleteNmisHrTitleById(Long id)
    {
        return nmisHrTitleMapper.deleteNmisHrTitleById(id);
    }
}

