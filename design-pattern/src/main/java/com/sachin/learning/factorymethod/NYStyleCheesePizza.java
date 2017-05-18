package com.sachin.learning.factorymethod;

/**
 * @author shicheng.zhang
 * @since 17-5-18 下午7:38
 */
public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Grated Reggiano Cheese");
    }
}
