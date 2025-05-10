package com.ydl.qc.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.ydl.common.annotation.Excel;
import com.ydl.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
/**
 * 护理质量检查计划对象 nmis_qc_chk_plan
 * 
 * @author ydl
 * @date 2025-05-08
 */
public class NmisQcChkPlan extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private String id;

    /** 检查年份 */
    @Excel(name = "检查年份")
    private String checkYear;

    /** 计划名称 */
    @Excel(name = "计划名称")
    private String planName;

    /** 年/月/周/日等计划类型 */
    @Excel(name = "年/月/周/日等计划类型")
    private String planType;

    /** 制定计划时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "制定计划时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date planDate;

    /** 检查开始时间 */
    @Excel(name = "检查开始时间")
    private String beginDate;

    /** 检查结束时间 */
    @Excel(name = "检查结束时间")
    private String endDate;

    /** 检查开始时间 */
    @Excel(name = "检查开始时间")
    private String beginTime;

    /** 检查结束时间 */
    @Excel(name = "检查结束时间")
    private String endTime;

    /** 1：新建未发布 2：已发布 */
    @Excel(name = "1：新建未发布 2：已发布")
    private String status;

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
    public void setCheckYear(String checkYear) 
    {
        this.checkYear = checkYear;
    }

    public String getCheckYear() 
    {
        return checkYear;
    }
    public void setPlanName(String planName) 
    {
        this.planName = planName;
    }

    public String getPlanName() 
    {
        return planName;
    }
    public void setPlanType(String planType) 
    {
        this.planType = planType;
    }

    public String getPlanType() 
    {
        return planType;
    }
    public void setPlanDate(Date planDate) 
    {
        this.planDate = planDate;
    }

    public Date getPlanDate() 
    {
        return planDate;
    }
    public void setBeginDate(String beginDate) 
    {
        this.beginDate = beginDate;
    }

    public String getBeginDate() 
    {
        return beginDate;
    }
    public void setEndDate(String endDate) 
    {
        this.endDate = endDate;
    }

    public String getEndDate() 
    {
        return endDate;
    }
    public void setBeginTime(String beginTime) 
    {
        this.beginTime = beginTime;
    }

    public String getBeginTime() 
    {
        return beginTime;
    }
    public void setEndTime(String endTime) 
    {
        this.endTime = endTime;
    }

    public String getEndTime() 
    {
        return endTime;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
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
            .append("checkYear", getCheckYear())
            .append("planName", getPlanName())
            .append("planType", getPlanType())
            .append("planDate", getPlanDate())
            .append("beginDate", getBeginDate())
            .append("endDate", getEndDate())
            .append("beginTime", getBeginTime())
            .append("endTime", getEndTime())
            .append("status", getStatus())
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
