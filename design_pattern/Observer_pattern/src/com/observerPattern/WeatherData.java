package com.observerPattern;

import java.util.ArrayList;

/**
 * 被观察者，也就是微信公众号服务
 * 实现了Observerable接口，对Observerable接口的三个方法进行了具体实现
 * @author zwy
 *
 */
public class WeatherData implements Subject{
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
        //消息更新，通知所有观察者
        notifyObservers();
    }

    //    调用dataChange通知天气信息
    public void setData(float mTemperatrue, float mPressure, float mHumidity) {
        this.mTemperatrue = mTemperatrue;
        this.mPressure = mPressure;
        this.mHumidity = mHumidity;
        dataChange();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if(observers.contains(o)) {
            observers.remove(o);
        }
    }

    @Override
    public void notifyObservers() {
        int len = observers.size();
        for(int i = 0; i < len; i++) {
            observers.get(i).update(getTemperature(), getPressure(),getHumidity());
        }
    }
}
