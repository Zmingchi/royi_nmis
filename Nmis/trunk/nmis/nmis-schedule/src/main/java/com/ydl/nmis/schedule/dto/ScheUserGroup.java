package com.ydl.nmis.schedule.dto;



import java.util.ArrayList;
import java.util.List;

import com.ydl.common.annotation.Excel;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 护理排班分组对象 nmis_sche_user_group
 *
 * @author ydl
 * @date 2025-03-19
 */
public class ScheUserGroup
{
    /** 组id */
    @Excel(name = "组id")
    private String groupId;

    /** 组名称 */
    @Excel(name = "组名称")
    private String groupName;

    List<ScheUser> groupUsers;

    public List<ScheUser> getGroupUsers() {
        return groupUsers;
    }

    public void setGroupUsers(List<ScheUser> groupUsers) {
        this.groupUsers = groupUsers;
    }

    public void setGroupId(String groupId)
    {
        this.groupId = groupId;
    }

    public String getGroupId()
    {
        return groupId;
    }
    public void setGroupName(String groupName)
    {
        this.groupName = groupName;
    }

    public String getGroupName()
    {
        return groupName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("groupId", getGroupId())
                .append("groupName", getGroupName())
                .toString();
    }
}

