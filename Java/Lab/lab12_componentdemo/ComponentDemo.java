// Write a program to show different components and containers in swing.

package Lab.lab12_componentdemo;

import javax.swing.*;
import java.awt.*;

public class ComponentDemo {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setSize(600, 400);
        jFrame.setLocation(300, 200);
        jFrame.setTitle("JFrame Demo - Bimochan 28555");
        jFrame.setLayout(new GridLayout(5, 5));
        // JPanel jPanel = new JPanel();
        JLabel jLabel = new JLabel("This is new display", SwingConstants.CENTER);
        jFrame.add(jLabel);
        JTextArea jTextArea = new JTextArea("This is text area");
        JScrollPane jScrollPane = new JScrollPane(jTextArea);
        jFrame.add(jScrollPane);
        JButton jButton = new JButton("Click here");
        jButton.setSize(20, 40);
        jFrame.add(jButton);
        JCheckBox checkBox = new JCheckBox("Check box 1");
        jFrame.add(checkBox);
        JPanel jPanel = new JPanel();
        JRadioButton jRadioButton1 = new JRadioButton("Radio 1");
        JRadioButton jRadioButton2 = new JRadioButton("Radio 2");
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(jRadioButton1);
        buttonGroup.add(jRadioButton2);
        jPanel.add(jRadioButton1);
        jPanel.add(jRadioButton2);
        jFrame.add(jPanel);
        String[] itemList = new String[] { "Item 1", "Item 2", "Item 3" };
        JList<String> jList = new JList<>(itemList);
        jFrame.add(jList);
        String[] comboBoxList = new String[] { "Item 1", "Item 2", "Item 3" };
        JComboBox<String> jComboBox = new JComboBox<>(comboBoxList);
        jFrame.add(jComboBox);
        JSlider slider = new JSlider(0, 100, 40);
        jFrame.add(slider);
        String[][] tableData = new String[][] { { "1", "2", "3" }, { "4", "5", "6" } };
        String[] tableHeading = new String[] { "Heading 1", "Heading 2", "Heading 3" };
        JTable table = new JTable(tableData, tableHeading);
        jFrame.add(table);
        JTabbedPane jTabbedPane = new JTabbedPane();
        jTabbedPane.addTab("Tab 1", new JLabel("Label 1"));
        jTabbedPane.addTab("Tab 2", new JLabel("Label 2"));
        jFrame.add(jTabbedPane);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}