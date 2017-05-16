package com.sachin.learning.decorator;

/**
 * @author shicheng.zhang
 * @since 17-5-16 下午7:35
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
