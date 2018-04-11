package com.strategyPattern.controller;

import com.strategyPattern.service.FlyBehavior;
import com.strategyPattern.service.QuackBehavior;

/**
 * Created by zwy on 18/4/10.
 */

/*
* 设计思想：将变化的部分封装成接口及其具体实现类，例如将飞行行为和呱呱叫行为封装起来，
* 这样的设计，使得它们可以被其他的对象复用，因为这些行为已经与鸭子类无关了，我们也可
* 以新增一些行为，不会影响到既有的行为类，也不会影响“使用”到飞行行为的鸭子类；
* 从Duck类的角度来看，把不变的部分留下来，把变化的部分（飞行行为和呱呱叫行为）
* 委托出去，而不是使用定义在Duck类或子类内的飞行方法和呱呱叫方法
* */

/*
abstract 说明
1.abstract修饰类，会使这个类成为一个抽象类，这个类将不能生成对象实例，
但可以做为对象变量声明的类型，也就是编译时类型，抽象类就像当于一类的半成品，
需要子类继承并覆盖其中的抽象方法。

2，abstract修饰方法，会使这个方法变成抽象方法，也就是只有声明（定义）而没有实现，
实现部分以"；"代替。需要子类继承实现（覆盖）。

注意：有抽象方法的类一定是抽象类。但是抽象类中不一定都是抽象方法，也可以全是具体方法。
*/

/*
*   策略模式
*   鸭子游戏来说明
*   新需求：添加鸭子会飞
*
*   继承的问题：对类的局部改动，尤其超类的局部改动，
*   会影响其他部分，影响会有溢出效应。
*
*
*   设计思维
*   需要新的设计方式，应对项目的扩展性，降低复杂度。
*   1）分析项目变化与不变部分，提取变化部分，抽象成接口+实现；
*   2）行为方式的不一样，用接口去实现；
* */
/**
 * 抽象鸭子类
 *
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck(){

    }

    public abstract void display();

    /*将飞行行为委托给接口处理*/
    public void performFly() {
        flyBehavior.fly();
    }

    /*将叫行为委托给接口处理*/
    public void performQuack() {
        quackBehavior.quack();
    }

    /*可以动态改变飞行行为*/
    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }
    /*可以动态改变叫行为*/
    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }


    public void swim() {
        System.out.println("~~ im swim ~~");
    }
}
