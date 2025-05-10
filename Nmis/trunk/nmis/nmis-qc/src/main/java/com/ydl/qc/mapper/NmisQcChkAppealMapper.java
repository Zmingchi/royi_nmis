package com.ydl.qc.mapper;

import java.util.List;
import com.ydl.qc.domain.NmisQcChkAppeal;

/**
 * 护理质量检查申诉记录Mapper接口
 * 
 * @author ydl
 * @date 2025-05-08
 */
public interface NmisQcChkAppealMapper 
{
    /**
     * 查询护理质量检查申诉记录
     * 
     * @param id 护理质量检查申诉记录主键
     * @return 护理质量检查申诉记录
     */
    public NmisQcChkAppeal selectNmisQcChkAppealById(String id);

    /**
     * 查询护理质量检查申诉记录列表
     * 
     * @param nmisQcChkAppeal 护理质量检查申诉记录
     * @return 护理质量检查申诉记录集合
     */
    public List<NmisQcChkAppeal> selectNmisQcChkAppealList(NmisQcChkAppeal nmisQcChkAppeal);

    /**
     * 新增护理质量检查申诉记录
     * 
     * @param nmisQcChkAppeal 护理质量检查申诉记录
     * @return 结果
     */
    public int insertNmisQcChkAppeal(NmisQcChkAppeal nmisQcChkAppeal);

    /**
     * 修改护理质量检查申诉记录
     * 
     * @param nmisQcChkAppeal 护理质量检查申诉记录
     * @return 结果
     */
    public int updateNmisQcChkAppeal(NmisQcChkAppeal nmisQcChkAppeal);

    /**
     * 删除护理质量检查申诉记录
     * 
     * @param id 护理质量检查申诉记录主键
     * @return 结果
     */
    public int deleteNmisQcChkAppealById(String id);

    /**
     * 批量删除护理质量检查申诉记录
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteNmisQcChkAppealByIds(String[] ids);
}
