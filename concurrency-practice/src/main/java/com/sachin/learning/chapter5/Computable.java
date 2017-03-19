package com.sachin.learning.chapter5;

/**
 * @author shicheng.zhang
 * @date 16-12-17
 * @time 下午11:33
 * @Description:
 */
public interface Computable<A, V> {

    V compute(A arg) throws InterruptedException;
}
