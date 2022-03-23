package com.sspirescu;

import java.sql.*;

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

//            statement.execute("UPDATE Contacts SET phone=5566789 WHERE name='Jane'");
//            statement.execute("DELETE FROM Contacts WHERE name='Joe' ");

            statement.execute("SELECT * FROM Contacts");
            ResultSet results = statement.getResultSet();
            while(results.next()) {
                System.out.println(results.getString("name") + " " +
                        results.getInt("phone") + " " +
                        results.getString("email"));

            }
            results.close();
            statement.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }
}
