package com.observerPattern;

/**
 * Created by zwy on 18/4/12.
 */
public class ForcastConditions implements Observer {
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
        System.out.println("天气预报公告板二: ");
        System.out.printf("*** Tomorrow temperature: %.1f ***\n", mTemperature + Math.random());
        System.out.printf("*** Tomorrow pressure: %.1f ***\n", mPressure  + Math.random());
        System.out.printf("*** Tomorrow humidity: %.1f ***\n", mHumidity  + Math.random());
    }
}
