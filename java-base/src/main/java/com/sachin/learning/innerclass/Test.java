package com.sachin.learning.innerclass;

/**
 * @author shicheng.zhang
 * @since 17-4-20 下午9:01
 */
public class Test {

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.innerDisplay();
    }
}
