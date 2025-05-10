package com.ydl.web.controller.hr;


import java.io.IOException;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import com.ydl.nmis.hr.domain.NmisHrCertificate;
import com.ydl.nmis.hr.domain.NmisHrUser;
import com.ydl.nmis.hr.service.INmisHrCertificateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.ydl.common.annotation.Log;
import com.ydl.common.core.controller.BaseController;
import com.ydl.common.core.domain.AjaxResult;
import com.ydl.common.enums.BusinessType;
import com.ydl.common.utils.poi.ExcelUtil;
import com.ydl.common.core.page.TableDataInfo;
import org.springframework.web.multipart.MultipartFile;

/**
 * 护理人员证书获得情况Controller
 *
 * @author ydl
 * @date 2025-03-05
 */
@RestController
@RequestMapping("/hr/certificate")
public class NmisHrCertificateController extends BaseController
{

    @Autowired
    private INmisHrCertificateService nmisHrCertificateService;

    /**
     * 查询护理人员证书获得情况列表
     */
    //@PreAuthorize("@ss.hasPermi('system:certificate:list')")
    @GetMapping("/list")
    public TableDataInfo list(NmisHrCertificate nmisHrCertificate)
    {
        startPage();
        List<NmisHrCertificate> list = nmisHrCertificateService.selectNmisHrCertificateList(nmisHrCertificate);
        return getDataTable(list);
    }

    /**
     * 导出护理人员证书获得情况列表
     */
    //@PreAuthorize("@ss.hasPermi('system:certificate:export')")
    @Log(title = "护理人员证书获得情况", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, NmisHrCertificate nmisHrCertificate)
    {
        List<NmisHrCertificate> list = nmisHrCertificateService.selectNmisHrCertificateList(nmisHrCertificate);
        ExcelUtil<NmisHrCertificate> util = new ExcelUtil<NmisHrCertificate>(NmisHrCertificate.class);
        util.exportExcel(response, list, "护理人员证书获得情况数据");
    }

    /**
     * 获取护理人员证书获得情况详细信息
     */
    //@PreAuthorize("@ss.hasPermi('system:certificate:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(nmisHrCertificateService.selectNmisHrCertificateById(id));
    }

    /**
     * 新增护理人员证书获得情况
     */
    //@PreAuthorize("@ss.hasPermi('system:certificate:add')")
    @Log(title = "护理人员证书获得情况", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@Valid @RequestBody NmisHrCertificate nmisHrCertificate)
    {
        return toAjax(nmisHrCertificateService.insertNmisHrCertificate(nmisHrCertificate));
    }

    /**
     *  上传护士证书照片
     */
    @PostMapping("/uploadPhoto")
    public ResponseEntity<String> uploadPhoto(@RequestParam("file") MultipartFile file) {
        try {
            String filePath = nmisHrCertificateService.savePhoto(file);
            return ResponseEntity.ok(filePath);
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to upload photo");
        }
    }

    /** 保存护士信息*/
    @PostMapping("/save")
    public ResponseEntity<String> saveHrCertificateInfo(@RequestBody NmisHrCertificate nmisHrCertificate,
                                                @RequestParam("photoPath") String photoPath) {
        nmisHrCertificateService.saveHrCertificateInfo(nmisHrCertificate,photoPath );
        return ResponseEntity.ok("Nurse information saved successfully");
    }

    /**
     * 修改护理人员证书获得情况
     */
    //@PreAuthorize("@ss.hasPermi('system:certificate:edit')")
    @Log(title = "护理人员证书获得情况", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@Valid @RequestBody NmisHrCertificate nmisHrCertificate)
    {
        return toAjax(nmisHrCertificateService.updateNmisHrCertificate(nmisHrCertificate));
    }

    /**
     * 删除护理人员证书获得情况
     */
    //@PreAuthorize("@ss.hasPermi('system:certificate:remove')")
    @Log(title = "护理人员证书获得情况", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(nmisHrCertificateService.deleteNmisHrCertificateByIds(ids));
    }
}
