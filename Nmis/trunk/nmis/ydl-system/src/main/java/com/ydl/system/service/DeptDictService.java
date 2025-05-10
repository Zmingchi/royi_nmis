package com.ydl.system.service;

import com.ydl.common.annotation.DataSource;
import com.ydl.common.core.domain.entity.DeptDict;
import com.ydl.common.enums.DataSourceType;
import org.springframework.stereotype.Service;

import java.util.List;

public interface DeptDictService {
    public List<DeptDict> selectDeptDict(DeptDict deptDict);
}
