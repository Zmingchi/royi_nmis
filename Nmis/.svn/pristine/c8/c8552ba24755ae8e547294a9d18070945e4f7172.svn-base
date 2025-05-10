package com.ydl.web.controller.schedule;


import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ydl.nmis.schedule.domain.NmisScheGroupUser;
import com.ydl.nmis.schedule.service.INmisScheGroupUserService;
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
 * 护理排班组用户Controller
 *
 * @author ydl
 * @date 2025-03-19
 */
@RestController
@RequestMapping("/schedule/group/user")
public class NmisScheGroupUserController extends BaseController
{

    @Autowired
    private INmisScheGroupUserService nmisScheGroupUserService;

    /**
     * 查询护理排班组用户列表
     */
    //@PreAuthorize("@ss.hasPermi('system:user:list')")
    @GetMapping("/list")
    public TableDataInfo list(NmisScheGroupUser nmisScheGroupUser)
    {
        startPage();
        List<NmisScheGroupUser> list = nmisScheGroupUserService.selectNmisScheGroupUserList(nmisScheGroupUser);
        return getDataTable(list);
    }

    /**
     * 导出护理排班组用户列表
     */
    //@PreAuthorize("@ss.hasPermi('system:user:export')")
    //@Log(title = "护理排班组用户", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, NmisScheGroupUser nmisScheGroupUser)
    {
        List<NmisScheGroupUser> list = nmisScheGroupUserService.selectNmisScheGroupUserList(nmisScheGroupUser);
        ExcelUtil<NmisScheGroupUser> util = new ExcelUtil<NmisScheGroupUser>(NmisScheGroupUser.class);
        util.exportExcel(response, list, "护理排班组用户数据");
    }

    /**
     * 获取护理排班组用户详细信息
     */
    //@PreAuthorize("@ss.hasPermi('system:user:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(nmisScheGroupUserService.selectNmisScheGroupUserById(id));
    }

    /**
     * 新增护理排班组用户
     */
    //@PreAuthorize("@ss.hasPermi('system:user:add')")
    @Log(title = "护理排班组用户", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody NmisScheGroupUser nmisScheGroupUser)
    {
        return toAjax(nmisScheGroupUserService.insertNmisScheGroupUser(nmisScheGroupUser));
    }

    /**
     * 修改护理排班组用户
     */
    //@PreAuthorize("@ss.hasPermi('system:user:edit')")
    //@Log(title = "护理排班组用户", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody NmisScheGroupUser nmisScheGroupUser)
    {
        return toAjax(nmisScheGroupUserService.updateNmisScheGroupUser(nmisScheGroupUser));
    }

    /**
     * 删除护理排班组用户
     */
    //@PreAuthorize("@ss.hasPermi('system:user:remove')")
    @Log(title = "护理排班组用户", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(nmisScheGroupUserService.deleteNmisScheGroupUserByIds(ids));
    }
}

