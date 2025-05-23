package com.ydl.web.controller.system;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ydl.system.domain.vo.SysDeptUserDisplay;
import com.ydl.system.domain.vo.SysUserDeptDisplay;
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
import com.ydl.system.domain.SysUserDept;
import com.ydl.system.service.ISysUserDeptService;
import com.ydl.common.utils.poi.ExcelUtil;
import com.ydl.common.core.page.TableDataInfo;

/**
 * 用户与科室对应Controller
 * 
 * @author ydl
 * @date 2025-03-27
 */
@RestController
@RequestMapping("/system/userdept")
public class SysUserDeptController extends BaseController
{
    @Autowired
    private ISysUserDeptService sysUserDeptService;

    /**
     * 查询用户与科室对应列表
     */
    @PreAuthorize("@ss.hasPermi('system:userdept:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysUserDept sysUserDept)
    {
        startPage();
        List<SysUserDept> list = sysUserDeptService.selectSysUserDeptList(sysUserDept);
        return getDataTable(list);
    }

    /**
     * 导出用户与科室对应列表
     */
    @PreAuthorize("@ss.hasPermi('system:userdept:export')")
    @Log(title = "用户与科室对应", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SysUserDept sysUserDept)
    {
        List<SysUserDept> list = sysUserDeptService.selectSysUserDeptList(sysUserDept);
        ExcelUtil<SysUserDept> util = new ExcelUtil<SysUserDept>(SysUserDept.class);
        util.exportExcel(response, list, "用户与科室对应数据");
    }

    /**
     * 获取用户与科室对应详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:userdept:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(sysUserDeptService.selectSysUserDeptById(id));
    }

    /**
     * 获取用户有全权限的科室
     */
    @PreAuthorize("@ss.hasPermi('system:userdept:query')")
    @GetMapping(value = "/user/{userId}")
    public AjaxResult getDeptListByUserId(@PathVariable("userId") String userId)
    {
        List<SysUserDeptDisplay> list = sysUserDeptService.selectSysUserDeptListByUserId(userId);
        return success(list);
    }

    /**
     * 获取用户有全权限的科室
     */
    @PreAuthorize("@ss.hasPermi('system:userdept:query')")
    @GetMapping(value = "/dept/{deptCode}")
    public AjaxResult getUserListByDeptCode(@PathVariable("deptCode") String deptCode)
    {
        List<SysDeptUserDisplay> list = sysUserDeptService.getUserListByDeptCode(deptCode);
        return success(list);
    }
    /**
     * 新增用户与科室对应
     */
    @PreAuthorize("@ss.hasPermi('system:userdept:add')")
    @Log(title = "用户与科室对应", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysUserDept sysUserDept)
    {
        return toAjax(sysUserDeptService.insertSysUserDept(sysUserDept));
    }

    /**
     * 修改用户与科室对应
     */
    @PreAuthorize("@ss.hasPermi('system:userdept:edit')")
    @Log(title = "用户与科室对应", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysUserDept sysUserDept)
    {
        return toAjax(sysUserDeptService.updateSysUserDept(sysUserDept));
    }

    /**
     * 删除用户与科室对应
     */
    @PreAuthorize("@ss.hasPermi('system:userdept:remove')")
    @Log(title = "用户与科室对应", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(sysUserDeptService.deleteSysUserDeptByIds(ids));
    }
}
