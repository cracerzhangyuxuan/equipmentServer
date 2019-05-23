package com.test;
/*
 *@auther suger
 *2019
 *17:33
 */

import com.service.demoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:config/applicationContext.xml")
public class categoryTest {

    @Autowired
    private demoService demoService;

    @Test
    public void test1(){
        demoService.testcheck();
        System.out.println("success");
    }
}
