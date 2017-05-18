package com.sachin.learning.simplefactory;

/**
 * @author shicheng.zhang
 * @since 17-5-18 下午7:19
 */
public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if ("cheese".equals(type)) {
            pizza = new CheesePizza();
        } else if ("clam".equals(type)) {
            pizza = new ClamPizza();
        } else if ("pepperoni".equals(type)) {
            pizza = new PepperoniPizza();
        } else if ("veggie".equals(type)) {
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
