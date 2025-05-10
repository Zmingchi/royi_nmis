package com.ydl.nmis.schedule.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ydl.common.core.domain.BaseEntity;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class NursingUnitStaffReport extends BaseEntity {

    private String hospitalName;
    private Integer totalStaff;
    private Integer unitStaff;
    private String headNurse;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date scheDate;
    private String deptId;
    private String deptName;
    private BigDecimal bedNurseRatio;
    private Integer licensedNurses;
    private Integer trainees;
    private Integer interns;
    private Integer n01;
    private Integer n02;
    private Integer n03;
    private Integer n11;
    private Integer n12;
    private Integer n21;
    private Integer n22;
    private Integer n31;
    private Integer n32;
    private Integer n4;
    private Integer onDuty;
    private Integer onLeave;
    private Integer dispatched;
    private Integer maternityLeave;
    private List<NursingUnitStaffDetail> nursingUnitStaffDetail;


    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public Integer getTotalStaff() {
        return totalStaff;
    }

    public void setTotalStaff(Integer totalStaff) {
        this.totalStaff = totalStaff;
    }

    public String getHeadNurse() {
        return headNurse;
    }

    public void setHeadNurse(String headNurse) {
        this.headNurse = headNurse;
    }

    public Integer getUnitStaff() {
        return unitStaff;
    }

    public void setUnitStaff(Integer unitStaff) {
        this.unitStaff = unitStaff;
    }

    public Date getScheDate() {
        return scheDate;
    }

    public void setScheDate(Date scheDate) {
        this.scheDate = scheDate;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public BigDecimal getBedNurseRatio() {
        return bedNurseRatio;
    }

    public void setBedNurseRatio(BigDecimal bedNurseRatio) {
        this.bedNurseRatio = bedNurseRatio;
    }

    public Integer getLicensedNurses() {
        return licensedNurses;
    }

    public void setLicensedNurses(Integer licensedNurses) {
        this.licensedNurses = licensedNurses;
    }

    public Integer getTrainees() {
        return trainees;
    }

    public void setTrainees(Integer trainees) {
        this.trainees = trainees;
    }

    public Integer getInterns() {
        return interns;
    }

    public void setInterns(Integer interns) {
        this.interns = interns;
    }

    public Integer getN01() {
        return n01;
    }

    public void setN01(Integer n01) {
        this.n01 = n01;
    }

    public Integer getN02() {
        return n02;
    }

    public void setN02(Integer n02) {
        this.n02 = n02;
    }

    public Integer getN03() {
        return n03;
    }

    public void setN03(Integer n03) {
        this.n03 = n03;
    }

    public Integer getN11() {
        return n11;
    }

    public void setN11(Integer n11) {
        this.n11 = n11;
    }

    public Integer getN12() {
        return n12;
    }

    public void setN12(Integer n12) {
        this.n12 = n12;
    }

    public Integer getN21() {
        return n21;
    }

    public void setN21(Integer n21) {
        this.n21 = n21;
    }

    public Integer getN22() {
        return n22;
    }

    public void setN22(Integer n22) {
        this.n22 = n22;
    }

    public Integer getN31() {
        return n31;
    }

    public void setN31(Integer n31) {
        this.n31 = n31;
    }

    public Integer getN32() {
        return n32;
    }

    public void setN32(Integer n32) {
        this.n32 = n32;
    }

    public Integer getN4() {
        return n4;
    }

    public void setN4(Integer n4) {
        this.n4 = n4;
    }

    public Integer getOnDuty() {
        return onDuty;
    }

    public void setOnDuty(Integer onDuty) {
        this.onDuty = onDuty;
    }

    public Integer getOnLeave() {
        return onLeave;
    }

    public void setOnLeave(Integer onLeave) {
        this.onLeave = onLeave;
    }

    public Integer getDispatched() {
        return dispatched;
    }

    public void setDispatched(Integer dispatched) {
        this.dispatched = dispatched;
    }

    public Integer getMaternityLeave() {
        return maternityLeave;
    }

    public void setMaternityLeave(Integer maternityLeave) {
        this.maternityLeave = maternityLeave;
    }

    public List<NursingUnitStaffDetail> getNursingUnitStaffDetail() {
        return nursingUnitStaffDetail;
    }

    public void setNursingUnitStaffDetail(List<NursingUnitStaffDetail> nursingUnitStaffDetail) {
        this.nursingUnitStaffDetail = nursingUnitStaffDetail;
    }

    @Override
    public String toString() {
        return "NursingUnitStaffReport{" +
                "hospitalName='" + hospitalName + '\'' +
                ", totalStaff=" + totalStaff +
                ", unitStaff=" + unitStaff +
                ", headNurse='" + headNurse + '\'' +
                ", scheDate=" + scheDate +
                ", deptId='" + deptId + '\'' +
                ", deptName='" + deptName + '\'' +
                ", bedNurseRatio=" + bedNurseRatio +
                ", licensedNurses=" + licensedNurses +
                ", trainees=" + trainees +
                ", interns=" + interns +
                ", n01=" + n01 +
                ", n02=" + n02 +
                ", n03=" + n03 +
                ", n11=" + n11 +
                ", n12=" + n12 +
                ", n21=" + n21 +
                ", n22=" + n22 +
                ", n31=" + n31 +
                ", n32=" + n32 +
                ", n4=" + n4 +
                ", onDuty=" + onDuty +
                ", onLeave=" + onLeave +
                ", dispatched=" + dispatched +
                ", maternityLeave=" + maternityLeave +
                ", nursingUnitStaffDetail=" + nursingUnitStaffDetail +
                '}';
    }
}
