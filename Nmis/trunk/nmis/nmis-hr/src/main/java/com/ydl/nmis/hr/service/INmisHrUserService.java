package com.ydl.nmis.hr.service;


import com.ydl.nmis.hr.domain.NmisHrUser;
import com.ydl.nmis.hr.dto.NmisHrUserPicture;
import org.springframework.data.repository.query.Param;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 * 护理人员基本信息Service接口
 *
 * @author ydl
 * @date 2025-03-05
 */
public interface INmisHrUserService
{
    /**
     * 查询护理人员基本信息
     *
     * @param id 护理人员基本信息主键
     * @return 护理人员基本信息
     */
    public NmisHrUser selectNmisHrUserById(Long id);

    /**
     * 查询护理人员基本信息列表
     *
     * @param nmisHrUser 护理人员基本信息
     * @return 护理人员基本信息集合
     */
    public List<NmisHrUser> selectNmisHrUserList(NmisHrUser nmisHrUser);

    public List<NmisHrUser> selectNmisHrUserlevelList(NmisHrUser nmisHrUser);


    /**
     * 新增护理人员基本信息
     *
     * @param nmisHrUser 护理人员基本信息
     * @return 结果
     */
    public int insertNmisHrUser(NmisHrUser nmisHrUser);

    /**
     * 新增人员基本信息
     *
     * @param file 护理人员基本信息
     * @return 结果
     */

    // 保存护士照片
    String savePhoto(MultipartFile file) throws IOException;

    // 保存护士证件文件
    String saveDocument(MultipartFile file) throws IOException;

    // 保存护士信息（包括文件路径）
    void saveNurseInfo(NmisHrUser nurse, String photoPath, String documentPath);

    /**
     * 修改护理人员基本信息
     *
     * @param nmisHrUser 护理人员基本信息
     * @return 结果
     */
    public int updateNmisHrUser(NmisHrUser nmisHrUser);

    /**
     * 批量删除护理人员基本信息
     *
     * @param ids 需要删除的护理人员基本信息主键集合
     * @return 结果
     */
    public int deleteNmisHrUserByIds(Long[] ids);

    /**
     * 删除护理人员基本信息信息
     *
     * @param id 护理人员基本信息主键
     * @return 结果
     */
    public int deleteNmisHrUserById(Long id);

    /**
     * 修改护理人员头像信息
     *
     * @param nmisHrUserPicture 护理人员头像信息
     * @return 结果
     */
    public int updateNmisHrUserPicture(NmisHrUserPicture nmisHrUserPicture);
}


