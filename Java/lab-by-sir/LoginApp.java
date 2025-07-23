package swing.project.database;

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
        JFrame frame = new JFrame("Login");
        JLabel nameLabel = new JLabel("Username:");
        JLabel passLabel = new JLabel("Password:");
        JTextField nameField = new JTextField(15);
        JPasswordField passField = new JPasswordField(15);
        JButton loginButton = new JButton("Login");

        frame.setLayout(new GridLayout(3, 2, 10, 10));
        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(passLabel);
        frame.add(passField);
        frame.add(new JLabel());
        frame.add(loginButton);

        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        loginButton.addActionListener(e -> {
            String name = nameField.getText();
            String password = new String(passField.getPassword());

            try {
                // Load JDBC driver
                Class.forName("com.mysql.cj.jdbc.Driver");

                // DB connection
                Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/user", "root", "");

                String sql = "SELECT * FROM user_login WHERE name=? AND password=?";
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setString(1, name);
                stmt.setString(2, password);
                ResultSet rs = stmt.executeQuery();

                if (rs.next()) {
                    JOptionPane.showMessageDialog(frame, "Login Successful!");
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid username or password");
                }

                rs.close();
                stmt.close();
                conn.close();
            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(frame, "Error: " + ex.getMessage());
            }
        });
    }
}
