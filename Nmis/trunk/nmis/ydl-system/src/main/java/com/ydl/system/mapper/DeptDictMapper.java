package com.ydl.system.mapper;

import com.ydl.common.annotation.DataSource;
import com.ydl.common.core.domain.entity.DeptDict;
import com.ydl.common.enums.DataSourceType;

import java.util.List;

public interface DeptDictMapper {

    @DataSource(value = DataSourceType.SLAVE)
    public List<DeptDict> selectDeptDict(DeptDict deptDict);

}
