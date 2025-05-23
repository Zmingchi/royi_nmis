package com.ydl.nmis.hr.domain;


import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.ydl.common.annotation.Excel;
import com.ydl.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * 护理人员院内培训考试对象 nmis_hr_training
 *
 * @author ydl
 * @date 2025-03-12
 */
public class NmisHrTraining extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 护士ID */
    @Excel(name = "护士ID")
    @NotNull(message = "护士id不能为空")
    private Long nurseId;

    /** 护士姓名 */
    @Excel(name = "护士姓名")
    @NotBlank(message = "护士姓名不能为空")
    private String nurseName;

    /** 培训内容 */
    @Excel(name = "培训内容")
    @NotBlank(message = "培训内容不能为空")
    private String trainingTitle;

    /** 培训方式 1：现场培训 2：在线培训 */
    @Excel(name = "培训方式 1：现场培训 2：在线培训")
    private String trainingWay;

    /** 培训时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "培训时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date trainingDate;

    /** 培训时长 */
    @Excel(name = "培训时长")
    private String trainingHours;

    /** 考试时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "考试时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date examDate;

    /** 考试方式： 1：理论加实操 2：理论 3：实操 */
    @Excel(name = "考试方式： 1：理论加实操 2：理论 3：实操")
    private String examWay;

    /** 理论得分 */
    @Excel(name = "理论得分")
    private Long theorySocre;

    /** 实操得分 */
    @Excel(name = "实操得分")
    private Long operScore;

    /** 总得分 */
    @Excel(name = "总得分")
    private Long totalScore;

    /** 删除标志 1：删除 0：未删除 */
    private Long delFlag;

    /** 版本号 */
    @Excel(name = "版本号")
    private Long revision;

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

    /**所在科室 */
    private String deptId;

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setNurseId(Long nurseId)
    {
        this.nurseId = nurseId;
    }

    public Long getNurseId()
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
    public void setTrainingTitle(String trainingTitle)
    {
        this.trainingTitle = trainingTitle;
    }

    public String getTrainingTitle()
    {
        return trainingTitle;
    }
    public void setTrainingWay(String trainingWay)
    {
        this.trainingWay = trainingWay;
    }

    public String getTrainingWay()
    {
        return trainingWay;
    }
    public void setTrainingDate(Date trainingDate)
    {
        this.trainingDate = trainingDate;
    }

    public Date getTrainingDate()
    {
        return trainingDate;
    }
    public void setTrainingHours(String trainingHours)
    {
        this.trainingHours = trainingHours;
    }

    public String getTrainingHours()
    {
        return trainingHours;
    }
    public void setExamDate(Date examDate)
    {
        this.examDate = examDate;
    }

    public Date getExamDate()
    {
        return examDate;
    }

    public String getExamWay() {
        return examWay;
    }

    public void setExamWay(String examWay) {
        this.examWay = examWay;
    }

    public void setTheorySocre(Long theorySocre)
    {
        this.theorySocre = theorySocre;
    }

    public Long getTheorySocre()
    {
        return theorySocre;
    }
    public void setOperScore(Long operScore)
    {
        this.operScore = operScore;
    }

    public Long getOperScore()
    {
        return operScore;
    }
    public void setTotalScore(Long totalScore)
    {
        this.totalScore = totalScore;
    }

    public Long getTotalScore()
    {
        return totalScore;
    }
    public void setDelFlag(Long delFlag)
    {
        this.delFlag = delFlag;
    }

    public Long getDelFlag()
    {
        return delFlag;
    }
    public void setRevision(Long revision)
    {
        this.revision = revision;
    }

    public Long getRevision()
    {
        return revision;
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
                .append("nurseId", getNurseId())
                .append("nurseName", getNurseName())
                .append("trainingTitle", getTrainingTitle())
                .append("trainingWay", getTrainingWay())
                .append("trainingDate", getTrainingDate())
                .append("trainingHours", getTrainingHours())
                .append("examDate", getExamDate())
                .append("examWay", getExamWay())
                .append("theorySocre", getTheorySocre())
                .append("operScore", getOperScore())
                .append("totalScore", getTotalScore())
                .append("remark", getRemark())
                .append("delFlag", getDelFlag())
                .append("revision", getRevision())
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
