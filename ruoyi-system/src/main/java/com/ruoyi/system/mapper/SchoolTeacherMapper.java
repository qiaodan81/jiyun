package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SchoolTeacher;

/**
 * 教师管理Mapper接口
 * 
 * @author ruoyi
 * @date 2020-12-09
 */
public interface SchoolTeacherMapper 
{
    /**
     * 查询教师管理
     * 
     * @param id 教师管理ID
     * @return 教师管理
     */
    public SchoolTeacher selectSchoolTeacherById(Long id);

    /**
     * 查询教师管理列表
     * 
     * @param schoolTeacher 教师管理
     * @return 教师管理集合
     */
    public List<SchoolTeacher> selectSchoolTeacherList(SchoolTeacher schoolTeacher);

    /**
     * 新增教师管理
     * 
     * @param schoolTeacher 教师管理
     * @return 结果
     */
    public int insertSchoolTeacher(SchoolTeacher schoolTeacher);

    /**
     * 修改教师管理
     * 
     * @param schoolTeacher 教师管理
     * @return 结果
     */
    public int updateSchoolTeacher(SchoolTeacher schoolTeacher);

    /**
     * 删除教师管理
     * 
     * @param id 教师管理ID
     * @return 结果
     */
    public int deleteSchoolTeacherById(Long id);

    /**
     * 批量删除教师管理
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteSchoolTeacherByIds(String[] ids);
}
