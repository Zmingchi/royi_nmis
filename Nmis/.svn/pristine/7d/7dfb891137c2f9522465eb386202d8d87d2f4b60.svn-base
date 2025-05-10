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
import com.ydl.qc.domain.NmisQcChkPaperItem;
import com.ydl.qc.service.INmisQcChkPaperItemService;
import com.ydl.common.utils.poi.ExcelUtil;
import com.ydl.common.core.page.TableDataInfo;

/**
 * 护理质量检查项目Controller
 * 
 * @author ydl
 * @date 2025-05-07
 */
@RestController
@RequestMapping("/system/item")
public class NmisQcChkPaperItemController extends BaseController
{
    @Autowired
    private INmisQcChkPaperItemService nmisQcChkPaperItemService;

    /**
     * 查询护理质量检查项目列表
     */
    //@PreAuthorize("@ss.hasPermi('system:item:list')")
    @GetMapping("/list")
    public TableDataInfo list(NmisQcChkPaperItem nmisQcChkPaperItem)
    {
        startPage();
        List<NmisQcChkPaperItem> list = nmisQcChkPaperItemService.selectNmisQcChkPaperItemList(nmisQcChkPaperItem);
        return getDataTable(list);
    }

    /**
     * 导出护理质量检查项目列表
     */
    //@PreAuthorize("@ss.hasPermi('system:item:export')")
    @Log(title = "护理质量检查项目", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, NmisQcChkPaperItem nmisQcChkPaperItem)
    {
        List<NmisQcChkPaperItem> list = nmisQcChkPaperItemService.selectNmisQcChkPaperItemList(nmisQcChkPaperItem);
        ExcelUtil<NmisQcChkPaperItem> util = new ExcelUtil<NmisQcChkPaperItem>(NmisQcChkPaperItem.class);
        util.exportExcel(response, list, "护理质量检查项目数据");
    }

    /**
     * 获取护理质量检查项目详细信息
     */
    //@PreAuthorize("@ss.hasPermi('system:item:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(nmisQcChkPaperItemService.selectNmisQcChkPaperItemById(id));
    }

    /**
     * 新增护理质量检查项目
     */
    //@PreAuthorize("@ss.hasPermi('system:item:add')")
    @Log(title = "护理质量检查项目", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody NmisQcChkPaperItem nmisQcChkPaperItem)
    {
        return toAjax(nmisQcChkPaperItemService.insertNmisQcChkPaperItem(nmisQcChkPaperItem));
    }

    /**
     * 修改护理质量检查项目
     */
    //@PreAuthorize("@ss.hasPermi('system:item:edit')")
    @Log(title = "护理质量检查项目", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody NmisQcChkPaperItem nmisQcChkPaperItem)
    {
        return toAjax(nmisQcChkPaperItemService.updateNmisQcChkPaperItem(nmisQcChkPaperItem));
    }

    /**
     * 删除护理质量检查项目
     */
    //@PreAuthorize("@ss.hasPermi('system:item:remove')")
    @Log(title = "护理质量检查项目", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(nmisQcChkPaperItemService.deleteNmisQcChkPaperItemByIds(ids));
    }
}
