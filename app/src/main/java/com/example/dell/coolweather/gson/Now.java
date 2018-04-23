package com.example.dell.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by dell on 2018/4/21.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;
    public class More{

        @SerializedName("txt")
        public String info;
    }
}
