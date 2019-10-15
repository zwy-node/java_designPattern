package com.demo;

/**
 * Created by zwy on 18/4/10.
 */

/*
* 没有使用策略模式，鸭子的叫声、飞行等行为的多样性在子类中多次实现具体行为，工作量大而且重复劳动。
* */

public abstract class Duck {
    public Duck() {

    }

    public void Quack() {
        System.out.println("~~gaga~~");
    }

    public abstract void display();

    public void swim() {
        System.out.println("~~ im swim ~~");
    }

    public void Fly() {
        System.out.println("~~ im Fly ~~");
    }
}
