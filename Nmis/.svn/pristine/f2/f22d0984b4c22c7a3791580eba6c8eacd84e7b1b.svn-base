package com.ydl.web.controller.common;

import com.ydl.common.core.domain.entity.StaffDict;
import com.ydl.system.service.StaffDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ydl.common.core.page.TableDataInfo;

import java.util.List;

import static com.ydl.common.utils.PageUtils.startPage;


/**
 *
 * @author comm
 * @date 2025-04-25
 */

@RestController
@RequestMapping("/system/commStaff")
public class CommStaffDict {

    @Autowired
    private StaffDictService staffDictService;

    @GetMapping("/list")
    public List<StaffDict> list2(StaffDict staffDict)
    {
        List<StaffDict> list = staffDictService.selectStaffList(staffDict);
        return list;
    }
}
