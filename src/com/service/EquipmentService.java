package com.service;

import java.util.*;
import com.bean.Equipment;
import com.bean.EquipmentExample;

public interface EquipmentService {

    /**
     * 查找
     * @param eqId  设备ID
     * @return  返回设备equipment
     */
     Equipment selectByPrimaryKey(Integer eqId);

    /**
     * 删除
     * @param eqId 设备ID
     * @return 受影响的条件
     */
      int deleteByPrimaryKey(Integer eqId);

    /**
     * 修改信息
     * @param record 修改的记录
     * @return 受影响的条件
     */
      int updateByPrimaryKeySelective(Equipment record);

    /**
     * 插入
     * @param record 修改的记录
     * @return  受影响的条件
      */
      int insert(Equipment record);

    /**
     * 统计数量
     * @param example 设备对象
     * @return 返回数量
     */
    long countByExample(EquipmentExample example);
}
