package com.sachin.learning.template;

/**
 * http://www.importnew.com/23467.html
 *
 * 模板方法模式在一个方法中定义了一个算法的骨架，而将一些步骤延迟到子类中。
 * 模板方法使得子类可以在不改变算法结构的情况下，重新定义算法中的某些步骤。
 *
 * 钩子是一种被声明在抽象类中的方法，但只有空的或者默认的实现。
 * 钩子的存在，可以让子类有能力对算法的不同点进行挂钩。要不要挂钩，由子类决定。
 *
 * @author shicheng.zhang
 * @since 17-5-4 下午8:40
 */
public class Test {
    public static void main(String[] args) {
        new Coffee().prepareRecipe();
        System.out.println("------------------------");
        new Tea().prepareRecipe();
    }
}
