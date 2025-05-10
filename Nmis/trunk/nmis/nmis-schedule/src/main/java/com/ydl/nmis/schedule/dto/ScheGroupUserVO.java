package com.ydl.nmis.schedule.dto;

public class ScheGroupUserVO {
    private String id;
    private String groupName;
    private String userName;  // 这里将包含拼接后的用户名
    private String deptId;
    private String deptName;
    private String delFlag;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    @Override
    public String toString() {
        return "ScheGroupUserVO{" +
                "id=" + id +
                ", groupName='" + groupName + '\'' +
                ", userName='" + userName + '\'' +
                ", deptId=" + deptId +
                ", deptName='" + deptName + '\'' +
                ", delFlag='" + delFlag + '\'' +
                '}';
    }
}
