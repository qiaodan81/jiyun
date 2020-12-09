package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.TestQuestionMapper;
import com.ruoyi.system.domain.TestQuestion;
import com.ruoyi.system.service.ITestQuestionService;
import com.ruoyi.common.core.text.Convert;

/**
 * 测试试题Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-09
 */
@Service
public class TestQuestionServiceImpl implements ITestQuestionService 
{
    @Autowired
    private TestQuestionMapper testQuestionMapper;

    /**
     * 查询测试试题
     * 
     * @param id 测试试题ID
     * @return 测试试题
     */
    @Override
    public TestQuestion selectTestQuestionById(Long id)
    {
        return testQuestionMapper.selectTestQuestionById(id);
    }

    /**
     * 查询测试试题列表
     * 
     * @param testQuestion 测试试题
     * @return 测试试题
     */
    @Override
    public List<TestQuestion> selectTestQuestionList(TestQuestion testQuestion)
    {
        return testQuestionMapper.selectTestQuestionList(testQuestion);
    }

    /**
     * 新增测试试题
     * 
     * @param testQuestion 测试试题
     * @return 结果
     */
    @Override
    public int insertTestQuestion(TestQuestion testQuestion)
    {
        testQuestion.setCreateTime(DateUtils.getNowDate());
        return testQuestionMapper.insertTestQuestion(testQuestion);
    }

    /**
     * 修改测试试题
     * 
     * @param testQuestion 测试试题
     * @return 结果
     */
    @Override
    public int updateTestQuestion(TestQuestion testQuestion)
    {
        return testQuestionMapper.updateTestQuestion(testQuestion);
    }

    /**
     * 删除测试试题对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTestQuestionByIds(String ids)
    {
        return testQuestionMapper.deleteTestQuestionByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除测试试题信息
     * 
     * @param id 测试试题ID
     * @return 结果
     */
    @Override
    public int deleteTestQuestionById(Long id)
    {
        return testQuestionMapper.deleteTestQuestionById(id);
    }
}
