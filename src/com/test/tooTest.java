package com.test;
/*
 *@auther suger
 *2019
 *15:19
 */

import com.alibaba.fastjson.JSONObject;
import com.tools.deleteSource;
import org.junit.Test;
import com.tools.callBack;
public class tooTest {

    @Test
    public void Test1(){
        Integer code=2000;
        JSONObject data=new JSONObject();
        data.put("name","小明");
        data.put("age",99);
        String errMsg="OK";
        System.out.println(callBack.resFun(code,data,errMsg).toJSONString());
    }

    @Test
    public void Test2(){
        String path="D:\\documents\\study\\zipfile\\线代学霸笔记";
        deleteSource.deleteDir(path);
    }
}
