package com.test;
/*
 *@auther suger
 *2019
 *17:33
 */

import com.bean.Equipment;
import com.bean.EquipmentExample;
import com.service.EquipmentService;
import com.service.demoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.crypto.Data;
import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:config/applicationContext.xml")
public class equipmentTest {

    @Autowired
    private demoService demoService;

    @Autowired
    EquipmentService equipmentService;
    EquipmentExample equipmentExample;

    @Test
    public void selectByPrimaryKeyTest(){
        Integer eqid=1;
        Equipment equipment=equipmentService.selectByPrimaryKey(eqid);
        if(equipment!=null){
            //  equipmentService.deleteByPrimaryKey(eqid);
            System.out.println("查询成功");
        }else System.out.println("查询失败");
    }
    @Test
    public void deleteByPrimaryKeyTest(){
        Integer eqid=1;
        Equipment equipment=equipmentService.selectByPrimaryKey(eqid);
        if(equipment!=null){
           int i= equipmentService.deleteByPrimaryKey(eqid);
            System.out.println("删除成功"+i);
        }else System.out.println("查询失败");
    }
    @Test
    public  void updateByPrimaryKeyTest(){
       String st="小明明";
        Equipment  equipment=equipmentService.selectByPrimaryKey(1);
        equipment.setAmount(9);
        equipment.setEqName(st);
       int i= equipmentService.updateByPrimaryKeySelective(equipment);
        if(i>0) {
            System.out.println("修改成功"+i);
        }
        else {
            System.out.println("修改失败");
        }
    }
    @Test
    public  void  insertSelectiveTest(){
        String str="小明明";
        Equipment  equipment=new Equipment();
        equipment.setEqName(str);
        equipment.setAmount(9);
        equipment.setCategoryId(6);
        equipment.setEqAdmin("李华");
        equipment.setEqDate(new Date());
        equipment.setImages("[]");
        int i= equipmentService.insert(equipment);
        if(i>0) {
            System.out.println("插入成功"+i);
        }
        else {
            System.out.println("插入失败");
        }
    }
}
