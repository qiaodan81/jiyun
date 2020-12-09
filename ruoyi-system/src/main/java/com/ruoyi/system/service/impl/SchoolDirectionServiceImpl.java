package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SchoolDirectionMapper;
import com.ruoyi.system.domain.SchoolDirection;
import com.ruoyi.system.service.ISchoolDirectionService;
import com.ruoyi.common.core.text.Convert;

/**
 * 方向Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-09
 */
@Service
public class SchoolDirectionServiceImpl implements ISchoolDirectionService 
{
    @Autowired
    private SchoolDirectionMapper schoolDirectionMapper;

    /**
     * 查询方向
     * 
     * @param id 方向ID
     * @return 方向
     */
    @Override
    public SchoolDirection selectSchoolDirectionById(Long id)
    {
        return schoolDirectionMapper.selectSchoolDirectionById(id);
    }

    /**
     * 查询方向列表
     * 
     * @param schoolDirection 方向
     * @return 方向
     */
    @Override
    public List<SchoolDirection> selectSchoolDirectionList(SchoolDirection schoolDirection)
    {
        return schoolDirectionMapper.selectSchoolDirectionList(schoolDirection);
    }

    /**
     * 新增方向
     * 
     * @param schoolDirection 方向
     * @return 结果
     */
    @Override
    public int insertSchoolDirection(SchoolDirection schoolDirection)
    {
        return schoolDirectionMapper.insertSchoolDirection(schoolDirection);
    }

    /**
     * 修改方向
     * 
     * @param schoolDirection 方向
     * @return 结果
     */
    @Override
    public int updateSchoolDirection(SchoolDirection schoolDirection)
    {
        return schoolDirectionMapper.updateSchoolDirection(schoolDirection);
    }

    /**
     * 删除方向对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteSchoolDirectionByIds(String ids)
    {
        return schoolDirectionMapper.deleteSchoolDirectionByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除方向信息
     * 
     * @param id 方向ID
     * @return 结果
     */
    @Override
    public int deleteSchoolDirectionById(Long id)
    {
        return schoolDirectionMapper.deleteSchoolDirectionById(id);
    }
}
