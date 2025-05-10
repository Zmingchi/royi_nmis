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
import com.ydl.qc.domain.NmisQcStdItem;
import com.ydl.qc.service.INmisQcStdItemService;
import com.ydl.common.utils.poi.ExcelUtil;
import com.ydl.common.core.page.TableDataInfo;

/**
 * 护理质量标准项目Controller
 * 
 * @author ydl
 * @date 2025-05-07
 */
@RestController
@RequestMapping("/qc/item")
public class NmisQcStdItemController extends BaseController
{
    @Autowired
    private INmisQcStdItemService nmisQcStdItemService;

    /**
     * 查询护理质量标准项目列表
     */
    //@PreAuthorize("@ss.hasPermi('system:item:list')")
    @GetMapping("/list")
    public TableDataInfo list(NmisQcStdItem nmisQcStdItem)
    {
        startPage();
        List<NmisQcStdItem> list = nmisQcStdItemService.selectNmisQcStdItemList(nmisQcStdItem);
        return getDataTable(list);
    }

    /**
     * 导出护理质量标准项目列表
     */
    //@PreAuthorize("@ss.hasPermi('system:item:export')")
    @Log(title = "护理质量标准项目", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, NmisQcStdItem nmisQcStdItem)
    {
        List<NmisQcStdItem> list = nmisQcStdItemService.selectNmisQcStdItemList(nmisQcStdItem);
        ExcelUtil<NmisQcStdItem> util = new ExcelUtil<NmisQcStdItem>(NmisQcStdItem.class);
        util.exportExcel(response, list, "护理质量标准项目数据");
    }

    /**
     * 获取护理质量标准项目详细信息
     */
    //@PreAuthorize("@ss.hasPermi('system:item:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(nmisQcStdItemService.selectNmisQcStdItemById(id));
    }

    /**
     * 新增护理质量标准项目
     */
    //@PreAuthorize("@ss.hasPermi('system:item:add')")
    @Log(title = "护理质量标准项目", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody NmisQcStdItem nmisQcStdItem)
    {
        return toAjax(nmisQcStdItemService.insertNmisQcStdItem(nmisQcStdItem));
    }

    /**
     * 修改护理质量标准项目
     */
    //@PreAuthorize("@ss.hasPermi('system:item:edit')")
    @Log(title = "护理质量标准项目", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody NmisQcStdItem nmisQcStdItem)
    {
        return toAjax(nmisQcStdItemService.updateNmisQcStdItem(nmisQcStdItem));
    }

    /**
     * 删除护理质量标准项目
     */
    //@PreAuthorize("@ss.hasPermi('system:item:remove')")
    @Log(title = "护理质量标准项目", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(nmisQcStdItemService.deleteNmisQcStdItemByIds(ids));
    }
}
