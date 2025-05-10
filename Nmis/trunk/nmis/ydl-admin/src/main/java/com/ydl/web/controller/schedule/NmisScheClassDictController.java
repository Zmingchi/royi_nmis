package com.ydl.web.controller.schedule;


import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletResponse;
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
import com.ydl.nmis.schedule.domain.NmisScheClassDict;

import com.ydl.nmis.schedule.service.INmisScheClassDictService;
import com.ydl.common.utils.poi.ExcelUtil;
import com.ydl.common.core.page.TableDataInfo;

/**
 * 班次类别字典Controller
 *
 * @author ydl
 * @date 2025-03-18
 */
@RestController
@RequestMapping("/schedule/Class/dict")
public class NmisScheClassDictController extends BaseController
{
    @Autowired
    private INmisScheClassDictService nmisScheClassDictService;


    /**
     *
     */
/*    @GetMapping("/listWithClass")
    public AjaxResult listWithClass() {
        //List<Map<String, Object>> result = nmisScheDictService.getScheClassDictWithScheDict();
        return success(result);
    }*/

    /**
     * 查询班次类别字典列表
     */
    //@PreAuthorize("@ss.hasPermi('system:dict:list')")
    @GetMapping("/list")
    public TableDataInfo list(NmisScheClassDict nmisScheClassDict)
    {
        startPage();
        List<NmisScheClassDict> list = nmisScheClassDictService.selectNmisScheClassDictList(nmisScheClassDict);
        return getDataTable(list);
    }

    /**
     * 导出班次类别字典列表
     */
    //@PreAuthorize("@ss.hasPermi('system:dict:export')")
    @Log(title = "班次类别字典", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, NmisScheClassDict nmisScheClassDict)
    {
        List<NmisScheClassDict> list = nmisScheClassDictService.selectNmisScheClassDictList(nmisScheClassDict);
        ExcelUtil<NmisScheClassDict> util = new ExcelUtil<NmisScheClassDict>(NmisScheClassDict.class);
        util.exportExcel(response, list, "班次类别字典数据");
    }

    /**
     * 获取班次类别字典详细信息
     */
   // @PreAuthorize("@ss.hasPermi('system:dict:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") String id)
    {
        return success(nmisScheClassDictService.selectNmisScheClassDictById(id));
    }

    /**
     * 新增班次类别字典
     */
    //@PreAuthorize("@ss.hasPermi('system:dict:add')")
    @Log(title = "班次类别字典", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody NmisScheClassDict nmisScheClassDict)
    {
        return toAjax(nmisScheClassDictService.insertNmisScheClassDict(nmisScheClassDict));
    }

    /**
     *
     * 通过user_id查询user_name
     *
     */
    @GetMapping(value = "/GetuserName/{createId}")
    public String GetuserName(@PathVariable String createId){
        return nmisScheClassDictService.selectNmisScheClassDictBycreateId(createId);
    }

    /**
     * 修改班次类别字典
     */
    //@PreAuthorize("@ss.hasPermi('system:dict:edit')")
    @Log(title = "班次类别字典", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody NmisScheClassDict nmisScheClassDict)
    {
        return toAjax(nmisScheClassDictService.updateNmisScheClassDict(nmisScheClassDict));
    }

    /**
     * 删除班次类别字典
     */
    //@PreAuthorize("@ss.hasPermi('system:dict:remove')")
    @Log(title = "班次类别字典", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable String[] ids)
    {
        return toAjax(nmisScheClassDictService.deleteNmisScheClassDictByIds(ids));
    }
}
