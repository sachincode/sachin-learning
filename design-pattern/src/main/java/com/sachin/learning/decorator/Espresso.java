package com.sachin.learning.decorator;

/**
 * @author shicheng.zhang
 * @since 17-5-16 下午7:35
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
