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
import com.ruoyi.system.domain.SchoolGrade;
import com.ruoyi.system.service.ISchoolGradeService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 班级Controller
 * 
 * @author ruoyi
 * @date 2020-12-09
 */
@Controller
@RequestMapping("/system/grade")
public class SchoolGradeController extends BaseController
{
    private String prefix = "system/grade";

    @Autowired
    private ISchoolGradeService schoolGradeService;

    @RequiresPermissions("system:grade:view")
    @GetMapping()
    public String grade()
    {
        return prefix + "/grade";
    }

    /**
     * 查询班级列表
     */
    @RequiresPermissions("system:grade:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SchoolGrade schoolGrade)
    {
        startPage();
        List<SchoolGrade> list = schoolGradeService.selectSchoolGradeList(schoolGrade);
        return getDataTable(list);
    }

    /**
     * 导出班级列表
     */
    @RequiresPermissions("system:grade:export")
    @Log(title = "班级", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SchoolGrade schoolGrade)
    {
        List<SchoolGrade> list = schoolGradeService.selectSchoolGradeList(schoolGrade);
        ExcelUtil<SchoolGrade> util = new ExcelUtil<SchoolGrade>(SchoolGrade.class);
        return util.exportExcel(list, "grade");
    }

    /**
     * 新增班级
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存班级
     */
    @RequiresPermissions("system:grade:add")
    @Log(title = "班级", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(SchoolGrade schoolGrade)
    {
        return toAjax(schoolGradeService.insertSchoolGrade(schoolGrade));
    }

    /**
     * 修改班级
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        SchoolGrade schoolGrade = schoolGradeService.selectSchoolGradeById(id);
        mmap.put("schoolGrade", schoolGrade);
        return prefix + "/edit";
    }

    /**
     * 修改保存班级
     */
    @RequiresPermissions("system:grade:edit")
    @Log(title = "班级", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SchoolGrade schoolGrade)
    {
        return toAjax(schoolGradeService.updateSchoolGrade(schoolGrade));
    }

    /**
     * 删除班级
     */
    @RequiresPermissions("system:grade:remove")
    @Log(title = "班级", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(schoolGradeService.deleteSchoolGradeByIds(ids));
    }
}
