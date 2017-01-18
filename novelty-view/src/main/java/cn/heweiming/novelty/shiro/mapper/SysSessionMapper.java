package cn.heweiming.novelty.shiro.mapper;

import java.util.List;

import cn.heweiming.novelty.shiro.model.SysSession;

public interface SysSessionMapper {
    int deleteByPrimaryKey(String id);

    int insert(SysSession record);

    SysSession selectByPrimaryKey(String id);

    List<SysSession> selectAll();

    int updateByPrimaryKey(SysSession record);
}