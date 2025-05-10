package com.ydl.web.controller.qc;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ydl.common.annotation.Log;
import com.ydl.common.core.controller.BaseController;
import com.ydl.common.core.domain.AjaxResult;
import com.ydl.common.enums.BusinessType;
import com.ydl.qc.domain.NmisQcChkMaster;
import com.ydl.qc.service.INmisQcChkMasterService;
import com.ydl.common.utils.poi.ExcelUtil;
import com.ydl.common.core.page.TableDataInfo;

/**
 * 护理质量检查主记录Controller
 * 
 * @author ydl
 * @date 2025-05-08
 */
@RestController
@RequestMapping("/qc/chkMaster")
public class NmisQcChkMasterController extends BaseController
{
    @Autowired
    private INmisQcChkMasterService nmisQcChkMasterService;

    /**
     * 查询护理质量检查主记录列表
     */
    //@PreAuthorize("@ss.hasPermi('system:master:list')")
    @GetMapping("/list")
    public TableDataInfo list(NmisQcChkMaster nmisQcChkMaster)
    {
        startPage();
        List<NmisQcChkMaster> list = nmisQcChkMasterService.selectNmisQcChkMasterList(nmisQcChkMaster);
        return getDataTable(list);
    }

    /**
     * 导出护理质量检查主记录列表
     */
    //@PreAuthorize("@ss.hasPermi('system:master:export')")
    @Log(title = "护理质量检查主记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, NmisQcChkMaster nmisQcChkMaster)
    {
        List<NmisQcChkMaster> list = nmisQcChkMasterService.selectNmisQcChkMasterList(nmisQcChkMaster);
        ExcelUtil<NmisQcChkMaster> util = new ExcelUtil<NmisQcChkMaster>(NmisQcChkMaster.class);
        util.exportExcel(response, list, "护理质量检查主记录数据");
    }

    /**
     * 获取护理质量检查主记录详细信息
     */
    //@PreAuthorize("@ss.hasPermi('system:master:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(nmisQcChkMasterService.selectNmisQcChkMasterById(id));
    }

    /**
     * 新增护理质量检查主记录
     */
    //@PreAuthorize("@ss.hasPermi('system:master:add')")
    @Log(title = "护理质量检查主记录", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody NmisQcChkMaster nmisQcChkMaster)
    {
        return toAjax(nmisQcChkMasterService.insertNmisQcChkMaster(nmisQcChkMaster));
    }

    /**
     * 修改护理质量检查主记录
     */
    //@PreAuthorize("@ss.hasPermi('system:master:edit')")
    @Log(title = "护理质量检查主记录", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody NmisQcChkMaster nmisQcChkMaster)
    {
        return toAjax(nmisQcChkMasterService.updateNmisQcChkMaster(nmisQcChkMaster));
    }

    /**
     * 删除护理质量检查主记录
     */
    //@PreAuthorize("@ss.hasPermi('system:master:remove')")
    @Log(title = "护理质量检查主记录", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(nmisQcChkMasterService.deleteNmisQcChkMasterByIds(ids));
    }
}
