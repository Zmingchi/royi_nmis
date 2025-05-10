package com.ydl.nmis.schedule.domain;


import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.ydl.common.annotation.Excel;
import com.ydl.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 护理排班主对象 nmis_sche_master
 *
 * @author ydl
 * @date 2025-03-28
 */
public class NmisScheMaster extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    @Excel(name = "主键")
    private String id;

    /** 护理人员ID */
    @Excel(name = "护理人员ID")
    private String nurseId;

    /** 护理人员姓名 */
    @Excel(name = "护理人员姓名")
    private String nurseName;

    /** 科室ID */
    @Excel(name = "科室ID")
    private String deptId;

    /** 科室名称 */
    @Excel(name = "科室名称")
    private String deptName;

    /** 排班计划ID，引用NIS_SCHEDULE_PLAN中ID */
    @Excel(name = "排班计划ID，引用NIS_SCHEDULE_PLAN中ID")
    private String planId;

    /**  护理等级 */
    private String nurseLevel;

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

    /** 白班工时 */
    @Excel(name = "白班工时")
    private Long hours1;

    /** 夜班工时 */
    @Excel(name = "夜班工时")
    private Long hours2;

    /** 假期工时 */
    @Excel(name = "假期工时")
    private Long hours3;

    /** 休息工时 */
    @Excel(name = "休息工时")
    private Long hours4;

    /** 其他工时 */
    @Excel(name = "其他工时")
    private Long hours5;

    /** 累计加扣班 */
    @Excel(name = "累计加扣班")
    private Long hours6;

    /** 累计存假 */
    @Excel(name = "累计存假")
    private Long hours7;

    /** 年假 */
    @Excel(name = "年假")
    private Long hours8;

    /** 总工时 */
    @Excel(name = "总工时")
    private Long hours9;

    private String groupId;
    private String groupName;
    public void setId(String id)
    {
        this.id = id;
    }

    public String getId()
    {
        return id;
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
    public void setHours1(Long hours1)
    {
        this.hours1 = hours1;
    }

    public Long getHours1()
    {
        return hours1;
    }
    public void setHours2(Long hours2)
    {
        this.hours2 = hours2;
    }

    public Long getHours2()
    {
        return hours2;
    }
    public void setHours3(Long hours3)
    {
        this.hours3 = hours3;
    }

    public Long getHours3()
    {
        return hours3;
    }
    public void setHours4(Long hours4)
    {
        this.hours4 = hours4;
    }

    public Long getHours4()
    {
        return hours4;
    }
    public void setHours5(Long hours5)
    {
        this.hours5 = hours5;
    }

    public Long getHours5()
    {
        return hours5;
    }
    public void setHours6(Long hours6)
    {
        this.hours6 = hours6;
    }

    public Long getHours6()
    {
        return hours6;
    }
    public void setHours7(Long hours7)
    {
        this.hours7 = hours7;
    }

    public Long getHours7()
    {
        return hours7;
    }
    public void setHours8(Long hours8)
    {
        this.hours8 = hours8;
    }

    public Long getHours8()
    {
        return hours8;
    }
    public void setHours9(Long hours9)
    {
        this.hours9 = hours9;
    }

    public Long getHours9()
    {
        return hours9;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getNurseLevel() {
        return nurseLevel;
    }

    public void setNurseLevel(String nurseLevel) {
        this.nurseLevel = nurseLevel;
    }

    @Override
    public String toString() {
        return "NmisScheMaster{" +
                "id='" + id + '\'' +
                ", nurseId='" + nurseId + '\'' +
                ", nurseName='" + nurseName + '\'' +
                ", deptId='" + deptId + '\'' +
                ", deptName='" + deptName + '\'' +
                ", planId='" + planId + '\'' +
                ", nurseLevel='" + nurseLevel + '\'' +
                ", createId='" + createId + '\'' +
                ", creator='" + creator + '\'' +
                ", createDate=" + createDate +
                ", modifyId='" + modifyId + '\'' +
                ", modifier='" + modifier + '\'' +
                ", modifyDate=" + modifyDate +
                ", unitCode='" + unitCode + '\'' +
                ", hours1=" + hours1 +
                ", hours2=" + hours2 +
                ", hours3=" + hours3 +
                ", hours4=" + hours4 +
                ", hours5=" + hours5 +
                ", hours6=" + hours6 +
                ", hours7=" + hours7 +
                ", hours8=" + hours8 +
                ", hours9=" + hours9 +
                ", groupId='" + groupId + '\'' +
                ", groupName='" + groupName + '\'' +
                '}';
    }
}
