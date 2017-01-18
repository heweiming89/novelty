package cn.heweiming.novelty.shiro.mapper;

import java.util.List;

import cn.heweiming.novelty.shiro.model.SysUserRoleRelation;

public interface SysUserRoleRelationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysUserRoleRelation record);

    SysUserRoleRelation selectByPrimaryKey(Integer id);

    List<SysUserRoleRelation> selectAll();

    int updateByPrimaryKey(SysUserRoleRelation record);
}