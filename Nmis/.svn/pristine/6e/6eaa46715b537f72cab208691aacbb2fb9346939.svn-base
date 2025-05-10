package com.ydl.qc.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ydl.qc.mapper.NmisQcChkPlanGrpUserMapper;
import com.ydl.qc.domain.NmisQcChkPlanGrpUser;
import com.ydl.qc.service.INmisQcChkPlanGrpUserService;

/**
 * 护理质量检查计划用户Service业务层处理
 * 
 * @author ydl
 * @date 2025-05-08
 */
@Service
public class NmisQcChkPlanGrpUserServiceImpl implements INmisQcChkPlanGrpUserService 
{
    @Autowired
    private NmisQcChkPlanGrpUserMapper nmisQcChkPlanGrpUserMapper;

    /**
     * 查询护理质量检查计划用户
     * 
     * @param id 护理质量检查计划用户主键
     * @return 护理质量检查计划用户
     */
    @Override
    public NmisQcChkPlanGrpUser selectNmisQcChkPlanGrpUserById(String id)
    {
        return nmisQcChkPlanGrpUserMapper.selectNmisQcChkPlanGrpUserById(id);
    }

    /**
     * 查询护理质量检查计划用户列表
     * 
     * @param nmisQcChkPlanGrpUser 护理质量检查计划用户
     * @return 护理质量检查计划用户
     */
    @Override
    public List<NmisQcChkPlanGrpUser> selectNmisQcChkPlanGrpUserList(NmisQcChkPlanGrpUser nmisQcChkPlanGrpUser)
    {
        return nmisQcChkPlanGrpUserMapper.selectNmisQcChkPlanGrpUserList(nmisQcChkPlanGrpUser);
    }

    /**
     * 新增护理质量检查计划用户
     * 
     * @param nmisQcChkPlanGrpUser 护理质量检查计划用户
     * @return 结果
     */
    @Override
    public int insertNmisQcChkPlanGrpUser(NmisQcChkPlanGrpUser nmisQcChkPlanGrpUser)
    {
        return nmisQcChkPlanGrpUserMapper.insertNmisQcChkPlanGrpUser(nmisQcChkPlanGrpUser);
    }

    /**
     * 修改护理质量检查计划用户
     * 
     * @param nmisQcChkPlanGrpUser 护理质量检查计划用户
     * @return 结果
     */
    @Override
    public int updateNmisQcChkPlanGrpUser(NmisQcChkPlanGrpUser nmisQcChkPlanGrpUser)
    {
        return nmisQcChkPlanGrpUserMapper.updateNmisQcChkPlanGrpUser(nmisQcChkPlanGrpUser);
    }

    /**
     * 批量删除护理质量检查计划用户
     * 
     * @param ids 需要删除的护理质量检查计划用户主键
     * @return 结果
     */
    @Override
    public int deleteNmisQcChkPlanGrpUserByIds(String[] ids)
    {
        return nmisQcChkPlanGrpUserMapper.deleteNmisQcChkPlanGrpUserByIds(ids);
    }

    /**
     * 删除护理质量检查计划用户信息
     * 
     * @param id 护理质量检查计划用户主键
     * @return 结果
     */
    @Override
    public int deleteNmisQcChkPlanGrpUserById(String id)
    {
        return nmisQcChkPlanGrpUserMapper.deleteNmisQcChkPlanGrpUserById(id);
    }
}
