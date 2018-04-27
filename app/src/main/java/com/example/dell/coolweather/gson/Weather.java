package com.example.dell.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by dell on 2018/4/21.
 *
 * 这是总实例类 来引用各个实体类
 */

public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;


    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
