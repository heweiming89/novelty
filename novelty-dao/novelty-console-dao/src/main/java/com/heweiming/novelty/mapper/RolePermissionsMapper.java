package com.heweiming.novelty.mapper;

import com.heweiming.novelty.model.RolePermissions;
import com.heweiming.novelty.model.RolePermissionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface RolePermissionsMapper {
    long countByExample(RolePermissionsExample example);

    int deleteByExample(RolePermissionsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RolePermissions record);

    int insertSelective(RolePermissions record);

    List<RolePermissions> selectByExampleWithRowbounds(RolePermissionsExample example, RowBounds rowBounds);

    List<RolePermissions> selectByExample(RolePermissionsExample example);

    RolePermissions selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RolePermissions record, @Param("example") RolePermissionsExample example);

    int updateByExample(@Param("record") RolePermissions record, @Param("example") RolePermissionsExample example);

    int updateByPrimaryKeySelective(RolePermissions record);

    int updateByPrimaryKey(RolePermissions record);
}