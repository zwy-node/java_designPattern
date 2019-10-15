package com.com.javaInside;

import com.observerPattern.Observer;

import java.util.ArrayList;
import java.util.Observable;

/**
 * Created by zwy on 18/4/12.
 */
public class WeatherData extends Observable{
    private float mTemperatrue;
    private float mPressure;
    private float mHumidity;
    private ArrayList<Observer> observers;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    public float getTemperature() {
        return mTemperatrue;
    }

    public float getPressure() {
        return mPressure;
    }

    public float getHumidity() {
        return mHumidity;
    }

    public void  dataChange() {
        this.setChanged();
        //消息更新，通知所有观察者
        this.notifyObservers(new Data(getTemperature(), getPressure(), getHumidity()));
    }


    //    调用dataChange通知天气信息
    public void setData(float mTemperatrue, float mPressure, float mHumidity) {
        this.mTemperatrue = mTemperatrue;
        this.mPressure = mPressure;
        this.mHumidity = mHumidity;
        dataChange();
    }

    public class Data {
        public float mTemperatrue;
        public float mPressure;
        public float mHumidity;

        public Data(float mTemperatrue, float mPressure, float mHumidity) {
            this.mTemperatrue = mTemperatrue;
            this.mPressure = mPressure;
            this.mHumidity = mHumidity;
        }
    }
}
