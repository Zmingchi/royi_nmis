package com.ydl.web.controller.schedule;


import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ydl.nmis.schedule.domain.NmisScheCombItemDict;
import com.ydl.nmis.schedule.service.INmisScheCombItemDictService;
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
 * 护理排班组合班与普通班次对应Controller
 *
 * @author ydl
 * @date 2025-03-19
 */
@RestController
@RequestMapping("/schedule/combltem/dict")
public class NmisScheCombItemDictController extends BaseController
{
    @Autowired
    private INmisScheCombItemDictService nmisScheCombItemDictService;

    /**
     * 查询护理排班组合班与普通班次对应列表
     */
    //@PreAuthorize("@ss.hasPermi('system:dict:list')")
    @GetMapping("/list")
    public TableDataInfo list(NmisScheCombItemDict nmisScheCombItemDict)
    {
        startPage();
        List<NmisScheCombItemDict> list = nmisScheCombItemDictService.selectNmisScheCombItemDictList(nmisScheCombItemDict);
        return getDataTable(list);
    }

    /**
     * 导出护理排班组合班与普通班次对应列表
     */
    //@PreAuthorize("@ss.hasPermi('system:dict:export')")
    @Log(title = "护理排班组合班与普通班次对应", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, NmisScheCombItemDict nmisScheCombItemDict)
    {
        List<NmisScheCombItemDict> list = nmisScheCombItemDictService.selectNmisScheCombItemDictList(nmisScheCombItemDict);
        ExcelUtil<NmisScheCombItemDict> util = new ExcelUtil<NmisScheCombItemDict>(NmisScheCombItemDict.class);
        util.exportExcel(response, list, "护理排班组合班与普通班次对应数据");
    }

    /**
     * 获取护理排班组合班与普通班次对应详细信息
     */
    //@PreAuthorize("@ss.hasPermi('system:dict:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(nmisScheCombItemDictService.selectNmisScheCombItemDictById(id));
    }

    /**
     * 新增护理排班组合班与普通班次对应
     */
    //@PreAuthorize("@ss.hasPermi('system:dict:add')")
    @Log(title = "护理排班组合班与普通班次对应", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody NmisScheCombItemDict nmisScheCombItemDict)
    {
        return toAjax(nmisScheCombItemDictService.insertNmisScheCombItemDict(nmisScheCombItemDict));
    }

    /**
     * 修改护理排班组合班与普通班次对应
     */
    //@PreAuthorize("@ss.hasPermi('system:dict:edit')")
    @Log(title = "护理排班组合班与普通班次对应", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody NmisScheCombItemDict nmisScheCombItemDict)
    {
        return toAjax(nmisScheCombItemDictService.updateNmisScheCombItemDict(nmisScheCombItemDict));
    }

    /**
     * 删除护理排班组合班与普通班次对应
     */
    //@PreAuthorize("@ss.hasPermi('system:dict:remove')")
    @Log(title = "护理排班组合班与普通班次对应", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(nmisScheCombItemDictService.deleteNmisScheCombItemDictByIds(ids));
    }
}

