package com.ydl.web.controller.qc;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ydl.qc.domain.NmisQcChkAppeal;
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
import com.ydl.qc.domain.NmisQcChkAppeal;
import com.ydl.qc.service.INmisQcChkAppealService;
import com.ydl.common.utils.poi.ExcelUtil;
import com.ydl.common.core.page.TableDataInfo;

/**
 * 护理质量检查申诉记录Controller
 * 
 * @author ydl
 * @date 2025-05-08
 */
@RestController
@RequestMapping("/qc/chkAppeal")
public class NmisQcChkAppealController extends BaseController
{
    @Autowired
    private INmisQcChkAppealService nmisQcChkAppealService;

    /**
     * 查询护理质量检查申诉记录列表
     */
    //@PreAuthorize("@ss.hasPermi('system:appeal:list')")
    @GetMapping("/list")
    public TableDataInfo list(NmisQcChkAppeal nmisQcChkAppeal)
    {
        startPage();
        List<NmisQcChkAppeal> list = nmisQcChkAppealService.selectNmisQcChkAppealList(nmisQcChkAppeal);
        return getDataTable(list);
    }

    /**
     * 导出护理质量检查申诉记录列表
     */
    //@PreAuthorize("@ss.hasPermi('system:appeal:export')")
    @Log(title = "护理质量检查申诉记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, NmisQcChkAppeal nmisQcChkAppeal)
    {
        List<NmisQcChkAppeal> list = nmisQcChkAppealService.selectNmisQcChkAppealList(nmisQcChkAppeal);
        ExcelUtil<NmisQcChkAppeal> util = new ExcelUtil<NmisQcChkAppeal>(NmisQcChkAppeal.class);
        util.exportExcel(response, list, "护理质量检查申诉记录数据");
    }

    /**
     * 获取护理质量检查申诉记录详细信息
     */
    //@PreAuthorize("@ss.hasPermi('system:appeal:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(nmisQcChkAppealService.selectNmisQcChkAppealById(id));
    }

    /**
     * 新增护理质量检查申诉记录
     */
    //@PreAuthorize("@ss.hasPermi('system:appeal:add')")
    @Log(title = "护理质量检查申诉记录", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody NmisQcChkAppeal nmisQcChkAppeal)
    {
        return toAjax(nmisQcChkAppealService.insertNmisQcChkAppeal(nmisQcChkAppeal));
    }

    /**
     * 修改护理质量检查申诉记录
     */
    //@PreAuthorize("@ss.hasPermi('system:appeal:edit')")
    @Log(title = "护理质量检查申诉记录", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody NmisQcChkAppeal nmisQcChkAppeal)
    {
        return toAjax(nmisQcChkAppealService.updateNmisQcChkAppeal(nmisQcChkAppeal));
    }

    /**
     * 删除护理质量检查申诉记录
     */
    //@PreAuthorize("@ss.hasPermi('system:appeal:remove')")
    @Log(title = "护理质量检查申诉记录", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(nmisQcChkAppealService.deleteNmisQcChkAppealByIds(ids));
    }
}
