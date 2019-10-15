package com.observerPattern;

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


        weatherData.registerObserver(currentConditions);
        weatherData.registerObserver(forcastConditions);

        weatherData.setData(20, 123, 43);
        weatherData.removeObserver(currentConditions);
        weatherData.setData(20, 53,3);
    }
}
