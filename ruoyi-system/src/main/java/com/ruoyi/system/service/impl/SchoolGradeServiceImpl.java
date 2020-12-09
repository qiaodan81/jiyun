package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SchoolGradeMapper;
import com.ruoyi.system.domain.SchoolGrade;
import com.ruoyi.system.service.ISchoolGradeService;
import com.ruoyi.common.core.text.Convert;

/**
 * 班级Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-09
 */
@Service
public class SchoolGradeServiceImpl implements ISchoolGradeService 
{
    @Autowired
    private SchoolGradeMapper schoolGradeMapper;

    /**
     * 查询班级
     * 
     * @param id 班级ID
     * @return 班级
     */
    @Override
    public SchoolGrade selectSchoolGradeById(Long id)
    {
        return schoolGradeMapper.selectSchoolGradeById(id);
    }

    /**
     * 查询班级列表
     * 
     * @param schoolGrade 班级
     * @return 班级
     */
    @Override
    public List<SchoolGrade> selectSchoolGradeList(SchoolGrade schoolGrade)
    {
        return schoolGradeMapper.selectSchoolGradeList(schoolGrade);
    }

    /**
     * 新增班级
     * 
     * @param schoolGrade 班级
     * @return 结果
     */
    @Override
    public int insertSchoolGrade(SchoolGrade schoolGrade)
    {
        return schoolGradeMapper.insertSchoolGrade(schoolGrade);
    }

    /**
     * 修改班级
     * 
     * @param schoolGrade 班级
     * @return 结果
     */
    @Override
    public int updateSchoolGrade(SchoolGrade schoolGrade)
    {
        return schoolGradeMapper.updateSchoolGrade(schoolGrade);
    }

    /**
     * 删除班级对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteSchoolGradeByIds(String ids)
    {
        return schoolGradeMapper.deleteSchoolGradeByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除班级信息
     * 
     * @param id 班级ID
     * @return 结果
     */
    @Override
    public int deleteSchoolGradeById(Long id)
    {
        return schoolGradeMapper.deleteSchoolGradeById(id);
    }
}
