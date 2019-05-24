package com.service;

import java.util.*;
import com.bean.Equipment;
import com.bean.EquipmentExample;

public interface EquipmentService {

     Equipment selectByPrimaryKey(Integer eqId);
     int deleteByPrimaryKey(Integer eqId);
    int updateByPrimaryKeySelective(Equipment record);
    int insert(Equipment record);
}
