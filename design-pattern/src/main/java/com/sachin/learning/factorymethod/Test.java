package com.sachin.learning.factorymethod;

/**
 * 工厂方法模式（Factory Method Pattern）
 * 通过让子类决定该创建的对象是什么，来达到将对象创建的过程封装的目的。
 *
 * @author shicheng.zhang
 * @since 17-5-18 下午7:41
 */
public class Test {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("---------------------");
        Pizza pizza1 = chicagoStore.orderPizza("cheese");
    }
}
