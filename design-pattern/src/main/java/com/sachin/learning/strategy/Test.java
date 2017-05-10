package com.sachin.learning.strategy;

/**
 * 策略模式的功能是把具体的算法实现，从具体的业务处理里面独立出来，
 * 把它们实现成为单独的算法类，从而形成一系列的算法，并让这些算法可以相互替换。
 *
 * 策略模式的重心不是如何来实现算法，而是如何组织、调用这些算法，
 * 从而让程序结构更灵活、具有更好的维护性和扩展性。
 *
 * @author shicheng.zhang
 * @since 17-5-10 下午8:45
 */
public class Test {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
    }
}
