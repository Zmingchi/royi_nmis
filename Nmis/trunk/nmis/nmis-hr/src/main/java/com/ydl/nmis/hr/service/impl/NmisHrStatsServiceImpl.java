package com.ydl.nmis.hr.service.impl;


import com.ydl.nmis.hr.dto.NmisHrStats;
import com.ydl.nmis.hr.mapper.NmisHrStatsMapper;
import com.ydl.nmis.hr.service.INmisHrStatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class NmisHrStatsServiceImpl implements INmisHrStatsService {

    @Autowired
    private NmisHrStatsMapper nmisHrStatsMapper;


    @Override
    public List<NmisHrStats> selectNmisHrStatsList(NmisHrStats nmisHrStats) {

        return nmisHrStatsMapper.selectNmisHrStatsList(nmisHrStats);

    }
}
