package com.sachin.learning.pool;

/**
 * http://www.importnew.com/20804.html
 * Represents a cached pool of objects.
 *
 * @author shicheng.zhang
 * @since 17-4-27 下午4:28
 */
public interface Pool<T> {

    T get();

    void release(T t);

    void shutdown();


    public static interface Validator<T> {

        /**
         * 检验对象
         * @param t
         * @return
         */
        public boolean isValid(T t);

        /**
         * 把对象置为无效
         * 当准备废弃一个对象并清理内存的时候，invalidate方法就派上用场了。
         * @param t
         */
        public void invalidate(T t);
    }
}
