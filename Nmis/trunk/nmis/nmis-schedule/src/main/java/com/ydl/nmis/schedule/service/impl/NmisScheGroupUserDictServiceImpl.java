package com.ydl.nmis.schedule.service.impl;

import com.ydl.nmis.schedule.domain.NmisScheGroupUserDict;
import com.ydl.nmis.schedule.dto.ScheGroupUserVO;
import com.ydl.nmis.schedule.mapper.NmisScheGroupUserDictMapper;
import com.ydl.nmis.schedule.service.INmisScheGroupUserDictService;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class NmisScheGroupUserDictServiceImpl implements INmisScheGroupUserDictService {

    @Autowired
    private NmisScheGroupUserDictMapper nmisScheGroupUserDictMapper;

    /**
     * 查询护理排班组用户列表
     *
     * @param scheGroupUserDict 护理排班组用户
     * @return 护理排班组用户
     */
    @Override
    public List<NmisScheGroupUserDict> selectScheGroupUserDictList(NmisScheGroupUserDict scheGroupUserDict) {
        return nmisScheGroupUserDictMapper.selectScheGroupUserDictList(scheGroupUserDict);
    }

    @Override
    public List<NmisScheGroupUserDict> selectRawGroupUsers(NmisScheGroupUserDict scheGroupUserDict) {
        return Collections.emptyList();
    }

    public List<ScheGroupUserVO> getGroupUserList(NmisScheGroupUserDict scheGroupUserDict) {
            // 1. 获取原始数据
            List<NmisScheGroupUserDict> rawData = nmisScheGroupUserDictMapper.selectRawGroupUsers(scheGroupUserDict);

            if (CollectionUtils.isEmpty(rawData)) {

                return Collections.emptyList();

            }

            // 2. 按groupId分组并拼接userName
            Map<String, String> groupUserNames = rawData.stream()
                    .filter(item -> item.getGroupId() != null && item.getUserName() != null)
                    .collect(Collectors.groupingBy(
                            NmisScheGroupUserDict::getGroupId,
                            Collectors.mapping(
                                    NmisScheGroupUserDict::getUserName,
                                    Collectors.joining(",")
                            )
                    ));

            // 3. 构建
            return rawData.stream()
                    .collect(Collectors.toMap(
                            NmisScheGroupUserDict::getGroupId,
                            item -> {
                                ScheGroupUserVO vo = new ScheGroupUserVO();
                                vo.setId(item.getGroupId());
                                vo.setGroupName(item.getGroupName());
                                vo.setDeptId(item.getDeptId());
                                vo.setDeptName(item.getDeptName());
                                vo.setDelFlag(String.valueOf(item.getDelFlag()));
                                return vo;
                            },
                            (existing, replacement) -> existing  // 如果有重复，保留已存在的
                    ))
                    .values().stream()
                    .peek(vo -> vo.setUserName(groupUserNames.get(vo.getId())))
                    .collect(Collectors.toList());
        }
    }
