package com.ydl.qc.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.ydl.common.annotation.Excel;
import com.ydl.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 护理质量标准对象 nmis_qc_std
 * 
 * @author ydl
 * @date 2025-05-07
 */
public class NmisQcStd extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private String id;

    /** 标准名称 */
    @Excel(name = "标准名称")
    private String stdName;

    /** 标准分类 */
    @Excel(name = "标准分类")
    private String stdClass;

    /** 标准类型 */
    @Excel(name = "标准类型")
    private String stdType;

    /** 标准类别 */
    @Excel(name = "标准类别")
    private String stdCategory;

    /** 状态 */
    @Excel(name = "状态")
    private String status;

    /** 审核人ID */
    @Excel(name = "审核人ID")
    private String verifyUserId;

    /** 审核人姓名 */
    @Excel(name = "审核人姓名")
    private String verifyUserName;

    /** 审核时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "审核时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date verifyDate;

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

    /** 删除标志 1：删除 0：未删除 */
    private Long delFlag;

    public void setId(String id) 
    {
        this.id = id;
    }

    public String getId() 
    {
        return id;
    }
    public void setStdName(String stdName) 
    {
        this.stdName = stdName;
    }

    public String getStdName() 
    {
        return stdName;
    }
    public void setStdClass(String stdClass) 
    {
        this.stdClass = stdClass;
    }

    public String getStdClass() 
    {
        return stdClass;
    }
    public void setStdType(String stdType) 
    {
        this.stdType = stdType;
    }

    public String getStdType() 
    {
        return stdType;
    }
    public void setStdCategory(String stdCategory) 
    {
        this.stdCategory = stdCategory;
    }

    public String getStdCategory() 
    {
        return stdCategory;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }
    public void setVerifyUserId(String verifyUserId) 
    {
        this.verifyUserId = verifyUserId;
    }

    public String getVerifyUserId() 
    {
        return verifyUserId;
    }
    public void setVerifyUserName(String verifyUserName) 
    {
        this.verifyUserName = verifyUserName;
    }

    public String getVerifyUserName() 
    {
        return verifyUserName;
    }
    public void setVerifyDate(Date verifyDate) 
    {
        this.verifyDate = verifyDate;
    }

    public Date getVerifyDate() 
    {
        return verifyDate;
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
    public void setDelFlag(Long delFlag) 
    {
        this.delFlag = delFlag;
    }

    public Long getDelFlag() 
    {
        return delFlag;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("stdName", getStdName())
            .append("stdClass", getStdClass())
            .append("stdType", getStdType())
            .append("stdCategory", getStdCategory())
            .append("status", getStatus())
            .append("verifyUserId", getVerifyUserId())
            .append("verifyUserName", getVerifyUserName())
            .append("verifyDate", getVerifyDate())
            .append("createId", getCreateId())
            .append("creator", getCreator())
            .append("createDate", getCreateDate())
            .append("modifyId", getModifyId())
            .append("modifier", getModifier())
            .append("modifyDate", getModifyDate())
            .append("unitCode", getUnitCode())
            .append("delFlag", getDelFlag())
            .toString();
    }
}
