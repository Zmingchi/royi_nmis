package com.ydl.web.controller.hr;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;


import com.ydl.nmis.hr.domain.NmisHrArrange;
import com.ydl.nmis.hr.service.INmisHrArrangeService;
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
 * 护理人员临时借调信息Controller
 *
 * @author ydl
 * @date 2025-03-05
 */
@RestController
@RequestMapping("/hr/arrange")
public class NmisHrArrangeController extends BaseController
{
    @Autowired
    private INmisHrArrangeService nmisHrArrangeService;

    /**
     * 查询护理人员临时借调信息列表
     */
    //@PreAuthorize("@ss.hasPermi('system:arrange:list')")
    @GetMapping("/list")
    public TableDataInfo list(NmisHrArrange nmisHrArrange)
    {
        startPage();
        List<NmisHrArrange> list = nmisHrArrangeService.selectNmisHrArrangeList(nmisHrArrange);
        return getDataTable(list);
    }

    /**
     * 导出护理人员临时借调信息列表
     */
    //@PreAuthorize("@ss.hasPermi('system:arrange:export')")
    @Log(title = "护理人员临时借调信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, NmisHrArrange nmisHrArrange)
    {
        List<NmisHrArrange> list = nmisHrArrangeService.selectNmisHrArrangeList(nmisHrArrange);
        ExcelUtil<NmisHrArrange> util = new ExcelUtil<NmisHrArrange>(NmisHrArrange.class);
        util.exportExcel(response, list, "护理人员临时借调信息数据");
    }

    /**
     * 获取护理人员临时借调信息详细信息
     */
    //@PreAuthorize("@ss.hasPermi('system:arrange:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(nmisHrArrangeService.selectNmisHrArrangeById(id));
    }

    /**
     * 新增护理人员临时借调信息
     */
    //@PreAuthorize("@ss.hasPermi('system:arrange:add')")
    @Log(title = "护理人员临时借调信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@Valid @RequestBody NmisHrArrange nmisHrArrange)
    {
        return toAjax(nmisHrArrangeService.insertNmisHrArrange(nmisHrArrange));
    }

    /**
     * 修改护理人员临时借调信息
     */
    //@PreAuthorize("@ss.hasPermi('system:arrange:edit')")
    @Log(title = "护理人员临时借调信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@Valid @RequestBody NmisHrArrange nmisHrArrange)
    {
        return toAjax(nmisHrArrangeService.updateNmisHrArrange(nmisHrArrange));
    }

    /**
     * 删除护理人员临时借调信息
     */
    //@PreAuthorize("@ss.hasPermi('system:arrange:remove')")
    @Log(title = "护理人员临时借调信息", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(nmisHrArrangeService.deleteNmisHrArrangeByIds(ids));
    }
}
