package com.ruoyi.system.controller;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.SchoolDirection;
import com.ruoyi.system.service.ISchoolDirectionService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 方向Controller
 * 
 * @author ruoyi
 * @date 2020-12-09
 */
@Controller
@RequestMapping("/system/direction")
public class SchoolDirectionController extends BaseController
{
    private String prefix = "system/direction";

    @Autowired
    private ISchoolDirectionService schoolDirectionService;

    @RequiresPermissions("system:direction:view")
    @GetMapping()
    public String direction()
    {
        return prefix + "/direction";
    }

    /**
     * 查询方向列表
     */
    @RequiresPermissions("system:direction:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SchoolDirection schoolDirection)
    {
        startPage();
        List<SchoolDirection> list = schoolDirectionService.selectSchoolDirectionList(schoolDirection);
        return getDataTable(list);
    }

    /**
     * 导出方向列表
     */
    @RequiresPermissions("system:direction:export")
    @Log(title = "方向", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SchoolDirection schoolDirection)
    {
        List<SchoolDirection> list = schoolDirectionService.selectSchoolDirectionList(schoolDirection);
        ExcelUtil<SchoolDirection> util = new ExcelUtil<SchoolDirection>(SchoolDirection.class);
        return util.exportExcel(list, "direction");
    }

    /**
     * 新增方向
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存方向
     */
    @RequiresPermissions("system:direction:add")
    @Log(title = "方向", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(SchoolDirection schoolDirection)
    {
        return toAjax(schoolDirectionService.insertSchoolDirection(schoolDirection));
    }

    /**
     * 修改方向
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        SchoolDirection schoolDirection = schoolDirectionService.selectSchoolDirectionById(id);
        mmap.put("schoolDirection", schoolDirection);
        return prefix + "/edit";
    }

    /**
     * 修改保存方向
     */
    @RequiresPermissions("system:direction:edit")
    @Log(title = "方向", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SchoolDirection schoolDirection)
    {
        return toAjax(schoolDirectionService.updateSchoolDirection(schoolDirection));
    }

    /**
     * 删除方向
     */
    @RequiresPermissions("system:direction:remove")
    @Log(title = "方向", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(schoolDirectionService.deleteSchoolDirectionByIds(ids));
    }
}
