package cn.heweiming.novelty.shiro.mapper;

import java.util.List;

import cn.heweiming.novelty.shiro.model.SysOperationLog;

public interface SysOperationLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysOperationLog record);

    SysOperationLog selectByPrimaryKey(Integer id);

    List<SysOperationLog> selectAll();

    int updateByPrimaryKey(SysOperationLog record);
}