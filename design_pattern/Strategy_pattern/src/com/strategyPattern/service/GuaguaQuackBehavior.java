package com.strategyPattern.service;

/**
 * Created by zwy on 18/4/10.
 */

/**
 * 封装呱呱叫行为
 *
 */
public class GuaguaQuackBehavior implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("-- guagua --");
    }
}
