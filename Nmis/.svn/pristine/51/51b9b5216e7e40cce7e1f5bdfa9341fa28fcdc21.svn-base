package com.ydl.nmis.schedule.service.impl;

import com.ydl.nmis.schedule.dto.NursingUnitStaffDetail;
import com.ydl.nmis.schedule.dto.NursingUnitStaffReport;
import com.ydl.nmis.schedule.mapper.NursingUnitStaffDetailMapper;
import com.ydl.nmis.schedule.service.NursingUnitStaffDetailService;
import io.lettuce.core.dynamic.annotation.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@Service
public class NursingUnitStaffDetailServiceImpl implements NursingUnitStaffDetailService {

    @Autowired
    private NursingUnitStaffDetailMapper nursingUnitStaffDetailMapper;

    @Override
    public List<NursingUnitStaffReport> selectNursingUnitStaffReport(String deptId,Date scheDate) {
        return nursingUnitStaffDetailMapper.selectNursingUnitStaffReport(deptId , scheDate);
    }


    @Override
    public List<NursingUnitStaffDetail> selectStaffDetailsByDept2(String deptId, Date scheDate,String scheName) {
        return nursingUnitStaffDetailMapper.selectStaffDetailsByDept2(deptId , scheDate, scheName);
    }

}
