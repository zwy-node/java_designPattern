package com.strategyPattern;

import com.strategyPattern.controller.Duck;
import com.strategyPattern.controller.MallardDuck;
import com.strategyPattern.controller.StoneDuck;
import com.strategyPattern.service.BadFlyBehavior;
import com.strategyPattern.service.GegeQuackBehavior;

/**
 * Created by zwy on 18/4/10.
 */
public class Application {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performFly();

        mallard.setFlyBehavior(new BadFlyBehavior());
        mallard.setQuackBehavior(new GegeQuackBehavior());


        StoneDuck stoneDuck = new StoneDuck();
        stoneDuck.display();
    }
}
