package com.demo;

/**
 * Created by zwy on 18/4/11.
 */

/*
* 一个天气数据类
* */
public class WeatherData {
    private float mTemperatrue;
    private float mPressure;
    private float mHumidity;
    private CurrentConditions currentConditions;

    public WeatherData(CurrentConditions currentConditions) {
        this.currentConditions = currentConditions;
    }

    public float getTemperatrue() {
        return mTemperatrue;
    }

    public float getPressure() {
        return mPressure;
    }

    public float getHumidity() {
        return mHumidity;
    }

    public void dataChange() {
        currentConditions.update(getTemperatrue(), getPressure(), getHumidity());
    }

//    调用dataChange通知天气信息
    public void setData(float mTemperatrue, float mPressure, float mHumidity) {
        this.mTemperatrue = mTemperatrue;
        this.mPressure = mPressure;
        this.mHumidity = mHumidity;
        dataChange();
    }
}
