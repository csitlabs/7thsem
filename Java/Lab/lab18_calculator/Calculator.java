// Write a simple program that takes two numbers as input using JTextField, and
// includes an 'Add' button. When the button is clicked, it should display the
// result.

package Lab.lab18_calculator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setSize(550, 400);
        jFrame.setTitle("Addition Calculator - Bimo 28555");
        jFrame.setLayout(new GridLayout(3, 3, 10, 10));
        JLabel jLabel = new JLabel("Enter a number");
        jFrame.add(jLabel);
        JTextField jTextField = new JTextField();
        jFrame.add(jTextField);
        JLabel jLabel2 = new JLabel("Enter a number");
        jFrame.add(jLabel2);
        JTextField jTextField2 = new JTextField();
        jFrame.add(jTextField2);
        JButton jButton = new JButton("Add");
        jFrame.add(jButton);
        JLabel result = new JLabel();
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    double num1 = Double.parseDouble(jTextField.getText());
                    double num2 = Double.parseDouble(jTextField2.getText());
                    result.setText("Result is " + (num1 + num2));
                } catch (Exception e) {
                    result.setText("Invalid number");
                    throw new RuntimeException("Invalid Input number");
                }
            }
        });
        jFrame.add(result);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
