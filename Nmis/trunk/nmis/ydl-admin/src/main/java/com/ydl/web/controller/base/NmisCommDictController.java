package com.ydl.web.controller.base;


import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ydl.nmis.base.domain.NmisCommDict;
import com.ydl.nmis.base.service.INmisCommDictService;
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
 * 护理通用字典Controller
 *
 * @author ydl
 * @date 2025-03-06
 */
@RestController
@RequestMapping("/base/dict")
public class NmisCommDictController extends BaseController
{
    @Autowired
    private INmisCommDictService nmisCommDictService;

    /**
     * 查询护理通用字典列表
     */
    //@PreAuthorize("@ss.hasPermi('system:dict:list')")
    @GetMapping("/list/")
    public TableDataInfo list(NmisCommDict id)
    {
        startPage();
        List<NmisCommDict> list = nmisCommDictService.selectNmisCommDictList(id);
        return getDataTable(list);
    }

    /**
     * type_code查询护理通用字典列表明细
     */
    @GetMapping("/byTypeCode/{typeCode}")
    public List<NmisCommDict> selectNmisCommDictByTypeCode(@PathVariable String typeCode) {
        return nmisCommDictService.selectNmisCommDictByTypeCode(typeCode);
    }

    /**
     * 导出护理通用字典列表
     */
    //@PreAuthorize("@ss.hasPermi('system:dict:export')")
    @Log(title = "护理通用字典", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, NmisCommDict nmisCommDict)
    {
        List<NmisCommDict> list = nmisCommDictService.selectNmisCommDictList(nmisCommDict);
        ExcelUtil<NmisCommDict> util = new ExcelUtil<NmisCommDict>(NmisCommDict.class);
        util.exportExcel(response, list, "护理通用字典数据");
    }


    /**
     * 获取护理通用字典详细信息

    //@PreAuthorize("@ss.hasPermi('system:dict:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        //return success(nmisCommDictService.selectNmisCommDictById(id));
        //return success(nmisCommDictService.selectNmisCommDictByTypeId(id));
    }
    */


    /**
     * 获取护理通用字典详细信息
     */
    //@PreAuthorize("@ss.hasPermi('system:dict:query')")


    /**
     * 新增护理通用字典
     */
    //@PreAuthorize("@ss.hasPermi('system:dict:add')")
    @Log(title = "护理通用字典", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody NmisCommDict nmisCommDict)
    {
        return toAjax(nmisCommDictService.insertNmisCommDict(nmisCommDict));
    }

    /**
     * 修改护理通用字典
     */
    //@PreAuthorize("@ss.hasPermi('system:dict:edit')")
    @Log(title = "护理通用字典", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody NmisCommDict nmisCommDict)
    {
        return toAjax(nmisCommDictService.updateNmisCommDict(nmisCommDict));
    }

    /**
     * 删除护理通用字典
     */
    //@PreAuthorize("@ss.hasPermi('system:dict:remove')")
    @Log(title = "护理通用字典", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(nmisCommDictService.deleteNmisCommDictByIds(ids));
    }
}

