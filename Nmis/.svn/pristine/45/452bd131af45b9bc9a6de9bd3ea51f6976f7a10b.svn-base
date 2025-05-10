package com.ydl.qc.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.ydl.common.annotation.Excel;
import com.ydl.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
/**
 * 护理质量检查明细记录对象 nmis_qc_chk_detail
 * 
 * @author ydl
 * @date 2025-05-08
 */
public class NmisQcChkDetail extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private String id;

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

    /** 分值 */
    @Excel(name = "分值")
    private Long score;

    /** 扣分原因 */
    @Excel(name = "扣分原因")
    private String descoreReason;

    /** 是否核查 */
    @Excel(name = "是否核查")
    private String checkFlag;

    /** 责任人ID */
    @Excel(name = "责任人ID")
    private String dutyNurseId;

    /** 责任人姓名 */
    @Excel(name = "责任人姓名")
    private String dutyNurseName;

    /** 标准ID */
    @Excel(name = "标准ID")
    private String stdId;

    /** 试卷ID */
    @Excel(name = "试卷ID")
    private String paperId;

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
    public void setScore(Long score) 
    {
        this.score = score;
    }

    public Long getScore() 
    {
        return score;
    }
    public void setDescoreReason(String descoreReason) 
    {
        this.descoreReason = descoreReason;
    }

    public String getDescoreReason() 
    {
        return descoreReason;
    }
    public void setCheckFlag(String checkFlag) 
    {
        this.checkFlag = checkFlag;
    }

    public String getCheckFlag() 
    {
        return checkFlag;
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
    public void setStdId(String stdId) 
    {
        this.stdId = stdId;
    }

    public String getStdId() 
    {
        return stdId;
    }
    public void setPaperId(String paperId) 
    {
        this.paperId = paperId;
    }

    public String getPaperId() 
    {
        return paperId;
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
            .append("stdItemId", getStdItemId())
            .append("stdItemName", getStdItemName())
            .append("detailItemId", getDetailItemId())
            .append("detailItemName", getDetailItemName())
            .append("score", getScore())
            .append("descoreReason", getDescoreReason())
            .append("checkFlag", getCheckFlag())
            .append("dutyNurseId", getDutyNurseId())
            .append("dutyNurseName", getDutyNurseName())
            .append("stdId", getStdId())
            .append("paperId", getPaperId())
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
