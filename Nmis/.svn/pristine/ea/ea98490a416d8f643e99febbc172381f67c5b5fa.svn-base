package com.ydl.nmis.schedule.domain;


import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.ydl.common.annotation.Excel;
import com.ydl.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 护理排班对象 nmis_sche_detail
 *
 * @author ydl
 * @date 2025-03-28
 */
public class NmisScheDetail extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private String id;

    /** 班次日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "班次日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date scheDate;

    /** 班次ID */
    @Excel(name = "班次ID")
    private String scheItemId;

    /** 引用NMIS_SCHEDULE_MASTER中ID */
    @Excel(name = "引用NMIS_SCHEDULE_MASTER中ID")
    private String sheduleId;

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

    /** 护士ID */
    @Excel(name = "护士ID")
    private String nurseId;

    /** 护士姓名 */
    @Excel(name = "护士姓名")
    private String nurseName;

    /** 所属科室编码 */
    @Excel(name = "所属科室编码")
    private String deptId;

    /** 所属科室名称 */
    @Excel(name = "所属科室名称")
    private String deptName;

    /** 引用NMIS_SCHEDULE_PLAN中ID */
    @Excel(name = "引用NMIS_SCHEDULE_PLAN中ID")
    private String planId;

    /** 工时 */
    @Excel(name = "工时")
    private Long scheHours;

    /** 工时增减，增加工时填正数，扣减工时填负数 */
    @Excel(name = "工时增减，增加工时填正数，扣减工时填负数")
    private Long scheHoursChange;

    /** 班次名称 */
    @Excel(name = "班次名称")
    private String scheName;

    public void setId(String id)
    {
        this.id = id;
    }

    public String getId()
    {
        return id;
    }
    public void setScheDate(Date scheDate)
    {
        this.scheDate = scheDate;
    }

    public Date getScheDate()
    {
        return scheDate;
    }
    public void setScheItemId(String scheItemId)
    {
        this.scheItemId = scheItemId;
    }

    public String getScheItemId()
    {
        return scheItemId;
    }
    public void setSheduleId(String sheduleId)
    {
        this.sheduleId = sheduleId;
    }

    public String getSheduleId()
    {
        return sheduleId;
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
    public void setNurseId(String nurseId)
    {
        this.nurseId = nurseId;
    }

    public String getNurseId()
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
    public void setPlanId(String planId)
    {
        this.planId = planId;
    }

    public String getPlanId()
    {
        return planId;
    }
    public void setScheHours(Long scheHours)
    {
        this.scheHours = scheHours;
    }

    public Long getScheHours()
    {
        return scheHours;
    }
    public void setScheHoursChange(Long scheHoursChange)
    {
        this.scheHoursChange = scheHoursChange;
    }

    public Long getScheHoursChange()
    {
        return scheHoursChange;
    }
    public void setScheName(String scheName)
    {
        this.scheName = scheName;
    }

    public String getScheName()
    {
        return scheName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("scheDate", getScheDate())
                .append("scheItemId", getScheItemId())
                .append("sheduleId", getSheduleId())
                .append("revision", getRevision())
                .append("createId", getCreateId())
                .append("creator", getCreator())
                .append("createDate", getCreateDate())
                .append("modifyId", getModifyId())
                .append("modifier", getModifier())
                .append("modifyDate", getModifyDate())
                .append("unitCode", getUnitCode())
                .append("nurseId", getNurseId())
                .append("nurseName", getNurseName())
                .append("deptId", getDeptId())
                .append("deptName", getDeptName())
                .append("planId", getPlanId())
                .append("scheHours", getScheHours())
                .append("scheHoursChange", getScheHoursChange())
                .append("remark", getRemark())
                .append("scheName", getScheName())
                .toString();
    }
}

