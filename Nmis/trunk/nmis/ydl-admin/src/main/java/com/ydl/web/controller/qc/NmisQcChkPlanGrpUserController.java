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
import com.ydl.qc.domain.NmisQcChkPlanGrpUser;
import com.ydl.qc.service.INmisQcChkPlanGrpUserService;
import com.ydl.common.utils.poi.ExcelUtil;
import com.ydl.common.core.page.TableDataInfo;

/**
 * 护理质量检查计划用户Controller
 * 
 * @author ydl
 * @date 2025-05-08
 */
@RestController
@RequestMapping("/qc/chkUser")
public class NmisQcChkPlanGrpUserController extends BaseController
{
    @Autowired
    private INmisQcChkPlanGrpUserService nmisQcChkPlanGrpUserService;

    /**
     * 查询护理质量检查计划用户列表
     */
    //@PreAuthorize("@ss.hasPermi('system:user:list')")
    @GetMapping("/list")
    public TableDataInfo list(NmisQcChkPlanGrpUser nmisQcChkPlanGrpUser)
    {
        startPage();
        List<NmisQcChkPlanGrpUser> list = nmisQcChkPlanGrpUserService.selectNmisQcChkPlanGrpUserList(nmisQcChkPlanGrpUser);
        return getDataTable(list);
    }

    /**
     * 导出护理质量检查计划用户列表
     */
    //@PreAuthorize("@ss.hasPermi('system:user:export')")
    @Log(title = "护理质量检查计划用户", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, NmisQcChkPlanGrpUser nmisQcChkPlanGrpUser)
    {
        List<NmisQcChkPlanGrpUser> list = nmisQcChkPlanGrpUserService.selectNmisQcChkPlanGrpUserList(nmisQcChkPlanGrpUser);
        ExcelUtil<NmisQcChkPlanGrpUser> util = new ExcelUtil<NmisQcChkPlanGrpUser>(NmisQcChkPlanGrpUser.class);
        util.exportExcel(response, list, "护理质量检查计划用户数据");
    }

    /**
     * 获取护理质量检查计划用户详细信息
     */
    //@PreAuthorize("@ss.hasPermi('system:user:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(nmisQcChkPlanGrpUserService.selectNmisQcChkPlanGrpUserById(id));
    }

    /**
     * 新增护理质量检查计划用户
     */
    //@PreAuthorize("@ss.hasPermi('system:user:add')")
    @Log(title = "护理质量检查计划用户", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody NmisQcChkPlanGrpUser nmisQcChkPlanGrpUser)
    {
        return toAjax(nmisQcChkPlanGrpUserService.insertNmisQcChkPlanGrpUser(nmisQcChkPlanGrpUser));
    }

    /**
     * 修改护理质量检查计划用户
     */
    //@PreAuthorize("@ss.hasPermi('system:user:edit')")
    @Log(title = "护理质量检查计划用户", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody NmisQcChkPlanGrpUser nmisQcChkPlanGrpUser)
    {
        return toAjax(nmisQcChkPlanGrpUserService.updateNmisQcChkPlanGrpUser(nmisQcChkPlanGrpUser));
    }

    /**
     * 删除护理质量检查计划用户
     */
    //@PreAuthorize("@ss.hasPermi('system:user:remove')")
    @Log(title = "护理质量检查计划用户", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(nmisQcChkPlanGrpUserService.deleteNmisQcChkPlanGrpUserByIds(ids));
    }
}
