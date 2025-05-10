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
import com.ydl.qc.domain.NmisQcChkPlanPaper;
import com.ydl.qc.service.INmisQcChkPlanPaperService;
import com.ydl.common.utils.poi.ExcelUtil;
import com.ydl.common.core.page.TableDataInfo;

/**
 * 护理质量检查计划-试卷Controller
 * 
 * @author ydl
 * @date 2025-05-08
 */
@RestController
@RequestMapping("/qc/chkPaper")
public class NmisQcChkPlanPaperController extends BaseController
{
    @Autowired
    private INmisQcChkPlanPaperService nmisQcChkPlanPaperService;

    /**
     * 查询护理质量检查计划-试卷列表
     */
    //@PreAuthorize("@ss.hasPermi('system:paper:list')")
    @GetMapping("/list")
    public TableDataInfo list(NmisQcChkPlanPaper nmisQcChkPlanPaper)
    {
        startPage();
        List<NmisQcChkPlanPaper> list = nmisQcChkPlanPaperService.selectNmisQcChkPlanPaperList(nmisQcChkPlanPaper);
        return getDataTable(list);
    }

    /**
     * 导出护理质量检查计划-试卷列表
     */
    //@PreAuthorize("@ss.hasPermi('system:paper:export')")
    @Log(title = "护理质量检查计划-试卷", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, NmisQcChkPlanPaper nmisQcChkPlanPaper)
    {
        List<NmisQcChkPlanPaper> list = nmisQcChkPlanPaperService.selectNmisQcChkPlanPaperList(nmisQcChkPlanPaper);
        ExcelUtil<NmisQcChkPlanPaper> util = new ExcelUtil<NmisQcChkPlanPaper>(NmisQcChkPlanPaper.class);
        util.exportExcel(response, list, "护理质量检查计划-试卷数据");
    }

    /**
     * 获取护理质量检查计划-试卷详细信息
     */
    //@PreAuthorize("@ss.hasPermi('system:paper:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(nmisQcChkPlanPaperService.selectNmisQcChkPlanPaperById(id));
    }

    /**
     * 新增护理质量检查计划-试卷
     */
    //@PreAuthorize("@ss.hasPermi('system:paper:add')")
    @Log(title = "护理质量检查计划-试卷", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody NmisQcChkPlanPaper nmisQcChkPlanPaper)
    {
        return toAjax(nmisQcChkPlanPaperService.insertNmisQcChkPlanPaper(nmisQcChkPlanPaper));
    }

    /**
     * 修改护理质量检查计划-试卷
     */
    //@PreAuthorize("@ss.hasPermi('system:paper:edit')")
    @Log(title = "护理质量检查计划-试卷", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody NmisQcChkPlanPaper nmisQcChkPlanPaper)
    {
        return toAjax(nmisQcChkPlanPaperService.updateNmisQcChkPlanPaper(nmisQcChkPlanPaper));
    }

    /**
     * 删除护理质量检查计划-试卷
     */
    //@PreAuthorize("@ss.hasPermi('system:paper:remove')")
    @Log(title = "护理质量检查计划-试卷", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(nmisQcChkPlanPaperService.deleteNmisQcChkPlanPaperByIds(ids));
    }
}
