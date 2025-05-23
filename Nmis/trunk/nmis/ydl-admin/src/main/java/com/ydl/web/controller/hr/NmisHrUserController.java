package com.ydl.web.controller.hr;


import java.io.IOException;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import com.ydl.nmis.hr.domain.NmisHrUser;
import com.ydl.nmis.hr.dto.NmisHrUserPicture;
import com.ydl.nmis.hr.service.INmisHrUserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.ydl.common.annotation.Log;
import com.ydl.common.core.controller.BaseController;
import com.ydl.common.core.domain.AjaxResult;
import com.ydl.common.enums.BusinessType;


import com.ydl.common.utils.poi.ExcelUtil;
import com.ydl.common.core.page.TableDataInfo;
import org.springframework.web.multipart.MultipartFile;

/**
 * 护理人员基本信息Controller
 *
 * @author ydl
 * @date 2025-03-05
 */
@RestController
@RequestMapping("/hr/user")
public class NmisHrUserController extends BaseController
{
    @Autowired
    private INmisHrUserService nmisHrUserService;

    //@Autowired
    //private FileService fileService;

    /**
     * 查询护理人员基本信息列表
     */
    //@PreAuthorize("@ss.hasPermi('system:user:list')")
    @GetMapping("/list")
    public TableDataInfo list(NmisHrUser nmisHrUser)
    {
        startPage();  //设置请求分页设计
        List<NmisHrUser> list = nmisHrUserService.selectNmisHrUserList(nmisHrUser);
        return getDataTable(list);
    }

/*    //@PreAuthorize("@ss.hasPermi('system:user:list')")
    @GetMapping("/levellist")
    public TableDataInfo list(NmisHrUser nmisHrUser1)
    {
        startPage();  //设置请求分页设计
        List<NmisHrUser> list = nmisHrUserService.selectNmisHrUserlevelList(nmisHrUser1);
        return getDataTable(list);
    }*/


    /**
     * 导出护理人员基本信息列表
     */
    //@PreAuthorize("@ss.hasPermi('system:user:export')")
    @Log(title = "护理人员基本信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, NmisHrUser nmisHrUser)
    {
        List<NmisHrUser> list = nmisHrUserService.selectNmisHrUserList(nmisHrUser);
        ExcelUtil<NmisHrUser> util = new ExcelUtil<NmisHrUser>(NmisHrUser.class);
        util.exportExcel(response, list, "护理人员基本信息数据");
    }


    @GetMapping("/all")
    public TableDataInfo listAll (NmisHrUser nmisHrUser){
        List<NmisHrUser> list = nmisHrUserService.selectNmisHrUserList(nmisHrUser);
        return getDataTable(list);
    }


    /**
     * 获取护理人员基本信息详细信息
     */
    //@PreAuthorize("@ss.hasPermi('system:user:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(nmisHrUserService.selectNmisHrUserById(id));
    }

    /**
     * 新增护理人员基本信息
     */
    //@PreAuthorize("@ss.hasPermi('system:user:add')")
    @Log(title = "护理人员基本信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@Valid @RequestBody NmisHrUser nmisHrUser)
    {
        return toAjax(nmisHrUserService.insertNmisHrUser(nmisHrUser));
    }

    /**
     *  上传护士照片
     */
    @PostMapping("/uploadPhoto")
    public ResponseEntity<String> uploadPhoto(@RequestParam("file") MultipartFile file) {
        try {
            String filePath = nmisHrUserService.savePhoto(file);
            return ResponseEntity.ok(filePath);
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to upload photo");
        }
    }

    /**上传护士证件文件*/
    @PostMapping("/uploadDocument")
    public ResponseEntity<String> uploadDocument(@RequestParam("file") MultipartFile file) {
        try {
            String filePath = nmisHrUserService.saveDocument(file);
            return ResponseEntity.ok(filePath);
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to upload document");
        }
    }

    /** 保存护士信息*/
    @PostMapping("/save")
    public ResponseEntity<String> saveNurseInfo(@RequestBody NmisHrUser nurse,
                                                @RequestParam("photoPath") String photoPath,
                                                @RequestParam("documentPath") String documentPath) {
        nmisHrUserService.saveNurseInfo(nurse, photoPath, documentPath);
        return ResponseEntity.ok("Nurse information saved successfully");
    }

    /**
     * 新增人员基本信息

    //@PreAuthorize("@ss.hasPermi('system:user:add')")
    @PostMapping("/list2")
    public ResponseEntity<String> addNurse(@RequestPart("nmisHrUser") NmisHrUser nmisHrUser,
                                           @RequestPart("photo") MultipartFile photo,
                                           @RequestPart("document") MultipartFile document) throws IOException {
        // 将文件设置到 Nurse 对象中
        nmisHrUser.setPhoto(photo);
        nmisHrUser.setDocument(document);

        // 调用 Service 层保存护士信息
        nmisHrUserService.saveNurse(nmisHrUser);
        return ResponseEntity.ok("Nurse information saved successfully");
    }
    */
    /**
     * 修改护理人员基本信息
     */
    //@PreAuthorize("@ss.hasPermi('system:user:edit')")
    @Log(title = "护理人员基本信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@Valid @RequestBody NmisHrUser nmisHrUser)
    {
        return toAjax(nmisHrUserService.updateNmisHrUser(nmisHrUser));
    }

    /**
     * 删除单个护理人员基本信息
     */
    //@PreAuthorize("@ss.hasPermi('system:user:remove')")
    @Log(title = "护理人员基本信息", businessType = BusinessType.DELETE)
    @DeleteMapping("/del/{id}")
    public AjaxResult removeid(@PathVariable Long id)
    {
        return toAjax(nmisHrUserService.deleteNmisHrUserById(id));
    }

    /**
     * 删除多个护理人员基本信息
     */
    //@PreAuthorize("@ss.hasPermi('system:user:remove')")
    @Log(title = "护理人员基本信息", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(nmisHrUserService.deleteNmisHrUserByIds(ids));
    }

    /**
     * 修改护理人员头像信息
     */
    //@PreAuthorize("@ss.hasPermi('system:user:edit')")
    @Log(title = "护理人员头像信息", businessType = BusinessType.UPDATE)
    @PutMapping("/updatePicture")
    public AjaxResult edit(@Valid @RequestBody NmisHrUserPicture nmisHrUserPicture)
    {
        return toAjax(nmisHrUserService.updateNmisHrUserPicture(nmisHrUserPicture));
    }

}
