package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/*
 *  项目名：    CoolWeather
 *  包名：      com.example.coolweather.db
 *  创建者：    XXX
 *  创建时间：  2019/7/10 9:29
 *  描述：      TODO
 */public class County extends DataSupport {

     private int id;

     private String countyName;

     private String weatherId;

     private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
