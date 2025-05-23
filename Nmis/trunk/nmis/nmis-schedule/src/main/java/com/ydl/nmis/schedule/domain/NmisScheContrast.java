package com.ydl.nmis.schedule.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ydl.common.annotation.Excel;

import javax.validation.constraints.NotBlank;
import java.util.Date;

public class NmisScheContrast {
    /** 主键 */
    private String id;

    /** 班次名称 */
    @NotBlank(message = "班次名称不能为空")
    @Excel(name = "班次名称")
    private String groupName;

    /** 科室ID */
    @NotBlank(message = "科室id不能为空")
    @Excel(name = "科室ID")
    private String deptId;

    /** 科室名称 */
    @Excel(name = "科室名称")
    private String deptName;

    /** $column.columnComment */
    private Long delFlag;

    /** 组合班次ID */
    @Excel(name = "组合班次ID")
    private String combId;

    /** 普通班次ID *//*
    @Excel(name = "普通班次ID")
    private String scheId;
*/
    /** 班次名称 */
    @NotBlank(message = "班次名称不能为空")
    @Excel(name = "班次名称")
    private String scheName;

    private String  scheItemId;

    /** 班次描述 *//*
    @Excel(name = "班次描述")
    private String scheDesc;

    *//** 开始时间 *//*
    @NotBlank(message = "开始时间不能为空")
    @Excel(name = "开始时间")
    private String beginTime;

    *//** 结束时间 *//*
    @NotBlank(message = "结束时间不能为空")
    @Excel(name = "结束时间")
    private String endTime;

    *//** 开始时间 *//*
    @Excel(name = "开始时间")
    private String beginTime1;

    *//** 结束时间 *//*
    @Excel(name = "结束时间")
    private String endTime1;

    *//** 总计工时 *//*
    @Excel(name = "总计工时")
    private Long hours;

    *//** 班次类别ID *//*
    @Excel(name = "班次类别ID")
    private String classId;

    *//** 输入码 *//*
    @Excel(name = "输入码")
    private String inputCode;

    *//** 排序号 *//*
    @Excel(name = "排序号")
    private Long serialNo;

    */
    @Excel(name = "输入码")
    private String inputCode;

    @Excel(name = "工时")
    private String hours;


    public String getScheItemId() {
        return scheItemId;
    }

    public void setScheItemId(String scheItemId) {
        this.scheItemId = scheItemId;
    }

    public String getInputCode() {
        return inputCode;
    }

    public void setInputCode(String inputCode) {
        this.inputCode = inputCode;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public @NotBlank(message = "班次名称不能为空") String getScheName() {
        return scheName;
    }

    public void setScheName(@NotBlank(message = "班次名称不能为空") String scheName) {
        this.scheName = scheName;
    }

    /** 状态： 1：停用 0：启用 *//*
    @Excel(name = "状态： 1：停用 0：启用")
    private String status;*/



    public String getCombId() {
        return combId;
    }

    public void setCombId(String combId) {
        this.combId = combId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public @NotBlank(message = "班次名称不能为空") String getGroupName() {
        return groupName;
    }

    public void setGroupName(@NotBlank(message = "班次名称不能为空") String groupName) {
        this.groupName = groupName;
    }

    public @NotBlank(message = "科室id不能为空") String getDeptId() {
        return deptId;
    }

    public void setDeptId(@NotBlank(message = "科室id不能为空") String deptId) {
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


    public String getScheColor() {
        return scheColor;
    }

    public void setScheColor(String scheColor) {
        this.scheColor = scheColor;
    }

    public String getScheType() {
        return scheType;
    }

    public void setScheType(String scheType) {
        this.scheType = scheType;
    }

    /** 班次颜色 */
    @Excel(name = "班次颜色")
    private String scheColor;



    /** 班次类型 1：全院班次 2：科室班次 */
    @Excel(name = "班次类型 1：全院班次 2：科室班次")
    private String scheType;
}
