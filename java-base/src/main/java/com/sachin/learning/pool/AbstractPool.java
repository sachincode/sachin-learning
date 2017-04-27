package com.sachin.learning.pool;

/**
 * @author shicheng.zhang
 * @since 17-4-27 下午4:29
 */
public abstract class AbstractPool<T> implements Pool<T> {

    /**
     * 先尝试检查下这个客户端返回的对象是否还能重复使用。
     * 如果是的话再把它扔回池里，
     * 如果不是，就舍弃掉这个对象。
     * @param t
     */
    @Override
    public void release(T t) {
        if (isValid(t)) {
            returnToPool(t);
        } else {
            handleInvalidReturn(t);
        }
    }

    protected abstract void handleInvalidReturn(T t);

    protected abstract void returnToPool(T t);

    protected abstract boolean isValid(T t);

}
