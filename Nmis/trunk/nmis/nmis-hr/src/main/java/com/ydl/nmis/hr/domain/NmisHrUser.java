package com.ydl.nmis.hr.domain;


import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.ydl.common.annotation.Excel;
import com.ydl.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * 护理人员基本信息对象 nmis_hr_user
 *
 * @author ydl
 * @date 2025-03-05
 */

public class NmisHrUser extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 工号 */

    @Excel(name = "工号")
    @NotNull(message = "工号不能为空")
    private Long nurseId;

    /** 姓名 */
    @Excel(name = "姓名")
    @NotBlank(message = "姓名不能为空")
    private String name;

    /** 性别 */
    @Excel(name = "性别")
    @NotBlank(message = "性别不能为空")
    private String sex;

    /** 出生日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "出生日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date dateOfBirth;

    /** 职称 */
    @Excel(name = "职称")
    @NotBlank(message = "职称不能为空")
    private String title;

    /** 职称时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "职称时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date dateOfTitle;

    /** 职务 */
    @Excel(name = "职务")
    private String duty;

    /** 职务时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "职务时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date dateOfDuty;

    /** 参加工作时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "参加工作时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date dateOfWork;

    /** 受聘时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "受聘时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date dateOfHire;

    /** 政治面貌 */
    @Excel(name = "政治面貌")
    private String politicalFeature;

    /** 籍贯 */
    @Excel(name = "籍贯")
    private String nativePlace;

    /** 婚否 */
    @Excel(name = "婚否")
    private String maritalStatus;

    /** 家庭地址 */
    @Excel(name = "家庭地址")
    private String homeAddress;

    /** 邮编 */
    @Excel(name = "邮编")
    private String zipCode;

    /** 联系电话 */
    @Excel(name = "联系电话")
    private String phoneNumber;

    /** 联系人姓名 */
    @Excel(name = "联系人姓名")
    private String nextOfKin;

    /** 联系人电话 */
    @Excel(name = "联系人电话")
    private String nextOfKinPhone;

    /** 联系人地址 */
    @Excel(name = "联系人地址")
    private String nextOfKinAddr;

    /** 证件类型 */
    @Excel(name = "证件类型")
    private String certType;

    /** 证件号 */
    @Excel(name = "证件号")
    @NotBlank(message = "证件号不能为空")
    @Pattern(regexp = "^\\d{17}[\\dXx]$", message = "身份证号码格式不正确")
    private String certNo;

    /** 民族 */
    @Excel(name = "民族")
    private String nation;

    /** 电子邮件 */
    @Excel(name = "电子邮件")
    private String email;

    /** 体重 */
    @Excel(name = "体重")
    private Long bodyWeight;

    /** 身高 */
    @Excel(name = "身高")
    private Long bodyHeight;

    /** 照片 */
    @Excel(name = "照片")
    private String picture;

    /** 护龄 */
    @Excel(name = "护龄")
    private String nurseAge;

    /** 执业证号码 */
    @Excel(name = "执业证号码")
    private String registerNo;

    /** 执业证取得时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "执业证取得时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date registerDate;

    /** 执行证附件 */
    @Excel(name = "执行证附件")
    private String registerAttach;


    /** 当前能级 */
    @Excel(name = "当前能级")
    private String nurseLevel;

    /** 当前能级取得时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "当前能级取得时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date nurseLevelDate;

    /** 来院时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "来院时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date enterDate;

    /** 离院时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "离院时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date levelDate;

    /** 离院原因 */
    @Excel(name = "离院原因")
    private String leaveReason;

    /** 特长 */
    @Excel(name = "特长")
    private String specialty;

    /** 英语水平 */
    @Excel(name = "英语水平")
    private String englishLevel;

    /** 当前护理单元 */
    @Excel(name = "当前护理单元")
    private String deptId;

    /** 定科护理单元 */
    @Excel(name = "定科护理单元")
    private String defaultDeptId;

    /** 上衣码（XL,M等） */
    @Excel(name = "上衣码", readConverterExp = "X=L,M等")
    private String coatSize;

    /** 裤子码（XL,M等） */
    @Excel(name = "裤子码", readConverterExp = "X=L,M等")
    private String trouserSize;

    /** 鞋码（37,38等） */
    @Excel(name = "鞋码", readConverterExp = "3=7,38等")
    private String shoeSize;

    /** 带教资格ID */
    @Excel(name = "带教资格ID")
    private String teachTypeId;

    /** 带教资格 */
    @Excel(name = "带教资格")
    private String teachTypeName;

    /** 岗位Id */
    @Excel(name = "岗位Id")
    private String postId;

    /** 岗位名称 */
    @Excel(name = "岗位名称")
    private String postName;

    /** 员工类型 合同工，正式工 */
    @Excel(name = "员工类型 合同工，正式工")
    private String staffTypeId;

    /** 员工类型 合同工，正式工 */
    @Excel(name = "员工类型 合同工，正式工")
    private String staffTypeName;

    /** 输入码 */
    @Excel(name = "输入码")
    private String inputCode;

    /** 排序号 */
    @Excel(name = "排序号")
    private Long serialNo;

    /** 状态： 1：停用 0：启用 */
    @Excel(name = "状态： 1：停用 0：启用")
    private String status;

    /** 删除标志 1：删除 0：未删除 */
    private Long delFlag;

    /** 版本号 */
    @Excel(name = "版本号")
    private Long revision;

    /** 创建人编码 */
    @Excel(name = "创建人编码")
    private Long createId;

    /** 创建人名称 */
    @Excel(name = "创建人名称")
    private String creator;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createDate;

    /** 最后一次操作人编号 */
    @Excel(name = "最后一次操作人编号")
    private Long modifyId;

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

    private Date startDate;

    private Date endDate;


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
    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
    public void setSex(String sex)
    {
        this.sex = sex;
    }

    public String getSex()
    {
        return sex;
    }
    public void setDateOfBirth(Date dateOfBirth)
    {
        this.dateOfBirth = dateOfBirth;
    }

    public Date getDateOfBirth()
    {
        return dateOfBirth;
    }
    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getTitle()
    {
        return title;
    }
    public void setDateOfTitle(Date dateOfTitle)
    {
        this.dateOfTitle = dateOfTitle;
    }

    public Date getDateOfTitle()
    {
        return dateOfTitle;
    }
    public void setDuty(String duty)
    {
        this.duty = duty;
    }

    public String getDuty()
    {
        return duty;
    }
    public void setDateOfDuty(Date dateOfDuty)
    {
        this.dateOfDuty = dateOfDuty;
    }

    public Date getDateOfDuty()
    {
        return dateOfDuty;
    }
    public void setDateOfWork(Date dateOfWork)
    {
        this.dateOfWork = dateOfWork;
    }

    public Date getDateOfWork()
    {
        return dateOfWork;
    }
    public void setDateOfHire(Date dateOfHire)
    {
        this.dateOfHire = dateOfHire;
    }

    public Date getDateOfHire()
    {
        return dateOfHire;
    }
    public void setPoliticalFeature(String politicalFeature)
    {
        this.politicalFeature = politicalFeature;
    }

    public String getPoliticalFeature()
    {
        return politicalFeature;
    }
    public void setNativePlace(String nativePlace)
    {
        this.nativePlace = nativePlace;
    }

    public String getNativePlace()
    {
        return nativePlace;
    }
    public void setMaritalStatus(String maritalStatus)
    {
        this.maritalStatus = maritalStatus;
    }

    public String getMaritalStatus()
    {
        return maritalStatus;
    }
    public void setHomeAddress(String homeAddress)
    {
        this.homeAddress = homeAddress;
    }

    public String getHomeAddress()
    {
        return homeAddress;
    }
    public void setZipCode(String zipCode)
    {
        this.zipCode = zipCode;
    }

    public String getZipCode()
    {
        return zipCode;
    }
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    public void setNextOfKin(String nextOfKin)
    {
        this.nextOfKin = nextOfKin;
    }

    public String getNextOfKin()
    {
        return nextOfKin;
    }
    public void setNextOfKinPhone(String nextOfKinPhone)
    {
        this.nextOfKinPhone = nextOfKinPhone;
    }

    public String getNextOfKinPhone()
    {
        return nextOfKinPhone;
    }
    public void setNextOfKinAddr(String nextOfKinAddr)
    {
        this.nextOfKinAddr = nextOfKinAddr;
    }

    public String getNextOfKinAddr()
    {
        return nextOfKinAddr;
    }
    public void setCertType(String certType)
    {
        this.certType = certType;
    }

    public String getCertType()
    {
        return certType;
    }
    public void setCertNo(String certNo)
    {
        this.certNo = certNo;
    }

    public String getCertNo()
    {
        return certNo;
    }
    public void setNation(String nation)
    {
        this.nation = nation;
    }

    public String getNation()
    {
        return nation;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getEmail()
    {
        return email;
    }
    public void setBodyWeight(Long bodyWeight)
    {
        this.bodyWeight = bodyWeight;
    }

    public Long getBodyWeight()
    {
        return bodyWeight;
    }
    public void setBodyHeight(Long bodyHeight)
    {
        this.bodyHeight = bodyHeight;
    }

    public Long getBodyHeight()
    {
        return bodyHeight;
    }
    public void setPicture(String picture)
    {
        this.picture = picture;
    }

    public String getPicture()
    {
        return picture;
    }
    public void setNurseAge(String nurseAge)
    {
        this.nurseAge = nurseAge;
    }

    public String getNurseAge()
    {
        return nurseAge;
    }
    public void setRegisterNo(String registerNo)
    {
        this.registerNo = registerNo;
    }

    public String getRegisterNo()
    {
        return registerNo;
    }
    public void setRegisterDate(Date registerDate)
    {
        this.registerDate = registerDate;
    }

    public Date getRegisterDate()
    {
        return registerDate;
    }
    public void setRegisterAttach(String registerAttach)
    {
        this.registerAttach = registerAttach;
    }

    public String getRegisterAttach()
    {
        return registerAttach;
    }
    public void setNurseLevel(String nurseLevel)
    {
        this.nurseLevel = nurseLevel;
    }

    public String getNurseLevel()
    {
        return nurseLevel;
    }
    public void setNurseLevelDate(Date nurseLevelDate)
    {
        this.nurseLevelDate = nurseLevelDate;
    }

    public Date getNurseLevelDate()
    {
        return nurseLevelDate;
    }
    public void setEnterDate(Date enterDate)
    {
        this.enterDate = enterDate;
    }

    public Date getEnterDate()
    {
        return enterDate;
    }
    public void setLevelDate(Date levelDate)
    {
        this.levelDate = levelDate;
    }

    public Date getLevelDate()
    {
        return levelDate;
    }
    public void setLeaveReason(String leaveReason)
    {
        this.leaveReason = leaveReason;
    }

    public String getLeaveReason()
    {
        return leaveReason;
    }
    public void setSpecialty(String specialty)
    {
        this.specialty = specialty;
    }

    public String getSpecialty()
    {
        return specialty;
    }
    public void setEnglishLevel(String englishLevel)
    {
        this.englishLevel = englishLevel;
    }

    public String getEnglishLevel()
    {
        return englishLevel;
    }
    public void setDeptId(String deptId)
    {
        this.deptId = deptId;
    }

    public String getDeptId()
    {
        return deptId;
    }
    public void setDefaultDeptId(String defaultDeptId)
    {
        this.defaultDeptId = defaultDeptId;
    }

    public String getDefaultDeptId()
    {
        return defaultDeptId;
    }
    public void setCoatSize(String coatSize)
    {
        this.coatSize = coatSize;
    }

    public String getCoatSize()
    {
        return coatSize;
    }
    public void setTrouserSize(String trouserSize)
    {
        this.trouserSize = trouserSize;
    }

    public String getTrouserSize()
    {
        return trouserSize;
    }
    public void setShoeSize(String shoeSize)
    {
        this.shoeSize = shoeSize;
    }

    public String getShoeSize()
    {
        return shoeSize;
    }
    public void setTeachTypeId(String teachTypeId)
    {
        this.teachTypeId = teachTypeId;
    }

    public String getTeachTypeId()
    {
        return teachTypeId;
    }
    public void setTeachTypeName(String teachTypeName)
    {
        this.teachTypeName = teachTypeName;
    }

    public String getTeachTypeName()
    {
        return teachTypeName;
    }
    public void setPostId(String postId)
    {
        this.postId = postId;
    }

    public String getPostId()
    {
        return postId;
    }
    public void setPostName(String postName)
    {
        this.postName = postName;
    }

    public String getPostName()
    {
        return postName;
    }
    public void setStaffTypeId(String staffTypeId)
    {
        this.staffTypeId = staffTypeId;
    }

    public String getStaffTypeId()
    {
        return staffTypeId;
    }
    public void setStaffTypeName(String staffTypeName)
    {
        this.staffTypeName = staffTypeName;
    }

    public String getStaffTypeName()
    {
        return staffTypeName;
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
    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getStatus()
    {
        return status;
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
    public void setCreateId(Long createId)
    {
        this.createId = createId;
    }

    public Long getCreateId()
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
    public void setModifyId(Long modifyId)
    {
        this.modifyId = modifyId;
    }

    public Long getModifyId()
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


    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("nurseId", getNurseId())
                .append("name", getName())
                .append("sex", getSex())
                .append("dateOfBirth", getDateOfBirth())
                .append("title", getTitle())
                .append("dateOfTitle", getDateOfTitle())
                .append("duty", getDuty())
                .append("dateOfDuty", getDateOfDuty())
                .append("dateOfWork", getDateOfWork())
                .append("dateOfHire", getDateOfHire())
                .append("politicalFeature", getPoliticalFeature())
                .append("nativePlace", getNativePlace())
                .append("maritalStatus", getMaritalStatus())
                .append("homeAddress", getHomeAddress())
                .append("zipCode", getZipCode())
                .append("phoneNumber", getPhoneNumber())
                .append("nextOfKin", getNextOfKin())
                .append("nextOfKinPhone", getNextOfKinPhone())
                .append("nextOfKinAddr", getNextOfKinAddr())
                .append("certType", getCertType())
                .append("certNo", getCertNo())
                .append("nation", getNation())
                .append("email", getEmail())
                .append("bodyWeight", getBodyWeight())
                .append("bodyHeight", getBodyHeight())
                .append("picture", getPicture())
                .append("nurseAge", getNurseAge())
                .append("registerNo", getRegisterNo())
                .append("registerDate", getRegisterDate())
                .append("registerAttach", getRegisterAttach())
                .append("nurseLevel", getNurseLevel())
                .append("nurseLevelDate", getNurseLevelDate())
                .append("enterDate", getEnterDate())
                .append("levelDate", getLevelDate())
                .append("leaveReason", getLeaveReason())
                .append("specialty", getSpecialty())
                .append("englishLevel", getEnglishLevel())
                .append("deptId", getDeptId())
                .append("defaultDeptId", getDefaultDeptId())
                .append("coatSize", getCoatSize())
                .append("trouserSize", getTrouserSize())
                .append("shoeSize", getShoeSize())
                .append("teachTypeId", getTeachTypeId())
                .append("teachTypeName", getTeachTypeName())
                .append("postId", getPostId())
                .append("postName", getPostName())
                .append("staffTypeId", getStaffTypeId())
                .append("staffTypeName", getStaffTypeName())
                .append("inputCode", getInputCode())
                .append("serialNo", getSerialNo())
                .append("status", getStatus())
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
