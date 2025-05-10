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
import com.ydl.qc.domain.NmisQcChkPlanGrp;
import com.ydl.qc.service.INmisQcChkPlanGrpService;
import com.ydl.common.utils.poi.ExcelUtil;
import com.ydl.common.core.page.TableDataInfo;

/**
 * 质量检查计划用户分组Controller
 * 
 * @author ydl
 * @date 2025-05-08
 */
@RestController
@RequestMapping("/qc/chkGrp")
public class NmisQcChkPlanGrpController extends BaseController
{
    @Autowired
    private INmisQcChkPlanGrpService nmisQcChkPlanGrpService;

    /**
     * 查询质量检查计划用户分组列表
     */
    //@PreAuthorize("@ss.hasPermi('system:grp:list')")
    @GetMapping("/list")
    public TableDataInfo list(NmisQcChkPlanGrp nmisQcChkPlanGrp)
    {
        startPage();
        List<NmisQcChkPlanGrp> list = nmisQcChkPlanGrpService.selectNmisQcChkPlanGrpList(nmisQcChkPlanGrp);
        return getDataTable(list);
    }

    /**
     * 导出质量检查计划用户分组列表
     */
    //@PreAuthorize("@ss.hasPermi('system:grp:export')")
    @Log(title = "质量检查计划用户分组", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, NmisQcChkPlanGrp nmisQcChkPlanGrp)
    {
        List<NmisQcChkPlanGrp> list = nmisQcChkPlanGrpService.selectNmisQcChkPlanGrpList(nmisQcChkPlanGrp);
        ExcelUtil<NmisQcChkPlanGrp> util = new ExcelUtil<NmisQcChkPlanGrp>(NmisQcChkPlanGrp.class);
        util.exportExcel(response, list, "质量检查计划用户分组数据");
    }

    /**
     * 获取质量检查计划用户分组详细信息
     */
    //@PreAuthorize("@ss.hasPermi('system:grp:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(nmisQcChkPlanGrpService.selectNmisQcChkPlanGrpById(id));
    }

    /**
     * 新增质量检查计划用户分组
     */
    //@PreAuthorize("@ss.hasPermi('system:grp:add')")
    @Log(title = "质量检查计划用户分组", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody NmisQcChkPlanGrp nmisQcChkPlanGrp)
    {
        return toAjax(nmisQcChkPlanGrpService.insertNmisQcChkPlanGrp(nmisQcChkPlanGrp));
    }

    /**
     * 修改质量检查计划用户分组
     */
    //@PreAuthorize("@ss.hasPermi('system:grp:edit')")
    @Log(title = "质量检查计划用户分组", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody NmisQcChkPlanGrp nmisQcChkPlanGrp)
    {
        return toAjax(nmisQcChkPlanGrpService.updateNmisQcChkPlanGrp(nmisQcChkPlanGrp));
    }

    /**
     * 删除质量检查计划用户分组
     */
    //@PreAuthorize("@ss.hasPermi('system:grp:remove')")
    @Log(title = "质量检查计划用户分组", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(nmisQcChkPlanGrpService.deleteNmisQcChkPlanGrpByIds(ids));
    }
}
