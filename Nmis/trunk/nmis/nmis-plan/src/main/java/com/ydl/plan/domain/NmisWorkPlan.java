package com.ydl.plan.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.ydl.common.annotation.Excel;
import com.ydl.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 工作计划对象 nmis_work_plan
 * 
 * @author ydl
 * @date 2025-03-25
 */
public class NmisWorkPlan extends BaseEntity
{

    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 计划名称 */
    @Excel(name = "计划名称")
    private String planName;

    /** 计划时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "计划时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date planDate;

    /** 计划类型 1：年计划 2：季度计划 3：月度计划 4：周计划 */
    private String planType;

    /** 计划内容 */
    @Excel(name = "计划内容")
    private String planContent;

    /** 计划总结 */
    @Excel(name = "计划总结")
    private String planSummary;

    /** 计划人ID */
    private String nurseId;

    /** 计划人姓名 */
    @Excel(name = "计划人姓名")
    private String nurseName;

    /** 审批人ID */
    private String approverId;

    /** 审批人姓名 */
    private String approverName;

    /** 审批时间 */
    @Excel(name = "审批时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date approveDate;

    /** 计划科室编码 */
    @Excel(name = "计划科室编码")
    private String deptCode;

    /** 计划科室名称 */
    @Excel(name = "计划科室名称")
    private String deptName;

    /** 计划状态 1：草稿 2：已提交，3：已审批 */
    @Excel(name = "计划状态 1：草稿 2：已提交，3：已审批")
    private String planStatus;

    /** 排序号 */
    @Excel(name = "排序号")
    private Long orderNum;

    /** 创建人ID */
    private String createId;

    /** 创建人姓名 */
    private String creator;

    /** 创建时间 */
    private Date createDate;

    /** 修改人ID */
    private String modifyId;

    /** 修改人姓名 */
    private String modifier;

    /** 修改时间 */
    private Date modifyDate;

    /** 所属单位 */
    private String unitCode;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setPlanName(String planName) 
    {
        this.planName = planName;
    }

    public String getPlanName() 
    {
        return planName;
    }
    public void setPlanDate(Date planDate) 
    {
        this.planDate = planDate;
    }

    public Date getPlanDate() 
    {
        return planDate;
    }
    public void setPlanType(String planType) 
    {
        this.planType = planType;
    }

    public String getPlanType() 
    {
        return planType;
    }
    public void setPlanContent(String planContent) 
    {
        this.planContent = planContent;
    }

    public String getPlanContent() 
    {
        return planContent;
    }
    public void setPlanSummary(String planSummary) 
    {
        this.planSummary = planSummary;
    }

    public String getPlanSummary() 
    {
        return planSummary;
    }
    public void setNurseId(String nurseId) 
    {
        this.nurseId = nurseId;
    }

    public String getNurseId() 
    {
        return nurseId;
    }
    public void setNurseName(String nurseName) 
    {
        this.nurseName = nurseName;
    }

    public String getNurseName() 
    {
        return nurseName;
    }
    public void setApproverId(String approverId) 
    {
        this.approverId = approverId;
    }

    public String getApproverId() 
    {
        return approverId;
    }
    public void setApproverName(String approverName) 
    {
        this.approverName = approverName;
    }

    public String getApproverName() 
    {
        return approverName;
    }
    public void setApproveDate(Date approveDate) 
    {
        this.approveDate = approveDate;
    }

    public Date getApproveDate() 
    {
        return approveDate;
    }
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
    public void setPlanStatus(String planStatus) 
    {
        this.planStatus = planStatus;
    }

    public String getPlanStatus() 
    {
        return planStatus;
    }
    public void setOrderNum(Long orderNum) 
    {
        this.orderNum = orderNum;
    }

    public Long getOrderNum() 
    {
        return orderNum;
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
            .append("planName", getPlanName())
            .append("planDate", getPlanDate())
            .append("planType", getPlanType())
            .append("planContent", getPlanContent())
            .append("planSummary", getPlanSummary())
            .append("nurseId", getNurseId())
            .append("nurseName", getNurseName())
            .append("approverId", getApproverId())
            .append("approverName", getApproverName())
            .append("approveDate", getApproveDate())
            .append("deptCode", getDeptCode())
            .append("deptName", getDeptName())
            .append("planStatus", getPlanStatus())
            .append("orderNum", getOrderNum())
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
