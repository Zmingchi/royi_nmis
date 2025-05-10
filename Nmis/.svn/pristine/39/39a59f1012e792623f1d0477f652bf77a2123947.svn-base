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
import com.ydl.qc.domain.NmisQcChkAnalyze;
import com.ydl.qc.service.INmisQcChkAnalyzeService;
import com.ydl.common.utils.poi.ExcelUtil;
import com.ydl.common.core.page.TableDataInfo;

/**
 * 护理质量检查分析改进记录Controller
 * 
 * @author ydl
 * @date 2025-05-08
 */
@RestController
@RequestMapping("/qc/chkAnalyze")
public class NmisQcChkAnalyzeController extends BaseController
{
    @Autowired
    private INmisQcChkAnalyzeService nmisQcChkAnalyzeService;

    /**
     * 查询护理质量检查分析改进记录列表
     */
    //@PreAuthorize("@ss.hasPermi('system:analyze:list')")
    @GetMapping("/list")
    public TableDataInfo list(NmisQcChkAnalyze nmisQcChkAnalyze)
    {
        startPage();
        List<NmisQcChkAnalyze> list = nmisQcChkAnalyzeService.selectNmisQcChkAnalyzeList(nmisQcChkAnalyze);
        return getDataTable(list);
    }

    /**
     * 导出护理质量检查分析改进记录列表
     */
    //@PreAuthorize("@ss.hasPermi('system:analyze:export')")
    @Log(title = "护理质量检查分析改进记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, NmisQcChkAnalyze nmisQcChkAnalyze)
    {
        List<NmisQcChkAnalyze> list = nmisQcChkAnalyzeService.selectNmisQcChkAnalyzeList(nmisQcChkAnalyze);
        ExcelUtil<NmisQcChkAnalyze> util = new ExcelUtil<NmisQcChkAnalyze>(NmisQcChkAnalyze.class);
        util.exportExcel(response, list, "护理质量检查分析改进记录数据");
    }

    /**
     * 获取护理质量检查分析改进记录详细信息
     */
    //@PreAuthorize("@ss.hasPermi('system:analyze:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(nmisQcChkAnalyzeService.selectNmisQcChkAnalyzeById(id));
    }

    /**
     * 新增护理质量检查分析改进记录
     */
    //@PreAuthorize("@ss.hasPermi('system:analyze:add')")
    @Log(title = "护理质量检查分析改进记录", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody NmisQcChkAnalyze nmisQcChkAnalyze)
    {
        return toAjax(nmisQcChkAnalyzeService.insertNmisQcChkAnalyze(nmisQcChkAnalyze));
    }

    /**
     * 修改护理质量检查分析改进记录
     */
    //@PreAuthorize("@ss.hasPermi('system:analyze:edit')")
    @Log(title = "护理质量检查分析改进记录", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody NmisQcChkAnalyze nmisQcChkAnalyze)
    {
        return toAjax(nmisQcChkAnalyzeService.updateNmisQcChkAnalyze(nmisQcChkAnalyze));
    }

    /**
     * 删除护理质量检查分析改进记录
     */
    //@PreAuthorize("@ss.hasPermi('system:analyze:remove')")
    @Log(title = "护理质量检查分析改进记录", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(nmisQcChkAnalyzeService.deleteNmisQcChkAnalyzeByIds(ids));
    }
}
