package com.ydl.nmis.hr.domain;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.ydl.common.core.domain.BaseEntity;

import java.util.Date;

/**
 * 护理人员床护比 nmis_hr_bed_rate
 *
 * @author zmc
 * @date 2025-04-07
 */
public class NmisHrBedRate extends BaseEntity {

    /** 主键 */
    private Long id;

    /** 科室id */
    private String deptId;

    /** 科室名称 */
    private String deptName;

    /**科室床位数 */
    private int bedNum;

    /**科室护士数 */
    private int nurseNum;

    /**院内床位数 */
    private int allBedNum;

    /**院内护士数 */
    private int allNurseNum;

    /**记录日期  */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date recordDate;

    private String startDate;

    private String endDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public int getBedNum() {
        return bedNum;
    }

    public void setBedNum(int bedNum) {
        this.bedNum = bedNum;
    }

    public int getNurseNum() {
        return nurseNum;
    }

    public void setNurseNum(int nurseNum) {
        this.nurseNum = nurseNum;
    }

    public int getAllBedNum() {
        return allBedNum;
    }

    public void setAllBedNum(int allBedNum) {
        this.allBedNum = allBedNum;
    }

    public int getAllNurseNum() {
        return allNurseNum;
    }

    public void setAllNurseNum(int allNurseNum) {
        this.allNurseNum = allNurseNum;
    }

    public Date getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(Date recordDate) {
        this.recordDate = recordDate;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
