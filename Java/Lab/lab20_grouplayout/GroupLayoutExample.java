// Write a program to demonstrate the Group Layout in swing.

package Lab.lab20_grouplayout;

import javax.swing.*;

public class GroupLayoutExample {
    public static void main(String[] args) {
        // Create a frame
        JFrame frame = new JFrame("GroupLayout Demo - Bimo 28555");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Create a panel to hold components
        JPanel panel = new JPanel();
        frame.setContentPane(panel);

        // Create components
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField(15);
        JLabel emailLabel = new JLabel("Email:");
        JTextField emailField = new JTextField(15);
        JButton submitButton = new JButton("Submit");

        // Create a GroupLayout and set it to the panel
        GroupLayout layout = new GroupLayout(panel);
        panel.setLayout(layout);
        layout.setAutoCreateGaps(true); // Adds space between components
        layout.setAutoCreateContainerGaps(true); // Adds space around the edges

        // Horizontal group
        layout.setHorizontalGroup(
                layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(nameLabel)
                                .addComponent(emailLabel))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(nameField)
                                .addComponent(emailField)
                                .addComponent(submitButton)));

        // Vertical group
        layout.setVerticalGroup(
                layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(nameLabel)
                                .addComponent(nameField))
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(emailLabel)
                                .addComponent(emailField))
                        .addComponent(submitButton));

        // Show the frame
        frame.setVisible(true);
    }
}
