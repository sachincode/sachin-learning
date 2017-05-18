package com.sachin.learning.factorymethod;

/**
 * @author shicheng.zhang
 * @since 17-5-18 下午7:42
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
