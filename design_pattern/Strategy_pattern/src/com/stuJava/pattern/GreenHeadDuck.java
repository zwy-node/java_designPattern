package com.stuJava.pattern;

/**
 * Created by zwy on 18/4/10.
 */

/*
*   继承原先的类可以达到代码的复用，或者功能的复用
* */
public class GreenHeadDuck extends Duck {
    @Override
    public void display() {
        System.out.println("** GreenHeadDuck **");
    }

    public void Fly() {
        System.out.println("~~ no Fly ~~");
    }
}
