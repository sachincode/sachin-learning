package com.sachin.learning.abstractfactory;

import java.util.ArrayList;

/**
 * @author shicheng.zhang
 * @since 17-5-18 下午7:34
 */
public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;

    abstract void prepare();

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough=" + dough +
                ", sauce=" + sauce +
                '}';
    }
}
