package com.ydl.web.controller.hr;


import java.util.List;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import com.ydl.nmis.hr.domain.NmisHrExpatriate;
import com.ydl.nmis.hr.service.INmisHrExpatriateService;
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
 * 护理人员外派信息Controller
 *
 * @author ydl
 * @date 2025-03-12
 */
@RestController
@RequestMapping("/hr/expatriate")
public class NmisHrExpatriateController extends BaseController
{
    @Autowired
    private INmisHrExpatriateService nmisHrExpatriateService;

    /**
     * 查询护理人员外派信息列表
     */
    //@PreAuthorize("@ss.hasPermi('system:expatriate:list')")
    @GetMapping("/list")
    public TableDataInfo list(NmisHrExpatriate nmisHrExpatriate)
    {
        startPage();
        List<NmisHrExpatriate> list = nmisHrExpatriateService.selectNmisHrExpatriateList(nmisHrExpatriate);
        return getDataTable(list);
    }

    /**
     * 导出护理人员外派信息列表
     */
    //@PreAuthorize("@ss.hasPermi('system:expatriate:export')")
    @Log(title = "护理人员外派信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, NmisHrExpatriate nmisHrExpatriate)
    {
        List<NmisHrExpatriate> list = nmisHrExpatriateService.selectNmisHrExpatriateList(nmisHrExpatriate);
        ExcelUtil<NmisHrExpatriate> util = new ExcelUtil<NmisHrExpatriate>(NmisHrExpatriate.class);
        util.exportExcel(response, list, "护理人员外派信息数据");
    }

    /**
     * 获取护理人员外派信息详细信息
     */
    //@PreAuthorize("@ss.hasPermi('system:expatriate:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(nmisHrExpatriateService.selectNmisHrExpatriateById(id));
    }

    /**
     * 新增护理人员外派信息
     */
    //@PreAuthorize("@ss.hasPermi('system:expatriate:add')")
    @Log(title = "护理人员外派信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@Valid @RequestBody NmisHrExpatriate nmisHrExpatriate)
    {
        return toAjax(nmisHrExpatriateService.insertNmisHrExpatriate(nmisHrExpatriate));
    }

    /**
     * 修改护理人员外派信息
     */
    //@PreAuthorize("@ss.hasPermi('system:expatriate:edit')")
    @Log(title = "护理人员外派信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@Valid @RequestBody NmisHrExpatriate nmisHrExpatriate)
    {
        return toAjax(nmisHrExpatriateService.updateNmisHrExpatriate(nmisHrExpatriate));
    }

    /**
     * 删除护理人员外派信息
     */
    //@PreAuthorize("@ss.hasPermi('system:expatriate:remove')")
    @Log(title = "护理人员外派信息", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(nmisHrExpatriateService.deleteNmisHrExpatriateByIds(ids));
    }
}
