package com.service;

import com.bean.Equipment;
import com.bean.EquipmentExample;
import com.mapper.EquipmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipmentServiceImpl implements EquipmentService {
    @Autowired
    private EquipmentMapper equipmentMapper;

    @Override
    public Equipment selectByPrimaryKey(Integer eqId){
        return equipmentMapper.selectByPrimaryKey(eqId);
    }
    @Override
    public  int deleteByPrimaryKey(Integer eqId){
        return equipmentMapper.deleteByPrimaryKey(eqId);
    }
    @Override
    public  int updateByPrimaryKeySelective(Equipment record){
        return equipmentMapper.updateByPrimaryKeySelective(record);
    }
    @Override
    public int insert(Equipment record){
        return equipmentMapper.insert(record);
    }

}





class Test{
    public static void Main(String[] args){
        EquipmentService equipmentService= new EquipmentServiceImpl();

        Equipment equipment = equipmentService.selectByPrimaryKey(250);

        equipmentService.deleteByPrimaryKey(110);
        equipment.setAmount(55623);

        equipmentService.updateByPrimaryKeySelective(equipment);
    }
}