package com.controller;
/*
 *@auther suger
 *2019
 *23:11
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "test",produces = "application/json;charset=utf-8")
public class testController {

    @RequestMapping(value = "hello")
    @ResponseBody
    public String test(){
        return "Hello World!";
    }
}
