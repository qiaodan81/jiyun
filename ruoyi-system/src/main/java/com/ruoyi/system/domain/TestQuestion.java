package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 测试试题对象 test_question
 * 
 * @author ruoyi
 * @date 2020-12-09
 */
public class TestQuestion extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 试卷名称 */
    @Excel(name = "试卷名称")
    private String questionName;

    /** 模型，通用，特定 */
    @Excel(name = "模型，通用，特定")
    private String model;

    /** 问题 */
    @Excel(name = "问题")
    private String question;

    /** 试卷内容json串 */
    @Excel(name = "试卷内容json串")
    private String key;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setQuestionName(String questionName) 
    {
        this.questionName = questionName;
    }

    public String getQuestionName() 
    {
        return questionName;
    }
    public void setModel(String model) 
    {
        this.model = model;
    }

    public String getModel() 
    {
        return model;
    }
    public void setQuestion(String question) 
    {
        this.question = question;
    }

    public String getQuestion() 
    {
        return question;
    }
    public void setKey(String key) 
    {
        this.key = key;
    }

    public String getKey() 
    {
        return key;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("questionName", getQuestionName())
            .append("model", getModel())
            .append("createTime", getCreateTime())
            .append("question", getQuestion())
            .append("key", getKey())
            .toString();
    }
}
