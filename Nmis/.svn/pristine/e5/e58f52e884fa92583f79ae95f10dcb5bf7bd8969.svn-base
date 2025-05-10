package com.ydl.web.controller.base;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ydl.nmis.base.service.impl.NmisCommTypeDictServiceImpl;
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
import com.ydl.nmis.base.domain.NmisCommTypeDict;
import com.ydl.nmis.base.service.INmisCommTypeDictService;
import com.ydl.common.utils.poi.ExcelUtil;
import com.ydl.common.core.page.TableDataInfo;

/**
 * 护理通用字典Controller
 *
 * @author ydl
 * @date 2024-04-24
 */
@RestController
@RequestMapping("/base/commdict")
public class NmisCommTypeDictController extends BaseController
{
    @Autowired
    private NmisCommTypeDictServiceImpl nmisCommTypeDictService;

    /**
     * 查询护理通用字典列表
     */
    //@PreAuthorize("@ss.hasPermi('base:commdict:list')")
    @GetMapping("/list")
    public TableDataInfo list(NmisCommTypeDict nmisCommTypeDict)
    {
        startPage();
        List<NmisCommTypeDict> list = nmisCommTypeDictService.selectNmisCommTypeDictList(nmisCommTypeDict);
        return getDataTable(list);
    }

    /**
     * 导出护理通用字典列表
     */
    //@PreAuthorize("@ss.hasPermi('base:commdict:export')")
    @Log(title = "护理通用字典", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, NmisCommTypeDict nmisCommTypeDict)
    {
        List<NmisCommTypeDict> list = nmisCommTypeDictService.selectNmisCommTypeDictList(nmisCommTypeDict);
        ExcelUtil<NmisCommTypeDict> util = new ExcelUtil<NmisCommTypeDict>(NmisCommTypeDict.class);
        util.exportExcel(response, list, "护理通用字典数据");
    }

    /**
     * 获取护理通用字典详细信息
     */
    //@PreAuthorize("@ss.hasPermi('base:commdict:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(nmisCommTypeDictService.selectNmisCommTypeDictById(id));
    }

    /**
     * 新增护理通用字典
     */
    //@PreAuthorize("@ss.hasPermi('base:commdict:add')")
    @Log(title = "护理通用字典", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody NmisCommTypeDict nmisCommTypeDict)
    {
        return toAjax(nmisCommTypeDictService.insertNmisCommTypeDict(nmisCommTypeDict));
    }

    /**
     * 修改护理通用字典
     */
    //@PreAuthorize("@ss.hasPermi('base:commdict:edit')")
    @Log(title = "护理通用字典", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody NmisCommTypeDict nmisCommTypeDict)
    {
        return toAjax(nmisCommTypeDictService.updateNmisCommTypeDict(nmisCommTypeDict));
    }

    /**
     * 删除护理通用字典
     */
    //@PreAuthorize("@ss.hasPermi('base:commdict:remove')")
    @Log(title = "护理通用字典", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(nmisCommTypeDictService.deleteNmisCommTypeDictByIds(ids));
    }
}
