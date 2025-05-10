package com.ydl.nmis.hr.service;

import com.ydl.nmis.hr.dto.NmisHrStats;

import java.util.List;

public interface INmisHrStatsService {

    public List<NmisHrStats> selectNmisHrStatsList(NmisHrStats nmisHrStats);

}
