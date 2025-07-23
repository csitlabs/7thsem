//Write a program to demonstrate the Border Layout in swing.

package Lab.lab19_borderlayout;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutExample {
    public static void main(String[] args) {
        // Create a frame
        JFrame frame = new JFrame("BorderLayout Demo - Bimo 28555");

        // Set layout manager
        frame.setLayout(new BorderLayout());

        // Add buttons to each region
        frame.add(new JButton("North"), BorderLayout.NORTH);
        frame.add(new JButton("South"), BorderLayout.SOUTH);
        frame.add(new JButton("East"), BorderLayout.EAST);
        frame.add(new JButton("West"), BorderLayout.WEST);
        frame.add(new JButton("Center"), BorderLayout.CENTER);

        // Set frame size and close operation
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
