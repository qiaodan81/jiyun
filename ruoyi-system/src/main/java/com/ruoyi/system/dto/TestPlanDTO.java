package com.ruoyi.system.dto;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 *
 * @author 乔总专用
 * description:
 * path: ruoyi-com.ruoyi.system.dto-TestPlanDTO
 * date: 2020/12/10 11:32
 * version: 02.06
 * To change this template use File | Settings | File Templates.
 *
 * 测试计划DTO
 *
 *
 */

public class TestPlanDTO {

    //测试计划id
    private Integer testPlanId;

    //测试计划名称
    private String planName;

    //开始时间
    private Date startime;

    //结束时间
    private Date endtime;

    //测试计划状态
    private String testPlanStatus;

    //测试计划的班级名称
    private String gradeName;

    //测试计划的班级id
    private Integer gardeid;

    //测试计划的方向id
    private Integer directionid;

    //测试计划的教学周期
    private String term;

    //测试计划的人数
    private String population;

    //测试计划的校区方向
    private String directionName;

   //测试计划的讲师
    private String teacherName;

    //测试计划的班主任
    private String leaderName;

    @Override
    public String toString() {
        return "TestPlanDTO{" +
                "testPlanId=" + testPlanId +
                ", planName='" + planName + '\'' +
                ", startime=" + startime +
                ", endtime=" + endtime +
                ", testPlanStatus='" + testPlanStatus + '\'' +
                ", gradeName='" + gradeName + '\'' +
                ", gardeid=" + gardeid +
                ", directionid=" + directionid +
                ", term='" + term + '\'' +
                ", population='" + population + '\'' +
                ", directionName='" + directionName + '\'' +
                ", teacherName='" + teacherName + '\'' +
                ", leaderName='" + leaderName + '\'' +
                '}';
    }

    public TestPlanDTO(Integer testPlanId, String planName, Date startime, Date endtime, String testPlanStatus, String gradeName, Integer gardeid, Integer directionid, String term, String population, String directionName, String teacherName, String leaderName) {
        this.testPlanId = testPlanId;
        this.planName = planName;
        this.startime = startime;
        this.endtime = endtime;
        this.testPlanStatus = testPlanStatus;
        this.gradeName = gradeName;
        this.gardeid = gardeid;
        this.directionid = directionid;
        this.term = term;
        this.population = population;
        this.directionName = directionName;
        this.teacherName = teacherName;
        this.leaderName = leaderName;
    }

    public TestPlanDTO() {
    }

    public Integer getTestPlanId() {
        return testPlanId;
    }

    public void setTestPlanId(Integer testPlanId) {
        this.testPlanId = testPlanId;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public Date getStartime() {
        return startime;
    }

    public void setStartime(Date startime) {
        this.startime = startime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getTestPlanStatus() {
        return testPlanStatus;
    }

    public void setTestPlanStatus(String testPlanStatus) {
        this.testPlanStatus = testPlanStatus;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

    public Integer getGardeid() {
        return gardeid;
    }

    public void setGardeid(Integer gardeid) {
        this.gardeid = gardeid;
    }

    public Integer getDirectionid() {
        return directionid;
    }

    public void setDirectionid(Integer directionid) {
        this.directionid = directionid;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getDirectionName() {
        return directionName;
    }

    public void setDirectionName(String directionName) {
        this.directionName = directionName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getLeaderName() {
        return leaderName;
    }

    public void setLeaderName(String leaderName) {
        this.leaderName = leaderName;
    }
}
