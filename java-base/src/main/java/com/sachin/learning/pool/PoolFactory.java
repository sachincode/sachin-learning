package com.sachin.learning.pool;

/**
 * @author shicheng.zhang
 * @since 17-4-27 下午5:41
 */
public class PoolFactory {

    private PoolFactory() {
    }

    public static <T> Pool<T> newBoundedBlockingPool(int size, ObjectFactory<T> factory, Pool.Validator<T> validator) {
        return new BoundedBlockingPool(size, validator, factory);
    }

    public static <T> Pool<T> newBoundedNonBlockingPool(int size, ObjectFactory<T> factory, Pool.Validator<T> validator) {
        return new BoundedPool<T>(size, validator, factory);
    }
}
