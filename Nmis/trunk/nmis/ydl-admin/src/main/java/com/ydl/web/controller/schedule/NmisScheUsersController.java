package com.ydl.web.controller.schedule;


import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ydl.nmis.schedule.domain.NmisScheUsers;
import com.ydl.nmis.schedule.service.INmisScheUsersService;
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
 * 参与排班用户Controller
 *
 * @author ydl
 * @date 2025-03-29
 */
@RestController
@RequestMapping("/system/users")
public class NmisScheUsersController extends BaseController
{
    @Autowired
    private INmisScheUsersService nmisScheUsersService;

    /**
     * 查询参与排班用户列表
     */
    @PreAuthorize("@ss.hasPermi('system:users:list')")
    @GetMapping("/list")
    public TableDataInfo list(NmisScheUsers nmisScheUsers)
    {
        startPage();
        List<NmisScheUsers> list = nmisScheUsersService.selectNmisScheUsersList(nmisScheUsers);
        return getDataTable(list);
    }

    /**
     * 导出参与排班用户列表
     */
    @PreAuthorize("@ss.hasPermi('system:users:export')")
    @Log(title = "参与排班用户", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, NmisScheUsers nmisScheUsers)
    {
        List<NmisScheUsers> list = nmisScheUsersService.selectNmisScheUsersList(nmisScheUsers);
        ExcelUtil<NmisScheUsers> util = new ExcelUtil<NmisScheUsers>(NmisScheUsers.class);
        util.exportExcel(response, list, "参与排班用户数据");
    }

    /**
     * 获取参与排班用户详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:users:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(nmisScheUsersService.selectNmisScheUsersById(id));
    }

    /**
     * 新增参与排班用户
     */
    @PreAuthorize("@ss.hasPermi('system:users:add')")
    @Log(title = "参与排班用户", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody NmisScheUsers nmisScheUsers)
    {
        return toAjax(nmisScheUsersService.insertNmisScheUsers(nmisScheUsers));
    }

    /**
     * 修改参与排班用户
     */
    @PreAuthorize("@ss.hasPermi('system:users:edit')")
    @Log(title = "参与排班用户", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody NmisScheUsers nmisScheUsers)
    {
        return toAjax(nmisScheUsersService.updateNmisScheUsers(nmisScheUsers));
    }

    /**
     * 删除参与排班用户
     */
    @PreAuthorize("@ss.hasPermi('system:users:remove')")
    @Log(title = "参与排班用户", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(nmisScheUsersService.deleteNmisScheUsersByIds(ids));
    }
}

