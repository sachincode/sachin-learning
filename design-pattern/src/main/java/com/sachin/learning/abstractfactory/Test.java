package com.sachin.learning.abstractfactory;

/**
 * 抽象工厂模式
 * 提供一个接口，用于创建相关或依赖对象的家族，而不需要明确指定具体类。
 *
 * @author shicheng.zhang
 * @since 17-5-18 下午8:12
 */
public class Test {

    public static void main(String[] args) {
        NYPizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza cheese = nyPizzaStore.orderPizza("cheese");
        System.out.println(cheese);
    }
}
