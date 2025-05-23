package com.ydl.nmis.base.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ydl.common.annotation.Excel;
import com.ydl.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;


/**
 * 护理科室信息对象 nmis_dept_dict
 *
 * @author ydl
 * @date 2025-03-07
 */
public class NmisDeptDict extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 科室编码 */
    @Excel(name = "科室编码")
    private String deptId;

    /** 科室名称 */
    @Excel(name = "科室名称")
    private String deptName;

    /** 编制床位数 */
    @Excel(name = "编制床位数")
    private Long approvedBedNum;

    /** 实际床位数 */
    @Excel(name = "实际床位数")
    private Long actualBedNum;

    /** 护士人数 */
    @Excel(name = "护士人数")
    private Long nurseNum;

    /** 拼音码 */
    @Excel(name = "拼音码")
    private String inputCode;

    /** 排序号 */
    @Excel(name = "排序号")
    private Long serialNo;

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



    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setDeptId(String deptId)
    {
        this.deptId = deptId;
    }

    public String getDeptId()
    {
        return deptId;
    }
    public void setDeptName(String deptName)
    {
        this.deptName = deptName;
    }

    public String getDeptName()
    {
        return deptName;
    }
    public void setApprovedBedNum(Long approvedBedNum)
    {
        this.approvedBedNum = approvedBedNum;
    }

    public Long getApprovedBedNum()
    {
        return approvedBedNum;
    }
    public void setActualBedNum(Long actualBedNum)
    {
        this.actualBedNum = actualBedNum;
    }

    public Long getActualBedNum()
    {
        return actualBedNum;
    }
    public void setNurseNum(Long nurseNum)
    {
        this.nurseNum = nurseNum;
    }

    public Long getNurseNum()
    {
        return nurseNum;
    }
    public void setInputCode(String inputCode)
    {
        this.inputCode = inputCode;
    }

    public String getInputCode()
    {
        return inputCode;
    }
    public void setSerialNo(Long serialNo)
    {
        this.serialNo = serialNo;
    }

    public Long getSerialNo()
    {
        return serialNo;
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
                .append("deptId", getDeptId())
                .append("deptName", getDeptName())
                .append("approvedBedNum", getApprovedBedNum())
                .append("actualBedNum", getActualBedNum())
                .append("nurseNum", getNurseNum())
                .append("inputCode", getInputCode())
                .append("serialNo", getSerialNo())
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

