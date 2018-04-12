package com.demo;

/**
 * Created by zwy on 18/4/10.
 */
public class StimulateDuck {
    public static void main(String[] args){
        GreenHeadDuck greenHeadDuck = new GreenHeadDuck();
        RedHeadDuck redHeadDuck = new RedHeadDuck();

        greenHeadDuck.display();
        greenHeadDuck.Quack();
        greenHeadDuck.swim();
        greenHeadDuck.Fly();

        redHeadDuck.display();
        redHeadDuck.Quack();
        redHeadDuck.swim();
        greenHeadDuck.Fly();
    }
}
