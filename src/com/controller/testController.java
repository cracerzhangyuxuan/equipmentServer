package com.controller;
/*
 *@auther suger
 *2019
 *23:11
 */

import com.bean.Category;
import com.bean.EqCorrelation;
import com.bean.Equipment;
import com.bean.EquipmentExample;
import com.service.EquipmentService;
import com.service.EquipmentServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

<<<<<<< HEAD

=======
import java.util.List;
>>>>>>> 3ea510837345b02647d78f54e7f37a3e7efcfa06

@Controller
@RequestMapping(value = "test",produces = "application/json;charset=utf-8")
public class testController {

    @Autowired
    private EquipmentService equipmentService;
    @RequestMapping(value = "hello")
    @ResponseBody
    public String test(){
        return "Hello World!";
    }


<<<<<<< HEAD
        


=======
>>>>>>> 3ea510837345b02647d78f54e7f37a3e7efcfa06

}
