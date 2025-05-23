package com.ydl.web.controller.hr;


import java.util.List;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import com.ydl.nmis.hr.domain.NmisHrTraining;
import com.ydl.nmis.hr.service.INmisHrTrainingService;
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
 * 护理人员院内培训考试Controller
 *
 * @author ydl
 * @date 2025-03-12
 */
@RestController
@RequestMapping("/hr/training")
public class NmisHrTrainingController extends BaseController
{
    @Autowired
    private INmisHrTrainingService nmisHrTrainingService;

    /**
     * 查询护理人员院内培训考试列表
     */
    //@PreAuthorize("@ss.hasPermi('system:training:list')")
    @GetMapping("/list")
    public TableDataInfo list(NmisHrTraining nmisHrTraining)
    {
        startPage();
        List<NmisHrTraining> list = nmisHrTrainingService.selectNmisHrTrainingList(nmisHrTraining);
        return getDataTable(list);
    }

    /**
     * 导出护理人员院内培训考试列表
     */
    //@PreAuthorize("@ss.hasPermi('system:training:export')")
    @Log(title = "护理人员院内培训考试", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, NmisHrTraining nmisHrTraining)
    {
        List<NmisHrTraining> list = nmisHrTrainingService.selectNmisHrTrainingList(nmisHrTraining);
        ExcelUtil<NmisHrTraining> util = new ExcelUtil<NmisHrTraining>(NmisHrTraining.class);
        util.exportExcel(response, list, "护理人员院内培训考试数据");
    }

    /**
     * 获取护理人员院内培训考试详细信息
     */
    //@PreAuthorize("@ss.hasPermi('system:training:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(nmisHrTrainingService.selectNmisHrTrainingById(id));
    }

    /**
     * 新增护理人员院内培训考试
     */
    //@PreAuthorize("@ss.hasPermi('system:training:add')")
    @Log(title = "护理人员院内培训考试", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@Valid  @RequestBody NmisHrTraining nmisHrTraining)
    {
        return toAjax(nmisHrTrainingService.insertNmisHrTraining(nmisHrTraining));
    }

    /**
     * 修改护理人员院内培训考试
     */
    //@PreAuthorize("@ss.hasPermi('system:training:edit')")
    @Log(title = "护理人员院内培训考试", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@Valid @RequestBody NmisHrTraining nmisHrTraining)
    {
        return toAjax(nmisHrTrainingService.updateNmisHrTraining(nmisHrTraining));
    }

    /**
     * 删除护理人员院内培训考试
     */
    //@PreAuthorize("@ss.hasPermi('system:training:remove')")
    @Log(title = "护理人员院内培训考试", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(nmisHrTrainingService.deleteNmisHrTrainingByIds(ids));
    }
}
