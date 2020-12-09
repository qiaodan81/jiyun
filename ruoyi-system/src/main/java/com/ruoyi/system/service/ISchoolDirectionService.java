package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.SchoolDirection;

/**
 * 方向Service接口
 * 
 * @author ruoyi
 * @date 2020-12-09
 */
public interface ISchoolDirectionService 
{
    /**
     * 查询方向
     * 
     * @param id 方向ID
     * @return 方向
     */
    public SchoolDirection selectSchoolDirectionById(Long id);

    /**
     * 查询方向列表
     * 
     * @param schoolDirection 方向
     * @return 方向集合
     */
    public List<SchoolDirection> selectSchoolDirectionList(SchoolDirection schoolDirection);

    /**
     * 新增方向
     * 
     * @param schoolDirection 方向
     * @return 结果
     */
    public int insertSchoolDirection(SchoolDirection schoolDirection);

    /**
     * 修改方向
     * 
     * @param schoolDirection 方向
     * @return 结果
     */
    public int updateSchoolDirection(SchoolDirection schoolDirection);

    /**
     * 批量删除方向
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteSchoolDirectionByIds(String ids);

    /**
     * 删除方向信息
     * 
     * @param id 方向ID
     * @return 结果
     */
    public int deleteSchoolDirectionById(Long id);
}
