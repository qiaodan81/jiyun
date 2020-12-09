package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.SchoolGrade;

/**
 * 班级Service接口
 * 
 * @author ruoyi
 * @date 2020-12-09
 */
public interface ISchoolGradeService 
{
    /**
     * 查询班级
     * 
     * @param id 班级ID
     * @return 班级
     */
    public SchoolGrade selectSchoolGradeById(Long id);

    /**
     * 查询班级列表
     * 
     * @param schoolGrade 班级
     * @return 班级集合
     */
    public List<SchoolGrade> selectSchoolGradeList(SchoolGrade schoolGrade);

    /**
     * 新增班级
     * 
     * @param schoolGrade 班级
     * @return 结果
     */
    public int insertSchoolGrade(SchoolGrade schoolGrade);

    /**
     * 修改班级
     * 
     * @param schoolGrade 班级
     * @return 结果
     */
    public int updateSchoolGrade(SchoolGrade schoolGrade);

    /**
     * 批量删除班级
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteSchoolGradeByIds(String ids);

    /**
     * 删除班级信息
     * 
     * @param id 班级ID
     * @return 结果
     */
    public int deleteSchoolGradeById(Long id);
}
