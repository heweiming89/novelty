package cn.heweiming.novelty.shiro.mapper;

import java.util.List;

import cn.heweiming.novelty.shiro.model.SysUser;

public interface SysUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysUser record);

    SysUser selectByPrimaryKey(Integer id);

    List<SysUser> selectAll();

    int updateByPrimaryKey(SysUser record);
}