package com.ydl.nmis.schedule.domain;


import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.ydl.common.annotation.Excel;
import com.ydl.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.validation.constraints.NotBlank;

/**
 * 护理班次字典对象 nmis_sche_dict
 *
 * @author ydl
 * @date 2025-03-18
 */


public class NmisScheDict extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private String id;

    /** 班次名称 */
    @NotBlank(message = "班次名称不能为空")
    @Excel(name = "班次名称")
    private String scheName;

    /** 班次描述 */
    @Excel(name = "班次描述")
    private String scheDesc;

    /** 开始时间 */
    @NotBlank(message = "开始时间不能为空")
    @Excel(name = "开始时间")
    private String beginTime;

    /** 结束时间 */
    @NotBlank(message = "结束时间不能为空")
    @Excel(name = "结束时间")
    private String endTime;

    /** 开始时间 */
    @Excel(name = "开始时间")
    private String beginTime1;

    /** 结束时间 */
    @Excel(name = "结束时间")
    private String endTime1;

    /** 总计工时 */
    @Excel(name = "总计工时")
    private Long hours;

    /** 班次类别ID */
    @Excel(name = "班次类别ID")
    private String classId;

    /** 输入码 */
    @Excel(name = "输入码")
    private String inputCode;

    /** 排序号 */
    @Excel(name = "排序号")
    private Long serialNo;

    /** 状态： 1：停用 0：启用 */
    @Excel(name = "状态： 1：停用 0：启用")
    private String status;

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

    /** 班次颜色 */
    @Excel(name = "班次颜色")
    private String scheColor;

    /** 所属科室编码 如果全院班次则为*，否则科室编码 */
    @Excel(name = "所属科室编码 如果全院班次则为*，否则科室编码")
    private String deptId;

    /** 所属科室名称 如果全院班次则为全院，否则科室名称 */
    @Excel(name = "所属科室名称 如果全院班次则为全院，否则科室名称")
    private String deptName;

    /** 班次类型 1：全院班次 2：科室班次 */
    @Excel(name = "班次类型 1：全院班次 2：科室班次")
    private String scheType;

    public void setId(String id)
    {
        this.id = id;
    }

    public String getId()
    {
        return id;
    }
    public void setScheName(String scheName)
    {
        this.scheName = scheName;
    }

    public String getScheName()
    {
        return scheName;
    }
    public void setScheDesc(String scheDesc)
    {
        this.scheDesc = scheDesc;
    }

    public String getScheDesc()
    {
        return scheDesc;
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
    public void setBeginTime1(String beginTime1)
    {
        this.beginTime1 = beginTime1;
    }

    public String getBeginTime1()
    {
        return beginTime1;
    }
    public void setEndTime1(String endTime1)
    {
        this.endTime1 = endTime1;
    }

    public String getEndTime1()
    {
        return endTime1;
    }
    public void setHours(Long hours)
    {
        this.hours = hours;
    }

    public Long getHours()
    {
        return hours;
    }
    public void setClassId(String classId)
    {
        this.classId = classId;
    }

    public String getClassId()
    {
        return classId;
    }
    public void setInputCode(String inputCode)
    {
        this.inputCode = inputCode;
    }

    public String getInputCode()
    {
        return inputCode;
    }
    public void setSerialNo(Long serialNo)
    {
        this.serialNo = serialNo;
    }

    public Long getSerialNo()
    {
        return serialNo;
    }
    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getStatus()
    {
        return status;
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
    public void setScheColor(String scheColor)
    {
        this.scheColor = scheColor;
    }

    public String getScheColor()
    {
        return scheColor;
    }
    public void setDeptId(String deptId)
    {
        this.deptId = deptId;
    }

    public String getDeptId()
    {
        return deptId;
    }
    public void setDeptName(String deptName)
    {
        this.deptName = deptName;
    }

    public String getDeptName()
    {
        return deptName;
    }
    public void setScheType(String scheType)
    {
        this.scheType = scheType;
    }

    public String getScheType()
    {
        return scheType;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("scheName", getScheName())
                .append("scheDesc", getScheDesc())
                .append("beginTime", getBeginTime())
                .append("endTime", getEndTime())
                .append("beginTime1", getBeginTime1())
                .append("endTime1", getEndTime1())
                .append("hours", getHours())
                .append("classId", getClassId())
                .append("inputCode", getInputCode())
                .append("serialNo", getSerialNo())
                .append("status", getStatus())
                .append("delFlag", getDelFlag())
                .append("revision", getRevision())
                .append("createId", getCreateId())
                .append("creator", getCreator())
                .append("createDate", getCreateDate())
                .append("modifyId", getModifyId())
                .append("modifier", getModifier())
                .append("modifyDate", getModifyDate())
                .append("unitCode", getUnitCode())
                .append("scheColor", getScheColor())
                .append("deptId", getDeptId())
                .append("deptName", getDeptName())
                .append("scheType", getScheType())
                .toString();
    }
}

