package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 学生对象 school_student
 * 
 * @author ruoyi
 * @date 2020-12-09
 */
public class SchoolStudent extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 学生姓名 */
    @Excel(name = "学生姓名")
    private String studentName;

    /** 本次是否评测状态 */
    @Excel(name = "本次是否评测状态")
    private String status;

    /** type表中所属班级 */
    @Excel(name = "type表中所属班级")
    private Long gradeid;

    /** 所属班主任外键 */
    @Excel(name = "所属班主任外键")
    private Long teacherid;

    /** 学生账户 */
    @Excel(name = "学生账户")
    private String account;

    /** 学生账户密码 */
    @Excel(name = "学生账户密码")
    private String password;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setStudentName(String studentName) 
    {
        this.studentName = studentName;
    }

    public String getStudentName() 
    {
        return studentName;
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
    public void setTeacherid(Long teacherid) 
    {
        this.teacherid = teacherid;
    }

    public Long getTeacherid() 
    {
        return teacherid;
    }
    public void setAccount(String account) 
    {
        this.account = account;
    }

    public String getAccount() 
    {
        return account;
    }
    public void setPassword(String password) 
    {
        this.password = password;
    }

    public String getPassword() 
    {
        return password;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("studentName", getStudentName())
            .append("status", getStatus())
            .append("gradeid", getGradeid())
            .append("teacherid", getTeacherid())
            .append("account", getAccount())
            .append("password", getPassword())
            .toString();
    }
}
