package com.example.okky.DBConntection;

import java.sql.*;

public class JDBCConnection {

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Connection conn = null;
        String url = "jdbc:mariadb://localhost:3306/okky";
        String member= "root";
        String password = "dpdlvldzm419!";

        Class.forName("org.mariadb.jdbc.Driver");

        conn = DriverManager.getConnection(url, member, password);

        return conn;
    }




}
