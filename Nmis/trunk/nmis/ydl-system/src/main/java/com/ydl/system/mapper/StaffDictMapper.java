package com.ydl.system.mapper;

import com.ydl.common.annotation.DataSource;
import com.ydl.common.core.domain.entity.StaffDict;
import com.ydl.common.enums.DataSourceType;

import java.util.List;

public interface StaffDictMapper {

    /**
     * 根据条件查询His中用户列表
     *
     * @param staff 用户信息
     * @return 用户信息集合信息
     */
    @DataSource(value = DataSourceType.SLAVE)
    public List<StaffDict> selectStaffList(StaffDict staff);
}
