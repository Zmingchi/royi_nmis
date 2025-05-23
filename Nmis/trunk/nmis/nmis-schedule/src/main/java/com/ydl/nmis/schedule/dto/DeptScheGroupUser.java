package com.ydl.nmis.schedule.dto;

import com.ydl.common.annotation.Excel;

public class DeptScheGroupUser {

    private  String seqNo;

    private String groupId;

    private String groupName;

    private String deptId;

    private String deptName;

    private String nurseLevel;

    private String enterDate;

    private String nurseId;

    private String nurseName;


    public String getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(String seqNo) {
        this.seqNo = seqNo;
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

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getNurseLevel() {
        return nurseLevel;
    }

    public void setNurseLevel(String nurseLevel) {
        this.nurseLevel = nurseLevel;
    }

    public String getEnterDate() {
        return enterDate;
    }

    public void setEnterDate(String enterDate) {
        this.enterDate = enterDate;
    }

    public String getNurseId() {
        return nurseId;
    }

    public void setNurseId(String nurseId) {
        this.nurseId = nurseId;
    }

    public String getNurseName() {
        return nurseName;
    }

    public void setNurseName(String nurseName) {
        this.nurseName = nurseName;
    }

    @Override
    public String toString() {
        return "DeptScheGroupUser{" +
                "seqNo='" + seqNo + '\'' +
                ", groupId='" + groupId + '\'' +
                ", groupName='" + groupName + '\'' +
                ", deptId='" + deptId + '\'' +
                ", deptName='" + deptName + '\'' +
                ", nurseLevel='" + nurseLevel + '\'' +
                ", enterDate='" + enterDate + '\'' +
                ", nurseId='" + nurseId + '\'' +
                ", nurseName='" + nurseName + '\'' +
                '}';
    }
}
