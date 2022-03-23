package com.sspirescu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {

        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\SS-PC\\Ciorne\\JavaCoursework\\Databases\\testjava.db");
//            conn.setAutoCommit(false);
            Statement statement = conn.createStatement();
//            statement.execute("CREATE TABLE IF NOT EXISTS Contacts" +
////                    " (name TEXT, phone INTEGER, email TEXT)");
////
////            statement.execute("INSERT INTO Contacts (name,phone,email)" +
////                    "VALUES ('Joe',55555, 'joe@myemail.com')");
////
////            statement.execute("INSERT INTO Contacts (name,phone,email)" +
////                    "VALUES ('Jane',429484, 'jane@somewhere.com')");
////
////            statement.execute("INSERT INTO Contacts (name,phone,email)" +
////                    "VALUES ('Fido',9038, 'dog@email.com')");

            statement.execute("UPDATE Contacts SET phone=5566789 WHERE name='Jane'");

            statement.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }
}
