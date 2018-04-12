package com.com.javaInside;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by zwy on 18/4/12.
 */
public class ForcastConditions implements Observer {
    private float mTemperatrue;
    private float mPressure;
    private float mHumidity;
    @Override
    public void update(Observable o, Object arg) {
        this.mTemperatrue = ((WeatherData.Data)(arg)).mTemperatrue;
        this.mPressure = ((WeatherData.Data)(arg)).mPressure;
        this.mHumidity = ((WeatherData.Data)(arg)).mHumidity;
        display();
    }

    public void display() {
        System.out.println("天气预报公告板二: ");
        System.out.printf("*** Tomorrow temperature: %.1f ***\n", mTemperatrue + Math.random());
        System.out.printf("*** Tomorrow pressure: %.1f ***\n", mPressure  + Math.random());
        System.out.printf("*** Tomorrow humidity: %.1f ***\n", mHumidity  + Math.random());
    }
}
