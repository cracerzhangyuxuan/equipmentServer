package com.service;
/*
 *@auther suger
 *2019
 *17:39
 */

import com.bean.Category;
import com.bean.CategoryExample;
import com.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class DemoServiceImpl implements demoService {

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public void testcheck() {


        Category category = categoryMapper.selectByPrimaryKey(0);

        System.out.println(category==null);
    }
}
