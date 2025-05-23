package com.ydl.system.service.impl;

import com.ydl.common.annotation.DataSource;
import com.ydl.common.core.domain.entity.StaffDict;
import com.ydl.common.enums.DataSourceType;
import com.ydl.system.mapper.StaffDictMapper;
import com.ydl.system.service.StaffDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class StaffDictServiceImpl implements StaffDictService {

    @Autowired
    private StaffDictMapper staffDictService;

    @Override
    public List<StaffDict> selectStaffList(StaffDict staff) {
        return staffDictService.selectStaffList(staff);
    }


}
