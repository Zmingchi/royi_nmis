package com.ydl.nmis.schedule.dto;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.ydl.common.annotation.Excel;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 护理排班计划对象 nmis_sche_plan
 *
 * @author ydl
 * @date 2025-03-28
 */
public class SchePlan
{

    /** 主键 */
    private String id;

    /** 科室ID (如果是总值班排班，则此字段值为*) */
    @Excel(name = "科室ID (如果是总值班排班，则此字段值为*)")
    private String deptId;

    /** 科室名称 */
    @Excel(name = "科室名称")
    private String deptName;

    /** 排班类型 1：科室排班 2：护理总值班排班 */
    @Excel(name = "排班类型 1：科室排班 2：护理总值班排班")
    private String scheduleType;

    /** 排班周期类型 1：周排班 2：月排班 */
    @Excel(name = "排班周期类型 1：周排班 2：月排班")
    private String periodType;

    /** 周期ID,周排班时代表第几周，月排班时代表第几个月 */
    @Excel(name = "周期ID,周排班时代表第几周，月排班时代表第几个月")
    private String periodId;

    /** 排班周期开始时间 */
    @Excel(name = "排班周期开始时间")
    private String beginDate;

    /** 排班周期结束时间 */
    @Excel(name = "排班周期结束时间")
    private String endDate;

    /** 状态：1：已保存，2：已发布 */
    @Excel(name = "状态：1：已保存，2：已发布")
    private String status;

    private String remark;

    List<ScheUserGroup> groups;

    public void setId(String id)
    {
        this.id = id;
    }

    public String getId()
    {
        return id;
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
    public void setScheduleType(String scheduleType)
    {
        this.scheduleType = scheduleType;
    }

    public String getScheduleType()
    {
        return scheduleType;
    }
    public void setPeriodType(String periodType)
    {
        this.periodType = periodType;
    }

    public String getPeriodType()
    {
        return periodType;
    }
    public void setPeriodId(String periodId)
    {
        this.periodId = periodId;
    }

    public String getPeriodId()
    {
        return periodId;
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
    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getStatus()
    {
        return status;
    }

    public List<ScheUserGroup> getGroups() {
        return groups;
    }

    public void setGroups(List<ScheUserGroup> groups) {
        this.groups = groups;
    }
    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("deptId", getDeptId())
                .append("deptName", getDeptName())
                .append("scheduleType", getScheduleType())
                .append("periodType", getPeriodType())
                .append("periodId", getPeriodId())
                .append("beginDate", getBeginDate())
                .append("endDate", getEndDate())
                .append("status", getStatus())
                .toString();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
