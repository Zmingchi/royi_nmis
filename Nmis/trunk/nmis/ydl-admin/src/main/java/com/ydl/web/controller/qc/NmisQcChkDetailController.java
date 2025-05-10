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
import com.ydl.qc.domain.NmisQcChkDetail;
import com.ydl.qc.service.INmisQcChkDetailService;
import com.ydl.common.utils.poi.ExcelUtil;
import com.ydl.common.core.page.TableDataInfo;

/**
 * 护理质量检查明细记录Controller
 * 
 * @author ydl
 * @date 2025-05-08
 */
@RestController
@RequestMapping("/qc/chkDetail")
public class NmisQcChkDetailController extends BaseController
{
    @Autowired
    private INmisQcChkDetailService nmisQcChkDetailService;

    /**
     * 查询护理质量检查明细记录列表
     */
    //@PreAuthorize("@ss.hasPermi('system:detail:list')")
    @GetMapping("/list")
    public TableDataInfo list(NmisQcChkDetail nmisQcChkDetail)
    {
        startPage();
        List<NmisQcChkDetail> list = nmisQcChkDetailService.selectNmisQcChkDetailList(nmisQcChkDetail);
        return getDataTable(list);
    }

    /**
     * 导出护理质量检查明细记录列表
     */
    //@PreAuthorize("@ss.hasPermi('system:detail:export')")
    @Log(title = "护理质量检查明细记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, NmisQcChkDetail nmisQcChkDetail)
    {
        List<NmisQcChkDetail> list = nmisQcChkDetailService.selectNmisQcChkDetailList(nmisQcChkDetail);
        ExcelUtil<NmisQcChkDetail> util = new ExcelUtil<NmisQcChkDetail>(NmisQcChkDetail.class);
        util.exportExcel(response, list, "护理质量检查明细记录数据");
    }

    /**
     * 获取护理质量检查明细记录详细信息
     */
    //@PreAuthorize("@ss.hasPermi('system:detail:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(nmisQcChkDetailService.selectNmisQcChkDetailById(id));
    }

    /**
     * 新增护理质量检查明细记录
     */
    //@PreAuthorize("@ss.hasPermi('system:detail:add')")
    @Log(title = "护理质量检查明细记录", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody NmisQcChkDetail nmisQcChkDetail)
    {
        return toAjax(nmisQcChkDetailService.insertNmisQcChkDetail(nmisQcChkDetail));
    }

    /**
     * 修改护理质量检查明细记录
     */
    //@PreAuthorize("@ss.hasPermi('system:detail:edit')")
    @Log(title = "护理质量检查明细记录", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody NmisQcChkDetail nmisQcChkDetail)
    {
        return toAjax(nmisQcChkDetailService.updateNmisQcChkDetail(nmisQcChkDetail));
    }

    /**
     * 删除护理质量检查明细记录
     */
    //@PreAuthorize("@ss.hasPermi('system:detail:remove')")
    @Log(title = "护理质量检查明细记录", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(nmisQcChkDetailService.deleteNmisQcChkDetailByIds(ids));
    }
}
