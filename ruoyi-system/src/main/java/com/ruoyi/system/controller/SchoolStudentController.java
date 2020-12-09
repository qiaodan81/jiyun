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
import com.ruoyi.system.domain.SchoolStudent;
import com.ruoyi.system.service.ISchoolStudentService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 学生Controller
 * 
 * @author ruoyi
 * @date 2020-12-09
 */
@Controller
@RequestMapping("/system/student")
public class SchoolStudentController extends BaseController
{
    private String prefix = "system/student";

    @Autowired
    private ISchoolStudentService schoolStudentService;

    @RequiresPermissions("system:student:view")
    @GetMapping()
    public String student()
    {
        return prefix + "/student";
    }

    /**
     * 查询学生列表
     */
    @RequiresPermissions("system:student:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SchoolStudent schoolStudent)
    {
        startPage();
        List<SchoolStudent> list = schoolStudentService.selectSchoolStudentList(schoolStudent);
        return getDataTable(list);
    }

    /**
     * 导出学生列表
     */
    @RequiresPermissions("system:student:export")
    @Log(title = "学生", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SchoolStudent schoolStudent)
    {
        List<SchoolStudent> list = schoolStudentService.selectSchoolStudentList(schoolStudent);
        ExcelUtil<SchoolStudent> util = new ExcelUtil<SchoolStudent>(SchoolStudent.class);
        return util.exportExcel(list, "student");
    }

    /**
     * 新增学生
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存学生
     */
    @RequiresPermissions("system:student:add")
    @Log(title = "学生", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(SchoolStudent schoolStudent)
    {
        return toAjax(schoolStudentService.insertSchoolStudent(schoolStudent));
    }

    /**
     * 修改学生
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        SchoolStudent schoolStudent = schoolStudentService.selectSchoolStudentById(id);
        mmap.put("schoolStudent", schoolStudent);
        return prefix + "/edit";
    }

    /**
     * 修改保存学生
     */
    @RequiresPermissions("system:student:edit")
    @Log(title = "学生", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SchoolStudent schoolStudent)
    {
        return toAjax(schoolStudentService.updateSchoolStudent(schoolStudent));
    }

    /**
     * 删除学生
     */
    @RequiresPermissions("system:student:remove")
    @Log(title = "学生", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(schoolStudentService.deleteSchoolStudentByIds(ids));
    }
}
