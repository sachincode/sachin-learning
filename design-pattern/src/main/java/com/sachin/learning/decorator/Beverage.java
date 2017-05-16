package com.sachin.learning.decorator;

/**
 * @author shicheng.zhang
 * @since 17-5-16 下午7:33
 */
public abstract class Beverage {

    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
