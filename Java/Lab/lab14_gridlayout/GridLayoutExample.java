// Write a program to demonstrate the Grid Layout in swing.

package Lab.lab14_gridlayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;

public class GridLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridLayout Demo - Bimo 28555");
        frame.setLayout(new GridLayout(3, 3));
        for (int i = 1; i <= 5; i++) {
            frame.add(new JButton("Button " + i));
        }
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}