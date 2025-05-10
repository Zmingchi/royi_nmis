package com.ydl.nmis.schedule.dto;

import java.util.Objects;

public class ScheGroupKey implements Comparable<ScheGroupKey>{
    private String groupId;
    private String groupName;

    public ScheGroupKey(String groupId, String groupName) {
        this.groupId = groupId;
        this.groupName = groupName;
    }

    public String getGroupId() {
        return groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ScheGroupKey groupKey = (ScheGroupKey) o;
        return Objects.equals(groupId, groupKey.groupId) &&
                Objects.equals(groupName, groupKey.groupName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, groupName);
    }

    @Override
    public String toString() {
        return "GroupKey{groupId='" + groupId + "', groupName='" + groupName + "'}";
    }

    @Override
    public int compareTo(ScheGroupKey other) {
        // 按 groupId 正序排序
        return this.groupId.compareTo(other.groupId);
    }
}
