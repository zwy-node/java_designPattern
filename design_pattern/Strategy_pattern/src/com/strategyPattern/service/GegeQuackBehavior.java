package com.strategyPattern.service;

/**
 * Created by zwy on 18/4/10.
 */

/**
 * 封装咯咯叫行为
 *
 */
public class GegeQuackBehavior implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("-- gege --");
    }
}
