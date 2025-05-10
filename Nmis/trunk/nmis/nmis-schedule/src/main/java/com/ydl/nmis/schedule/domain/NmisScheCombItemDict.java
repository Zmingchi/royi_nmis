package com.ydl.nmis.schedule.domain;



import com.ydl.common.annotation.Excel;
import com.ydl.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.validation.constraints.NotBlank;

/**
 * 护理排班组合班与普通班次对应对象 nmis_sche_comb_item_dict
 *
 * @author ydl
 * @date 2025-03-19
 */
public class NmisScheCombItemDict extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private String id;

    /** 组合班次ID */
    @NotBlank(message = "组合班次id不能为空")
    @Excel(name = "组合班次ID")
    private String combId;

    /** 组合班次名称 */
    private String combName;

    /** 普通班次ID */
    @NotBlank(message = "普通班次id不能为空")
    @Excel(name = "普通班次ID")
    private String scheId;

    /** 普通班次名称 */
    private String scheName;
    /** 排序号 */
    @Excel(name = "排序号")
    private Long seqNo;

    public String getCombName() {
        return combName;
    }

    public void setCombName(String combName) {
        this.combName = combName;
    }

    public String getScheName() {
        return scheName;
    }

    public void setScheName(String scheName) {
        this.scheName = scheName;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getId()
    {
        return id;
    }
    public void setCombId(String combId)
    {
        this.combId = combId;
    }

    public String getCombId()
    {
        return combId;
    }
    public void setScheId(String scheId)
    {
        this.scheId = scheId;
    }

    public String getScheId()
    {
        return scheId;
    }
    public void setSeqNo(Long seqNo)
    {
        this.seqNo = seqNo;
    }

    public Long getSeqNo()
    {
        return seqNo;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("combId", getCombId())
                .append("scheId", getScheId())
                .append("seqNo", getSeqNo())
                .toString();
    }
}

