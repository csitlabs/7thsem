package Lab.lab21_jtoolbar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JToolBar;
import java.awt.*;

public class JToolBarExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple JToolBar Example - Bimo 28555");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create toolbar
        JToolBar toolBar = new JToolBar();

        // Create buttons
        JButton newButton = new JButton("New");
        newButton.setToolTipText("Create a new file");

        JButton openButton = new JButton("Open");
        openButton.setToolTipText("Open a file");

        JButton saveButton = new JButton("Save");
        saveButton.setToolTipText("Save the file");

        // Add action listeners
        newButton.addActionListener(e -> JOptionPane.showMessageDialog(frame, "New clicked"));

        openButton.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Open clicked"));

        saveButton.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Save clicked"));

        // Add buttons to toolbar
        toolBar.add(newButton);
        toolBar.add(openButton);
        toolBar.add(saveButton);

        // Add toolbar and text area to frame
        frame.add(toolBar, BorderLayout.NORTH);

        // Show the frame
        frame.setVisible(true);
    }
}