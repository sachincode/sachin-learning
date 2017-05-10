package com.sachin.learning.strategy;

/**
 * @author shicheng.zhang
 * @since 17-5-10 下午8:41
 */
public class FlyNoWay implements FlyBehavior {
    @Override public void fly() {
        System.out.println("I can't fly!");
    }
}
