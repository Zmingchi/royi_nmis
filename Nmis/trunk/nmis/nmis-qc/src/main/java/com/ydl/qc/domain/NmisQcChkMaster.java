package com.ydl.qc.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.ydl.common.annotation.Excel;
import com.ydl.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
/**
 * 护理质量检查主记录对象 nmis_qc_chk_master
 * 
 * @author ydl
 * @date 2025-05-08
 */
public class NmisQcChkMaster extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private String id;

    /** 检查时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "检查时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date checkDate;

    /** 引用NIS_QC_CHECK_PLAN_PAPER中ID */
    @Excel(name = "引用NIS_QC_CHECK_PLAN_PAPER中ID")
    private String planPaperId;

    /** 引用NIS_QC_CHECK_PLAN_PAPER中PAPER_ID */
    @Excel(name = "引用NIS_QC_CHECK_PLAN_PAPER中PAPER_ID")
    private String paperId;

    /** 引用NIS_QC_CHECK_PLAN_PAPER中PAPER_NAME */
    @Excel(name = "引用NIS_QC_CHECK_PLAN_PAPER中PAPER_NAME")
    private String paperName;

    /** 责任人Id */
    @Excel(name = "责任人Id")
    private String dutyNurseId;

    /** 责任人姓名 */
    @Excel(name = "责任人姓名")
    private String dutyNurseName;

    /** 得分率 */
    @Excel(name = "得分率")
    private Long score;

    /** 随机检查 1：是 0：否 */
    @Excel(name = "随机检查 1：是 0：否")
    private String randomFlag;

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
    public void setCheckDate(Date checkDate) 
    {
        this.checkDate = checkDate;
    }

    public Date getCheckDate() 
    {
        return checkDate;
    }
    public void setPlanPaperId(String planPaperId) 
    {
        this.planPaperId = planPaperId;
    }

    public String getPlanPaperId() 
    {
        return planPaperId;
    }
    public void setPaperId(String paperId) 
    {
        this.paperId = paperId;
    }

    public String getPaperId() 
    {
        return paperId;
    }
    public void setPaperName(String paperName) 
    {
        this.paperName = paperName;
    }

    public String getPaperName() 
    {
        return paperName;
    }
    public void setDutyNurseId(String dutyNurseId) 
    {
        this.dutyNurseId = dutyNurseId;
    }

    public String getDutyNurseId() 
    {
        return dutyNurseId;
    }
    public void setDutyNurseName(String dutyNurseName) 
    {
        this.dutyNurseName = dutyNurseName;
    }

    public String getDutyNurseName() 
    {
        return dutyNurseName;
    }
    public void setScore(Long score) 
    {
        this.score = score;
    }

    public Long getScore() 
    {
        return score;
    }
    public void setRandomFlag(String randomFlag) 
    {
        this.randomFlag = randomFlag;
    }

    public String getRandomFlag() 
    {
        return randomFlag;
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
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("checkDate", getCheckDate())
            .append("planPaperId", getPlanPaperId())
            .append("paperId", getPaperId())
            .append("paperName", getPaperName())
            .append("dutyNurseId", getDutyNurseId())
            .append("dutyNurseName", getDutyNurseName())
            .append("score", getScore())
            .append("randomFlag", getRandomFlag())
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
