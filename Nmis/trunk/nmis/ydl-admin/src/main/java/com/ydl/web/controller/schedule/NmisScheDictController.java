package com.ydl.web.controller.schedule;

import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletResponse;

import com.ydl.common.core.domain.entity.SysDept;
import com.ydl.nmis.schedule.domain.NmisScheDict;
import com.ydl.nmis.schedule.service.INmisScheDictService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.ydl.common.annotation.Log;
import com.ydl.common.core.controller.BaseController;
import com.ydl.common.core.domain.AjaxResult;
import com.ydl.common.enums.BusinessType;
import com.ydl.common.utils.poi.ExcelUtil;
import com.ydl.common.core.page.TableDataInfo;
import com.ydl.common.core.domain.entity.SysDept;
import com.ydl.system.service.ISysDeptService;



/**
 * 护理班次字典Controller
 *
 * @author ydl
 * @date 2025-03-18
 */
@RestController
@RequestMapping("/schedule/dict")
public class NmisScheDictController extends BaseController
{
    @Autowired
    private INmisScheDictService nmisScheDictService;


    @GetMapping(value ="/listWithClass")
    public AjaxResult listWithClass(@RequestParam(required=false) String deptId) {
        // 如果未传入deptId，默认为查询全院班次(*)
        String actualDeptId = deptId != null ? deptId : "*";
        List<Map<String, Object>> result = nmisScheDictService.getScheClassDictWithScheDict(actualDeptId);
        return success(result);
    }

    /**
     * 查询护理班次字典列表
     */
    //@PreAuthorize("@ss.hasPermi('system:dict:list')")
    @GetMapping("/list")
    public TableDataInfo list(NmisScheDict nmisScheDict)
    {
        startPage();
        List<NmisScheDict> list = nmisScheDictService.selectNmisScheDictList(nmisScheDict);
        return getDataTable(list);
    }

    /**
     * 校验护理班次字典列表
     */
    //@PreAuthorize("@ss.hasPermi('system:dict:list')")
    @GetMapping("/list2")
    public TableDataInfo list2(NmisScheDict nmisScheDict)
    {
        startPage();
        List<NmisScheDict> list = nmisScheDictService.selectNmisScheDictList2(nmisScheDict);
        return getDataTable(list);
    }

    /**
     * 导出护理班次字典列表
     */
    //@PreAuthorize("@ss.hasPermi('system:dict:export')")
    @Log(title = "护理班次字典", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, NmisScheDict nmisScheDict)
    {
        List<NmisScheDict> list = nmisScheDictService.selectNmisScheDictList(nmisScheDict);
        ExcelUtil<NmisScheDict> util = new ExcelUtil<NmisScheDict>(NmisScheDict.class);
        util.exportExcel(response, list, "护理班次字典数据");
    }

    /**
     * 获取护理班次字典详细信息
     */
    //@PreAuthorize("@ss.hasPermi('system:dict:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(nmisScheDictService.selectNmisScheDictById(id));
    }

    /**
     * 新增护理班次字典
     */
    //@PreAuthorize("@ss.hasPermi('system:dict:add')")
    @Log(title = "护理班次字典", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody NmisScheDict nmisScheDict)
    {
        return toAjax(nmisScheDictService.insertNmisScheDict(nmisScheDict));
    }

    /**
     * 修改护理班次字典
     */
    //@PreAuthorize("@ss.hasPermi('system:dict:edit')")
    @Log(title = "护理班次字典", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody NmisScheDict nmisScheDict)
    {
        return toAjax(nmisScheDictService.updateNmisScheDict(nmisScheDict));
    }

    /**
     * 删除护理班次字典
     */
    //@PreAuthorize("@ss.hasPermi('system:dict:remove')")
    @Log(title = "护理班次字典", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(nmisScheDictService.deleteNmisScheDictByIds(ids));
    }
}

