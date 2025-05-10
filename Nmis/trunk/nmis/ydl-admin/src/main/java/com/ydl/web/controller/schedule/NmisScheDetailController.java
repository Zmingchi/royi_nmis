package com.ydl.web.controller.schedule;


import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ydl.nmis.schedule.domain.NmisScheDetail;
import com.ydl.nmis.schedule.service.INmisScheDetailService;
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
 * 护理排班Controller
 *
 * @author ydl
 * @date 2025-03-28
 */
@RestController
@RequestMapping("/schedule/detail")
public class NmisScheDetailController extends BaseController
{
    @Autowired
    private INmisScheDetailService nmisScheDetailService;

    /**
     * 查询护理排班列表
     */
    //@PreAuthorize("@ss.hasPermi('system:detail:list')")
    @GetMapping("/list")
    public TableDataInfo list(NmisScheDetail nmisScheDetail)
    {
        startPage();
        List<NmisScheDetail> list = nmisScheDetailService.selectNmisScheDetailList(nmisScheDetail);
        return getDataTable(list);
    }

    /**
     * 导出护理排班列表
     */
    //@PreAuthorize("@ss.hasPermi('system:detail:export')")
    @Log(title = "护理排班", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, NmisScheDetail nmisScheDetail)
    {
        List<NmisScheDetail> list = nmisScheDetailService.selectNmisScheDetailList(nmisScheDetail);
        ExcelUtil<NmisScheDetail> util = new ExcelUtil<NmisScheDetail>(NmisScheDetail.class);
        util.exportExcel(response, list, "护理排班数据");
    }

    /**
     * 获取护理排班详细信息
     */
    //@PreAuthorize("@ss.hasPermi('system:detail:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(nmisScheDetailService.selectNmisScheDetailById(id));
    }

    /**
     * 新增护理排班
     */
    //@PreAuthorize("@ss.hasPermi('system:detail:add')")
    @Log(title = "护理排班", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody NmisScheDetail nmisScheDetail)
    {
        return toAjax(nmisScheDetailService.insertNmisScheDetail(nmisScheDetail));
    }

    /**
     * 修改护理排班
     */
    //@PreAuthorize("@ss.hasPermi('system:detail:edit')")
    @Log(title = "护理排班", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody NmisScheDetail nmisScheDetail)
    {
        return toAjax(nmisScheDetailService.updateNmisScheDetail(nmisScheDetail));
    }

    /**
     * 删除护理排班
     */
    //@PreAuthorize("@ss.hasPermi('system:detail:remove')")
    @Log(title = "护理排班", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(nmisScheDetailService.deleteNmisScheDetailByIds(ids));
    }
}
