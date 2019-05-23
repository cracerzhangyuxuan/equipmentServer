package com.mapper;

import com.bean.EqCorrelation;
import com.bean.EqCorrelationExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EqCorrelationMapper {
    long countByExample(EqCorrelationExample example);

    int deleteByExample(EqCorrelationExample example);

    int deleteByPrimaryKey(Integer eqCoId);

    int insert(EqCorrelation record);

    int insertSelective(EqCorrelation record);

    List<EqCorrelation> selectByExample(EqCorrelationExample example);

    EqCorrelation selectByPrimaryKey(Integer eqCoId);

    int updateByExampleSelective(@Param("record") EqCorrelation record, @Param("example") EqCorrelationExample example);

    int updateByExample(@Param("record") EqCorrelation record, @Param("example") EqCorrelationExample example);

    int updateByPrimaryKeySelective(EqCorrelation record);

    int updateByPrimaryKey(EqCorrelation record);
}