
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class MouseEvent {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Mouse Event");
        jFrame.setSize(400, 300);

        jFrame.setLayout(new FlowLayout());

        JLabel jLabel = new JLabel("Click anywhere");

        jFrame.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                jLabel.setText("x: " + e.getX() + "y: " + e.getY());
            }
        });

        jFrame.add(jLabel);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
