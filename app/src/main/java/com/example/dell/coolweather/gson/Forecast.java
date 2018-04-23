package com.example.dell.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by dell on 2018/4/21.
 */

public class Forecast {
    @SerializedName("date")
    public String date;
    @SerializedName("cond")
    public More more;
    @SerializedName("tmp")
    public Temperature temperature;

    public class More{
        @SerializedName("txt_d")
        public String info;
    }

    public class Temperature{
        @SerializedName("max")
        public String max;
        @SerializedName("min")
        public String min;
    }
}
