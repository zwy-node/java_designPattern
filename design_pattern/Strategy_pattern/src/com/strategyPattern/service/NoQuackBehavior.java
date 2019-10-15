package com.strategyPattern.service;

/**
 * Created by zwy on 18/4/11.
 */
public class NoQuackBehavior implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("-- No quack --");
    }
}
