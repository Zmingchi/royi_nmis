package com.ydl.nmis.schedule.dto;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.ydl.common.annotation.Excel;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * 参与排班用户对象 nmis_sche_users
 *
 * @author ydl
 * @date 2025-03-29
 */
public class ScheUser
{
    /** 主键 */
    private String id;
    /** 护理人员ID */
    @Excel(name = "护理人员ID")
    private String nurseId;

    /** 护理人员姓名 */
    @Excel(name = "护理人员姓名")
    private String nurseName;

    /** 排序号 */
    @Excel(name = "排序号")
    private String seqNo;

    private String nurseLevel;

    private String enterDate;

    private String remark;
    /** 白班工时 */
    @Excel(name = "白班工时")
    private Long hours1;

    /** 夜班工时 */
    @Excel(name = "夜班工时")
    private Long hours2;

    /** 假期工时 */
    @Excel(name = "假期工时")
    private Long hours3;

    /** 休息工时 */
    @Excel(name = "休息工时")
    private Long hours4;

    /** 其他工时 */
    @Excel(name = "其他工时")
    private Long hours5;

    /** 累计加扣班 */
    @Excel(name = "累计加扣班")
    private Long hours6;

    /** 累计存假 */
    @Excel(name = "累计存假")
    private Long hours7;

    /** 年假 */
    @Excel(name = "年假")
    private Long hours8;

    /** 总工时 */
    @Excel(name = "总工时")
    private Long hours9;

    // 使用固定字段替代Map
    private ScheDetail day1;
    private ScheDetail day2;
    private ScheDetail day3;
    private ScheDetail day4;
    private ScheDetail day5;
    private ScheDetail day6;
    private ScheDetail day7;

    public void setId(String id)
    {
        this.id = id;
    }

    public String getId()
    {
        return id;
    }

    public String getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(String seqNo) {
        this.seqNo = seqNo;
    }

    public String getNurseLevel() {
        return nurseLevel;
    }

    public void setNurseLevel(String nurseLevel) {
        this.nurseLevel = nurseLevel;
    }
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
    public String getEnterDate() {
        return enterDate;
    }

    public void setEnterDate(String enterDate) {
        this.enterDate = enterDate;
    }

    public ScheDetail getDay1() {
        return day1;
    }

    public void setDay1(ScheDetail day1) {
        this.day1 = day1;
    }

    public ScheDetail getDay2() {
        return day2;
    }

    public void setDay2(ScheDetail day2) {
        this.day2 = day2;
    }

    public ScheDetail getDay3() {
        return day3;
    }

    public void setDay3(ScheDetail day3) {
        this.day3 = day3;
    }

    public ScheDetail getDay4() {
        return day4;
    }

    public void setDay4(ScheDetail day4) {
        this.day4 = day4;
    }

    public ScheDetail getDay5() {
        return day5;
    }

    public void setDay5(ScheDetail day5) {
        this.day5 = day5;
    }

    public ScheDetail getDay6() {
        return day6;
    }

    public void setDay6(ScheDetail day6) {
        this.day6 = day6;
    }

    public ScheDetail getDay7() {
        return day7;
    }

    public void setDay7(ScheDetail day7) {
        this.day7 = day7;
    }

    public String getNurseId() {
        return nurseId;
    }

    public void setNurseId(String nurseId) {
        this.nurseId = nurseId;
    }

    public String getNurseName() {
        return nurseName;
    }

    public void setNurseName(String nurseName) {
        this.nurseName = nurseName;
    }


    public Long getHours1() {
        return hours1;
    }

    public void setHours1(Long hours1) {
        this.hours1 = hours1;
    }

    public Long getHours2() {
        return hours2;
    }

    public void setHours2(Long hours2) {
        this.hours2 = hours2;
    }

    public Long getHours3() {
        return hours3;
    }

    public void setHours3(Long hours3) {
        this.hours3 = hours3;
    }

    public Long getHours4() {
        return hours4;
    }

    public void setHours4(Long hours4) {
        this.hours4 = hours4;
    }

    public Long getHours5() {
        return hours5;
    }

    public void setHours5(Long hours5) {
        this.hours5 = hours5;
    }

    public Long getHours6() {
        return hours6;
    }

    public void setHours6(Long hours6) {
        this.hours6 = hours6;
    }

    public Long getHours7() {
        return hours7;
    }

    public void setHours7(Long hours7) {
        this.hours7 = hours7;
    }

    public Long getHours8() {
        return hours8;
    }

    public void setHours8(Long hours8) {
        this.hours8 = hours8;
    }

    public Long getHours9() {
        return hours9;
    }

    public void setHours9(Long hours9) {
        this.hours9 = hours9;
    }

    @Override
    public String toString() {
        return "ScheUser{" +
                "id='" + id + '\'' +
                ", nurseId='" + nurseId + '\'' +
                ", nurseName='" + nurseName + '\'' +
                ", seqNo='" + seqNo + '\'' +
                ", nurseLevel='" + nurseLevel + '\'' +
                ", enterDate='" + enterDate + '\'' +
                ", remark='" + remark + '\'' +
                ", hours1=" + hours1 +
                ", hours2=" + hours2 +
                ", hours3=" + hours3 +
                ", hours4=" + hours4 +
                ", hours5=" + hours5 +
                ", hours6=" + hours6 +
                ", hours7=" + hours7 +
                ", hours8=" + hours8 +
                ", hours9=" + hours9 +
                ", day1=" + day1 +
                ", day2=" + day2 +
                ", day3=" + day3 +
                ", day4=" + day4 +
                ", day5=" + day5 +
                ", day6=" + day6 +
                ", day7=" + day7 +
                '}';
    }
}

