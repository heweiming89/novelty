package com.heweiming.novelty.mapper;

import com.heweiming.novelty.model.Session;
import com.heweiming.novelty.model.SessionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface SessionMapper {
    long countByExample(SessionExample example);

    int deleteByExample(SessionExample example);

    int deleteByPrimaryKey(String id);

    int insert(Session record);

    int insertSelective(Session record);

    List<Session> selectByExampleWithRowbounds(SessionExample example, RowBounds rowBounds);

    List<Session> selectByExample(SessionExample example);

    Session selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Session record, @Param("example") SessionExample example);

    int updateByExample(@Param("record") Session record, @Param("example") SessionExample example);

    int updateByPrimaryKeySelective(Session record);

    int updateByPrimaryKey(Session record);
}