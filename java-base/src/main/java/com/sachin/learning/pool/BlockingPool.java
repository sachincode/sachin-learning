package com.sachin.learning.pool;

import java.util.concurrent.TimeUnit;

/**
 * @author shicheng.zhang
 * @since 17-4-27 下午4:44
 */
public interface BlockingPool<T> extends Pool<T> {

    T get();

    T get(long time, TimeUnit unit) throws InterruptedException;
}
