package com.ydl.nmis.schedule.domain;

import com.ydl.common.annotation.Excel;

import javax.validation.constraints.NotBlank;

public class NmisScheGroupUserDict {

    /** 主键 */
    private String id;

    /** 组id */
    @Excel(name = "组id")
    private String groupId;

    /** 组名称 */
    @Excel(name = "组名称")
    private String groupName;

    /** 护士ID */
    @Excel(name = "护士ID")
    private String userId;

    /** 姓名 */
    @Excel(name = "姓名")
    @NotBlank(message = "姓名不能为空")
    private String userName;

    /** 科室ID */
    @Excel(name = "科室ID")
    private String deptId;

    /** 科室名称 */
    @Excel(name = "科室名称")
    private String deptName;

    /** $column.columnComment */
    private Long delFlag;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public @NotBlank(message = "姓名不能为空") String getUserName() {
        return userName;
    }

    public void setUserName(@NotBlank(message = "姓名不能为空") String userName) {
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

    public Long getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Long delFlag) {
        this.delFlag = delFlag;
    }
}
