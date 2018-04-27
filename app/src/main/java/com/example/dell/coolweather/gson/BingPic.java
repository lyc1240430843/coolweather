package com.example.dell.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by dell on 2018/4/24.
 */

public class BingPic {
    /**
     * {"images":[{"startdate":"20180423",
     *      "fullstartdate":"201804231600",
     *      "enddate":"20180424",
     *      "url":"/az/hprichbg/rb/SatelliteGlades_ZH-CN11389308210_1920x1080.jpg",
     *      "urlbase":"/az/hprichbg/rb/SatelliteGlades_ZH-CN11389308210",
     *      "copyright":"大沼泽地国家公园的卫星视图，佛罗里达州 (© Satellite Earth Art/Aurora Photos)",
     *      "copyrightlink":"http://www.bing.com/search?q=%E5%A4%A7%E6%B2%BC%E6%B3%BD%E5%9C%B0%E5%9B%BD%E5%AE%B6%E5%85%AC%E5%9B%AD&form=hpcapt&mkt=zh-cn",
     *      "quiz":"/search?q=Bing+homepage+quiz&filters=WQOskey:%22HPQuiz_20180423_SatelliteGlades%22&FORM=HPQUIZ",
     *      "wp":true,"hsh":"9926603351c94d203e7d9e7e8d7c9518",
     *      "drk":1,"top":1,"bot":1,"hs":[]}],
     *      "tooltips":
     *          {"loading":"正在加载...","previous":"上一个图像","next":"下一个图像",
     *          "walle":"此图片不能下载用作壁纸。","walls":"下载今日美图。仅限用作桌面壁纸。"}}
     */
    @SerializedName("images")
    public List<BaseBingPic> images;
    public class BaseBingPic{
        @SerializedName("url")
        public String url;
        @SerializedName("copyright")
        public String copyRight;
    }
}
