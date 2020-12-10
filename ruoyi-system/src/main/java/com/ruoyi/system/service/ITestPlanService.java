package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.TestPlan;
import com.ruoyi.system.dto.TestPlanDTO;

/**
 * 测试计划Service接口
 * 
 * @author ruoyi
 * @date 2020-12-09
 */
public interface ITestPlanService 
{
    /**
     * 查询测试计划
     * 
     * @param id 测试计划ID
     * @return 测试计划
     */
    public TestPlan selectTestPlanById(Long id);

    /**
     * 查询测试计划列表
     * 
     * @param testPlan 测试计划
     * @return 测试计划集合
     */
    public List<TestPlan> selectTestPlanList(TestPlan testPlan);

    /**
     * 新增测试计划
     * 
     * @param testPlan 测试计划
     * @return 结果
     */
    public int insertTestPlan(TestPlan testPlan);

    /**
     * 修改测试计划
     * 
     * @param testPlan 测试计划
     * @return 结果
     */
    public int updateTestPlan(TestPlan testPlan);

    /**
     * 批量删除测试计划
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTestPlanByIds(String ids);

    /**
     * 删除测试计划信息
     * 
     * @param id 测试计划ID
     * @return 结果
     */
    public int deleteTestPlanById(Long id);

    List<TestPlanDTO> selectTestPlanList2(TestPlanDTO testPlanDTO);
}
