package com.sachin.learning.pool.test;

import com.sachin.learning.pool.Pool;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author shicheng.zhang
 * @since 17-4-27 下午5:24
 */
public class JDBCConnectionValidator implements Pool.Validator<Connection> {
    @Override
    public boolean isValid(Connection connection) {
        if (connection == null) {
            return false;
        }
        try {
            return !connection.isClosed();
        } catch (SQLException e) {
            return false;
        }
    }

    @Override
    public void invalidate(Connection connection) {
        try {
            connection.close();
        } catch (SQLException e) {

        }
    }
}
