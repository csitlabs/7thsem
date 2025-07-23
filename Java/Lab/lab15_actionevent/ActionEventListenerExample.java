// Write a program to handle action events in a Swing component using an ActionListener.

package Lab.lab15_actionevent;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEventListenerExample {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setSize(400, 100);
        jFrame.setLocation(300, 200);
        jFrame.setTitle("Action Event Demo - Bimo 28555");
        JButton jButton = new JButton("Button");
        jFrame.add(jButton);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Button Clicked");
            }
        });
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }

    public static class MyActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Button Clicked");
        }
    }
}