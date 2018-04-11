package com.strategyPattern.controller;

import com.strategyPattern.service.GegeQuackBehavior;
import com.strategyPattern.service.goodFlyBehavior;

/**
 * Created by zwy on 18/4/10.
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehavior = new goodFlyBehavior();
        quackBehavior = new GegeQuackBehavior();
    }

    public void display() {
        System.out.println("~~ Mallard Duck! ~~");
    }
}
