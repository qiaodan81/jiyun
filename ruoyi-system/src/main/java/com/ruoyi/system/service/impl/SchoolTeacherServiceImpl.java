package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SchoolTeacherMapper;
import com.ruoyi.system.domain.SchoolTeacher;
import com.ruoyi.system.service.ISchoolTeacherService;
import com.ruoyi.common.core.text.Convert;

/**
 * 教师管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-09
 */
@Service
public class SchoolTeacherServiceImpl implements ISchoolTeacherService 
{
    @Autowired
    private SchoolTeacherMapper schoolTeacherMapper;

    /**
     * 查询教师管理
     * 
     * @param id 教师管理ID
     * @return 教师管理
     */
    @Override
    public SchoolTeacher selectSchoolTeacherById(Long id)
    {
        return schoolTeacherMapper.selectSchoolTeacherById(id);
    }

    /**
     * 查询教师管理列表
     * 
     * @param schoolTeacher 教师管理
     * @return 教师管理
     */
    @Override
    public List<SchoolTeacher> selectSchoolTeacherList(SchoolTeacher schoolTeacher)
    {
        return schoolTeacherMapper.selectSchoolTeacherList(schoolTeacher);
    }

    /**
     * 新增教师管理
     * 
     * @param schoolTeacher 教师管理
     * @return 结果
     */
    @Override
    public int insertSchoolTeacher(SchoolTeacher schoolTeacher)
    {
        return schoolTeacherMapper.insertSchoolTeacher(schoolTeacher);
    }

    /**
     * 修改教师管理
     * 
     * @param schoolTeacher 教师管理
     * @return 结果
     */
    @Override
    public int updateSchoolTeacher(SchoolTeacher schoolTeacher)
    {
        return schoolTeacherMapper.updateSchoolTeacher(schoolTeacher);
    }

    /**
     * 删除教师管理对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteSchoolTeacherByIds(String ids)
    {
        return schoolTeacherMapper.deleteSchoolTeacherByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除教师管理信息
     * 
     * @param id 教师管理ID
     * @return 结果
     */
    @Override
    public int deleteSchoolTeacherById(Long id)
    {
        return schoolTeacherMapper.deleteSchoolTeacherById(id);
    }
}
