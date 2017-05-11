package com.sachin.learning.adapter;

/**
 * @author shicheng.zhang
 * @since 17-5-11 下午8:16
 */
public class TurkeyAdapter implements Duck {

    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override public void quack() {
        turkey.gobble();
    }

    @Override public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
