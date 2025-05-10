package com.ydl.nmis.schedule.mapper;


import com.ydl.nmis.schedule.domain.NmisScheGroupUser;
import com.ydl.nmis.schedule.dto.DeptScheGroupUser;

import java.util.List;

/**
 * 护理排班组用户Mapper接口
 *
 * @author ydl
 * @date 2025-03-19
 */
public interface NmisScheGroupUserMapper
{
    /**
     * 查询护理排班组用户
     *
     * @param id 护理排班组用户主键
     * @return 护理排班组用户
     */
    public NmisScheGroupUser selectNmisScheGroupUserById(String id);

    /**
     * 查询护理排班组用户列表
     *
     * @param nmisScheGroupUser 护理排班组用户
     * @return 护理排班组用户集合
     */
    public List<NmisScheGroupUser> selectNmisScheGroupUserList(NmisScheGroupUser nmisScheGroupUser);

    public List<DeptScheGroupUser> selectDeptScheGroupUserList(String deptId);
    /**
     * 新增护理排班组用户
     *
     * @param nmisScheGroupUser 护理排班组用户
     * @return 结果
     */
    public int insertNmisScheGroupUser(NmisScheGroupUser nmisScheGroupUser);

    /**
     * 修改护理排班组用户
     *
     * @param nmisScheGroupUser 护理排班组用户
     * @return 结果
     */
    public int updateNmisScheGroupUser(NmisScheGroupUser nmisScheGroupUser);

    /**
     * 删除护理排班组用户
     *
     * @param id 护理排班组用户主键
     * @return 结果
     */
    public int deleteNmisScheGroupUserById(String id);

    /**
     * 批量删除护理排班组用户
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteNmisScheGroupUserByIds(String[] ids);
}

