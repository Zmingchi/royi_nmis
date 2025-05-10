package com.ydl.system.service.impl;

import com.ydl.common.core.domain.entity.DeptDict;
import com.ydl.system.mapper.DeptDictMapper;
import com.ydl.system.service.DeptDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class DeptDictServiceImpl implements DeptDictService {

    @Autowired
    private DeptDictMapper deptDictMapper;
    @Override
    public List<DeptDict> selectDeptDict(DeptDict deptDict) {
        return deptDictMapper.selectDeptDict(deptDict);
    }
}
