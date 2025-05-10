package com.ydl.nmis.hr.mapper;


import com.ydl.nmis.hr.domain.NmisHrCertificate;

import java.util.List;

/**
 * 护理人员证书获得情况Mapper接口
 *
 * @author ydl
 * @date 2025-03-05
 */
public interface NmisHrCertificateMapper
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

    /**
     * 修改护理人员证书获得情况
     *
     * @param nmisHrCertificate 护理人员证书获得情况
     * @return 结果
     */
    public int updateNmisHrCertificate(NmisHrCertificate nmisHrCertificate);

    /**
     * 删除护理人员证书获得情况
     *
     * @param id 护理人员证书获得情况主键
     * @return 结果
     */
    public int deleteNmisHrCertificateById(Long id);

    /**
     * 批量删除护理人员证书获得情况
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteNmisHrCertificateByIds(Long[] ids);
}

