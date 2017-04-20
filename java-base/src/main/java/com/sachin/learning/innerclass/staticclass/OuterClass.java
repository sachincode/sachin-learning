package com.sachin.learning.innerclass.staticclass;

/**
 * 静态内部类
 *
 * 静态内部类与非静态内部类之间存在一个最大的区别，
 * 我们知道非静态内部类在编译完成之后会隐含地保存着一个引用，
 * 该引用是指向创建它的外围内，但是静态内部类却没有。
 *
 * 没有这个引用就意味着：
 *  1、 它的创建是不需要依赖于外围类的。
 *  2、 它不能使用任何外围类的非static成员变量和方法。
 *
 * @author shicheng.zhang
 * @since 17-4-20 下午9:31
 */
public class OuterClass {

    private String sex;

    public static String name = "outer...";

    static class InnerClass1 {
        /* 在静态内部类中可以存在静态成员 */
        public static String _name = "static inner...";

        /*
         * 静态内部类只能访问外围类的静态成员变量和方法
         * 不能访问外围类的非静态成员变量和方法
         */
        public void display() {
            System.out.println("OuterClass name: " + name);
        }
    }

    /**
     * 非静态内部类
     */
    class InnerClass2 {
        /* 非静态内部类中不能存在静态成员 */
        public String _name = "inner...";

        /* 非静态内部类中可以调用外围类的任何成员,不管是静态的还是非静态的 */
        public void display() {
            System.out.println("OuterClass name: " + name);
            System.out.println("OuterClass sex: " + sex);
        }
    }

    public void display() {
        /* 外围类访问静态内部类：内部类. */
        System.out.println(InnerClass1._name);
        /* 静态内部类 可以直接创建实例不需要依赖于外围类 */
        new InnerClass1().display();

        /* 非静态内部的创建需要依赖于外围类 */
        OuterClass.InnerClass2 innerClass2 = new OuterClass().new InnerClass2();
        /* 访问非静态内部类的成员需要使用非静态内部类的实例 */
        System.out.println(innerClass2._name);
        innerClass2.display();
    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.display();
    }
}
