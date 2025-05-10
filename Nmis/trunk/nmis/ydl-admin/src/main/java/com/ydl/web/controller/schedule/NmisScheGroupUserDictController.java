package com.ydl.web.controller.schedule;

import com.ydl.common.core.controller.BaseController;
import com.ydl.common.core.page.TableDataInfo;
import com.ydl.nmis.schedule.domain.NmisScheGroupUserDict;
import com.ydl.nmis.schedule.dto.ScheGroupUserVO;
import com.ydl.nmis.schedule.service.INmisScheGroupUserDictService;
import com.ydl.nmis.schedule.service.impl.NmisScheGroupUserDictServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/schedule/group/user/dict")
public class NmisScheGroupUserDictController extends BaseController {
    @Autowired
    public INmisScheGroupUserDictService nmsScheGroupUserDictService;

    @Autowired
    public NmisScheGroupUserDictServiceImpl nmsScheGroupUserDictServiceImpl;

    @GetMapping("list2")  //listagg方法实现，用户拼接
    public TableDataInfo list2(NmisScheGroupUserDict nmsScheGroupUserDict) {
        startPage();
        List<NmisScheGroupUserDict> list = nmsScheGroupUserDictService.selectScheGroupUserDictList(nmsScheGroupUserDict);
        return getDataTable(list);
    }
    @GetMapping("list")  //代码流转换方法
    public TableDataInfo list(NmisScheGroupUserDict scheGroupUserDict) {

        List<ScheGroupUserVO> list = nmsScheGroupUserDictServiceImpl.getGroupUserList(scheGroupUserDict);
        startPage();
        List<ScheGroupUserVO> list2;
        list2 = list;
        return getDataTable(list2);
/*
        return ResponseEntity.ok(nmsScheGroupUserDictServiceImpl.getGroupUserList(scheGroupUserDict));
*/
    }

}
