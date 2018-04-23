package com.example.dell.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by dell on 2018/4/21.
 */

public class Basic {

    /**
     * 这里给出json的具体内容举例
     * "basic":{
     *     "city":"苏州"
     *     "id":CN101190401
     *     "update":{
     *         "loc":"2016-08-08 21:58"
     *     }
     * }
     *根据这个来设计下面对应的java参数和类
     */
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    @SerializedName("update")
    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
