package cn.heweiming.novelty.shiro.mapper;

import java.util.List;

import cn.heweiming.novelty.shiro.model.SysLoginLog;

public interface SysLoginLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysLoginLog record);

    SysLoginLog selectByPrimaryKey(Integer id);

    List<SysLoginLog> selectAll();

    int updateByPrimaryKey(SysLoginLog record);
}