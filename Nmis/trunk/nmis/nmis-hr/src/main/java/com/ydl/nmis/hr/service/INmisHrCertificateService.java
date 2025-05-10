package com.ydl.nmis.hr.service;


import com.ydl.nmis.hr.domain.NmisHrCertificate;
import com.ydl.nmis.hr.domain.NmisHrUser;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

/**
 * 护理人员证书获得情况Service接口
 *
 * @author ydl
 * @date 2025-03-05
 */
public interface INmisHrCertificateService
{
    /**
     * 查询护理人员证书获得情况
     *
     * @param id 护理人员证书获得情况主键
     * @return 护理人员证书获得情况
     */
    public NmisHrCertificate selectNmisHrCertificateById(Long id);

    /**
     * 查询护理人员证书获得情况列表
     *
     * @param nmisHrCertificate 护理人员证书获得情况
     * @return 护理人员证书获得情况集合
     */
    public List<NmisHrCertificate> selectNmisHrCertificateList(NmisHrCertificate nmisHrCertificate);

    /**
     * 新增护理人员证书获得情况
     *
     * @param nmisHrCertificate 护理人员证书获得情况
     * @return 结果
     */
    public int insertNmisHrCertificate(NmisHrCertificate nmisHrCertificate);


    // 保存护士照片
    String savePhoto(MultipartFile file) throws IOException;

    // 保存护士证件文件
    String saveDocument(MultipartFile file) throws IOException;

    // 保存护士信息（包括文件路径）
    void saveHrCertificateInfo(NmisHrCertificate nmisHrCertificate, String photoPath);

    /**
     * 修改护理人员证书获得情况
     *
     * @param nmisHrCertificate 护理人员证书获得情况
     * @return 结果
     */
    public int updateNmisHrCertificate(NmisHrCertificate nmisHrCertificate);

    /**
     * 批量删除护理人员证书获得情况
     *
     * @param ids 需要删除的护理人员证书获得情况主键集合
     * @return 结果
     */
    public int deleteNmisHrCertificateByIds(Long[] ids);

    /**
     * 删除护理人员证书获得情况信息
     *
     * @param id 护理人员证书获得情况主键
     * @return 结果
     */
    public int deleteNmisHrCertificateById(Long id);
}

