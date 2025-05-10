package com.ydl.nmis.schedule.domain;


import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.ydl.common.annotation.Excel;
import com.ydl.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.validation.constraints.NotBlank;

/**
 * 校验护理班次字典对象 nmis_sche_dict
 *
 * @author ydl
 * @date 2025-03-18
 */


public class NmisScheDictCheck extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private String scheItemId;

    /** 班次名称 */
    @NotBlank(message = "班次名称不能为空")
    @Excel(name = "班次名称")
    private String scheName;


    /** 总计工时 */
    @Excel(name = "总计工时")
    private Long scheHours;

    /** 所属科室编码 如果全院班次则为*，否则科室编码 */
    @Excel(name = "所属科室编码 如果全院班次则为*，否则科室编码")
    private String deptId;


    public void setScheName(String scheName)
    {
        this.scheName = scheName;
    }

    public String getScheName()
    {
        return scheName;
    }


    public String getScheItemId() {
        return scheItemId;
    }

    public void setScheItemId(String scheItemId) {
        this.scheItemId = scheItemId;
    }

    public Long getScheHours() {
        return scheHours;
    }

    public void setScheHours(Long scheHours) {
        this.scheHours = scheHours;
    }

    public void setDeptId(String deptId)
    {
        this.deptId = deptId;
    }

    public String getDeptId()
    {
        return deptId;
    }



    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("scheItemId", getScheItemId())
                .append("scheName", getScheName())
                .append("scheHours", getScheHours())
                .append("deptId", getDeptId())
                .toString();
    }
}

