package com.demo;

/**
 * Created by zwy on 18/4/11.
 */
public class CurrentConditions {
    private float mTemperature;
    private float mPressure;
    private float mHumidity;


    public void update(float mTemperature, float mPressure, float mHumidity) {
        this.mTemperature = mTemperature;
        this.mPressure = mPressure;
        this.mHumidity = mHumidity;
        display();
    }

    public void display() {
        System.out.printf("*** Today temperature: %.1f ***\n", mTemperature);
        System.out.printf("*** Today pressure: %.1f ***\n", mPressure);
        System.out.printf("*** Today humidity: %.1f ***\n", mHumidity);
    }
}
