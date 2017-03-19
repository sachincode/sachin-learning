package com.sachin.learning.proxy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author shicheng.zhang
 * @date 17-3-7
 * @time 下午12:06
 * @Description:
 */
public class Test {

    public static void main(String[] args) throws Exception {
        Class<?> proxyClass = Proxy.getProxyClass(Test.class.getClassLoader(), HelloWorld.class);
        Constructor<?> constructor = proxyClass.getConstructor(InvocationHandler.class);
        MyInvocationHandler invocationHandler = new MyInvocationHandler(new HelloWorldImpl());
        HelloWorld helloWorld = (HelloWorld) constructor.newInstance(invocationHandler);
        String s = helloWorld.sayHello("china");
        System.out.println(s);

        System.out.println();

        /*HelloWorld helloWorld1 = (HelloWorld) Proxy
                .newProxyInstance(Test.class.getClassLoader(), new Class<?>[] { HelloWorld.class },
                        new MyInvocationHandler(new HelloWorldImpl()));
        helloWorld1.sayHello();*/
    }
}
