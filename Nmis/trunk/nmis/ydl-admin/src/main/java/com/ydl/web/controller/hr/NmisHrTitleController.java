package com.ydl.web.controller.hr;


import java.util.List;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import com.ydl.nmis.hr.domain.NmisHrTitle;
import com.ydl.nmis.hr.dto.NmisHrTitleWithDept;
import com.ydl.nmis.hr.service.INmisHrTitleService;
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
 * 护理人员职称信息Controller
 *
 * @author ydl
 * @date 2025-03-04
 */

@RestController
@RequestMapping("/hr/title")
public class NmisHrTitleController extends BaseController
{
    @Autowired
    private INmisHrTitleService nmisHrTitleService;

    /**
     * 查询护理人员职称信息列表
     */
    //@PreAuthorize("@ss.hasPermi('system:title:list')")
    @GetMapping("/list")
    public TableDataInfo list(NmisHrTitle nmisHrTitle)
    {
        startPage();
        List<NmisHrTitle> list = nmisHrTitleService.selectNmisHrTitleList(nmisHrTitle);
        return getDataTable(list);
    }

    /**
     * 导出护理人员职称信息列表
     */
    //@PreAuthorize("@ss.hasPermi('system:title:export')")
    @Log(title = "护理人员职称信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, NmisHrTitle nmisHrTitle)
    {
        List<NmisHrTitle> list = nmisHrTitleService.selectNmisHrTitleList(nmisHrTitle);
        ExcelUtil<NmisHrTitle> util = new ExcelUtil<NmisHrTitle>(NmisHrTitle.class);
        util.exportExcel(response, list, "护理人员职称信息数据");
    }

   /**
     * 获取护理人员职称信息详细信息
    */

    //@PreAuthorize("@ss.hasPermi('system:title:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(nmisHrTitleService.selectNmisHrTitleById(id));
    }


    /**
     * 通过科室获取护理人员职称信息详细信息
     */
    //@PreAuthorize("@ss.hasPermi('system:title:query')")
    @GetMapping(value = "/listWithDept")
    public TableDataInfo list(NmisHrTitleWithDept nmisHrTitleWithDept) {
        startPage(); // 开启分页
        List<Long> list1 = nmisHrTitleService.selectNmisHrTitleBydeptId(nmisHrTitleWithDept);
        return getDataTable(list1); // 返回分页数据
    }


    /**
     * 新增护理人员职称信息
     */
    //@PreAuthorize("@ss.hasPermi('system:title:add')")
    @Log(title = "护理人员职称信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@Valid  @RequestBody NmisHrTitle nmisHrTitle)
    {
        return toAjax(nmisHrTitleService.insertNmisHrTitle(nmisHrTitle));
    }


    /**
     * 修改护理人员职称信息
     */
    //@PreAuthorize("@ss.hasPermi('system:title:edit')")
    @Log(title = "护理人员职称信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@Valid @RequestBody NmisHrTitle nmisHrTitle)
    {
        return toAjax(nmisHrTitleService.updateNmisHrTitle(nmisHrTitle));
    }

    /**
     * 删除护理人员职称信息
     */

    //@PreAuthorize("@ss.hasPermi('system:title:remove')")
    @Log(title = "护理人员职称信息", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(nmisHrTitleService.deleteNmisHrTitleByIds(ids));
    }
}
