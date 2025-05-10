package com.ydl.web.controller.hr;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import com.ydl.nmis.hr.domain.NmisHrUserEdu;
import com.ydl.nmis.hr.service.INmisHrUserEduService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
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
 * 护理人员教育信息Controller
 *
 * @author ydl
 * @date 2025-03-05
 */
@RestController
@RequestMapping("/hr/edu")
public class NmisHrUserEduController extends BaseController
{
    @Autowired
    private INmisHrUserEduService nmisHrUserEduService;

    /**
     * 查询护理人员教育信息列表
     */
    //@PreAuthorize("@ss.hasPermi('system:edu:list')")
    @GetMapping("/list")
    public TableDataInfo list(NmisHrUserEdu nmisHrUserEdu)
    {
        startPage();
        List<NmisHrUserEdu> list = nmisHrUserEduService.selectNmisHrUserEduList(nmisHrUserEdu);
        return getDataTable(list);
    }

    /**
     * 导出护理人员教育信息列表
     */
    //@PreAuthorize("@ss.hasPermi('system:edu:export')")
    @Log(title = "护理人员教育信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, NmisHrUserEdu nmisHrUserEdu)
    {
        List<NmisHrUserEdu> list = nmisHrUserEduService.selectNmisHrUserEduList(nmisHrUserEdu);
        ExcelUtil<NmisHrUserEdu> util = new ExcelUtil<NmisHrUserEdu>(NmisHrUserEdu.class);
        util.exportExcel(response, list, "护理人员教育信息数据");
    }

    /**
     * 获取护理人员教育信息详细信息
     */
    //@PreAuthorize("@ss.hasPermi('system:edu:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(nmisHrUserEduService.selectNmisHrUserEduById(id));
    }

    /**
     * 新增护理人员教育信息
     */
    //@PreAuthorize("@ss.hasPermi('system:edu:add')")
    @Log(title = "护理人员教育信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@Valid @RequestBody  NmisHrUserEdu nmisHrUserEdu)
    {
        return toAjax(nmisHrUserEduService.insertNmisHrUserEdu(nmisHrUserEdu));
    }


    /**
     * 修改护理人员教育信息
     */
    //@PreAuthorize("@ss.hasPermi('system:edu:edit')")
    @Log(title = "护理人员教育信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit( @RequestBody @Valid NmisHrUserEdu nmisHrUserEdu)
    {
        return toAjax(nmisHrUserEduService.updateNmisHrUserEdu(nmisHrUserEdu));
    }

    /**
     * 删除护理人员教育信息
     */
    //@PreAuthorize("@ss.hasPermi('system:edu:remove')")
    @Log(title = "护理人员教育信息", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(nmisHrUserEduService.deleteNmisHrUserEduByIds(ids));
    }
}
