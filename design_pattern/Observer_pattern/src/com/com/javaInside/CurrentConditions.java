package com.com.javaInside;

import java.util.Observable;
import java.util.Observer;
import com.com.javaInside.WeatherData.Data;
/**
 * Created by zwy on 18/4/12.
 */
public class CurrentConditions implements Observer{
    private float mTemperatrue;
    private float mPressure;
    private float mHumidity;
    @Override
    public void update(Observable o, Object arg) {
        this.mTemperatrue = ((Data)(arg)).mTemperatrue;
        this.mPressure = ((Data)(arg)).mPressure;
        this.mHumidity = ((Data)(arg)).mHumidity;
        display();
    }

    public void display() {
        System.out.println("天气预报公告板一: ");
        System.out.printf("*** Today temperature: %.1f ***\n", mTemperatrue);
        System.out.printf("*** Today pressure: %.1f ***\n", mPressure);
        System.out.printf("*** Today humidity: %.1f ***\n", mHumidity);
    }
}
