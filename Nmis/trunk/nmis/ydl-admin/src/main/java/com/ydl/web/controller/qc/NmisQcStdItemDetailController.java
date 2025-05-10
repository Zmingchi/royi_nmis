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
import com.ydl.qc.domain.NmisQcStdItemDetail;
import com.ydl.qc.service.INmisQcStdItemDetailService;
import com.ydl.common.utils.poi.ExcelUtil;
import com.ydl.common.core.page.TableDataInfo;

/**
 * 护理质量标准项目细则Controller
 * 
 * @author ydl
 * @date 2025-05-07
 */
@RestController
@RequestMapping("/qc/StdDetail")
public class NmisQcStdItemDetailController extends BaseController
{
    @Autowired
    private INmisQcStdItemDetailService nmisQcStdItemDetailService;

    /**
     * 查询护理质量标准项目细则列表
     */
    //@PreAuthorize("@ss.hasPermi('system:detail:list')")
    @GetMapping("/list")
    public TableDataInfo list(NmisQcStdItemDetail nmisQcStdItemDetail)
    {
        startPage();
        List<NmisQcStdItemDetail> list = nmisQcStdItemDetailService.selectNmisQcStdItemDetailList(nmisQcStdItemDetail);
        return getDataTable(list);
    }

    /**
     * 导出护理质量标准项目细则列表
     */
    //@PreAuthorize("@ss.hasPermi('system:detail:export')")
    @Log(title = "护理质量标准项目细则", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, NmisQcStdItemDetail nmisQcStdItemDetail)
    {
        List<NmisQcStdItemDetail> list = nmisQcStdItemDetailService.selectNmisQcStdItemDetailList(nmisQcStdItemDetail);
        ExcelUtil<NmisQcStdItemDetail> util = new ExcelUtil<NmisQcStdItemDetail>(NmisQcStdItemDetail.class);
        util.exportExcel(response, list, "护理质量标准项目细则数据");
    }

    /**
     * 获取护理质量标准项目细则详细信息
     */
    //@PreAuthorize("@ss.hasPermi('system:detail:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(nmisQcStdItemDetailService.selectNmisQcStdItemDetailById(id));
    }

    /**
     * 新增护理质量标准项目细则
     */
    //@PreAuthorize("@ss.hasPermi('system:detail:add')")
    @Log(title = "护理质量标准项目细则", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody NmisQcStdItemDetail nmisQcStdItemDetail)
    {
        return toAjax(nmisQcStdItemDetailService.insertNmisQcStdItemDetail(nmisQcStdItemDetail));
    }

    /**
     * 修改护理质量标准项目细则
     */
    //@PreAuthorize("@ss.hasPermi('system:detail:edit')")
    @Log(title = "护理质量标准项目细则", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody NmisQcStdItemDetail nmisQcStdItemDetail)
    {
        return toAjax(nmisQcStdItemDetailService.updateNmisQcStdItemDetail(nmisQcStdItemDetail));
    }

    /**
     * 删除护理质量标准项目细则
     */
    //@PreAuthorize("@ss.hasPermi('system:detail:remove')")
    @Log(title = "护理质量标准项目细则", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(nmisQcStdItemDetailService.deleteNmisQcStdItemDetailByIds(ids));
    }
}
