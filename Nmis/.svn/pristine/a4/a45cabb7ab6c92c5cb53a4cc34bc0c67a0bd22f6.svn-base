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
import com.ydl.qc.domain.NmisQcStd;
import com.ydl.qc.service.INmisQcStdService;
import com.ydl.common.utils.poi.ExcelUtil;
import com.ydl.common.core.page.TableDataInfo;

/**
 * 护理质量标准Controller
 * 
 * @author ydl
 * @date 2025-05-07
 */
@RestController
@RequestMapping("/qc/std")
public class NmisQcStdController extends BaseController
{
    @Autowired
    private INmisQcStdService nmisQcStdService;

    /**
     * 查询护理质量标准列表
     */
    //@PreAuthorize("@ss.hasPermi('system:std:list')")
    @GetMapping("/list")
    public TableDataInfo list(NmisQcStd nmisQcStd)
    {
        startPage();
        List<NmisQcStd> list = nmisQcStdService.selectNmisQcStdList(nmisQcStd);
        return getDataTable(list);
    }

    /**
     * 导出护理质量标准列表
     */
    //@PreAuthorize("@ss.hasPermi('system:std:export')")
    @Log(title = "护理质量标准", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, NmisQcStd nmisQcStd)
    {
        List<NmisQcStd> list = nmisQcStdService.selectNmisQcStdList(nmisQcStd);
        ExcelUtil<NmisQcStd> util = new ExcelUtil<NmisQcStd>(NmisQcStd.class);
        util.exportExcel(response, list, "护理质量标准数据");
    }

    /**
     * 获取护理质量标准详细信息
     */
    //@PreAuthorize("@ss.hasPermi('system:std:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(nmisQcStdService.selectNmisQcStdById(id));
    }

    /**
     * 新增护理质量标准
     */
    //@PreAuthorize("@ss.hasPermi('system:std:add')")
    @Log(title = "护理质量标准", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody NmisQcStd nmisQcStd)
    {
        return toAjax(nmisQcStdService.insertNmisQcStd(nmisQcStd));
    }

    /**
     * 修改护理质量标准
     */
    //@PreAuthorize("@ss.hasPermi('system:std:edit')")
    @Log(title = "护理质量标准", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody NmisQcStd nmisQcStd)
    {
        return toAjax(nmisQcStdService.updateNmisQcStd(nmisQcStd));
    }

    /**
     * 删除护理质量标准
     */
    //@PreAuthorize("@ss.hasPermi('system:std:remove')")
    @Log(title = "护理质量标准", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(nmisQcStdService.deleteNmisQcStdByIds(ids));
    }
}
