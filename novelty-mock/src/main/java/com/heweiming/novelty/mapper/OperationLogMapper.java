package com.heweiming.novelty.mapper;

import com.heweiming.novelty.model.OperationLog;
import com.heweiming.novelty.model.OperationLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface OperationLogMapper {
    long countByExample(OperationLogExample example);

    int deleteByExample(OperationLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OperationLog record);

    int insertSelective(OperationLog record);

    List<OperationLog> selectByExampleWithRowbounds(OperationLogExample example, RowBounds rowBounds);

    List<OperationLog> selectByExample(OperationLogExample example);

    OperationLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OperationLog record, @Param("example") OperationLogExample example);

    int updateByExample(@Param("record") OperationLog record, @Param("example") OperationLogExample example);

    int updateByPrimaryKeySelective(OperationLog record);

    int updateByPrimaryKey(OperationLog record);
}