package com.heweiming.novelty.mapper;

import com.heweiming.novelty.model.Permissions;
import com.heweiming.novelty.model.PermissionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface PermissionsMapper {
    long countByExample(PermissionsExample example);

    int deleteByExample(PermissionsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Permissions record);

    int insertSelective(Permissions record);

    List<Permissions> selectByExampleWithRowbounds(PermissionsExample example, RowBounds rowBounds);

    List<Permissions> selectByExample(PermissionsExample example);

    Permissions selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Permissions record, @Param("example") PermissionsExample example);

    int updateByExample(@Param("record") Permissions record, @Param("example") PermissionsExample example);

    int updateByPrimaryKeySelective(Permissions record);

    int updateByPrimaryKey(Permissions record);
}