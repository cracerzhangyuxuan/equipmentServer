package com.service;

import com.bean.EqCorrelation;
import com.bean.EqCorrelationExample;

import java.util.List;

public interface EqCorrelationService {

    //增
    public int insertSelective(EqCorrelation record);

    //删
    public int deleteByPrimaryKey(Integer eqCoId);

    //查
    public EqCorrelation selectByPrimaryKey(Integer eqCoId);

    //改
    public int updateByPrimaryKey(EqCorrelation record);

    //获取数据库中所有对象
    public List<EqCorrelation> selectByExample(EqCorrelationExample example);

    //统计数量
    public long countByExample(EqCorrelationExample example);

}
