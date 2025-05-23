package com.ydl.nmis.schedule.domain;


import com.ydl.common.annotation.Excel;
import com.ydl.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 护理排班组用户对象 nmis_sche_group_user
 *
 * @author ydl
 * @date 2025-03-19
 */
public class NmisScheGroupUser extends BaseEntity
{
    private static final long serialVersionUID = 1L;



    /** 主键 */
    private String id;

    /** 组id */
    @Excel(name = "组id")
    private String groupId;


    /** 护士ID */
    @Excel(name = "护士ID")
    private String userId;

    /** 组名 */
    private String groupName;

    /** 护士姓名 */
    private String userName;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setGroupId(String groupId)
    {
        this.groupId = groupId;
    }

    public String getGroupId()
    {
        return groupId;
    }
    public void setUserId(String userId)
    {
        this.userId = userId;
    }

    public String getUserId()
    {
        return userId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("groupId", getGroupId())
                .append("userId", getUserId())
                .toString();
    }
}
