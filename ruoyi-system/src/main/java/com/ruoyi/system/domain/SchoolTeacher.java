package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 教师管理对象 school_teacher
 * 
 * @author ruoyi
 * @date 2020-12-09
 */
public class SchoolTeacher extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 班主任名字 */
    @Excel(name = "班主任名字")
    private String leaderName;

    /** 讲师名字 */
    @Excel(name = "讲师名字")
    private String teacherName;

    /** $column.columnComment */
    @Excel(name = "讲师名字")
    private Long gardeid;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setLeaderName(String leaderName) 
    {
        this.leaderName = leaderName;
    }

    public String getLeaderName() 
    {
        return leaderName;
    }
    public void setTeacherName(String teacherName) 
    {
        this.teacherName = teacherName;
    }

    public String getTeacherName() 
    {
        return teacherName;
    }
    public void setGardeid(Long gardeid) 
    {
        this.gardeid = gardeid;
    }

    public Long getGardeid() 
    {
        return gardeid;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("leaderName", getLeaderName())
            .append("teacherName", getTeacherName())
            .append("gardeid", getGardeid())
            .toString();
    }
}
