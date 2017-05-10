package com.sachin.learning.strategy;

/**
 * @author shicheng.zhang
 * @since 17-5-10 下午8:44
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quck();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck!");
    }
}
