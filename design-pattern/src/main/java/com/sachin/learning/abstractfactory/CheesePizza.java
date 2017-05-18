package com.sachin.learning.abstractfactory;

/**
 * @author shicheng.zhang
 * @since 17-5-18 下午8:05
 */
public class CheesePizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    // 要制作披萨，需要工厂提供原料。
    // 所以每个披萨类都需要从构造器参数中得到一个工厂，并把这个工厂存储在一个实例变量中。
    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
    }
}
