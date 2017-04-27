package com.sachin.learning.pool.test;

import com.sachin.learning.pool.ObjectFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author shicheng.zhang
 * @since 17-4-27 下午5:26
 */
public class JDBCObjectFactory implements ObjectFactory<Connection> {

    private String connectionURL;
    private String username;
    private String password;

    public JDBCObjectFactory(String driver, String connectionURL, String username, String password) {
        super();
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            throw new IllegalArgumentException("Unable to find driver in calsspath", e);
        }
        this.connectionURL = connectionURL;
        this.username = username;
        this.password = password;
    }

    @Override
    public Connection createNew() {
        try {
            return DriverManager.getConnection(connectionURL, username, password);
        } catch (SQLException e) {
            throw new IllegalArgumentException("Unable to create new connection", e);
        }
    }
}
