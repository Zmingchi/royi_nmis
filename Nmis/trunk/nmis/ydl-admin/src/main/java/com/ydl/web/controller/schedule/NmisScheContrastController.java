package com.ydl.web.controller.schedule;


import com.ydl.common.core.controller.BaseController;
import com.ydl.common.core.page.TableDataInfo;
import com.ydl.nmis.schedule.domain.NmisScheCompDict;
import com.ydl.nmis.schedule.domain.NmisScheContrast;
import com.ydl.nmis.schedule.service.NmisScheContrastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/schedule/contrast/dict")
public class NmisScheContrastController extends BaseController {
    @Autowired
    private NmisScheContrastService nmisScheContrastService;

    /**
     * 查询护理排班组合班次对照列表
     * 通过代码流查询
     */

    @GetMapping("/list")
    public TableDataInfo list2(NmisScheContrast nmisScheContrast){
        List<NmisScheContrast> list = nmisScheContrastService.selectNmisScheContrastList2(nmisScheContrast);
        startPage();
        List<NmisScheContrast> list2 = list;
        return getDataTable(list2);
    }
}
