package com.ydl.web.controller.hr;


import java.util.List;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import com.ydl.nmis.hr.domain.NmisHrTransfer;
import com.ydl.nmis.hr.service.INmisHrTransferService;
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
import com.ydl.common.utils.poi.ExcelUtil;
import com.ydl.common.core.page.TableDataInfo;

/**
 * 护理人员调科信息Controller
 *
 * @author ydl
 * @date 2025-03-05
 */
@RestController
@RequestMapping("/hr/transfer")
public class NmisHrTransferController extends BaseController
{
    @Autowired
    private INmisHrTransferService nmisHrTransferService;

    /**
     * 查询护理人员调科信息列表
     */
    //@PreAuthorize("@ss.hasPermi('system:transfer:list')")
    @GetMapping("/list")
    public TableDataInfo list(NmisHrTransfer nmisHrTransfer)
    {
        startPage();
        List<NmisHrTransfer> list = nmisHrTransferService.selectNmisHrTransferList(nmisHrTransfer);
        return getDataTable(list);
    }

    /**
     * 导出护理人员调科信息列表
     */
    //@PreAuthorize("@ss.hasPermi('system:transfer:export')")
    @Log(title = "护理人员调科信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, NmisHrTransfer nmisHrTransfer)
    {
        List<NmisHrTransfer> list = nmisHrTransferService.selectNmisHrTransferList(nmisHrTransfer);
        ExcelUtil<NmisHrTransfer> util = new ExcelUtil<NmisHrTransfer>(NmisHrTransfer.class);
        util.exportExcel(response, list, "护理人员调科信息数据");
    }

    /**
     * 获取护理人员调科信息详细信息
     */
    //@PreAuthorize("@ss.hasPermi('system:transfer:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(nmisHrTransferService.selectNmisHrTransferById(id));
    }

    /**
     * 新增护理人员调科信息
     */
    //@PreAuthorize("@ss.hasPermi('system:transfer:add')")
    @Log(title = "护理人员调科信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@Valid @RequestBody NmisHrTransfer nmisHrTransfer)
    {
        return toAjax(nmisHrTransferService.insertNmisHrTransfer(nmisHrTransfer));
    }

    /**
     * 修改护理人员调科信息
     */
    //@PreAuthorize("@ss.hasPermi('system:transfer:edit')")
    @Log(title = "护理人员调科信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@Valid @RequestBody NmisHrTransfer nmisHrTransfer)
    {
        return toAjax(nmisHrTransferService.updateNmisHrTransfer(nmisHrTransfer));
    }

    /**
     * 删除护理人员调科信息
     */
    //@PreAuthorize("@ss.hasPermi('system:transfer:remove')")
    @Log(title = "护理人员调科信息", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(nmisHrTransferService.deleteNmisHrTransferByIds(ids));
    }
}

