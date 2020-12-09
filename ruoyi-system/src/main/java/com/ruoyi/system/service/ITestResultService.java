package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.TestResult;

/**
 * 测评结果Service接口
 * 
 * @author ruoyi
 * @date 2020-12-09
 */
public interface ITestResultService 
{
    /**
     * 查询测评结果
     * 
     * @param id 测评结果ID
     * @return 测评结果
     */
    public TestResult selectTestResultById(Long id);

    /**
     * 查询测评结果列表
     * 
     * @param testResult 测评结果
     * @return 测评结果集合
     */
    public List<TestResult> selectTestResultList(TestResult testResult);

    /**
     * 新增测评结果
     * 
     * @param testResult 测评结果
     * @return 结果
     */
    public int insertTestResult(TestResult testResult);

    /**
     * 修改测评结果
     * 
     * @param testResult 测评结果
     * @return 结果
     */
    public int updateTestResult(TestResult testResult);

    /**
     * 批量删除测评结果
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTestResultByIds(String ids);

    /**
     * 删除测评结果信息
     * 
     * @param id 测评结果ID
     * @return 结果
     */
    public int deleteTestResultById(Long id);
}
