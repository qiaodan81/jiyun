package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 班级对象 school_grade
 * 
 * @author ruoyi
 * @date 2020-12-09
 */
public class SchoolGrade extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 班级名 */
    @Excel(name = "班级名")
    private String gradeName;

    /** 人数 */
    @Excel(name = "人数")
    private String population;

    /** 教学周期 */
    @Excel(name = "教学周期")
    private String term;

    /** 方向外键 */
    @Excel(name = "方向外键")
    private Long directionid;

    /** 测评结果外键 */
    @Excel(name = "测评结果外键")
    private Long resultid;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setGradeName(String gradeName) 
    {
        this.gradeName = gradeName;
    }

    public String getGradeName() 
    {
        return gradeName;
    }
    public void setPopulation(String population) 
    {
        this.population = population;
    }

    public String getPopulation() 
    {
        return population;
    }
    public void setTerm(String term) 
    {
        this.term = term;
    }

    public String getTerm() 
    {
        return term;
    }
    public void setDirectionid(Long directionid) 
    {
        this.directionid = directionid;
    }

    public Long getDirectionid() 
    {
        return directionid;
    }
    public void setResultid(Long resultid) 
    {
        this.resultid = resultid;
    }

    public Long getResultid() 
    {
        return resultid;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("gradeName", getGradeName())
            .append("population", getPopulation())
            .append("term", getTerm())
            .append("directionid", getDirectionid())
            .append("resultid", getResultid())
            .toString();
    }
}
