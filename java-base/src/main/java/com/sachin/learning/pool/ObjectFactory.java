package com.sachin.learning.pool;

/**
 * @author shicheng.zhang
 * @since 17-4-27 下午4:42
 */
public interface ObjectFactory<T> {

    public abstract T createNew();
}
