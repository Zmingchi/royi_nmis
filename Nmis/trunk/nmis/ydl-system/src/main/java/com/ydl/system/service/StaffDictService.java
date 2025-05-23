package com.ydl.system.service;

import com.ydl.common.core.domain.entity.StaffDict;
import com.ydl.common.core.domain.entity.SysUser;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StaffDictService {

    /**
     * 根据条件查询His中用户列表
     *
     * @param staff 用户信息
     * @return 用户信息集合信息
     */
    public List<StaffDict> selectStaffList(StaffDict staff);
}
