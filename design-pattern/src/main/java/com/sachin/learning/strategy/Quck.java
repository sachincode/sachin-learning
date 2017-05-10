package com.sachin.learning.strategy;

/**
 * @author shicheng.zhang
 * @since 17-5-10 下午8:42
 */
public class Quck implements QuackBehavior {
    @Override public void quack() {
        System.out.println("quack!");
    }
}
