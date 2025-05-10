package com.ydl.web.controller.schedule;


import com.ydl.common.core.controller.BaseController;
import com.ydl.common.core.page.TableDataInfo;
import com.ydl.nmis.hr.domain.NmisHrUser;
import com.ydl.nmis.hr.service.INmisHrUserService;
import com.ydl.nmis.schedule.dto.NursingUnitStaffDetail;
import com.ydl.nmis.schedule.dto.NursingUnitStaffReport;
import com.ydl.nmis.schedule.service.NursingUnitStaffDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.Date;
import java.util.List;
import java.util.Objects;


@RestController
@RequestMapping("schedule/staffReport")
public class NursingUnitStaffReportController extends BaseController {

    @Autowired
    private NursingUnitStaffDetailService nursingUnitStaffDetailService;
    @Autowired
    private INmisHrUserService nmisHrUserService;

    @GetMapping("/reportList")
    public TableDataInfo list(@RequestParam(value = "deptId",required = false) String deptId,
                              @RequestParam("scheDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date scheDate
    )  {
        startPage();
        String deptId1;
        NmisHrUser nmisHrUser;
        List<NmisHrUser> userList;
        List<NursingUnitStaffReport> list = nursingUnitStaffDetailService.selectNursingUnitStaffReport(deptId,scheDate);
            for (NursingUnitStaffReport nursingUnitStaffReport1 : list) {
                deptId1 = nursingUnitStaffReport1.getDeptId();
                nmisHrUser = new NmisHrUser();
                nmisHrUser.setDeptId(deptId1);
                userList = nmisHrUserService.selectNmisHrUserList(nmisHrUser);
                for (NmisHrUser nmisHrUser1 : userList) {
                    if (Objects.equals(nmisHrUser1.getTitle(), "5")) {
                        nursingUnitStaffReport1.setHeadNurse(nmisHrUser1.getName());
                    }
                }
            }
        return getDataTable(list);
    }

    @GetMapping("/detailList")
    public TableDataInfo list2(@RequestParam(value = "deptId",required = false) String deptId,
                               @RequestParam("scheDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date scheDate,
                               @RequestParam(value ="scheName",required = false) String scheName
    )  {
        startPage();
        List<NursingUnitStaffDetail> list = nursingUnitStaffDetailService.selectStaffDetailsByDept2(deptId,scheDate, scheName);
        return getDataTable(list);

    }
}
