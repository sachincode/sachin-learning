package com.sachin.learning.spring.extend;

/**
 * @author shicheng.zhang
 * @since 17-5-12 下午7:17
 */
public class Monkey implements Animal {
    @Override public void move() {
        System.out.println("Monkey move!");
    }
}
