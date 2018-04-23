package com.example.dell.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by dell on 2018/4/21.
 */

public class AQI {
    /**
     * "aqi":{
     *     "city":{
     *         "aqi":"44",
     *         "pm25":"13"
     *     }
     * }
     */
    @SerializedName("city")
    public AQICity city;
    public class AQICity{
        //TODO 跟书上不一样
        @SerializedName("aqi")
        public String aqi;
        @SerializedName("pm25")
        public String pm25;
    }

}
