package com.ydl.nmis.hr.dto;

import java.math.BigDecimal;

public class NmisHrStats {

    private int serialNo ;
    // Basic department info
    private String deptId;
    private String deptName;

    // Gender distribution
    private Integer maleCount;
    private Integer femaleCount;
    private Integer unknownGender;

    // Title distribution
    private Integer nurse;
    private Integer seniorNurse;
    private Integer chargeNurse;
    private Integer associateChiefNurse;
    private Integer chiefNurse;
    private Integer noTitle;
    private Integer unknownTitle;

    // Level distribution
    private Integer N0;
    private Integer N1;
    private Integer N2;
    private Integer N3;
    private Integer N4;
    private Integer N5;
    private Integer unknownLevel;

    // Duty distribution
    private Integer instructor;
    private Integer teamLeader;
    private Integer deputyHeadNurse;
    private Integer headNurse;
    private Integer departmentHeadNurse;
    private Integer nursingOfficeClerk;
    private Integer nursingOfficeSupervisor;
    private Integer nursingOfficeAssistantDirector;
    private Integer nursingOfficeDeputyDirector;
    private Integer nursingOfficeDirector;
    private Integer noDuty;
    private Integer unknownDuty;

    // Age group distribution
    private Integer under20;
    private Integer age20To29;
    private Integer age30To39;
    private Integer age40To49;
    private Integer age50To54;
    private Integer age55Plus;
    private Integer unknownAge;

    // Education distribution
    private Integer juniorHigh;
    private Integer technicalSchool;
    private Integer highSchool;
    private Integer college;
    private Integer bachelor;
    private Integer master;
    private Integer phd;
    private Integer postdoc;
    private Integer unknownEducation;

    // Position category distribution
    private Integer clinicalPosition;
    private Integer managementPosition;
    private Integer unknownPosition;

    // Employment type distribution
    private Integer formalEmployee;
    private Integer contractEmployee;
    private Integer personnelAgency;
    private Integer laborDispatch;
    private Integer rehire;
    private Integer standardizedTraining;
    private Integer intern;
    private Integer furtherStudy;
    private Integer preReport;
    private Integer otherType;
    private Integer unknownEmploymentType;

    // Work experience distribution
    private Integer lessThan1Year;
    private Integer years1To2;
    private Integer years2To5;
    private Integer years5To10;
    private Integer years10To20;
    private Integer moreThan20Years;
    private Integer unknownExperience;

    // Hospital tenure distribution
    private Integer hospitalLessThan1Year;
    private Integer hospital1To2Years;
    private Integer hospital2To5Years;
    private Integer hospital5To10Years;
    private Integer hospital10To20Years;
    private Integer hospitalMoreThan20Years;
    private Integer unknownHospitalTenure;

    // 专业类别
    private Integer nursing;
    private Integer midwifery;
    private Integer unknownSpecialty;

    // 在职状态
    private Integer active;
    private Integer inactive;

    public int getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
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

    public Integer getMaleCount() {
        return maleCount;
    }

    public void setMaleCount(Integer maleCount) {
        this.maleCount = maleCount;
    }

    public Integer getFemaleCount() {
        return femaleCount;
    }

    public void setFemaleCount(Integer femaleCount) {
        this.femaleCount = femaleCount;
    }

    public Integer getUnknownGender() {
        return unknownGender;
    }

    public void setUnknownGender(Integer unknownGender) {
        this.unknownGender = unknownGender;
    }

    public Integer getNurse() {
        return nurse;
    }

    public void setNurse(Integer nurse) {
        this.nurse = nurse;
    }

    public Integer getSeniorNurse() {
        return seniorNurse;
    }

    public void setSeniorNurse(Integer seniorNurse) {
        this.seniorNurse = seniorNurse;
    }

    public Integer getChargeNurse() {
        return chargeNurse;
    }

    public void setChargeNurse(Integer chargeNurse) {
        this.chargeNurse = chargeNurse;
    }

    public Integer getAssociateChiefNurse() {
        return associateChiefNurse;
    }

    public void setAssociateChiefNurse(Integer associateChiefNurse) {
        this.associateChiefNurse = associateChiefNurse;
    }

    public Integer getChiefNurse() {
        return chiefNurse;
    }

    public void setChiefNurse(Integer chiefNurse) {
        this.chiefNurse = chiefNurse;
    }

    public Integer getNoTitle() {
        return noTitle;
    }

    public void setNoTitle(Integer noTitle) {
        this.noTitle = noTitle;
    }

    public Integer getUnknownTitle() {
        return unknownTitle;
    }

    public void setUnknownTitle(Integer unknownTitle) {
        this.unknownTitle = unknownTitle;
    }

    public Integer getN0() {
        return N0;
    }

    public void setN0(Integer n0) {
        N0 = n0;
    }

    public Integer getN1() {
        return N1;
    }

    public void setN1(Integer n1) {
        N1 = n1;
    }

    public Integer getN2() {
        return N2;
    }

    public void setN2(Integer n2) {
        N2 = n2;
    }

    public Integer getN3() {
        return N3;
    }

    public void setN3(Integer n3) {
        N3 = n3;
    }

    public Integer getN4() {
        return N4;
    }

    public void setN4(Integer n4) {
        N4 = n4;
    }

    public Integer getN5() {
        return N5;
    }

    public void setN5(Integer n5) {
        N5 = n5;
    }

    public Integer getUnknownLevel() {
        return unknownLevel;
    }

    public void setUnknownLevel(Integer unknownLevel) {
        this.unknownLevel = unknownLevel;
    }

    public Integer getInstructor() {
        return instructor;
    }

    public void setInstructor(Integer instructor) {
        this.instructor = instructor;
    }

    public Integer getTeamLeader() {
        return teamLeader;
    }

    public void setTeamLeader(Integer teamLeader) {
        this.teamLeader = teamLeader;
    }

    public Integer getDeputyHeadNurse() {
        return deputyHeadNurse;
    }

    public void setDeputyHeadNurse(Integer deputyHeadNurse) {
        this.deputyHeadNurse = deputyHeadNurse;
    }

    public Integer getHeadNurse() {
        return headNurse;
    }

    public void setHeadNurse(Integer headNurse) {
        this.headNurse = headNurse;
    }

    public Integer getDepartmentHeadNurse() {
        return departmentHeadNurse;
    }

    public void setDepartmentHeadNurse(Integer departmentHeadNurse) {
        this.departmentHeadNurse = departmentHeadNurse;
    }

    public Integer getNursingOfficeClerk() {
        return nursingOfficeClerk;
    }

    public void setNursingOfficeClerk(Integer nursingOfficeClerk) {
        this.nursingOfficeClerk = nursingOfficeClerk;
    }

    public Integer getNursingOfficeSupervisor() {
        return nursingOfficeSupervisor;
    }

    public void setNursingOfficeSupervisor(Integer nursingOfficeSupervisor) {
        this.nursingOfficeSupervisor = nursingOfficeSupervisor;
    }

    public Integer getNursingOfficeAssistantDirector() {
        return nursingOfficeAssistantDirector;
    }

    public void setNursingOfficeAssistantDirector(Integer nursingOfficeAssistantDirector) {
        this.nursingOfficeAssistantDirector = nursingOfficeAssistantDirector;
    }

    public Integer getNursingOfficeDeputyDirector() {
        return nursingOfficeDeputyDirector;
    }

    public void setNursingOfficeDeputyDirector(Integer nursingOfficeDeputyDirector) {
        this.nursingOfficeDeputyDirector = nursingOfficeDeputyDirector;
    }

    public Integer getNursingOfficeDirector() {
        return nursingOfficeDirector;
    }

    public void setNursingOfficeDirector(Integer nursingOfficeDirector) {
        this.nursingOfficeDirector = nursingOfficeDirector;
    }

    public Integer getNoDuty() {
        return noDuty;
    }

    public void setNoDuty(Integer noDuty) {
        this.noDuty = noDuty;
    }

    public Integer getUnknownDuty() {
        return unknownDuty;
    }

    public void setUnknownDuty(Integer unknownDuty) {
        this.unknownDuty = unknownDuty;
    }

    public Integer getUnder20() {
        return under20;
    }

    public void setUnder20(Integer under20) {
        this.under20 = under20;
    }

    public Integer getAge20To29() {
        return age20To29;
    }

    public void setAge20To29(Integer age20To29) {
        this.age20To29 = age20To29;
    }

    public Integer getAge30To39() {
        return age30To39;
    }

    public void setAge30To39(Integer age30To39) {
        this.age30To39 = age30To39;
    }

    public Integer getAge40To49() {
        return age40To49;
    }

    public void setAge40To49(Integer age40To49) {
        this.age40To49 = age40To49;
    }

    public Integer getAge50To54() {
        return age50To54;
    }

    public void setAge50To54(Integer age50To54) {
        this.age50To54 = age50To54;
    }

    public Integer getAge55Plus() {
        return age55Plus;
    }

    public void setAge55Plus(Integer age55Plus) {
        this.age55Plus = age55Plus;
    }

    public Integer getUnknownAge() {
        return unknownAge;
    }

    public void setUnknownAge(Integer unknownAge) {
        this.unknownAge = unknownAge;
    }

    public Integer getJuniorHigh() {
        return juniorHigh;
    }

    public void setJuniorHigh(Integer juniorHigh) {
        this.juniorHigh = juniorHigh;
    }

    public Integer getTechnicalSchool() {
        return technicalSchool;
    }

    public void setTechnicalSchool(Integer technicalSchool) {
        this.technicalSchool = technicalSchool;
    }

    public Integer getHighSchool() {
        return highSchool;
    }

    public void setHighSchool(Integer highSchool) {
        this.highSchool = highSchool;
    }

    public Integer getCollege() {
        return college;
    }

    public void setCollege(Integer college) {
        this.college = college;
    }

    public Integer getBachelor() {
        return bachelor;
    }

    public void setBachelor(Integer bachelor) {
        this.bachelor = bachelor;
    }

    public Integer getMaster() {
        return master;
    }

    public void setMaster(Integer master) {
        this.master = master;
    }

    public Integer getPhd() {
        return phd;
    }

    public void setPhd(Integer phd) {
        this.phd = phd;
    }

    public Integer getPostdoc() {
        return postdoc;
    }

    public void setPostdoc(Integer postdoc) {
        this.postdoc = postdoc;
    }

    public Integer getUnknownEducation() {
        return unknownEducation;
    }

    public void setUnknownEducation(Integer unknownEducation) {
        this.unknownEducation = unknownEducation;
    }

    public Integer getClinicalPosition() {
        return clinicalPosition;
    }

    public void setClinicalPosition(Integer clinicalPosition) {
        this.clinicalPosition = clinicalPosition;
    }

    public Integer getManagementPosition() {
        return managementPosition;
    }

    public void setManagementPosition(Integer managementPosition) {
        this.managementPosition = managementPosition;
    }

    public Integer getUnknownPosition() {
        return unknownPosition;
    }

    public void setUnknownPosition(Integer unknownPosition) {
        this.unknownPosition = unknownPosition;
    }

    public Integer getFormalEmployee() {
        return formalEmployee;
    }

    public void setFormalEmployee(Integer formalEmployee) {
        this.formalEmployee = formalEmployee;
    }

    public Integer getContractEmployee() {
        return contractEmployee;
    }

    public void setContractEmployee(Integer contractEmployee) {
        this.contractEmployee = contractEmployee;
    }

    public Integer getPersonnelAgency() {
        return personnelAgency;
    }

    public void setPersonnelAgency(Integer personnelAgency) {
        this.personnelAgency = personnelAgency;
    }

    public Integer getLaborDispatch() {
        return laborDispatch;
    }

    public void setLaborDispatch(Integer laborDispatch) {
        this.laborDispatch = laborDispatch;
    }

    public Integer getRehire() {
        return rehire;
    }

    public void setRehire(Integer rehire) {
        this.rehire = rehire;
    }

    public Integer getStandardizedTraining() {
        return standardizedTraining;
    }

    public void setStandardizedTraining(Integer standardizedTraining) {
        this.standardizedTraining = standardizedTraining;
    }

    public Integer getIntern() {
        return intern;
    }

    public void setIntern(Integer intern) {
        this.intern = intern;
    }

    public Integer getFurtherStudy() {
        return furtherStudy;
    }

    public void setFurtherStudy(Integer furtherStudy) {
        this.furtherStudy = furtherStudy;
    }

    public Integer getPreReport() {
        return preReport;
    }

    public void setPreReport(Integer preReport) {
        this.preReport = preReport;
    }

    public Integer getOtherType() {
        return otherType;
    }

    public void setOtherType(Integer otherType) {
        this.otherType = otherType;
    }

    public Integer getUnknownEmploymentType() {
        return unknownEmploymentType;
    }

    public void setUnknownEmploymentType(Integer unknownEmploymentType) {
        this.unknownEmploymentType = unknownEmploymentType;
    }

    public Integer getLessThan1Year() {
        return lessThan1Year;
    }

    public void setLessThan1Year(Integer lessThan1Year) {
        this.lessThan1Year = lessThan1Year;
    }

    public Integer getYears1To2() {
        return years1To2;
    }

    public void setYears1To2(Integer years1To2) {
        this.years1To2 = years1To2;
    }

    public Integer getYears2To5() {
        return years2To5;
    }

    public void setYears2To5(Integer years2To5) {
        this.years2To5 = years2To5;
    }

    public Integer getYears5To10() {
        return years5To10;
    }

    public void setYears5To10(Integer years5To10) {
        this.years5To10 = years5To10;
    }

    public Integer getYears10To20() {
        return years10To20;
    }

    public void setYears10To20(Integer years10To20) {
        this.years10To20 = years10To20;
    }

    public Integer getMoreThan20Years() {
        return moreThan20Years;
    }

    public void setMoreThan20Years(Integer moreThan20Years) {
        this.moreThan20Years = moreThan20Years;
    }

    public Integer getUnknownExperience() {
        return unknownExperience;
    }

    public void setUnknownExperience(Integer unknownExperience) {
        this.unknownExperience = unknownExperience;
    }

    public Integer getHospitalLessThan1Year() {
        return hospitalLessThan1Year;
    }

    public void setHospitalLessThan1Year(Integer hospitalLessThan1Year) {
        this.hospitalLessThan1Year = hospitalLessThan1Year;
    }

    public Integer getHospital1To2Years() {
        return hospital1To2Years;
    }

    public void setHospital1To2Years(Integer hospital1To2Years) {
        this.hospital1To2Years = hospital1To2Years;
    }

    public Integer getHospital2To5Years() {
        return hospital2To5Years;
    }

    public void setHospital2To5Years(Integer hospital2To5Years) {
        this.hospital2To5Years = hospital2To5Years;
    }

    public Integer getHospital5To10Years() {
        return hospital5To10Years;
    }

    public void setHospital5To10Years(Integer hospital5To10Years) {
        this.hospital5To10Years = hospital5To10Years;
    }

    public Integer getHospital10To20Years() {
        return hospital10To20Years;
    }

    public void setHospital10To20Years(Integer hospital10To20Years) {
        this.hospital10To20Years = hospital10To20Years;
    }

    public Integer getHospitalMoreThan20Years() {
        return hospitalMoreThan20Years;
    }

    public void setHospitalMoreThan20Years(Integer hospitalMoreThan20Years) {
        this.hospitalMoreThan20Years = hospitalMoreThan20Years;
    }

    public Integer getUnknownHospitalTenure() {
        return unknownHospitalTenure;
    }

    public void setUnknownHospitalTenure(Integer unknownHospitalTenure) {
        this.unknownHospitalTenure = unknownHospitalTenure;
    }

    public Integer getNursing() {
        return nursing;
    }

    public void setNursing(Integer nursing) {
        this.nursing = nursing;
    }

    public Integer getMidwifery() {
        return midwifery;
    }

    public void setMidwifery(Integer midwifery) {
        this.midwifery = midwifery;
    }

    public Integer getUnknownSpecialty() {
        return unknownSpecialty;
    }

    public void setUnknownSpecialty(Integer unknownSpecialty) {
        this.unknownSpecialty = unknownSpecialty;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public Integer getInactive() {
        return inactive;
    }

    public void setInactive(Integer inactive) {
        this.inactive = inactive;
    }
}
