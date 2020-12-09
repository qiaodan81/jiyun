package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SchoolStudentMapper;
import com.ruoyi.system.domain.SchoolStudent;
import com.ruoyi.system.service.ISchoolStudentService;
import com.ruoyi.common.core.text.Convert;

/**
 * 学生Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-09
 */
@Service
public class SchoolStudentServiceImpl implements ISchoolStudentService 
{
    @Autowired
    private SchoolStudentMapper schoolStudentMapper;

    /**
     * 查询学生
     * 
     * @param id 学生ID
     * @return 学生
     */
    @Override
    public SchoolStudent selectSchoolStudentById(Long id)
    {
        return schoolStudentMapper.selectSchoolStudentById(id);
    }

    /**
     * 查询学生列表
     * 
     * @param schoolStudent 学生
     * @return 学生
     */
    @Override
    public List<SchoolStudent> selectSchoolStudentList(SchoolStudent schoolStudent)
    {
        return schoolStudentMapper.selectSchoolStudentList(schoolStudent);
    }

    /**
     * 新增学生
     * 
     * @param schoolStudent 学生
     * @return 结果
     */
    @Override
    public int insertSchoolStudent(SchoolStudent schoolStudent)
    {
        return schoolStudentMapper.insertSchoolStudent(schoolStudent);
    }

    /**
     * 修改学生
     * 
     * @param schoolStudent 学生
     * @return 结果
     */
    @Override
    public int updateSchoolStudent(SchoolStudent schoolStudent)
    {
        return schoolStudentMapper.updateSchoolStudent(schoolStudent);
    }

    /**
     * 删除学生对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteSchoolStudentByIds(String ids)
    {
        return schoolStudentMapper.deleteSchoolStudentByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除学生信息
     * 
     * @param id 学生ID
     * @return 结果
     */
    @Override
    public int deleteSchoolStudentById(Long id)
    {
        return schoolStudentMapper.deleteSchoolStudentById(id);
    }
}
