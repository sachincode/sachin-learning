package com.sachin.learning.proxy;

/**
 * @author shicheng.zhang
 * @date 17-3-7
 * @time 下午12:03
 * @Description:
 */
public class HelloWorldImpl implements HelloWorld {

    @Override
    public String sayHello(String name) {
        System.out.println("hello " + name + "!");
        return name;
    }
}
