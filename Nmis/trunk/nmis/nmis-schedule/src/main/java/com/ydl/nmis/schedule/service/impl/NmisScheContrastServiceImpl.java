package com.ydl.nmis.schedule.service.impl;

import com.ydl.nmis.schedule.domain.NmisScheCompDict;
import com.ydl.nmis.schedule.domain.NmisScheContrast;
import com.ydl.nmis.schedule.domain.NmisScheGroupUserDict;
import com.ydl.nmis.schedule.dto.ScheGroupUserVO;
import com.ydl.nmis.schedule.mapper.NmisScheContrastMapper;
import com.ydl.nmis.schedule.service.NmisScheContrastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Service
public class NmisScheContrastServiceImpl implements NmisScheContrastService {

    @Autowired
    private NmisScheContrastMapper nmisScheContrastMapper;

    /**
     * 查询护理排班组合班次2
     *
     * @param id 护理排班组合班次主键
     * @return 护理排班组合班次
     */

    @Override
    public NmisScheContrast selectNmisScheContrastDictById(String id) {
        return nmisScheContrastMapper.selectNmisScheContrastDictById(id);
    }


    /**
     * 查询护理排班组合班次对照列表2
     *
     * @param nmisScheContrast 护理排班组合班次2
     * @return 护理排班组合班次集合2
     */
    @Override
    public List<NmisScheContrast> selectNmisScheContrastList2(NmisScheContrast nmisScheContrast) {

        //1. 获取原始数据
        List<NmisScheContrast> rowData =  nmisScheContrastMapper.selectNmisScheContrastList2(nmisScheContrast);

        if(CollectionUtils.isEmpty(rowData)){
            return Collections.emptyList();
        }

        //2. 按id进行分组拼接scheItemId、scheName、inputCode、hours
        Map<String, String> groupScheItemId = rowData.stream()
                .filter(item -> item.getId() != null && item.getScheItemId() != null)
                .collect(Collectors.groupingBy(
                        NmisScheContrast::getId,
                        Collectors.mapping(
                                NmisScheContrast::getScheItemId,
                                Collectors.joining(",")
                        )
                ));

        Map<String, String> groupScheName = rowData.stream()
                .filter(item -> item.getId() != null && item.getScheName() != null)
                .collect(Collectors.groupingBy(
                        NmisScheContrast::getId,
                        Collectors.mapping(
                                NmisScheContrast::getScheName,
                                Collectors.joining(",")
                        )
                ));

        Map<String, String> groupInputCode = rowData.stream()
                .filter(item -> item.getId() != null && item.getInputCode() != null)
                .collect(Collectors.groupingBy(
                        NmisScheContrast::getId,
                        Collectors.mapping(
                                NmisScheContrast::getInputCode,
                                Collectors.joining(",")
                        )
                ));

        Map<String, String> groupHours = rowData.stream()
                .filter(item -> item.getId() != null && item.getHours() != null)
                .collect(Collectors.groupingBy(
                        NmisScheContrast::getId,
                        Collectors.mapping(
                                NmisScheContrast::getHours,
                                Collectors.joining(",")
                        )
                ));

        // 3. 构建最终结果
        return rowData.stream()
                .collect(Collectors.toMap(
                        NmisScheContrast::getId,
                        item -> {
                            NmisScheContrast vo = new NmisScheContrast();
                            vo.setId(item.getId());
                            vo.setGroupName(item.getGroupName());
                            vo.setDeptId(item.getDeptId());
                            vo.setDeptName(item.getDeptName());
                            vo.setDelFlag(item.getDelFlag());
                            vo.setCombId(item.getCombId());
                            return vo;
                        },
                        (existing, replacement) -> existing  // 如果有重复，保留已存在的
                ))
                .values().stream()
                .peek(vo -> vo.setScheItemId(groupScheItemId.get(vo.getId())))
                .peek(vo -> vo.setScheName(groupScheName.get(vo.getId())))
                .peek(vo -> vo.setInputCode(groupInputCode.get(vo.getId())))
                .peek(vo -> vo.setHours(groupHours.get(vo.getId())))
                .collect(Collectors.toList());
    }
}
