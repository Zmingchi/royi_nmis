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
 * 护理人员证书获得情况对象 nmis_hr_certificate
 *
 * @author ydl
 * @date 2025-03-05
 */
public class NmisHrCertificate extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 护士Id */
    @Excel(name = "护士Id")
    @NotNull(message = "护士id不能为空")
    private Long nurseId;

    /** 护士姓名 */
    @Excel(name = "护士姓名")
    @NotBlank(message = "护士姓名不能为空")
    private String nurseName;

    /** 证书名称 */
    @Excel(name = "证书名称")
    @NotBlank(message = "证书名称不能为空")
    private String certName;

    /** 获得证书时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "或者证书时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date certDate;

    /** 证书失效时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "证书失效时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date expirationDate;

    /** 附件 */
    @Excel(name = "附件")
    private String attachment;

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
    public void setCertName(String certName)
    {
        this.certName = certName;
    }

    public String getCertName()
    {
        return certName;
    }
    public void setCertDate(Date certDate)
    {
        this.certDate = certDate;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Date getCertDate()
    {
        return certDate;
    }
    public void setAttachment(String attachment)
    {
        this.attachment = attachment;
    }

    public String getAttachment()
    {
        return attachment;
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
        return "NmisHrCertificate{" +
                "id=" + id +
                ", nurseId=" + nurseId +
                ", nurseName='" + nurseName + '\'' +
                ", certName='" + certName + '\'' +
                ", certDate=" + certDate +
                ", expirationDate=" + expirationDate +
                ", attachment='" + attachment + '\'' +
                ", delFlag=" + delFlag +
                ", revision=" + revision +
                ", createId='" + createId + '\'' +
                ", creator='" + creator + '\'' +
                ", createDate=" + createDate +
                ", modifyId='" + modifyId + '\'' +
                ", modifier='" + modifier + '\'' +
                ", modifyDate=" + modifyDate +
                ", unitCode='" + unitCode + '\'' +
                ", deptId='" + deptId + '\'' +
                '}';
    }
}

