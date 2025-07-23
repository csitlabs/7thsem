// Write a program to handle mouse events in a Swing component using a mouse event listener.


package Lab.lab17_mouseevent;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseEventListenerExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mouse Listener - Bimo 28555");
        JLabel label = new JLabel("Click inside the frame");
        frame.add(label);
        frame.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                label.setText("Clicked at: " + e.getX() + ", " + e.getY());
            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("Mouse is pressed");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("Mouse is released");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("Mouse is entered");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("Mouse is exited");
            }
        });
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}