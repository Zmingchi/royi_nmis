package com.ydl.nmis.hr.service.impl;


import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import com.ydl.nmis.hr.domain.NmisHrCertificate;
import com.ydl.nmis.hr.mapper.NmisHrCertificateMapper;
import com.ydl.nmis.hr.service.INmisHrCertificateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


/**
 * 护理人员证书获得情况Service业务层处理
 *
 * @author ydl
 * @date 2025-03-05
 */
@Service
public class NmisHrCertificateServiceImpl implements INmisHrCertificateService
{
    @Autowired
    private NmisHrCertificateMapper nmisHrCertificateMapper;

    private static final String PHOTO_DIR = "uploads/photos/";
    private static final String DOCUMENT_DIR = "uploads/documents/";

    /**
     * 查询护理人员证书获得情况
     *
     * @param id 护理人员证书获得情况主键
     * @return 护理人员证书获得情况
     */
    @Override
    public NmisHrCertificate selectNmisHrCertificateById(Long id)
    {
        return nmisHrCertificateMapper.selectNmisHrCertificateById(id);
    }

    /**
     * 查询护理人员证书获得情况列表
     *
     * @param nmisHrCertificate 护理人员证书获得情况
     * @return 护理人员证书获得情况
     */
    @Override
    public List<NmisHrCertificate> selectNmisHrCertificateList(NmisHrCertificate nmisHrCertificate)
    {
        return nmisHrCertificateMapper.selectNmisHrCertificateList(nmisHrCertificate);
    }

    /**
     * 新增护理人员证书获得情况
     *
     * @param nmisHrCertificate 护理人员证书获得情况
     * @return 结果
     */
    @Override
    public int insertNmisHrCertificate(NmisHrCertificate nmisHrCertificate)
    {
        return nmisHrCertificateMapper.insertNmisHrCertificate(nmisHrCertificate);
    }

    @Override
    public String savePhoto(MultipartFile file) throws IOException {
        return saveFile(file, PHOTO_DIR);
    }

    @Override
    public String saveDocument(MultipartFile file) throws IOException {
        return saveFile(file, DOCUMENT_DIR);
    }

    @Override
    public void saveHrCertificateInfo(NmisHrCertificate nmisHrCertificate, String photoPath) {
        nmisHrCertificate.setAttachment(photoPath);
        nmisHrCertificateMapper.insertNmisHrCertificate(nmisHrCertificate);
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
     * 修改护理人员证书获得情况
     *
     * @param nmisHrCertificate 护理人员证书获得情况
     * @return 结果
     */
    @Override
    public int updateNmisHrCertificate(NmisHrCertificate nmisHrCertificate)
    {
        return nmisHrCertificateMapper.updateNmisHrCertificate(nmisHrCertificate);
    }

    /**
     * 批量删除护理人员证书获得情况
     *
     * @param ids 需要删除的护理人员证书获得情况主键
     * @return 结果
     */
    @Override
    public int deleteNmisHrCertificateByIds(Long[] ids)
    {
        return nmisHrCertificateMapper.deleteNmisHrCertificateByIds(ids);
    }

    /**
     * 删除护理人员证书获得情况信息
     *
     * @param id 护理人员证书获得情况主键
     * @return 结果
     */
    @Override
    public int deleteNmisHrCertificateById(Long id)
    {
        return nmisHrCertificateMapper.deleteNmisHrCertificateById(id);
    }
}

