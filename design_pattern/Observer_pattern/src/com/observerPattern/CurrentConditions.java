package com.observerPattern;

/**
 * Created by zwy on 18/4/12.
 */
/**
 * 观察者
 * 实现了update方法
 * @author zwy
 *
 */
public class CurrentConditions implements Observer {
    private float mTemperature;
    private float mPressure;
    private float mHumidity;

    @Override
    public void update(float mTemperature, float mPressure, float mHumidity) {
        this.mTemperature = mTemperature;
        this.mPressure = mPressure;
        this.mHumidity = mHumidity;
        display();
    }

    public void display() {
        System.out.println("天气预报公告板一: ");
        System.out.printf("*** Today temperature: %.1f ***\n", mTemperature);
        System.out.printf("*** Today pressure: %.1f ***\n", mPressure);
        System.out.printf("*** Today humidity: %.1f ***\n", mHumidity);
    }


}
