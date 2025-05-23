package com.ydl.web.controller.hr;

import com.ydl.nmis.base.domain.NmisDeptDict;
import com.ydl.nmis.base.service.INmisDeptDictService;
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

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.List;


/**
 * 护理科室信息Controller
 *
 * @author ydl
 * @date 2025-03-07
 */

@RestController
@RequestMapping("/dept/dict")
public class NmisDeptDictController extends BaseController
{
    @Autowired
    private INmisDeptDictService nmisDeptDictService;

    /**
     * 查询护理科室信息列表
     */
    //@PreAuthorize("@ss.hasPermi('system:dict:list')")
    @GetMapping("/list")
    public TableDataInfo list(NmisDeptDict nmisDeptDict)
    {
        startPage();
        List<NmisDeptDict> list = nmisDeptDictService.selectNmisDeptDictList(nmisDeptDict);
        return getDataTable(list);
    }

    /**
     * 查询护理科室信息列表
     */

    //@PreAuthorize("@ss.hasPermi('system:dict:list')")
    @GetMapping("/all")
    public TableDataInfo list1(NmisDeptDict nmisDeptDict1)
    {
        List<NmisDeptDict> list = nmisDeptDictService.selectNmisDeptDictList(nmisDeptDict1);
        return getDataTable(list);
    }

    /**
     * 导出护理科室信息列表
     */
    //@PreAuthorize("@ss.hasPermi('system:dict:export')")
    @Log(title = "护理科室信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, NmisDeptDict nmisDeptDict)
    {
        List<NmisDeptDict> list = nmisDeptDictService.selectNmisDeptDictList(nmisDeptDict);
        ExcelUtil<NmisDeptDict> util = new ExcelUtil<NmisDeptDict>(NmisDeptDict.class);
        util.exportExcel(response, list, "护理科室信息数据");
    }

    /**
     * 获取护理科室信息详细信息
     */
    //@PreAuthorize("@ss.hasPermi('system:dict:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(nmisDeptDictService.selectNmisDeptDictById(id));
    }

    /**
     * 新增护理科室信息
     */
    //@PreAuthorize("@ss.hasPermi('system:dict:add')")
    @Log(title = "护理科室信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@Valid @RequestBody NmisDeptDict nmisDeptDict)
    {
        return toAjax(nmisDeptDictService.insertNmisDeptDict(nmisDeptDict));
    }

    /**
     * 修改护理科室信息
     */
    //@PreAuthorize("@ss.hasPermi('system:dict:edit')")
    @Log(title = "护理科室信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@Valid @RequestBody NmisDeptDict nmisDeptDict)
    {
        return toAjax(nmisDeptDictService.updateNmisDeptDict(nmisDeptDict));
    }

    /**
     * 删除护理科室信息
     */
    //@PreAuthorize("@ss.hasPermi('system:dict:remove')")
    @Log(title = "护理科室信息", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(nmisDeptDictService.deleteNmisDeptDictByIds(ids));
    }
}

