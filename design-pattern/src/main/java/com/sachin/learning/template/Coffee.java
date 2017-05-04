package com.sachin.learning.template;

/**
 * @author shicheng.zhang
 * @since 17-5-4 下午8:38
 */
public class Coffee extends CaffeineBeverage {
    @Override
    protected void addCondiments() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    protected void brew() {
        System.out.println("Adding sugar and milk");
    }
}
