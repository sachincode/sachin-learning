package com.sachin.learning.abstractfactory;


/**
 * @author shicheng.zhang
 * @since 17-5-18 下午7:43
 */
public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        ChicagoPizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
        if ("cheese".equals(type)) {
            return new CheesePizza(ingredientFactory);
        }
        return null;
    }
}
