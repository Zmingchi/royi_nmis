package com.ydl.web.controller.hr;


import java.util.List;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import com.ydl.nmis.hr.domain.NmisHrCareer;
import com.ydl.nmis.hr.service.INmisHrCareerService;
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
 * 护理人员工作经历Controller
 *
 * @author ydl
 * @date 2025-03-05
 */
@RestController
@RequestMapping("/hr/career")
public class NmisHrCareerController extends BaseController
{
    @Autowired
    private INmisHrCareerService nmisHrCareerService;

    /**
     * 查询护理人员工作经历列表
     */
    //@PreAuthorize("@ss.hasPermi('system:career:list')")
    @GetMapping("/list")
    public TableDataInfo list(NmisHrCareer nmisHrCareer)
    {
        startPage() ;
        List<NmisHrCareer> list = nmisHrCareerService.selectNmisHrCareerList(nmisHrCareer) ;
        return getDataTable(list) ;
    }

    /**
     * 导出护理人员工作经历列表
     */
    //@PreAuthorize("@ss.hasPermi('system:career:export')")
    @Log(title = "护理人员工作经历", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, NmisHrCareer nmisHrCareer)
    {
        List<NmisHrCareer> list = nmisHrCareerService.selectNmisHrCareerList(nmisHrCareer);
        ExcelUtil<NmisHrCareer> util = new ExcelUtil<NmisHrCareer>(NmisHrCareer.class);
        util.exportExcel(response, list, "护理人员工作经历数据");
    }

    /**
     * 获取护理人员工作经历详细信息
     */
    //@PreAuthorize("@ss.hasPermi('system:career:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(nmisHrCareerService.selectNmisHrCareerById(id));
    }

    /**
     * 新增护理人员工作经历
     */
    //@PreAuthorize("@ss.hasPermi('system:career:add')")
    @Log(title = "护理人员工作经历", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@Valid  @RequestBody NmisHrCareer nmisHrCareer)
    {
        return toAjax(nmisHrCareerService.insertNmisHrCareer(nmisHrCareer));
    }

    /**
     * 修改护理人员工作经历
     */
    //@PreAuthorize("@ss.hasPermi('system:career:edit')")
    @Log(title = "护理人员工作经历", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@Valid @RequestBody NmisHrCareer nmisHrCareer)
    {
        return toAjax(nmisHrCareerService.updateNmisHrCareer(nmisHrCareer));
    }

    /**
     * 删除护理人员工作经历
     */
    //@PreAuthorize("@ss.hasPermi('system:career:remove')")
    @Log(title = "护理人员工作经历", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(nmisHrCareerService.deleteNmisHrCareerByIds(ids));
    }
}

