package com.ruoyi.system.controller;

import java.util.List;

import com.ruoyi.system.dto.TestPlanDTO;
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
import com.ruoyi.system.domain.TestPlan;
import com.ruoyi.system.service.ITestPlanService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 测试计划Controller
 * 
 * @author ruoyi
 * @date 2020-12-09
 */
@Controller
@RequestMapping("/system/plan")
public class TestPlanController extends BaseController
{
    private String prefix = "system/plan";

    @Autowired
    private ITestPlanService testPlanService;

    @RequiresPermissions("system:plan:view")
    @GetMapping()
    public String plan()
    {
        return prefix + "/plan";
    }

    /**
     * 查询测试计划列表
     */
//    @RequiresPermissions("system:plan:list")
//    @PostMapping("/list")
//    @ResponseBody
//    public TableDataInfo list(TestPlan testPlan)
//    {
//        startPage();
//        List<TestPlan> list = testPlanService.selectTestPlanList(testPlan);
//        return getDataTable(list);
//    }

    /**
     * 查询测试计划列表自己写
     *
     */
    @RequiresPermissions("system:plan:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list2(TestPlanDTO testPlanDTO)
    {
        startPage();
        List<TestPlanDTO> list = testPlanService.selectTestPlanList2(testPlanDTO);
        return getDataTable(list);
    }

    /**
     * 导出测试计划列表
     */
    @RequiresPermissions("system:plan:export")
    @Log(title = "测试计划", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TestPlan testPlan)
    {
        List<TestPlan> list = testPlanService.selectTestPlanList(testPlan);
        ExcelUtil<TestPlan> util = new ExcelUtil<TestPlan>(TestPlan.class);
        return util.exportExcel(list, "plan");
    }

    /**
     * 新增测试计划
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存测试计划
     */
    @RequiresPermissions("system:plan:add")
    @Log(title = "测试计划", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TestPlan testPlan)
    {
        return toAjax(testPlanService.insertTestPlan(testPlan));
    }

    /**
     * 修改测试计划
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TestPlan testPlan = testPlanService.selectTestPlanById(id);
        mmap.put("testPlan", testPlan);
        return prefix + "/edit";
    }

    /**
     * 修改保存测试计划
     */
    @RequiresPermissions("system:plan:edit")
    @Log(title = "测试计划", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TestPlan testPlan)
    {
        return toAjax(testPlanService.updateTestPlan(testPlan));
    }

    /**
     * 删除测试计划
     */
    @RequiresPermissions("system:plan:remove")
    @Log(title = "测试计划", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(testPlanService.deleteTestPlanByIds(ids));
    }
}
