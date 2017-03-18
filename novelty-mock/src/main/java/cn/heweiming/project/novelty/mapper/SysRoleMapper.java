package cn.heweiming.project.novelty.mapper;

import cn.heweiming.project.novelty.model.SysRole;
import java.util.List;

public interface SysRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysRole record);

    SysRole selectByPrimaryKey(Integer id);

    List<SysRole> selectAll();

    int updateByPrimaryKey(SysRole record);
}