package com.sachin.learning.template;

/**
 * @author shicheng.zhang
 * @since 17-5-4 下午8:39
 */
public class Tea extends CaffeineBeverage {
    @Override
    protected void addCondiments() {
        System.out.println("Steeping the tea");
    }

    @Override
    protected void brew() {
        System.out.println("Adding lemon");
    }
}
