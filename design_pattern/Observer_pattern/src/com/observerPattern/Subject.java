package com.observerPattern;

/**
 * Created by zwy on 18/4/12.
 */

/***
 * 抽象被观察者接口
 * 声明了添加、删除、通知观察者方法
 * @author zwy
 *
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
