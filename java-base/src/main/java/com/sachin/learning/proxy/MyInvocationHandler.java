package com.sachin.learning.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author shicheng.zhang
 * @date 17-3-7
 * @time 下午12:04
 * @Description:
 */
public class MyInvocationHandler implements InvocationHandler {

    private Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("method: " + method.getName() + " is invoked!");
        Object invoke = method.invoke(target, args);
        System.out.println("method: " + method.getName() + " done! result: " + invoke);
        return invoke;
    }
}
