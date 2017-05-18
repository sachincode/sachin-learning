package com.sachin.learning.simplefactory;

/**
 * @author shicheng.zhang
 * @since 17-5-18 下午7:21
 */
public class PizzaStore {

    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza = factory.createPizza(type);
        if (pizza == null) {
            throw new IllegalArgumentException("we have no this type of pizza!");
        }
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
