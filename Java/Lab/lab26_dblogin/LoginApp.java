// Write a program to build a simple login application using Swing and connect it to a database.

package dbjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.*;

public class LoginApp {
    public static void main(String[] args) {
        // Create and configure the main frame
        JFrame frame = new JFrame("Login - Bimo 28555");
        frame.setLayout(new GridLayout(3, 2, 10, 10));
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create UI components
        JLabel nameLabel = new JLabel("Username:");
        JLabel passLabel = new JLabel("Password:");
        JTextField nameField = new JTextField(15);
        JPasswordField passField = new JPasswordField(15);
        JButton loginButton = new JButton("Login");

        // Add components to frame
        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(passLabel);
        frame.add(passField);
        frame.add(new JLabel());
        frame.add(loginButton);

        // Login button action listener
        loginButton.addActionListener(e -> {
            String name = nameField.getText();
            String password = new String(passField.getPassword());

            try {
                // 1. Load JDBC driver
                Class.forName("com.mysql.cj.jdbc.Driver");
                
                // 2. Establish database connection
                Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/users", 
                    "root", 
                    ""
                );
                
                // 3. Prepare and execute SQL query
                String sql = "SELECT * FROM user_login WHERE name=? AND password=?";
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setString(1, name);
                stmt.setString(2, password);
                
                // 4. Process query results
                ResultSet rs = stmt.executeQuery();
                if (rs.next()) {
                    JOptionPane.showMessageDialog(frame, "Login Successful!");
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid username or password");
                }
                
                // 5. Clean up resources
                rs.close();
                stmt.close();
                conn.close();
                
            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(frame, "Error: " + ex.getMessage());
            }
        });

        // Display the frame
        frame.setVisible(true);
    }
}