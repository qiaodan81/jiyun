package com.ruoyi.system.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 测评结果对象 test_result
 * 
 * @author ruoyi
 * @date 2020-12-09
 */
public class TestResult extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 分数 */
    @Excel(name = "分数")
    private Long score;

    /** 应到人数 */
    @Excel(name = "应到人数")
    private Long shouldPserson;

    /** 实到人数 */
    @Excel(name = "实到人数")
    private Long actualPerson;

    /** 出勤率 */
    @Excel(name = "出勤率")
    private String perWork;

    /** 开始时间 */
    @Excel(name = "开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date startTime;

    /** 结束时间 */
    @Excel(name = "结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date endTime;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setScore(Long score) 
    {
        this.score = score;
    }

    public Long getScore() 
    {
        return score;
    }
    public void setShouldPserson(Long shouldPserson) 
    {
        this.shouldPserson = shouldPserson;
    }

    public Long getShouldPserson() 
    {
        return shouldPserson;
    }
    public void setActualPerson(Long actualPerson) 
    {
        this.actualPerson = actualPerson;
    }

    public Long getActualPerson() 
    {
        return actualPerson;
    }
    public void setPerWork(String perWork) 
    {
        this.perWork = perWork;
    }

    public String getPerWork() 
    {
        return perWork;
    }
    public void setStartTime(Date startTime) 
    {
        this.startTime = startTime;
    }

    public Date getStartTime() 
    {
        return startTime;
    }
    public void setEndTime(Date endTime) 
    {
        this.endTime = endTime;
    }

    public Date getEndTime() 
    {
        return endTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("score", getScore())
            .append("shouldPserson", getShouldPserson())
            .append("actualPerson", getActualPerson())
            .append("perWork", getPerWork())
            .append("startTime", getStartTime())
            .append("endTime", getEndTime())
            .toString();
    }
}
