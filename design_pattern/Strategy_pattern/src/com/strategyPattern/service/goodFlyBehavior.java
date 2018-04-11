package com.strategyPattern.service;

/**
 * Created by zwy on 18/4/10.
 */
public class goodFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("-- good Fly --");
    }
}
