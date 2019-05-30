package com.tools;
/*
 *@auther suger
 *2019
 *15:16
 */

import com.alibaba.fastjson.JSONObject;

public class callBack {

    /**
     * 生成回调内容模板
     * @param code 状态码
     * @param data 返回的数据
     * @param errMsg 错误信息
     * @return JSONObject
     */
    public static JSONObject resFun(Integer code, JSONObject data,String errMsg){
        JSONObject res=new JSONObject();
        res.put("code",code);
        res.put("data",data);
        res.put("errMsg",errMsg);
        return res;
    }
}
