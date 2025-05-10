package com.ydl.nmis.schedule.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ydl.common.core.domain.BaseEntity;

import java.util.Date;


public class NursingUnitStaffDetail extends BaseEntity {
    private String nurseName;
    private String workYear;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date scheDate;
    private String nurseLevel;

    private String deptId;
    private String scheName;

    public String getNurseName() {
        return nurseName;
    }

    public void setNurseName(String nurseName) {
        this.nurseName = nurseName;
    }

    public String getWorkYear() {
        return workYear;
    }

    public void setWorkYear(String workYear) {
        this.workYear = workYear;
    }

    public Date getScheDate() {
        return scheDate;
    }

    public void setScheDate(Date scheDate) {
        this.scheDate = scheDate;
    }

    public String getNurseLevel() {
        return nurseLevel;
    }

    public void setNurseLevel(String nurseLevel) {
        this.nurseLevel = nurseLevel;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getScheName() {
        return scheName;
    }

    public void setScheName(String scheName) {
        this.scheName = scheName;
    }

    @Override
    public String toString() {
        return "NursingUnitStaffDetail{" +
                "nurseName='" + nurseName + '\'' +
                ", workYear='" + workYear + '\'' +
                ", scheDate=" + scheDate +
                ", nurseLevel='" + nurseLevel + '\'' +
                ", deptId='" + deptId + '\'' +
                ", className='" + scheName + '\'' +
                '}';
    }
}
