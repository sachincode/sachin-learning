package com.sachin.learning.abstractfactory;

/**
 * @author shicheng.zhang
 * @since 17-5-18 下午7:59
 */
public interface PizzaIngredientFactory {

    public Dough createDough();
    public Sauce createSauce();
}
