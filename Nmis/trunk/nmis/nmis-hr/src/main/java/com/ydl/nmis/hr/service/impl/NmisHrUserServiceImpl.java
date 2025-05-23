package com.ydl.nmis.hr.service.impl;


import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import cn.hutool.core.util.IdcardUtil;


import com.ydl.nmis.hr.domain.NmisHrUser;
import com.ydl.nmis.hr.dto.NmisHrUserPicture;
import com.ydl.nmis.hr.mapper.NmisHrUserMapper;
import com.ydl.nmis.hr.service.INmisHrUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.web.multipart.MultipartFile;

/**
 * 护理人员基本信息Service业务层处理
 *
 * @author ydl
 * @date 2025-03-05
 */
@Service
public class NmisHrUserServiceImpl implements INmisHrUserService
{
    @Autowired
    private NmisHrUserMapper nmisHrUserMapper;


    private static final String PHOTO_DIR = "uploads/photos/";
    private static final String DOCUMENT_DIR = "uploads/documents/";

    /**
     * 查询护理人员基本信息
     *
     * @param id 护理人员基本信息主键
     * @return 护理人员基本信息
     */
    @Override
    public NmisHrUser selectNmisHrUserById(Long id)
    {
        return nmisHrUserMapper.selectNmisHrUserById(id);
    }

    /**
     * 查询护理人员基本信息列表
     *
     * @param nmisHrUser 护理人员基本信息
     * @return 护理人员基本信息
     */
    @Override
    public List<NmisHrUser> selectNmisHrUserList(NmisHrUser nmisHrUser)
    {
        return nmisHrUserMapper.selectNmisHrUserList(nmisHrUser);
    }

    @Override
    public List<NmisHrUser> selectNmisHrUserlevelList(NmisHrUser nmisHrUser)
    {
        return nmisHrUserMapper.selectNmisHrUserlevelList( nmisHrUser);
    }

/////********************
    @Override
    public String savePhoto(MultipartFile file) throws IOException {
        return saveFile(file, PHOTO_DIR);
    }

    @Override
    public String saveDocument(MultipartFile file) throws IOException {
        return saveFile(file, DOCUMENT_DIR);
    }

    @Override
    public void saveNurseInfo(NmisHrUser nurse, String photoPath, String documentPath) {
        nurse.setPicture(photoPath);
        nurse.setRegisterAttach(documentPath);
        nmisHrUserMapper.insertNmisHrUser(nurse); // 插入护士信息到数据库
    }

    private String saveFile(MultipartFile file, String directory) throws IOException {
        File dir = new File(directory);
        if (!dir.exists()) {
            dir.mkdirs();
        }

        // 生成唯一文件名
        String fileName = UUID.randomUUID().toString() + "_" + file.getOriginalFilename();
        File targetFile = new File(dir.getAbsolutePath() + File.separator + fileName);
        file.transferTo(targetFile);

        return targetFile.getAbsolutePath();
    }

    /**
     * 新增基本信息
     *
     * @param nmisHrUser 护理人员基本信息
     * @return 结果
     *
    public void saveNurse(NmisHrUser nmisHrUser) throws IOException {
        // 上传照片
        String photoPath = fileService.uploadFile(nmisHrUser.getPhoto(), "nurse_photo");

        // 上传档案
        String documentPath = fileService.uploadFile(nmisHrUser.getDocument(), "nurse_document");

        // 设置文件路径到 Nurse 对象
        nmisHrUser.setPicture(photoPath);
        nmisHrUser.setRegisterAttach(documentPath);

        // 插入护士信息
        nmisHrUserMapper.saveNurse(nmisHrUser);
    }
     */
    /**
     * 新增护理人员基本信息
     *
     * @param nmisHrUser 护理人员基本信息
     * @return 结果
     */
    @Override
    public int insertNmisHrUser(NmisHrUser nmisHrUser)
    {
            return nmisHrUserMapper.insertNmisHrUser(nmisHrUser);

    }

    /**
     * 修改护理人员基本信息
     *
     * @param nmisHrUser 护理人员基本信息
     * @return 结果
     */
    @Override
    public int updateNmisHrUser(NmisHrUser nmisHrUser)
    {
        return nmisHrUserMapper.updateNmisHrUser(nmisHrUser);
    }

    /**
     * 批量删除护理人员基本信息
     *
     * @param ids 需要删除的护理人员基本信息主键
     * @return 结果
     */
    @Override
    public int deleteNmisHrUserByIds(Long[] ids)
    {
        return nmisHrUserMapper.deleteNmisHrUserByIds(ids);
    }

    /**
     * 删除护理人员基本信息信息
     *
     * @param id 护理人员基本信息主键
     * @return 结果
     */
    @Override
    public int deleteNmisHrUserById(Long id)
    {
        return nmisHrUserMapper.deleteNmisHrUserById(id);
    }


    @Override
    public int updateNmisHrUserPicture(NmisHrUserPicture nmisHrUserPicture) {
        return nmisHrUserMapper.updateNmisHrUserPicture(nmisHrUserPicture);
    }
}