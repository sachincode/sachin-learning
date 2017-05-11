package com.sachin.learning.adapter;

/**
 * @author shicheng.zhang
 * @since 17-5-11 下午8:15
 */
public class WildTurkey implements Turkey {
    @Override public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
