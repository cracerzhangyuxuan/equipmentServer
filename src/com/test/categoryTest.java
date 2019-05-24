package com.test;
/*
 *@auther suger
 *2019
 *17:33
 */

import com.bean.Category;
import com.bean.CategoryExample;
import com.service.CategoryService;
import com.service.demoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:config/applicationContext.xml")
public class categoryTest {

    @Autowired
    private demoService demoService;
    @Autowired
    private CategoryService CategoryService;


    @Test
    public void test1(){
        demoService.testcheck();
        System.out.println("success1");

    }

    @Test
    public void insertSelectiveiveTest(){

        CategoryExample CategoryExample1=new CategoryExample();
        CategoryExample1.or().andCgIdIsNotNull();
        long count=CategoryService.countByExample(CategoryExample1);
        Category record=new Category();
        if(count==0){
            record.setCgId(1);
        }
        record.setCgAdmin("admin123");
        record.setCgDate(new Date());
        record.setCgName("音响类");
        CategoryService.insertSelective(record);
        System.out.println(count);
        System.out.println("success2");

    }

    @Test
    public void deleteByPrimaryKeyTest(){

        Integer cgid=2;
        Category category=CategoryService.selectByPrimaryKey(cgid);
        if(category!=null) {
            CategoryService.deleteByPrimaryKey(cgid);
            System.out.println("success3");
        }
        else
            System.out.println("无此种类");

    }

    @Test
    public void selectByPrimaryKeyTest(){

        Category category=CategoryService.selectByPrimaryKey(1);
        if(category!=null)
            System.out.println(category.toString());
        else
            System.out.println("无此种类");
        System.out.println("success4");

    }
    @Test
    public void updateByPrimaryKeyTest(){

        Category category=CategoryService.selectByPrimaryKey(2);
        if(category==null)
            System.out.println("无此种类");
        else {
            category.setCgName("相机类");
            category.setCgDate(new Date());
            category.setCgAdmin("admin456");
            CategoryService.updateByPrimaryKey(category);
        }
        System.out.println("success5");
    }

    @Test
    public void selectByExampleTest(){

        CategoryExample categoryExample1=new CategoryExample();

        categoryExample1.or().andCgIdIsNotNull();

        List<Category> CategoryList=CategoryService.selectByExample(categoryExample1);

        for (Category eq:
                CategoryList) {

            System.out.println(eq.toString());


        }
        System.out.println("success6");

    }
}
