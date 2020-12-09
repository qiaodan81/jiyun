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
import com.ruoyi.system.domain.TestQuestion;
import com.ruoyi.system.service.ITestQuestionService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 测试试题Controller
 * 
 * @author ruoyi
 * @date 2020-12-09
 */
@Controller
@RequestMapping("/system/question")
public class TestQuestionController extends BaseController
{
    private String prefix = "system/question";

    @Autowired
    private ITestQuestionService testQuestionService;

    @RequiresPermissions("system:question:view")
    @GetMapping()
    public String question()
    {
        return prefix + "/question";
    }

    /**
     * 查询测试试题列表
     */
    @RequiresPermissions("system:question:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TestQuestion testQuestion)
    {
        startPage();
        List<TestQuestion> list = testQuestionService.selectTestQuestionList(testQuestion);
        return getDataTable(list);
    }

    /**
     * 导出测试试题列表
     */
    @RequiresPermissions("system:question:export")
    @Log(title = "测试试题", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TestQuestion testQuestion)
    {
        List<TestQuestion> list = testQuestionService.selectTestQuestionList(testQuestion);
        ExcelUtil<TestQuestion> util = new ExcelUtil<TestQuestion>(TestQuestion.class);
        return util.exportExcel(list, "question");
    }

    /**
     * 新增测试试题
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存测试试题
     */
    @RequiresPermissions("system:question:add")
    @Log(title = "测试试题", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TestQuestion testQuestion)
    {
        return toAjax(testQuestionService.insertTestQuestion(testQuestion));
    }

    /**
     * 修改测试试题
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TestQuestion testQuestion = testQuestionService.selectTestQuestionById(id);
        mmap.put("testQuestion", testQuestion);
        return prefix + "/edit";
    }

    /**
     * 修改保存测试试题
     */
    @RequiresPermissions("system:question:edit")
    @Log(title = "测试试题", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TestQuestion testQuestion)
    {
        return toAjax(testQuestionService.updateTestQuestion(testQuestion));
    }

    /**
     * 删除测试试题
     */
    @RequiresPermissions("system:question:remove")
    @Log(title = "测试试题", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(testQuestionService.deleteTestQuestionByIds(ids));
    }
}
