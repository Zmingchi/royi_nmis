package com.ydl.nmis.schedule.mapper;

import com.ydl.nmis.schedule.dto.NursingUnitStaffDetail;
import com.ydl.nmis.schedule.dto.NursingUnitStaffReport;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface NursingUnitStaffDetailMapper {

    // 查询 NursingUnitStaffReport 主数据
    public List<NursingUnitStaffReport> selectNursingUnitStaffReport(@Param("deptId") String deptId, @Param("scheDate") Date scheDate);

    // 查询 NursingUnitStaffDetail 列表（通过关联查询自动映射）
    public List<NursingUnitStaffDetail> selectStaffDetailsByDept2(@Param("deptId") String deptId, @Param("scheDate") Date scheDate , @Param("scheName") String scheName);

}
