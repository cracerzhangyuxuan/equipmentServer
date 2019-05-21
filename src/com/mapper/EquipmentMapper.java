package com.mapper;

import com.bean.Equipment;
import com.bean.EquipmentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EquipmentMapper {
    long countByExample(EquipmentExample example);

    int deleteByExample(EquipmentExample example);

    int deleteByPrimaryKey(Integer eqId);

    int insert(Equipment record);

    int insertSelective(Equipment record);

    List<Equipment> selectByExample(EquipmentExample example);

    Equipment selectByPrimaryKey(Integer eqId);

    int updateByExampleSelective(@Param("record") Equipment record, @Param("example") EquipmentExample example);

    int updateByExample(@Param("record") Equipment record, @Param("example") EquipmentExample example);

    int updateByPrimaryKeySelective(Equipment record);

    int updateByPrimaryKey(Equipment record);
}