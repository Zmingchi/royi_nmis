package com.ydl.nmis.hr.service.impl;

import com.ydl.nmis.hr.domain.NmisHrBedRate;
import com.ydl.nmis.hr.dto.NmisHrCoat;
import com.ydl.nmis.hr.dto.NmisHrShoe;
import com.ydl.nmis.hr.dto.NmisHrTrouser;
import com.ydl.nmis.hr.mapper.NmisHrClothesMapper;
import com.ydl.nmis.hr.service.INmisHrClothesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class NmisHrClothesServiceImpl implements INmisHrClothesService {

    @Autowired
    private NmisHrClothesMapper nmisHrClothesMapper;

    /**
     * 根据科室码，衣服类型类型查询下面
     *@param nmisHrCoat 上衣统计信息
     */

    public List<NmisHrCoat> selectNmisHrCoat(NmisHrCoat nmisHrCoat){
        return nmisHrClothesMapper.selectNmisHrCoat(nmisHrCoat);
    }

    @Override
    public List<NmisHrTrouser> selectNmisHrTrouser(NmisHrTrouser nmisHrTrouser) {
        return nmisHrClothesMapper.selectNmisHrTrouser(nmisHrTrouser);
    }

    @Override
    public List<NmisHrShoe> selectNmisHrShoe(NmisHrShoe nmisHrShoe) {
        return nmisHrClothesMapper.selectNmisHrShoe(nmisHrShoe);
    }

    @Override
    public List<NmisHrBedRate> selectNmisHrBedRate(NmisHrBedRate nmisHrBedRate) {
        return nmisHrClothesMapper.selectNmisHrBedRate(nmisHrBedRate);
    }


}
