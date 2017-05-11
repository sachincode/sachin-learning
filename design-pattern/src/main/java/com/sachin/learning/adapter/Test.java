package com.sachin.learning.adapter;

/**
 * @author shicheng.zhang
 * @since 17-5-11 下午8:17
 */
public class Test {

    public static void main(String[] args) {
        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        turkeyAdapter.quack();
        turkeyAdapter.fly();

        System.out.println("-------------------------");

        Duck duck = new MallardDuck();
        duck.quack();
        duck.fly();
    }
}
