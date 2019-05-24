package com.service;


import com.bean.Category;
import com.bean.CategoryExample;
import com.mapper.CategoryMapper;
import org.apache.taglibs.standard.tei.ForEachTEI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CategoryServicelmpl implements CategoryService{


    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public int insertSelective(Category record) {

            return categoryMapper.insertSelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer cgId) {

        return categoryMapper.deleteByPrimaryKey(cgId);

    }

    @Override
    public Category selectByPrimaryKey(Integer cgId) {

        return categoryMapper.selectByPrimaryKey(cgId);
    }

    @Override
    public int updateByPrimaryKey(Category record) {
        return categoryMapper.updateByPrimaryKey(record);

    }

    @Override
    public List<Category> selectByExample(CategoryExample example){
        return categoryMapper.selectByExample(example);
    }

    @Override
    public long countByExample(CategoryExample example) {
        return categoryMapper.countByExample(example);
    }


}
