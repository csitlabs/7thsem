package dbjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBTest1 {
   public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/emission_management";  // Replace with your DB URL
        String username = "root";        // Replace with your DB username
        String password = "";    // Replace with your DB password

        try {
            // 1. Load JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Establish Connection
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);
            System.out.println("Connected to the database.");

            // 3. Create Statement
            Statement statement = connection.createStatement();


            // 6. SELECT Query
            String selectSQL = "SELECT id, topic FROM emissions;";
            ResultSet resultSet = statement.executeQuery(selectSQL);
            // 5. Process Results
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("topic");
                // String userPassword = resultSet.getString("password");
                System.out.println("ID: " + id + ", Name: " + name);
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
