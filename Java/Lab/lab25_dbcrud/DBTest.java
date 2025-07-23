// Write a program to connect a Java application to a database and perform insert, update, select, and delete operations.
package lab25_dbcrud.app.src.main.java.dbjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBTest {
    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/users"; // Replace with your DB URL
        String username = "root"; // Replace with your DB username
        String password = ""; // Replace with your DB password

        try {
            // 1. Load JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // 2. Establish Connection
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);
            System.out.println("Connected to the database.");
            
            // 3. Create Statement
            Statement statement = connection.createStatement();
            
            // 4. INSERT Query
            String insertSQL = "INSERT INTO user_login (name, password) VALUES ('Utsav', 'utsav123')";
            int rowsInserted = statement.executeUpdate(insertSQL);
            System.out.println("Rows inserted: " + rowsInserted);
            
            // 5. SELECT Query
            String selectSQL = "SELECT user_id, name, password FROM user_login";
            ResultSet resultSet = statement.executeQuery(selectSQL);
            
            // Process Results
            while (resultSet.next()) {
                int id = resultSet.getInt("user_id");
                String name = resultSet.getString("name");
                String userPassword = resultSet.getString("password");
                System.out.println("ID: " + id + ", Name: " + name + ", password: " + userPassword);
            }
            
            // 6. Close resources
            resultSet.close();
            statement.close();
            connection.close();
            System.out.println("Connection closed.");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}