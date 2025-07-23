import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Calculator {

    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setTitle("Calculator");

        jFrame.setSize(500, 300);
        jFrame.setLayout(new GridLayout(3, 3));

        JLabel firstlabel = new JLabel("Enter first number: ");
        JTextField firstNumberField = new JTextField();

        JLabel secondlabel = new JLabel("Enter second number: ");
        JTextField secondNumberField = new JTextField();

        JButton addButton = new JButton("Add");

        JLabel resultlabel = new JLabel();
        resultlabel.setText("Result: ");

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Double firstNumber = Double.parseDouble(firstNumberField.getText());
                    Double secondNumber = Double.parseDouble(secondNumberField.getText());
                    Double result = firstNumber + secondNumber;

                    resultlabel.setText("Result: " + result);

                } catch (Exception ex) {
                    resultlabel.setText("Invalid");
                }
            }
        });

        jFrame.add(firstlabel);
        jFrame.add(firstNumberField);
        jFrame.add(secondlabel);
        jFrame.add(secondNumberField);
        jFrame.add(addButton);
        jFrame.add(resultlabel);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);

    }
}
