package com.sachin.learning.decorator;

/**
 * @author shicheng.zhang
 * @since 17-5-16 下午7:37
 */
public class Soy extends CondimentDecorator {

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return 0.10 + beverage.cost();
    }

}
