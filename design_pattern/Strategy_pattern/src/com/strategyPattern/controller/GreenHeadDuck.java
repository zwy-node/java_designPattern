package com.strategyPattern.controller;

import com.strategyPattern.service.GegeQuackBehavior;
import com.strategyPattern.service.GoodFlyBehavior;

/**
 * Created by zwy on 18/4/10.
 */
public class GreenHeadDuck extends Duck {
    public GreenHeadDuck() {
        flyBehavior = new GoodFlyBehavior();
        quackBehavior = new GegeQuackBehavior();
    }

    public void display() {
        System.out.println("** GreenHeadDuck **");
    }
}
