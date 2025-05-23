package com.ydl.qc.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.ydl.common.annotation.Excel;
import com.ydl.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ydl.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
/**
 * 护理质量检查试卷对象 nmis_qc_chk_paper
 * 
 * @author ydl
 * @date 2025-05-07
 */
public class NmisQcChkPaper extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private String id;

    /** 试卷名称 */
    @Excel(name = "试卷名称")
    private String paperName;

    /** 患者质量标准或病房质量标准 */
    @Excel(name = "患者质量标准或病房质量标准")
    private String stdType;

    /** 全院或指定科室 1:全院 2：科室 */
    @Excel(name = "全院或指定科室 1:全院 2：科室")
    private String deptScope;

    /** 合格分数 */
    @Excel(name = "合格分数")
    private Long scores;

    /** 发布时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "发布时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date pubDate;

    /** 1: 新建未发布 2：启用（发布后即为启用） 3：停用 */
    @Excel(name = "1: 新建未发布 2：启用", readConverterExp = "发=布后即为启用")
    private String status;

    /** 创建人编码 */
    @Excel(name = "创建人编码")
    private String createId;

    /** 创建人名称 */
    @Excel(name = "创建人名称")
    private String creator;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createDate;

    /** 最后一次操作人编号 */
    @Excel(name = "最后一次操作人编号")
    private String modifyId;

    /** 最后一次操作人姓名 */
    @Excel(name = "最后一次操作人姓名")
    private String modifier;

    /** 最后更新时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "最后更新时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date modifyDate;

    /** 所属单位 */
    @Excel(name = "所属单位")
    private String unitCode;

    public void setId(String id) 
    {
        this.id = id;
    }

    public String getId() 
    {
        return id;
    }
    public void setPaperName(String paperName) 
    {
        this.paperName = paperName;
    }

    public String getPaperName() 
    {
        return paperName;
    }
    public void setStdType(String stdType) 
    {
        this.stdType = stdType;
    }

    public String getStdType() 
    {
        return stdType;
    }
    public void setDeptScope(String deptScope) 
    {
        this.deptScope = deptScope;
    }

    public String getDeptScope() 
    {
        return deptScope;
    }
    public void setScores(Long scores) 
    {
        this.scores = scores;
    }

    public Long getScores() 
    {
        return scores;
    }
    public void setPubDate(Date pubDate) 
    {
        this.pubDate = pubDate;
    }

    public Date getPubDate() 
    {
        return pubDate;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }
    public void setCreateId(String createId) 
    {
        this.createId = createId;
    }

    public String getCreateId() 
    {
        return createId;
    }
    public void setCreator(String creator) 
    {
        this.creator = creator;
    }

    public String getCreator() 
    {
        return creator;
    }
    public void setCreateDate(Date createDate) 
    {
        this.createDate = createDate;
    }

    public Date getCreateDate() 
    {
        return createDate;
    }
    public void setModifyId(String modifyId) 
    {
        this.modifyId = modifyId;
    }

    public String getModifyId() 
    {
        return modifyId;
    }
    public void setModifier(String modifier) 
    {
        this.modifier = modifier;
    }

    public String getModifier() 
    {
        return modifier;
    }
    public void setModifyDate(Date modifyDate) 
    {
        this.modifyDate = modifyDate;
    }

    public Date getModifyDate() 
    {
        return modifyDate;
    }
    public void setUnitCode(String unitCode) 
    {
        this.unitCode = unitCode;
    }

    public String getUnitCode() 
    {
        return unitCode;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("paperName", getPaperName())
            .append("stdType", getStdType())
            .append("deptScope", getDeptScope())
            .append("scores", getScores())
            .append("pubDate", getPubDate())
            .append("status", getStatus())
            .append("createId", getCreateId())
            .append("creator", getCreator())
            .append("createDate", getCreateDate())
            .append("modifyId", getModifyId())
            .append("modifier", getModifier())
            .append("modifyDate", getModifyDate())
            .append("unitCode", getUnitCode())
            .toString();
    }
}
