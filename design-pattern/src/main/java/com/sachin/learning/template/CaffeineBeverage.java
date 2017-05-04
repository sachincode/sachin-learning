package com.sachin.learning.template;

/**
 * @author shicheng.zhang
 * @since 17-5-4 下午8:37
 */
public abstract class CaffeineBeverage {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    protected abstract void addCondiments();

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    protected abstract void brew();

    private void boilWater() {
        System.out.println("Boiling water");
    }
}
