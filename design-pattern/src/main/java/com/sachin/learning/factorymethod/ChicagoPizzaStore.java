package com.sachin.learning.factorymethod;

/**
 * @author shicheng.zhang
 * @since 17-5-18 下午7:43
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if ("cheese".equals(type)) {
            return new ChicagoStyleCheesePizza();
        }
        return null;
    }
}
