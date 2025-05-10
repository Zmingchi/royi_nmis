package com.ydl.qc.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.ydl.common.annotation.Excel;
import com.ydl.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 护理质量标准项目细则对象 nmis_qc_std_item_detail
 * 
 * @author ydl
 * @date 2025-05-07
 */
public class NmisQcStdItemDetail extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private String id;

    /** 标准项目ID;引用NMIS_QC_STD_ITEM中ID */
    @Excel(name = "标准项目ID;引用NMIS_QC_STD_ITEM中ID")
    private String stdItemId;

    /** 细则名称 */
    @Excel(name = "细则名称")
    private String name;

    /** 分值 */
    @Excel(name = "分值")
    private Long score;

    /** 检查方法 */
    @Excel(name = "检查方法")
    private String examMethod;

    /** 影响因素 */
    @Excel(name = "影响因素")
    private String relateFactor;

    /** 状态：0：启用 1：停用 */
    @Excel(name = "状态：0：启用 1：停用")
    private String status;

    /** 排序号 */
    @Excel(name = "排序号")
    private Long serialNo;

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
    public void setStdItemId(String stdItemId) 
    {
        this.stdItemId = stdItemId;
    }

    public String getStdItemId() 
    {
        return stdItemId;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setScore(Long score) 
    {
        this.score = score;
    }

    public Long getScore() 
    {
        return score;
    }
    public void setExamMethod(String examMethod) 
    {
        this.examMethod = examMethod;
    }

    public String getExamMethod() 
    {
        return examMethod;
    }
    public void setRelateFactor(String relateFactor) 
    {
        this.relateFactor = relateFactor;
    }

    public String getRelateFactor() 
    {
        return relateFactor;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }
    public void setSerialNo(Long serialNo) 
    {
        this.serialNo = serialNo;
    }

    public Long getSerialNo() 
    {
        return serialNo;
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
            .append("stdItemId", getStdItemId())
            .append("name", getName())
            .append("score", getScore())
            .append("examMethod", getExamMethod())
            .append("relateFactor", getRelateFactor())
            .append("status", getStatus())
            .append("serialNo", getSerialNo())
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
