package com.ydl.qc.mapper;

import java.util.List;
import com.ydl.qc.domain.NmisQcChkPlanGrpUser;

/**
 * 护理质量检查计划用户Mapper接口
 * 
 * @author ydl
 * @date 2025-05-08
 */
public interface NmisQcChkPlanGrpUserMapper 
{
    /**
     * 查询护理质量检查计划用户
     * 
     * @param id 护理质量检查计划用户主键
     * @return 护理质量检查计划用户
     */
    public NmisQcChkPlanGrpUser selectNmisQcChkPlanGrpUserById(String id);

    /**
     * 查询护理质量检查计划用户列表
     * 
     * @param nmisQcChkPlanGrpUser 护理质量检查计划用户
     * @return 护理质量检查计划用户集合
     */
    public List<NmisQcChkPlanGrpUser> selectNmisQcChkPlanGrpUserList(NmisQcChkPlanGrpUser nmisQcChkPlanGrpUser);

    /**
     * 新增护理质量检查计划用户
     * 
     * @param nmisQcChkPlanGrpUser 护理质量检查计划用户
     * @return 结果
     */
    public int insertNmisQcChkPlanGrpUser(NmisQcChkPlanGrpUser nmisQcChkPlanGrpUser);

    /**
     * 修改护理质量检查计划用户
     * 
     * @param nmisQcChkPlanGrpUser 护理质量检查计划用户
     * @return 结果
     */
    public int updateNmisQcChkPlanGrpUser(NmisQcChkPlanGrpUser nmisQcChkPlanGrpUser);

    /**
     * 删除护理质量检查计划用户
     * 
     * @param id 护理质量检查计划用户主键
     * @return 结果
     */
    public int deleteNmisQcChkPlanGrpUserById(String id);

    /**
     * 批量删除护理质量检查计划用户
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteNmisQcChkPlanGrpUserByIds(String[] ids);
}
