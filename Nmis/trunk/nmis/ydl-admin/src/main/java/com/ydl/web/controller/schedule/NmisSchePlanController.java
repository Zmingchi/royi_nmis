package com.ydl.web.controller.schedule;


import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ydl.nmis.schedule.domain.NmisSchePlan;
import com.ydl.nmis.schedule.service.INmisScheMasterService;
import com.ydl.nmis.schedule.service.INmisSchePlanService;
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
 * 护理排班计划Controller
 *
 * @author ydl
 * @date 2025-03-28
 */
@RestController
@RequestMapping("/schedule/plan")
public class NmisSchePlanController extends BaseController
{
    @Autowired
    private INmisSchePlanService nmisSchePlanService;
    @Autowired
    private INmisScheMasterService nmisScheMasterService;

    /**
     * 查询护理排班计划列表
     */
    //@PreAuthorize("@ss.hasPermi('system:plan:list')")
    @GetMapping("/list")
    public TableDataInfo list(NmisSchePlan nmisSchePlan)
    {
        startPage();
        List<NmisSchePlan> list = nmisSchePlanService.selectNmisSchePlanList(nmisSchePlan);
        return getDataTable(list);
    }

    /**
     * 导出护理排班计划列表
     */
    //@PreAuthorize("@ss.hasPermi('system:plan:export')")
    @Log(title = "护理排班计划", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, NmisSchePlan nmisSchePlan)
    {
        List<NmisSchePlan> list = nmisSchePlanService.selectNmisSchePlanList(nmisSchePlan);
        ExcelUtil<NmisSchePlan> util = new ExcelUtil<NmisSchePlan>(NmisSchePlan.class);
        util.exportExcel(response, list, "护理排班计划数据");
    }

    /**
     * 获取护理排班计划详细信息
     */
    //@PreAuthorize("@ss.hasPermi('system:plan:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(nmisSchePlanService.selectNmisSchePlanById(id));
    }

    /**
     * 新增护理排班计划
     */
    //@PreAuthorize("@ss.hasPermi('system:plan:add')")
    @Log(title = "护理排班计划", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody NmisSchePlan nmisSchePlan)
    {
        return toAjax(nmisSchePlanService.insertNmisSchePlan(nmisSchePlan));
    }

    /**
     * 修改护理排班计划
     */
    //@PreAuthorize("@ss.hasPermi('system:plan:edit')")
    @Log(title = "护理排班计划", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody NmisSchePlan nmisSchePlan)
    {
        return toAjax(nmisSchePlanService.updateNmisSchePlan(nmisSchePlan));
    }

    /**
     * 删除护理排班计划
     */
    //@PreAuthorize("@ss.hasPermi('system:plan:remove')")
    @Log(title = "护理排班计划", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String ids)
    {
        return toAjax(nmisSchePlanService.deleteNmisSchePlanById(ids));
        //通过plan_id调用触发器进行删除sche_master和sche_detial相关数据
    }
}

