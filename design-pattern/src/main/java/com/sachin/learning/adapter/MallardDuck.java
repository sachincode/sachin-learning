package com.sachin.learning.adapter;

/**
 * @author shicheng.zhang
 * @since 17-5-11 下午8:14
 */
public class MallardDuck implements Duck {

    @Override public void quack() {
        System.out.println("Quack");
    }

    @Override public void fly() {
        System.out.println("I'm flying");
    }
}
