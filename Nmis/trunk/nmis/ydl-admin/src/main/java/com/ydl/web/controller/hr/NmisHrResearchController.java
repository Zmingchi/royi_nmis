package com.ydl.web.controller.hr;


import java.util.List;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import com.ydl.nmis.hr.domain.NmisHrResearch;
import com.ydl.nmis.hr.service.INmisHrResearchService;
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
import com.ydl.common.utils.poi.ExcelUtil;
import com.ydl.common.core.page.TableDataInfo;

/**
 * 护理人员科研信息Controller
 *
 * @author ydl
 * @date 2025-03-12
 */
@RestController
@RequestMapping("/hr/research")
public class NmisHrResearchController extends BaseController
{
    @Autowired
    private INmisHrResearchService nmisHrResearchService;

    /**
     * 查询护理人员科研信息列表
     */
    //@PreAuthorize("@ss.hasPermi('system:research:list')")
    @GetMapping("/list")
    public TableDataInfo list(NmisHrResearch nmisHrResearch)
    {
        startPage();
        List<NmisHrResearch> list = nmisHrResearchService.selectNmisHrResearchList(nmisHrResearch);
        return getDataTable(list);
    }

    /**
     * 导出护理人员科研信息列表
     */
    //@PreAuthorize("@ss.hasPermi('system:research:export')")
    @Log(title = "护理人员科研信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, NmisHrResearch nmisHrResearch)
    {
        List<NmisHrResearch> list = nmisHrResearchService.selectNmisHrResearchList(nmisHrResearch);
        ExcelUtil<NmisHrResearch> util = new ExcelUtil<NmisHrResearch>(NmisHrResearch.class);
        util.exportExcel(response, list, "护理人员科研信息数据");
    }

    /**
     * 获取护理人员科研信息详细信息
     */
    //@PreAuthorize("@ss.hasPermi('system:research:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(nmisHrResearchService.selectNmisHrResearchById(id));
    }

    /**
     * 新增护理人员科研信息
     */
    //@PreAuthorize("@ss.hasPermi('system:research:add')")
    @Log(title = "护理人员科研信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@Valid @RequestBody NmisHrResearch nmisHrResearch)
    {
        return toAjax(nmisHrResearchService.insertNmisHrResearch(nmisHrResearch));
    }

    /**
     * 修改护理人员科研信息
     */
    //@PreAuthorize("@ss.hasPermi('system:research:edit')")
    @Log(title = "护理人员科研信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@Valid @RequestBody NmisHrResearch nmisHrResearch)
    {
        return toAjax(nmisHrResearchService.updateNmisHrResearch(nmisHrResearch));
    }

    /**
     * 删除护理人员科研信息
     */
    //@PreAuthorize("@ss.hasPermi('system:research:remove')")
    @Log(title = "护理人员科研信息", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(nmisHrResearchService.deleteNmisHrResearchByIds(ids));
    }
}
