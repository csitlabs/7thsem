import javax.swing.*;
import java.awt.*;

public class ToolbarExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Toolbar Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JToolBar toolBar = new JToolBar(); //create toolbar


        //create buttons
        JButton newButton = new JButton("New");
        newButton.setToolTipText("Create a new file");

        JButton openButton = new JButton("Open");
        newButton.setToolTipText("Open a new file");

        JButton saveButton = new JButton("Save");
        newButton.setToolTipText("Save new file");


        //add action listeners

        newButton.addActionListener(e -> JOptionPane.showMessageDialog(frame,"New File"));
        openButton.addActionListener(e -> JOptionPane.showMessageDialog(frame,"Open File"));
        saveButton.addActionListener(e -> JOptionPane.showMessageDialog(frame,"Save File"));

        // add buttons to toolbar

        toolBar.add(newButton);
        toolBar.add(openButton);
        toolBar.add(saveButton);


        frame.add(toolBar, BorderLayout.NORTH);
        frame.setVisible(true);


        
    }
}
