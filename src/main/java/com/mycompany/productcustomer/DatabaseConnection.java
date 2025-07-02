package com.mycompany.productcustomer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb?useSSL=false&serverTimezone=UTC", "root", "");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("❌ Connection Error: " + e.getMessage());
            return null;
        }
    }
}
