package com.sachin.learning.chapter5;

import java.math.BigInteger;

/**
 * @author shicheng.zhang
 * @date 16-12-17
 * @time 下午11:34
 * @Description:
 */
public class ExpensiveFunction implements Computable<String, BigInteger> {
    @Override
    public BigInteger compute(String arg) throws InterruptedException {
        return new BigInteger(arg);
    }
}
