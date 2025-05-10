package com.ydl.nmis.schedule.dto;



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
public class ScheDetail
{
    /** 主键 */
    private String id;

    /** 班次日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "班次日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date scheDate;

    /** 班次ID */
    @Excel(name = "班次ID")
    private String scheItemId;

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

    public String getScheItemId() {
        return scheItemId;
    }

    public void setScheItemId(String scheItemId) {
        this.scheItemId = scheItemId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("scheDate", getScheDate())
                .append("scheHours", getScheHours())
                .append("scheHoursChange", getScheHoursChange())
                .append("scheName", getScheName())
                .toString();
    }


}

