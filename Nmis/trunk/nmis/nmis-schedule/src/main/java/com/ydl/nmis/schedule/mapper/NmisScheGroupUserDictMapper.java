package com.ydl.nmis.schedule.mapper;

import com.ydl.nmis.schedule.domain.NmisScheGroupUserDict;

import java.util.List;

public interface NmisScheGroupUserDictMapper {

    /**
     * 查询护理排班组用户列表
     *
     * @param  scheGroupUserDict 护理排班组用户
     * @return 护理排班组用户集合
     */
    public List<NmisScheGroupUserDict> selectScheGroupUserDictList(NmisScheGroupUserDict scheGroupUserDict);

    /**
     * 查询护理排班组用户列表2
     *
     * @param scheGroupUserDict 护理排班组用户2 //
     * @return 护理排班组用户集合2
     */
    public List<NmisScheGroupUserDict> selectRawGroupUsers(NmisScheGroupUserDict scheGroupUserDict);
}
