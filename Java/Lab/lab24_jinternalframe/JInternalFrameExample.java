// Write a Java program to demonstrate the use of JInternalFrame in a Swing application.

package Lab.lab24_jinternalframe;

import javax.swing.*;

public class JInternalFrameExample {
    public static void main(String[] args) {
        JFrame mainFrame = new JFrame("JInternalFrame Example - Bimo 28555");
        mainFrame.setSize(600, 400);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JInternalFrame internalFrame = new JInternalFrame(
                "Internal Window", // title
                true, // resizable
                true, // closable
                true, // maximizable
                true // iconifiable
        );

        internalFrame.setSize(300, 200);
        internalFrame.setVisible(true);
        internalFrame.add(new JLabel("This is an internal frame"));

        mainFrame.add(internalFrame);
        mainFrame.setVisible(true);
    }
}