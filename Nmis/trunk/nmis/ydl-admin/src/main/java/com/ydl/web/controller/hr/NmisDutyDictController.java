package com.ydl.web.controller.hr;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;


import com.ydl.nmis.base.domain.NmisDutyDict;
import com.ydl.nmis.base.service.INmisDutyDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
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
 * 护理人员职务字典Controller
 * 
 * @author ydl
 * @date 2024-04-09
 */
@RestController
@RequestMapping("/base/duty")
public class NmisDutyDictController extends BaseController
{
    @Autowired
    private INmisDutyDictService nmisDutyDictService;

    /**
     * 查询护理人员职务字典列表
     */
    //@PreAuthorize("@ss.hasPermi('base:duty:list')")
    @GetMapping("/list")
    public TableDataInfo list(NmisDutyDict nmisDutyDict)
    {
        startPage();
        List<NmisDutyDict> list = nmisDutyDictService.selectNmisDutyDictList(nmisDutyDict);
        return getDataTable(list);
    }

    /**
     * 导出护理人员职务字典列表
     */
    //@PreAuthorize("@ss.hasPermi('base:duty:export')")
    @Log(title = "护理人员职务字典", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, NmisDutyDict nmisDutyDict)
    {
        List<NmisDutyDict> list = nmisDutyDictService.selectNmisDutyDictList(nmisDutyDict);
        ExcelUtil<NmisDutyDict> util = new ExcelUtil<NmisDutyDict>(NmisDutyDict.class);

        util.exportExcel(response, list, "护理人员职务字典数据");
    }

    /**
     * 获取护理人员职务字典详细信息
     */
    //@PreAuthorize("@ss.hasPermi('base:duty:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(nmisDutyDictService.selectNmisDutyDictById(id));
    }

    /**
     * 新增护理人员职务字典
     */
    //@PreAuthorize("@ss.hasPermi('base:duty:add')")
    @Log(title = "护理人员职务字典", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@Valid  @RequestBody NmisDutyDict nmisDutyDict)
    {
        return toAjax(nmisDutyDictService.insertNmisDutyDict(nmisDutyDict));
    }

    /**
     * 修改护理人员职务字典
     */
    //@PreAuthorize("@ss.hasPermi('base:duty:edit')")
    @Log(title = "护理人员职务字典", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@Valid @RequestBody NmisDutyDict nmisDutyDict)
    {
        return toAjax(nmisDutyDictService.updateNmisDutyDict(nmisDutyDict));
    }

    /**
     * 删除护理人员职务字典
     */
    //@PreAuthorize("@ss.hasPermi('base:dutyremove')")
    @Log(title = "护理人员职务字典", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(nmisDutyDictService.deleteNmisDutyDictByIds(ids));
    }
}
