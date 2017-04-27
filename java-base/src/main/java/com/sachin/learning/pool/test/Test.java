package com.sachin.learning.pool.test;

import com.sachin.learning.pool.BoundedBlockingPool;
import com.sachin.learning.pool.Pool;

import java.sql.Connection;

/**
 * @author shicheng.zhang
 * @since 17-4-27 下午5:29
 */
public class Test {

    public static void main(String[] args) {
        Pool<Connection> pool = new BoundedBlockingPool<Connection>(10, new JDBCConnectionValidator(),
                new JDBCObjectFactory("", "", "", ""));
        pool.get();
        pool.shutdown();
    }

}
