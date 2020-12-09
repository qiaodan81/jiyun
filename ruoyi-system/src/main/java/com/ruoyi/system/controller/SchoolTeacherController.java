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
import com.ruoyi.system.domain.SchoolTeacher;
import com.ruoyi.system.service.ISchoolTeacherService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 教师管理Controller
 * 
 * @author ruoyi
 * @date 2020-12-09
 */
@Controller
@RequestMapping("/system/teacher")
public class SchoolTeacherController extends BaseController
{
    private String prefix = "system/teacher";

    @Autowired
    private ISchoolTeacherService schoolTeacherService;

    @RequiresPermissions("system:teacher:view")
    @GetMapping()
    public String teacher()
    {
        return prefix + "/teacher";
    }

    /**
     * 查询教师管理列表
     */
    @RequiresPermissions("system:teacher:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SchoolTeacher schoolTeacher)
    {
        startPage();
        List<SchoolTeacher> list = schoolTeacherService.selectSchoolTeacherList(schoolTeacher);
        return getDataTable(list);
    }

    /**
     * 导出教师管理列表
     */
    @RequiresPermissions("system:teacher:export")
    @Log(title = "教师管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SchoolTeacher schoolTeacher)
    {
        List<SchoolTeacher> list = schoolTeacherService.selectSchoolTeacherList(schoolTeacher);
        ExcelUtil<SchoolTeacher> util = new ExcelUtil<SchoolTeacher>(SchoolTeacher.class);
        return util.exportExcel(list, "teacher");
    }

    /**
     * 新增教师管理
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存教师管理
     */
    @RequiresPermissions("system:teacher:add")
    @Log(title = "教师管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(SchoolTeacher schoolTeacher)
    {
        return toAjax(schoolTeacherService.insertSchoolTeacher(schoolTeacher));
    }

    /**
     * 修改教师管理
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        SchoolTeacher schoolTeacher = schoolTeacherService.selectSchoolTeacherById(id);
        mmap.put("schoolTeacher", schoolTeacher);
        return prefix + "/edit";
    }

    /**
     * 修改保存教师管理
     */
    @RequiresPermissions("system:teacher:edit")
    @Log(title = "教师管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SchoolTeacher schoolTeacher)
    {
        return toAjax(schoolTeacherService.updateSchoolTeacher(schoolTeacher));
    }

    /**
     * 删除教师管理
     */
    @RequiresPermissions("system:teacher:remove")
    @Log(title = "教师管理", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(schoolTeacherService.deleteSchoolTeacherByIds(ids));
    }
}
