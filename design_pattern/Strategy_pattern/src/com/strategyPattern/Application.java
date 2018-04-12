package com.strategyPattern;

import com.strategyPattern.controller.Duck;
import com.strategyPattern.controller.GreenHeadDuck;
import com.strategyPattern.controller.RedHeadDuck;
import com.strategyPattern.controller.StoneDuck;
import com.strategyPattern.service.*;

/**
 * Created by zwy on 18/4/10.
 */
public class Application {
    public static void printf(){
        System.out.println("\n");
    }

    public static void main(String[] args) {
        Duck greenHeadDuck = new GreenHeadDuck();
        //共同属性，鸭子名称
        greenHeadDuck.display();
        //不同行为，飞行和叫声
        greenHeadDuck.performQuack();
        greenHeadDuck.performFly();

        printf();

        Duck redHeadDuck = new RedHeadDuck();
        redHeadDuck.display();
        redHeadDuck.performQuack();
        redHeadDuck.performFly();
        printf();

        Duck stoneDuck = new StoneDuck();
        stoneDuck.display();
        stoneDuck.setFlyBehavior(new BadFlyBehavior());
        stoneDuck.performFly();
        stoneDuck.setQuackBehavior(new NoQuackBehavior());
        stoneDuck.performQuack();

        printf();
    }
}
