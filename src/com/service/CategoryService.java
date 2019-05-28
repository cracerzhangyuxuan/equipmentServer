package com.service;

import com.bean.Category;
import com.bean.CategoryExample;
import com.bean.EqCorrelationExample;

import java.util.List;


public interface CategoryService {


   //插入 Category对象
   public int insertSelective(Category record);

   //根据id删除 Category对象
   public int deleteByPrimaryKey(Integer cgId);

   //根据id查询 Category对象
    public Category selectByPrimaryKey(Integer cgId);

   //更改  Category对象信息
   public int updateByPrimaryKey(Category record);

   //获取数据库中所有对象
   public List<Category> selectByExample(CategoryExample example);

   //统计数量
   public long countByExample(CategoryExample example);
}
