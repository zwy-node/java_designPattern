package com.strategyPattern.controller;

import com.strategyPattern.service.GoodFlyBehavior;
import com.strategyPattern.service.GuaguaQuackBehavior;

/**
 * Created by zwy on 18/4/11.
 */
public class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        flyBehavior = new GoodFlyBehavior();
        quackBehavior = new GuaguaQuackBehavior();
    }
    @Override
    public void display() {
        System.out.println("** RedHeadDuck **");
    }
}
