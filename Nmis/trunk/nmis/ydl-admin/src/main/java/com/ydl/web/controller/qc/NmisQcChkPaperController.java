package com.ydl.web.controller.qc;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ydl.common.utils.poi.ExcelUtil;
import com.ydl.qc.domain.NmisQcChkPaper;
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
import com.ydl.qc.service.INmisQcChkPaperService;
import com.ydl.common.core.page.TableDataInfo;

/**
 * 护理质量检查试卷Controller
 * 
 * @author ydl
 * @date 2025-05-07
 */
@RestController
@RequestMapping("/qc/paper")
public class NmisQcChkPaperController extends BaseController
{
    @Autowired
    private INmisQcChkPaperService nmisQcChkPaperService;

    /**
     * 查询护理质量检查试卷列表
     */
    //@PreAuthorize("@ss.hasPermi('system:paper:list')")
    @GetMapping("/list")
    public TableDataInfo list(NmisQcChkPaper nmisQcChkPaper)
    {
        startPage();
        List<NmisQcChkPaper> list = nmisQcChkPaperService.selectNmisQcChkPaperList(nmisQcChkPaper);
        return getDataTable(list);
    }

    /**
     * 导出护理质量检查试卷列表
     */
    //@PreAuthorize("@ss.hasPermi('system:paper:export')")
    @Log(title = "护理质量检查试卷", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, NmisQcChkPaper nmisQcChkPaper)
    {
        List<NmisQcChkPaper> list = nmisQcChkPaperService.selectNmisQcChkPaperList(nmisQcChkPaper);
        ExcelUtil<NmisQcChkPaper> util = new ExcelUtil<NmisQcChkPaper>(NmisQcChkPaper.class);
        util.exportExcel(response, list, "护理质量检查试卷数据");
    }

    /**
     * 获取护理质量检查试卷详细信息
     */
    //@PreAuthorize("@ss.hasPermi('system:paper:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(nmisQcChkPaperService.selectNmisQcChkPaperById(id));
    }

    /**
     * 新增护理质量检查试卷
     */
    //@PreAuthorize("@ss.hasPermi('system:paper:add')")
    @Log(title = "护理质量检查试卷", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody NmisQcChkPaper nmisQcChkPaper)
    {
        return toAjax(nmisQcChkPaperService.insertNmisQcChkPaper(nmisQcChkPaper));
    }

    /**
     * 修改护理质量检查试卷
     */
    //@PreAuthorize("@ss.hasPermi('system:paper:edit')")
    @Log(title = "护理质量检查试卷", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody NmisQcChkPaper nmisQcChkPaper)
    {
        return toAjax(nmisQcChkPaperService.updateNmisQcChkPaper(nmisQcChkPaper));
    }

    /**
     * 删除护理质量检查试卷
     */
    //@PreAuthorize("@ss.hasPermi('system:paper:remove')")
    @Log(title = "护理质量检查试卷", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(nmisQcChkPaperService.deleteNmisQcChkPaperByIds(ids));
    }
}
