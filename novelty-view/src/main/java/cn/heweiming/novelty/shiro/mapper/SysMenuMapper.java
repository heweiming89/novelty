package cn.heweiming.novelty.shiro.mapper;

import java.util.List;

import cn.heweiming.novelty.shiro.model.SysMenu;

public interface SysMenuMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysMenu record);

    SysMenu selectByPrimaryKey(Integer id);

    List<SysMenu> selectAll();

    int updateByPrimaryKey(SysMenu record);
}