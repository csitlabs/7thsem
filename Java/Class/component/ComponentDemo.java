import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ComponentDemo {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setSize(600,400);
        jf.setTitle("JFrame Demo");
        jf.setLayout(new GridLayout(3,3));


        JLabel jl = new JLabel();
        jl.setText("Hello World");

        JTextField jtf = new JTextField();

        JPasswordField jpf = new JPasswordField();
        jpf.setText("Hello");

        JButton jb = new JButton("Click");

        JTextArea jta = new JTextArea("Test Area");

        JScrollPane jsp = new JScrollPane();

        JRadioButton jrb1 = new JRadioButton("Radio 1");
        JRadioButton jrb2 = new JRadioButton("Radio 2");
        ButtonGroup btngrp = new ButtonGroup();
        btngrp.add(jrb1);
        btngrp.add(jrb2);

        JPanel jpnl = new JPanel();
        jpnl.add(jrb1);
        jpnl.add(jrb2);


        String[] itemList = {"Item 1", "Item 2", "Item 3"};
        JList<String> jList = new JList<>(itemList);

        String[] comboBoxList = {"Item 1", "Item 2", "Item 3"};
        JComboBox<String> jComboBox = new JComboBox<>(comboBoxList);


        JSlider slider = new JSlider(0, 100, 40);


        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem newItem = new JMenuItem("New");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem exitItem = new JMenuItem("Exit");

        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);
        jf.setJMenuBar(menuBar);

        JTabbedPane jTabbedPane = new JTabbedPane();
        jTabbedPane.addTab("Tab 1", new JLabel("Label 1"));
        jTabbedPane.addTab("Tab 2", new JLabel("Label 2"));


       
        jf.add(jl);
        jf.add(jtf);
        jf.add(jpf);
        jf.add(jb);
        jf.add(jta);
        jf.add(jsp);
        jf.add(jrb1);
        jf.add(jrb2);

        jf.add(jList);
        jf.add(jComboBox);
        jf.add(slider);

         jf.add(jTabbedPane);

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }
}
