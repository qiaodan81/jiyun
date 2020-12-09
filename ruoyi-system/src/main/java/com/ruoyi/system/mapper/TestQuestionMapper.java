package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.TestQuestion;

/**
 * 测试试题Mapper接口
 * 
 * @author ruoyi
 * @date 2020-12-09
 */
public interface TestQuestionMapper 
{
    /**
     * 查询测试试题
     * 
     * @param id 测试试题ID
     * @return 测试试题
     */
    public TestQuestion selectTestQuestionById(Long id);

    /**
     * 查询测试试题列表
     * 
     * @param testQuestion 测试试题
     * @return 测试试题集合
     */
    public List<TestQuestion> selectTestQuestionList(TestQuestion testQuestion);

    /**
     * 新增测试试题
     * 
     * @param testQuestion 测试试题
     * @return 结果
     */
    public int insertTestQuestion(TestQuestion testQuestion);

    /**
     * 修改测试试题
     * 
     * @param testQuestion 测试试题
     * @return 结果
     */
    public int updateTestQuestion(TestQuestion testQuestion);

    /**
     * 删除测试试题
     * 
     * @param id 测试试题ID
     * @return 结果
     */
    public int deleteTestQuestionById(Long id);

    /**
     * 批量删除测试试题
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTestQuestionByIds(String[] ids);
}
