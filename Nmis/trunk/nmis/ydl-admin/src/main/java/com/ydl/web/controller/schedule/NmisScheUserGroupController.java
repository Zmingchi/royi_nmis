package com.ydl.web.controller.schedule;


import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ydl.nmis.schedule.domain.NmisScheUserGroup;
import com.ydl.nmis.schedule.service.INmisScheUserGroupService;
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
 * 护理排班分组Controller
 *
 * @author ydl
 * @date 2025-03-19
 */
@RestController
@RequestMapping("/schedule/user/group")
public class NmisScheUserGroupController extends BaseController
{
    @Autowired
    private INmisScheUserGroupService nmisScheUserGroupService;

    /**
     * 查询护理排班分组列表
     */
    //@PreAuthorize("@ss.hasPermi('system:group:list')")
    @GetMapping("/list")
    public TableDataInfo list(NmisScheUserGroup nmisScheUserGroup)
    {
        startPage();
        List<NmisScheUserGroup> list = nmisScheUserGroupService.selectNmisScheUserGroupList(nmisScheUserGroup);
        return getDataTable(list);
    }

    /**
     * 导出护理排班分组列表
     */
    //@PreAuthorize("@ss.hasPermi('system:group:export')")
    @Log(title = "护理排班分组", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, NmisScheUserGroup nmisScheUserGroup)
    {
        List<NmisScheUserGroup> list = nmisScheUserGroupService.selectNmisScheUserGroupList(nmisScheUserGroup);
        ExcelUtil<NmisScheUserGroup> util = new ExcelUtil<NmisScheUserGroup>(NmisScheUserGroup.class);
        util.exportExcel(response, list, "护理排班分组数据");
    }

    /**
     * 获取护理排班分组详细信息
     */
    //@PreAuthorize("@ss.hasPermi('system:group:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(nmisScheUserGroupService.selectNmisScheUserGroupById(id));
    }

    /**
     * 新增护理排班分组
     */
    //@PreAuthorize("@ss.hasPermi('system:group:add')")
    @Log(title = "护理排班分组", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody NmisScheUserGroup nmisScheUserGroup)
    {
        return toAjax(nmisScheUserGroupService.insertNmisScheUserGroup(nmisScheUserGroup));
    }

    /**
     * 修改护理排班分组
     */
    //@PreAuthorize("@ss.hasPermi('system:group:edit')")
    @Log(title = "护理排班分组", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody NmisScheUserGroup nmisScheUserGroup)
    {
        return toAjax(nmisScheUserGroupService.updateNmisScheUserGroup(nmisScheUserGroup));
    }

    /**
     * 删除护理排班分组
     */
    //@PreAuthorize("@ss.hasPermi('system:group:remove')")
    @Log(title = "护理排班分组", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(nmisScheUserGroupService.deleteNmisScheUserGroupByIds(ids));
    }
}
