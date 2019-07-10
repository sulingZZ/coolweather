package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/*
 *  项目名：    CoolWeather
 *  包名：      com.example.coolweather.db
 *  创建者：    XXX
 *  创建时间：  2019/7/10 9:23
 *  描述：      TODO
 */public class Province extends DataSupport {

     private int id;

     private String provinceName;

     private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
