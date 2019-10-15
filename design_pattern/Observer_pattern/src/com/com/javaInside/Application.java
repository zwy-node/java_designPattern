package com.com.javaInside;

/**
 * Created by zwy on 18/4/12.
 */
public class Application {
    public static void main(String[] args) {
        CurrentConditions currentConditions;
        ForcastConditions forcastConditions;
        WeatherData weatherData;

        weatherData = new WeatherData();
        currentConditions = new CurrentConditions();
        forcastConditions = new ForcastConditions();

        weatherData.addObserver(currentConditions);
        weatherData.addObserver(forcastConditions);

        weatherData.setData(10,34,6);

        weatherData.deleteObserver(forcastConditions);
        weatherData.setData(1,4,6);
    }
}
