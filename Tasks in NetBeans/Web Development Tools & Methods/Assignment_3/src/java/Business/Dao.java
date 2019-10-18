/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.apache.commons.dbutils.DbUtils;

/**
 *
 * @author Administrator
 */
public class Dao {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/info6250?serverTimezone=UTC";
    static final String USER = "root";
    static final String PASSWORD = "123456";
    private Connection connection;

    public Connection getConnection() throws Exception {
        try {
            Connection connection = null;
            DbUtils.loadDriver(JDBC_DRIVER);
            this.connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
        } catch (SQLException ex) {
            System.out.println("SQL Exception");
            ex.printStackTrace();
            throw new Exception();
        }
        return this.connection;
    }
}
