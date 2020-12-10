package com.ruoyi.system.service.impl;

import java.util.List;

import com.ruoyi.system.dto.TestPlanDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.TestPlanMapper;
import com.ruoyi.system.domain.TestPlan;
import com.ruoyi.system.service.ITestPlanService;
import com.ruoyi.common.core.text.Convert;

/**
 * 测试计划Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-09
 */
@Service
public class TestPlanServiceImpl implements ITestPlanService 
{
    @Autowired
    private TestPlanMapper testPlanMapper;

    /**
     * 查询测试计划
     * 
     * @param id 测试计划ID
     * @return 测试计划
     */
    @Override
    public TestPlan selectTestPlanById(Long id)
    {
        return testPlanMapper.selectTestPlanById(id);
    }

    /**
     * 查询测试计划列表
     * 
     * @param testPlan 测试计划
     * @return 测试计划
     */
    @Override
    public List<TestPlan> selectTestPlanList(TestPlan testPlan)
    {
        return testPlanMapper.selectTestPlanList(testPlan);
    }

    /**
     * 新增测试计划
     * 
     * @param testPlan 测试计划
     * @return 结果
     */
    @Override
    public int insertTestPlan(TestPlan testPlan)
    {
        return testPlanMapper.insertTestPlan(testPlan);
    }

    /**
     * 修改测试计划
     * 
     * @param testPlan 测试计划
     * @return 结果
     */
    @Override
    public int updateTestPlan(TestPlan testPlan)
    {
        return testPlanMapper.updateTestPlan(testPlan);
    }

    /**
     * 删除测试计划对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTestPlanByIds(String ids)
    {
        return testPlanMapper.deleteTestPlanByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除测试计划信息
     * 
     * @param id 测试计划ID
     * @return 结果
     */
    @Override
    public int deleteTestPlanById(Long id)
    {
        return testPlanMapper.deleteTestPlanById(id);
    }

    @Override
    public List<TestPlanDTO> selectTestPlanList2(TestPlanDTO testPlanDTO) {
        return testPlanMapper.selectTestPlanList2(testPlanDTO);
    }
}
