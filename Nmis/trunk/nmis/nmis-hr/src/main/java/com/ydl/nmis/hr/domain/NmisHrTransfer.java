package com.ydl.nmis.hr.domain;


import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.ydl.common.annotation.Excel;
import com.ydl.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * 护理人员调科信息对象 nmis_hr_transfer
 *
 * @author ydl
 * @date 2025-03-05
 */
public class NmisHrTransfer extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 护士ID */
    @Excel(name = "护士ID")
    @NotNull(message = "护士id不能为空")
    private Long nurseId;

    /** 护士姓名 */
    @Excel(name = "护士姓名")
    @NotBlank(message = "护士姓名不能为空")
    private String nurseName;

    /** 调出科室ID */
    @Excel(name = "调出科室ID")
    @NotBlank(message = "调出科室不能为空")
    private String srcDeptId;

    /** 调出科室名称 */
    @Excel(name = "调出科室名称")
    @NotBlank(message = "调出科室名字不能为空")
    private String srcDeptName;

    /** 调入科室ID */
    @Excel(name = "调入科室ID")
    @NotBlank(message = "调入科室不能为空")
    private String destDeptId;

    /** 调入科室名称 */
    @Excel(name = "调入科室名称")
    @NotBlank(message = "调入科室名称不能为空")
    private String destDeptName;

    /** 调科时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "调科时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date transDate;

    /** 调科原因 */
    @Excel(name = "调科原因")
    private String transReason;

    /** 删除标志 1：删除 0：未删除 */
    private Long delFlag;

    /** 版本号 */
    @Excel(name = "版本号")
    private Long revision;

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

    /**所在科室 */
    private String deptId;

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setNurseId(Long nurseId)
    {
        this.nurseId = nurseId;
    }

    public Long getNurseId()
    {
        return nurseId;
    }
    public void setNurseName(String nurseName)
    {
        this.nurseName = nurseName;
    }

    public String getNurseName()
    {
        return nurseName;
    }
    public void setSrcDeptId(String srcDeptId)
    {
        this.srcDeptId = srcDeptId;
    }

    public String getSrcDeptId()
    {
        return srcDeptId;
    }
    public void setSrcDeptName(String srcDeptName)
    {
        this.srcDeptName = srcDeptName;
    }

    public String getSrcDeptName()
    {
        return srcDeptName;
    }
    public void setDestDeptId(String destDeptId)
    {
        this.destDeptId = destDeptId;
    }

    public String getDestDeptId()
    {
        return destDeptId;
    }
    public void setDestDeptName(String destDeptName)
    {
        this.destDeptName = destDeptName;
    }

    public String getDestDeptName()
    {
        return destDeptName;
    }
    public void setTransDate(Date transDate)
    {
        this.transDate = transDate;
    }

    public Date getTransDate()
    {
        return transDate;
    }
    public void setTransReason(String transReason)
    {
        this.transReason = transReason;
    }

    public String getTransReason()
    {
        return transReason;
    }
    public void setDelFlag(Long delFlag)
    {
        this.delFlag = delFlag;
    }

    public Long getDelFlag()
    {
        return delFlag;
    }
    public void setRevision(Long revision)
    {
        this.revision = revision;
    }

    public Long getRevision()
    {
        return revision;
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
                .append("nurseId", getNurseId())
                .append("nurseName", getNurseName())
                .append("srcDeptId", getSrcDeptId())
                .append("srcDeptName", getSrcDeptName())
                .append("destDeptId", getDestDeptId())
                .append("destDeptName", getDestDeptName())
                .append("transDate", getTransDate())
                .append("transReason", getTransReason())
                .append("remark", getRemark())
                .append("delFlag", getDelFlag())
                .append("revision", getRevision())
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

