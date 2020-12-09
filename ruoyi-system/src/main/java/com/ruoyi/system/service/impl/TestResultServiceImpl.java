package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.TestResultMapper;
import com.ruoyi.system.domain.TestResult;
import com.ruoyi.system.service.ITestResultService;
import com.ruoyi.common.core.text.Convert;

/**
 * 测评结果Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-09
 */
@Service
public class TestResultServiceImpl implements ITestResultService 
{
    @Autowired
    private TestResultMapper testResultMapper;

    /**
     * 查询测评结果
     * 
     * @param id 测评结果ID
     * @return 测评结果
     */
    @Override
    public TestResult selectTestResultById(Long id)
    {
        return testResultMapper.selectTestResultById(id);
    }

    /**
     * 查询测评结果列表
     * 
     * @param testResult 测评结果
     * @return 测评结果
     */
    @Override
    public List<TestResult> selectTestResultList(TestResult testResult)
    {
        return testResultMapper.selectTestResultList(testResult);
    }

    /**
     * 新增测评结果
     * 
     * @param testResult 测评结果
     * @return 结果
     */
    @Override
    public int insertTestResult(TestResult testResult)
    {
        return testResultMapper.insertTestResult(testResult);
    }

    /**
     * 修改测评结果
     * 
     * @param testResult 测评结果
     * @return 结果
     */
    @Override
    public int updateTestResult(TestResult testResult)
    {
        return testResultMapper.updateTestResult(testResult);
    }

    /**
     * 删除测评结果对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTestResultByIds(String ids)
    {
        return testResultMapper.deleteTestResultByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除测评结果信息
     * 
     * @param id 测评结果ID
     * @return 结果
     */
    @Override
    public int deleteTestResultById(Long id)
    {
        return testResultMapper.deleteTestResultById(id);
    }
}
