import java.awt.GridBagConstraints;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridBagLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GridBag Layout");
        frame.setSize(500,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new java.awt.GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        JButton btn1 = new JButton("Button 1");
        gbc.gridx = 0;
        gbc.gridy = 0;
        frame.add(btn1, gbc);

        JButton btn2 = new JButton("Button 2");
        gbc.gridx = 1;
        gbc.gridy = 0;
        frame.add(btn2, gbc);

        JButton btn3 = new JButton("Button 3");
        gbc.gridx = 0;
        gbc.gridy = 1;
        frame.add(btn3, gbc);

        frame.setVisible(true);


    }
}