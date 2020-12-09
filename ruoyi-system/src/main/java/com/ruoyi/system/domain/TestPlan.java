package com.ruoyi.system.domain;

import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 测试计划对象 test_plan
 * 
 * @author ruoyi
 * @date 2020-12-09
 */
public class TestPlan extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 某某计划名 */
    @Excel(name = "某某计划名")
    private String planName;

    /** 开始时间 */
    @Excel(name = "开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date startime;

    /** 结束时间 */
    @Excel(name = "结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date endtime;

    /** 状态，1代表已测评，0代表未测评 */
    @Excel(name = "状态，1代表已测评，0代表未测评")
    private String status;

    /** $column.columnComment */
    @Excel(name = "状态，1代表已测评，0代表未测评")
    private Long gradeid;

    /** $column.columnComment */
    @Excel(name = "状态，1代表已测评，0代表未测评")
    private String key;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setPlanName(String planName) 
    {
        this.planName = planName;
    }

    public String getPlanName() 
    {
        return planName;
    }
    public void setStartime(Date startime) 
    {
        this.startime = startime;
    }

    public Date getStartime() 
    {
        return startime;
    }
    public void setEndtime(Date endtime) 
    {
        this.endtime = endtime;
    }

    public Date getEndtime() 
    {
        return endtime;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }
    public void setGradeid(Long gradeid) 
    {
        this.gradeid = gradeid;
    }

    public Long getGradeid() 
    {
        return gradeid;
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
            .append("planName", getPlanName())
            .append("startime", getStartime())
            .append("endtime", getEndtime())
            .append("status", getStatus())
            .append("gradeid", getGradeid())
            .append("key", getKey())
            .toString();
    }
}
