package com.ydl.web.controller.plan;

import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ydl.common.utils.DateUtils;
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
import com.ydl.plan.domain.NmisWorkPlan;
import com.ydl.plan.service.INmisWorkPlanService;
import com.ydl.common.utils.poi.ExcelUtil;
import com.ydl.common.core.page.TableDataInfo;

/**
 * 工作计划Controller
 * 
 * @author ydl
 * @date 2025-03-25
 */
@RestController
@RequestMapping("/system/plan")
public class NmisWorkPlanController extends BaseController
{
    @Autowired
    private INmisWorkPlanService nmisWorkPlanService;

    /**
     * 查询工作计划列表
     */
    //@PreAuthorize("@ss.hasPermi('nmis:plan:list')")
    @GetMapping("/list")
    public TableDataInfo list(NmisWorkPlan nmisWorkPlan)
    {
        startPage();
        List<NmisWorkPlan> list = nmisWorkPlanService.selectNmisWorkPlanList(nmisWorkPlan);
        return getDataTable(list);
    }

    /**
     * 导出工作计划列表
     */
    @PreAuthorize("@ss.hasPermi('nmis:plan:export')")
    @Log(title = "工作计划", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, NmisWorkPlan nmisWorkPlan)
    {
        List<NmisWorkPlan> list = nmisWorkPlanService.selectNmisWorkPlanList(nmisWorkPlan);
        ExcelUtil<NmisWorkPlan> util = new ExcelUtil<NmisWorkPlan>(NmisWorkPlan.class);
        util.exportExcel(response, list, "工作计划数据");
    }

    /**
     * 获取工作计划详细信息
     */
    @PreAuthorize("@ss.hasPermi('nmis:plan:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(nmisWorkPlanService.selectNmisWorkPlanById(id));
    }

    /**
     * 新增工作计划
     */
    @PreAuthorize("@ss.hasPermi('nmis:plan:add')")
    @Log(title = "工作计划", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody NmisWorkPlan nmisWorkPlan)
    {
        Date now = DateUtils.getNowDate();
        String userId = this.getUserId().toString();
        String userName = this.getUsername();
        nmisWorkPlan.setCreator(userName);
        nmisWorkPlan.setCreateId(userId);
        nmisWorkPlan.setModifier(userName);
        nmisWorkPlan.setModifyId(userId);
        nmisWorkPlan.setCreateDate(now);
        nmisWorkPlan.setModifyDate(now);
        nmisWorkPlan.setNurseId(userId);
        nmisWorkPlan.setNurseName(userName);
        return toAjax(nmisWorkPlanService.insertNmisWorkPlan(nmisWorkPlan));
    }

    /**
     * 修改工作计划
     */
    @PreAuthorize("@ss.hasPermi('nmis:plan:edit')")
    @Log(title = "工作计划", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody NmisWorkPlan nmisWorkPlan)
    {
        return toAjax(nmisWorkPlanService.updateNmisWorkPlan(nmisWorkPlan));
    }

    /**
     * 修改工作计划
     */
    @PreAuthorize("@ss.hasPermi('nmis:plan:commit')")
    @Log(title = "工作计划", businessType = BusinessType.UPDATE)
    @PutMapping("/commit")
    public AjaxResult commit(@RequestBody NmisWorkPlan nmisWorkPlan)
    {
        Date now = DateUtils.getNowDate();
        String userId = this.getUserId().toString();
        String userName = this.getUsername();
        nmisWorkPlan.setModifier(userName);
        nmisWorkPlan.setModifyId(userId);
        nmisWorkPlan.setModifyDate(now);
        nmisWorkPlan.setPlanStatus("2");
        return toAjax(nmisWorkPlanService.commitNmisWorkPlan(nmisWorkPlan));
    }

    /**
     * 修改工作计划
     */
    @PreAuthorize("@ss.hasPermi('nmis:plan:uncommit')")
    @Log(title = "工作计划", businessType = BusinessType.UPDATE)
    @PutMapping("/uncommit")
    public AjaxResult uncommit(@RequestBody NmisWorkPlan nmisWorkPlan)
    {
        Date now = DateUtils.getNowDate();
        String userId = this.getUserId().toString();
        String userName = this.getUsername();
        nmisWorkPlan.setModifier(userName);
        nmisWorkPlan.setModifyId(userId);
        nmisWorkPlan.setModifyDate(now);
        nmisWorkPlan.setPlanStatus("1");
        return toAjax(nmisWorkPlanService.uncommitNmisWorkPlan(nmisWorkPlan));
    }

    /**
     * 审批工作计划
     */
    @PreAuthorize("@ss.hasPermi('nmis:plan:approve')")
    @Log(title = "工作计划", businessType = BusinessType.UPDATE)
    @PutMapping("/approve")
    public AjaxResult approve(@RequestBody NmisWorkPlan nmisWorkPlan)
    {
        Date now = DateUtils.getNowDate();
        String userId = this.getUserId().toString();
        String userName = this.getUsername();
        nmisWorkPlan.setModifier(userName);
        nmisWorkPlan.setModifyId(userId);
        nmisWorkPlan.setModifyDate(now);
        nmisWorkPlan.setApproverId(userId);
        nmisWorkPlan.setApproverName(userName);
        nmisWorkPlan.setApproveDate(now);
        nmisWorkPlan.setPlanStatus("3");
        return toAjax(nmisWorkPlanService.approveNmisWorkPlan(nmisWorkPlan));
    }

    /**
     * 取消审批工作计划
     */
    @PreAuthorize("@ss.hasPermi('nmis:plan:unapprove')")
    @Log(title = "工作计划", businessType = BusinessType.UPDATE)
    @PutMapping("/unapprove")
    public AjaxResult unapprove(@RequestBody NmisWorkPlan nmisWorkPlan)
    {
        Date now = DateUtils.getNowDate();
        String userId = this.getUserId().toString();
        String userName = this.getUsername();
        nmisWorkPlan.setModifier(userName);
        nmisWorkPlan.setModifyId(userId);
        nmisWorkPlan.setModifyDate(now);
        nmisWorkPlan.setApproverId(null);
        nmisWorkPlan.setApproverName(null);
        nmisWorkPlan.setApproveDate(null);
        nmisWorkPlan.setPlanStatus("2");
        return toAjax(nmisWorkPlanService.unApproveNmisWorkPlan(nmisWorkPlan));
    }

    /**
     * 删除工作计划
     */
    @PreAuthorize("@ss.hasPermi('nmis:plan:remove')")
    @Log(title = "工作计划", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(nmisWorkPlanService.deleteNmisWorkPlanByIds(ids));
    }
}
