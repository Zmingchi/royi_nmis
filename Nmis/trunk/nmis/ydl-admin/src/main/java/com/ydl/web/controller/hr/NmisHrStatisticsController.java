package com.ydl.web.controller.hr;


import com.ydl.common.core.controller.BaseController;
import com.ydl.common.core.page.TableDataInfo;
import com.ydl.nmis.base.service.INmisDeptDictService;
import com.ydl.nmis.hr.domain.NmisHrBedRate;
import com.ydl.nmis.hr.domain.NmisHrUser;
import com.ydl.nmis.hr.dto.NmisHrCoat;
import com.ydl.nmis.hr.dto.NmisHrShoe;
import com.ydl.nmis.hr.dto.NmisHrStats;
import com.ydl.nmis.hr.dto.NmisHrTrouser;
import com.ydl.nmis.hr.service.INmisHrClothesService;
import com.ydl.nmis.hr.service.INmisHrStatsService;
import com.ydl.nmis.hr.service.INmisHrUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.DecimalFormat;
import java.util.List;


@RestController
@RequestMapping("/hr/query")
public class NmisHrStatisticsController extends BaseController {
    @Autowired
    private INmisHrUserService nmisHrUserService;
    @Autowired
    private INmisHrClothesService hrClothesService;
    @Autowired
    private INmisDeptDictService deptDictService;
    @Autowired
    private INmisHrStatsService hrStatsService;


    /**
     * 查询护理人员离职率基本信息列表
     */
    @GetMapping("/resignList")
    public TableDataInfo list(NmisHrUser nmisHrUser)
    {
        startPage();  //设置请求分页设计
        List<NmisHrUser> list = nmisHrUserService.selectNmisHrUserList(nmisHrUser);
        return getDataTable(list);
    }

    /**
     * 查询护理人员上衣统计
     */
    @GetMapping("/coatList")
    public TableDataInfo list(NmisHrCoat nmisHrCoat){
        startPage();

        List<NmisHrCoat> list = hrClothesService.selectNmisHrCoat(nmisHrCoat);
        int i = 1;
        for(NmisHrCoat nmisHrCoat1:list){
            nmisHrCoat1.setId(i);
            i++;
        }
        return getDataTable(list);
    }

    /**
     * 查询护理人员裤子统计
     */
    @GetMapping("/trouserList")
    public TableDataInfo list(NmisHrTrouser nmisHrTrouser){
        startPage();
        List<NmisHrTrouser> list = hrClothesService.selectNmisHrTrouser(nmisHrTrouser);
        int t = 1;
        for(NmisHrTrouser nmisHrTrouser1:list){
            nmisHrTrouser1.setId(t);
            t++;
        }
        return getDataTable(list);
    }

    /**
     * 查询护理人员鞋子统计
     */
    @GetMapping("/shoeList")
    public TableDataInfo list(NmisHrShoe nmisHrShoe){
        startPage();
        List<NmisHrShoe> list = hrClothesService.selectNmisHrShoe(nmisHrShoe);
        int t = 1;
        for(NmisHrShoe nmisHrShoe1:list){
            nmisHrShoe1.setId(t);
            t++;
        }
        return getDataTable(list);
    }

    /**
     * 查询科室、全院床护比
     */
    @GetMapping("/bedRateList")
    public TableDataInfo list(NmisHrBedRate nmisHrBedRate){
        startPage();
        List<NmisHrBedRate> list = hrClothesService.selectNmisHrBedRate(nmisHrBedRate);
        return getDataTable(list);
    }

    /**
     * 查询人员分布
     */
    @GetMapping("/peopleSpread")
    public  TableDataInfo list(NmisHrStats nmisHrStats,
                               @RequestParam(defaultValue = "true") boolean isPage // 默认分页
    ){
        if(isPage) {
            startPage();
        }
            List<NmisHrStats> list = hrStatsService.selectNmisHrStatsList(nmisHrStats);
            int t = 1;
            for (NmisHrStats nmisHrStats1 : list) {
                nmisHrStats1.setSerialNo(t);
                t++;
            }
            return getDataTable(list);

    }

}
