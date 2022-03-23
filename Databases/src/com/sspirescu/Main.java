package com.sspirescu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {

        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\SS-PC\\Ciorne\\JavaCoursework\\Databases\\testjava.db");
            Statement statement = conn.createStatement();
            statement.execute("CREATE TABLE Contacts (name TEXT, phone INTEGER, email TEXT)");

        } catch (SQLException e) {
            System.out.println("Something went wrong.." + e.getMessage());
        }
    }
}
