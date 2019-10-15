package com.demo;

/**
 * Created by zwy on 18/4/11.
 */

/*
* 很难满足多个公告板
*   产生出观察者模式
* */
public class InternetWeather {
    public static void main(String[] args) {
        CurrentConditions currentConditions;
        WeatherData weatherData;

        currentConditions = new CurrentConditions();
        weatherData = new WeatherData(currentConditions);

        weatherData.setData(30, 150, 40);
    }
}
