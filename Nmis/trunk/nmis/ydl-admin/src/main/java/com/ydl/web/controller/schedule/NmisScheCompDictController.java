package com.ydl.web.controller.schedule;


import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ydl.nmis.schedule.domain.NmisScheCompDict;
import com.ydl.nmis.schedule.service.INmisScheCompDictService;
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
 * 护理排班组合班次Controller
 *
 * @author ydl
 * @date 2025-03-19
 */
@RestController
@RequestMapping("/schedule/comp/dict")
public class NmisScheCompDictController extends BaseController
{
    @Autowired
    private INmisScheCompDictService nmisScheCompDictService;

    /**
     * 查询护理排班组合班次列表
     */
    //@PreAuthorize("@ss.hasPermi('system:dict:list')")
    @GetMapping("/list")
    public TableDataInfo list(NmisScheCompDict nmisScheCompDict)
    {
        startPage();
        List<NmisScheCompDict> list = nmisScheCompDictService.selectNmisScheCompDictList(nmisScheCompDict);
        return getDataTable(list);
    }



    /**
     * 导出护理排班组合班次列表
     */
    //@PreAuthorize("@ss.hasPermi('system:dict:export')")
    @Log(title = "护理排班组合班次", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, NmisScheCompDict nmisScheCompDict)
    {
        List<NmisScheCompDict> list = nmisScheCompDictService.selectNmisScheCompDictList(nmisScheCompDict);
        ExcelUtil<NmisScheCompDict> util = new ExcelUtil<NmisScheCompDict>(NmisScheCompDict.class);
        util.exportExcel(response, list, "护理排班组合班次数据");
    }

    /**
     * 获取护理排班组合班次详细信息
     */
    //@PreAuthorize("@ss.hasPermi('system:dict:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(nmisScheCompDictService.selectNmisScheCompDictById(id));
    }

    /**
     * 查询护理排班组合班次2
     *
     *
    @GetMapping(value = "/{id2}")
    public  AjaxResult getInfo2(@PathVariable("id2") String id2){
        return success(nmisScheCompDictService.selectNmisScheCompDictById2(id2));

    };
     */

    /**
     * 新增护理排班组合班次
     */
    //@PreAuthorize("@ss.hasPermi('system:dict:add')")
    @Log(title = "护理排班组合班次", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody NmisScheCompDict nmisScheCompDict)
    {
        return toAjax(nmisScheCompDictService.insertNmisScheCompDict(nmisScheCompDict));
    }

    /**
     * 修改护理排班组合班次
     */
    //@PreAuthorize("@ss.hasPermi('system:dict:edit')")
    @Log(title = "护理排班组合班次", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody NmisScheCompDict nmisScheCompDict)
    {
        return toAjax(nmisScheCompDictService.updateNmisScheCompDict(nmisScheCompDict));
    }

    /**
     * 删除护理排班组合班次
     */
    //@PreAuthorize("@ss.hasPermi('system:dict:remove')")
    @Log(title = "护理排班组合班次", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(nmisScheCompDictService.deleteNmisScheCompDictByIds(ids));
    }
}

