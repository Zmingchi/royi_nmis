package com.ydl.system.domain.vo;

import com.ydl.common.annotation.Excel;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 用户与科室对应对象 sys_user_dept
 * 
 * @author ydl
 * @date 2025-03-27
 */
public class SysUserDeptDisplay
{

    /** 科室编码 */
    @Excel(name = "科室编码")
    private String deptCode;

    /** 科室名称 */
    @Excel(name = "科室名称")
    private String deptName;


    public void setDeptCode(String deptCode) 
    {
        this.deptCode = deptCode;
    }

    public String getDeptCode() 
    {
        return deptCode;
    }
    public void setDeptName(String deptName) 
    {
        this.deptName = deptName;
    }

    public String getDeptName() 
    {
        return deptName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("deptCode", getDeptCode())
            .append("deptName", getDeptName())
            .toString();
    }
}
