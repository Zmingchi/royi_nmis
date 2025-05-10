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
import com.ydl.qc.domain.NmisQcChkPlan;
import com.ydl.qc.service.INmisQcChkPlanService;
import com.ydl.common.utils.poi.ExcelUtil;
import com.ydl.common.core.page.TableDataInfo;

/**
 * 护理质量检查计划Controller
 * 
 * @author ydl
 * @date 2025-05-08
 */
@RestController
@RequestMapping("/qc/chkPlan")
public class NmisQcChkPlanController extends BaseController
{
    @Autowired
    private INmisQcChkPlanService nmisQcChkPlanService;

    /**
     * 查询护理质量检查计划列表
     */
    //@PreAuthorize("@ss.hasPermi('system:plan:list')")
    @GetMapping("/list")
    public TableDataInfo list(NmisQcChkPlan nmisQcChkPlan)
    {
        startPage();
        List<NmisQcChkPlan> list = nmisQcChkPlanService.selectNmisQcChkPlanList(nmisQcChkPlan);
        return getDataTable(list);
    }

    /**
     * 导出护理质量检查计划列表
     */
    //@PreAuthorize("@ss.hasPermi('system:plan:export')")
    @Log(title = "护理质量检查计划", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, NmisQcChkPlan nmisQcChkPlan)
    {
        List<NmisQcChkPlan> list = nmisQcChkPlanService.selectNmisQcChkPlanList(nmisQcChkPlan);
        ExcelUtil<NmisQcChkPlan> util = new ExcelUtil<NmisQcChkPlan>(NmisQcChkPlan.class);
        util.exportExcel(response, list, "护理质量检查计划数据");
    }

    /**
     * 获取护理质量检查计划详细信息
     */
    //@PreAuthorize("@ss.hasPermi('system:plan:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(nmisQcChkPlanService.selectNmisQcChkPlanById(id));
    }

    /**
     * 新增护理质量检查计划
     */
    //@PreAuthorize("@ss.hasPermi('system:plan:add')")
    @Log(title = "护理质量检查计划", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody NmisQcChkPlan nmisQcChkPlan)
    {
        return toAjax(nmisQcChkPlanService.insertNmisQcChkPlan(nmisQcChkPlan));
    }

    /**
     * 修改护理质量检查计划
     */
    //@PreAuthorize("@ss.hasPermi('system:plan:edit')")
    @Log(title = "护理质量检查计划", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody NmisQcChkPlan nmisQcChkPlan)
    {
        return toAjax(nmisQcChkPlanService.updateNmisQcChkPlan(nmisQcChkPlan));
    }

    /**
     * 删除护理质量检查计划
     */
    //@PreAuthorize("@ss.hasPermi('system:plan:remove')")
    @Log(title = "护理质量检查计划", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(nmisQcChkPlanService.deleteNmisQcChkPlanByIds(ids));
    }
}
