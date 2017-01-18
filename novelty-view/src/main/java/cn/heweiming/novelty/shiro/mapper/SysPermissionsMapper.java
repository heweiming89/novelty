package cn.heweiming.novelty.shiro.mapper;

import java.util.List;

import cn.heweiming.novelty.shiro.model.SysPermissions;

public interface SysPermissionsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysPermissions record);

    SysPermissions selectByPrimaryKey(Integer id);

    List<SysPermissions> selectAll();

    int updateByPrimaryKey(SysPermissions record);
}