package com.sachin.learning.abstractfactory;

/**
 * @author shicheng.zhang
 * @since 17-5-18 下午8:00
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override public Sauce createSauce() {
        return new PlumTomatoSauce();
    }
}
