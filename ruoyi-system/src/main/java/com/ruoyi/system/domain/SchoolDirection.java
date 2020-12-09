package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 方向对象 school_direction
 * 
 * @author ruoyi
 * @date 2020-12-09
 */
public class SchoolDirection extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 具体的方向名字 */
    @Excel(name = "具体的方向名字")
    private String directionName;

    /** 自关联外键 */
    @Excel(name = "自关联外键")
    private Long pid;

    /** 阶段：如入学教育、实训 */
    @Excel(name = "阶段：如入学教育、实训")
    private String stage;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setDirectionName(String directionName) 
    {
        this.directionName = directionName;
    }

    public String getDirectionName() 
    {
        return directionName;
    }
    public void setPid(Long pid) 
    {
        this.pid = pid;
    }

    public Long getPid() 
    {
        return pid;
    }
    public void setStage(String stage) 
    {
        this.stage = stage;
    }

    public String getStage() 
    {
        return stage;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("directionName", getDirectionName())
            .append("pid", getPid())
            .append("stage", getStage())
            .toString();
    }
}
