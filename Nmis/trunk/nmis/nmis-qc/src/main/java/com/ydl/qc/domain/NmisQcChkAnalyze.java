package com.ydl.qc.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.ydl.common.annotation.Excel;
import com.ydl.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 护理质量检查分析改进记录对象 nmis_qc_chk_analyze
 * 
 * @author ydl
 * @date 2025-05-08
 */
public class NmisQcChkAnalyze extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private String id;

    /** 护理单元编码 */
    @Excel(name = "护理单元编码")
    private String wardCode;

    /** 护理单元名称 */
    @Excel(name = "护理单元名称")
    private String wardName;

    /** 标准项目ID */
    @Excel(name = "标准项目ID")
    private String stdItemId;

    /** 标准项目名称 */
    @Excel(name = "标准项目名称")
    private String stdItemName;

    /** 细则ID */
    @Excel(name = "细则ID")
    private String detailItemId;

    /** 细则名称 */
    @Excel(name = "细则名称")
    private String detailItemName;

    /** 默认分值 */
    @Excel(name = "默认分值")
    private Long defaultScore;

    /** 得分 */
    @Excel(name = "得分")
    private Long score;

    /** 问题 */
    @Excel(name = "问题")
    private String problem;

    /** 原因 */
    @Excel(name = "原因")
    private String reason;

    /** 处理措施 */
    @Excel(name = "处理措施")
    private String measure;

    /** 效果 */
    @Excel(name = "效果")
    private String effect;

    /** 分析时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "分析时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date analyzeDate;

    /** 状态： 0：未处理 1：通过 2：不通过 3：忽略 */
    @Excel(name = "状态： 0：未处理 1：通过 2：不通过 3：忽略")
    private String status;

    /** NIS_QC_CHECK_DETAIL中Id */
    @Excel(name = "NIS_QC_CHECK_DETAIL中Id")
    private String checkDetailId;

    /** 创建人编码 */
    @Excel(name = "创建人编码")
    private String createId;

    /** 创建人名称 */
    @Excel(name = "创建人名称")
    private String creator;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createDate;

    /** 最后一次操作人编号 */
    @Excel(name = "最后一次操作人编号")
    private String modifyId;

    /** 最后一次操作人姓名 */
    @Excel(name = "最后一次操作人姓名")
    private String modifier;

    /** 最后更新时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "最后更新时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date modifyDate;

    /** 所属单位 */
    @Excel(name = "所属单位")
    private String unitCode;

    public void setId(String id) 
    {
        this.id = id;
    }

    public String getId() 
    {
        return id;
    }
    public void setWardCode(String wardCode) 
    {
        this.wardCode = wardCode;
    }

    public String getWardCode() 
    {
        return wardCode;
    }
    public void setWardName(String wardName) 
    {
        this.wardName = wardName;
    }

    public String getWardName() 
    {
        return wardName;
    }
    public void setStdItemId(String stdItemId) 
    {
        this.stdItemId = stdItemId;
    }

    public String getStdItemId() 
    {
        return stdItemId;
    }
    public void setStdItemName(String stdItemName) 
    {
        this.stdItemName = stdItemName;
    }

    public String getStdItemName() 
    {
        return stdItemName;
    }
    public void setDetailItemId(String detailItemId) 
    {
        this.detailItemId = detailItemId;
    }

    public String getDetailItemId() 
    {
        return detailItemId;
    }
    public void setDetailItemName(String detailItemName) 
    {
        this.detailItemName = detailItemName;
    }

    public String getDetailItemName() 
    {
        return detailItemName;
    }
    public void setDefaultScore(Long defaultScore) 
    {
        this.defaultScore = defaultScore;
    }

    public Long getDefaultScore() 
    {
        return defaultScore;
    }
    public void setScore(Long score) 
    {
        this.score = score;
    }

    public Long getScore() 
    {
        return score;
    }
    public void setProblem(String problem) 
    {
        this.problem = problem;
    }

    public String getProblem() 
    {
        return problem;
    }
    public void setReason(String reason) 
    {
        this.reason = reason;
    }

    public String getReason() 
    {
        return reason;
    }
    public void setMeasure(String measure) 
    {
        this.measure = measure;
    }

    public String getMeasure() 
    {
        return measure;
    }
    public void setEffect(String effect) 
    {
        this.effect = effect;
    }

    public String getEffect() 
    {
        return effect;
    }
    public void setAnalyzeDate(Date analyzeDate) 
    {
        this.analyzeDate = analyzeDate;
    }

    public Date getAnalyzeDate() 
    {
        return analyzeDate;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }
    public void setCheckDetailId(String checkDetailId) 
    {
        this.checkDetailId = checkDetailId;
    }

    public String getCheckDetailId() 
    {
        return checkDetailId;
    }
    public void setCreateId(String createId) 
    {
        this.createId = createId;
    }

    public String getCreateId() 
    {
        return createId;
    }
    public void setCreator(String creator) 
    {
        this.creator = creator;
    }

    public String getCreator() 
    {
        return creator;
    }
    public void setCreateDate(Date createDate) 
    {
        this.createDate = createDate;
    }

    public Date getCreateDate() 
    {
        return createDate;
    }
    public void setModifyId(String modifyId) 
    {
        this.modifyId = modifyId;
    }

    public String getModifyId() 
    {
        return modifyId;
    }
    public void setModifier(String modifier) 
    {
        this.modifier = modifier;
    }

    public String getModifier() 
    {
        return modifier;
    }
    public void setModifyDate(Date modifyDate) 
    {
        this.modifyDate = modifyDate;
    }

    public Date getModifyDate() 
    {
        return modifyDate;
    }
    public void setUnitCode(String unitCode) 
    {
        this.unitCode = unitCode;
    }

    public String getUnitCode() 
    {
        return unitCode;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("wardCode", getWardCode())
            .append("wardName", getWardName())
            .append("stdItemId", getStdItemId())
            .append("stdItemName", getStdItemName())
            .append("detailItemId", getDetailItemId())
            .append("detailItemName", getDetailItemName())
            .append("defaultScore", getDefaultScore())
            .append("score", getScore())
            .append("problem", getProblem())
            .append("reason", getReason())
            .append("measure", getMeasure())
            .append("effect", getEffect())
            .append("analyzeDate", getAnalyzeDate())
            .append("status", getStatus())
            .append("checkDetailId", getCheckDetailId())
            .append("createId", getCreateId())
            .append("creator", getCreator())
            .append("createDate", getCreateDate())
            .append("modifyId", getModifyId())
            .append("modifier", getModifier())
            .append("modifyDate", getModifyDate())
            .append("unitCode", getUnitCode())
            .toString();
    }
}
