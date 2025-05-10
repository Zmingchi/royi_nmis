package com.ydl.nmis.schedule.domain;


import com.ydl.common.annotation.Excel;
import com.ydl.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 参与排班用户对象 nmis_sche_users
 *
 * @author ydl
 * @date 2025-03-29
 */
public class NmisScheUsers extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private String id;

    /** 科室编码 */
    @Excel(name = "科室编码")
    private String deptCode;

    /** 用户ID */
    @Excel(name = "用户ID")
    private String userId;

    /** 排序号 */
    @Excel(name = "排序号")
    private Long seqNo;

    public void setId(String id)
    {
        this.id = id;
    }

    public String getId()
    {
        return id;
    }
    public void setDeptCode(String deptCode)
    {
        this.deptCode = deptCode;
    }

    public String getDeptCode()
    {
        return deptCode;
    }
    public void setUserId(String userId)
    {
        this.userId = userId;
    }

    public String getUserId()
    {
        return userId;
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
                .append("deptCode", getDeptCode())
                .append("userId", getUserId())
                .append("seqNo", getSeqNo())
                .toString();
    }
}

