package com.ydl.nmis.schedule.service;

import com.ydl.nmis.schedule.dto.NursingUnitStaffDetail;
import com.ydl.nmis.schedule.dto.NursingUnitStaffReport;


import java.util.Date;
import java.util.List;

public interface NursingUnitStaffDetailService {

    public List<NursingUnitStaffReport> selectNursingUnitStaffReport (String deptId ,Date scheDate);

    public List<NursingUnitStaffDetail> selectStaffDetailsByDept2(String deptId,Date scheDate,String scheName);

}
