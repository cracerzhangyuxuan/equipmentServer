package com.service;

import com.bean.EqCorrelation;
import com.bean.EqCorrelationExample;
import com.mapper.EqCorrelationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EqCorrelationServicelmpl implements  EqCorrelationService{

    @Autowired
    private EqCorrelationMapper EqCorrelationMapper;

    @Override
    public int insertSelective(EqCorrelation record) {
        return EqCorrelationMapper.insertSelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer eqCoId) {
        return EqCorrelationMapper.deleteByPrimaryKey(eqCoId);
    }

    @Override
    public EqCorrelation selectByPrimaryKey(Integer eqCoId) {
        return EqCorrelationMapper.selectByPrimaryKey(eqCoId);
    }

    @Override
    public int updateByPrimaryKey(EqCorrelation record) {
        return EqCorrelationMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<EqCorrelation> selectByExample(EqCorrelationExample example) {

        return EqCorrelationMapper.selectByExample(example);
    }

    @Override
    public long countByExample(EqCorrelationExample example) {
        return EqCorrelationMapper.countByExample(example);
    }
}
