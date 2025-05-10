package com.ydl.web.controller.schedule;


import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ydl.nmis.schedule.domain.NmisScheMaster;
import com.ydl.nmis.schedule.service.INmisScheMasterService;
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
import com.ydl.common.utils.poi.ExcelUtil;
import com.ydl.common.core.page.TableDataInfo;

/**
 * 护理排班主Controller
 *
 * @author ydl
 * @date 2025-03-28
 */
@RestController
@RequestMapping("/schedule/master")
public class NmisScheMasterController extends BaseController
{
    @Autowired
    private INmisScheMasterService nmisScheMasterService;

    /**
     * 查询护理排班主列表
     */
    //@PreAuthorize("@ss.hasPermi('system:master:list')")
    @GetMapping("/list")
    public TableDataInfo list(NmisScheMaster nmisScheMaster)
    {
        startPage();
        List<NmisScheMaster> list = nmisScheMasterService.selectNmisScheMasterList(nmisScheMaster);
        return getDataTable(list);
    }

    /**
     * 导出护理排班主列表
     */
    //@PreAuthorize("@ss.hasPermi('system:master:export')")
    @Log(title = "护理排班主", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, NmisScheMaster nmisScheMaster)
    {
        List<NmisScheMaster> list = nmisScheMasterService.selectNmisScheMasterList(nmisScheMaster);
        ExcelUtil<NmisScheMaster> util = new ExcelUtil<NmisScheMaster>(NmisScheMaster.class);
        util.exportExcel(response, list, "护理排班主数据");
    }

    /**
     * 获取护理排班主详细信息
     */
    //@PreAuthorize("@ss.hasPermi('system:master:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(nmisScheMasterService.selectNmisScheMasterById(id));
    }

    /**
     * 新增护理排班主
     */
    //@PreAuthorize("@ss.hasPermi('system:master:add')")
    //@Log(title = "护理排班主", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody NmisScheMaster nmisScheMaster)
    {
        return toAjax(nmisScheMasterService.insertNmisScheMaster(nmisScheMaster));
    }

    /**
     * 修改护理排班主
     */
    //@PreAuthorize("@ss.hasPermi('system:master:edit')")
    //@Log(title = "护理排班主", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody NmisScheMaster nmisScheMaster)
    {
        return toAjax(nmisScheMasterService.updateNmisScheMaster(nmisScheMaster));
    }

    /**
     * 删除护理排班主
     */
    //@PreAuthorize("@ss.hasPermi('system:master:remove')")
    @Log(title = "护理排班主", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(nmisScheMasterService.deleteNmisScheMasterByIds(ids));
    }
}

