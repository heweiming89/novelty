package cn.heweiming.novelty.shiro.mapper;

import java.util.List;

import cn.heweiming.novelty.shiro.model.SysDictionary;

public interface SysDictionaryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysDictionary record);

    SysDictionary selectByPrimaryKey(Integer id);

    List<SysDictionary> selectAll();

    int updateByPrimaryKey(SysDictionary record);
}