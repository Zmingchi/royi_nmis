package com.ydl.qc.mapper;

import java.util.List;
import com.ydl.qc.domain.NmisQcStdItemDetail;

/**
 * 护理质量标准项目细则Mapper接口
 * 
 * @author ydl
 * @date 2025-05-07
 */
public interface NmisQcStdItemDetailMapper 
{
    /**
     * 查询护理质量标准项目细则
     * 
     * @param id 护理质量标准项目细则主键
     * @return 护理质量标准项目细则
     */
    public NmisQcStdItemDetail selectNmisQcStdItemDetailById(String id);

    /**
     * 查询护理质量标准项目细则列表
     * 
     * @param nmisQcStdItemDetail 护理质量标准项目细则
     * @return 护理质量标准项目细则集合
     */
    public List<NmisQcStdItemDetail> selectNmisQcStdItemDetailList(NmisQcStdItemDetail nmisQcStdItemDetail);

    /**
     * 新增护理质量标准项目细则
     * 
     * @param nmisQcStdItemDetail 护理质量标准项目细则
     * @return 结果
     */
    public int insertNmisQcStdItemDetail(NmisQcStdItemDetail nmisQcStdItemDetail);

    /**
     * 修改护理质量标准项目细则
     * 
     * @param nmisQcStdItemDetail 护理质量标准项目细则
     * @return 结果
     */
    public int updateNmisQcStdItemDetail(NmisQcStdItemDetail nmisQcStdItemDetail);

    /**
     * 删除护理质量标准项目细则
     * 
     * @param id 护理质量标准项目细则主键
     * @return 结果
     */
    public int deleteNmisQcStdItemDetailById(String id);

    /**
     * 批量删除护理质量标准项目细则
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteNmisQcStdItemDetailByIds(String[] ids);
}
