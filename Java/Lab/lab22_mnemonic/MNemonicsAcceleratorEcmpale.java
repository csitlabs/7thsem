// Write a Java program to demonstrate the use of Mnemonics and Accelerators in a Swing Menu.

package Lab.lab22_mnemonic;

import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

public class MNemonicsAcceleratorEcmpale {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mnemonic & Accelerator Example - Bimo 28555");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        
        // Create a menu bar
        JMenuBar menuBar = new JMenuBar();

        // Create "File" menu with mnemonic Alt + F
        JMenu jmFile = new JMenu("File");
        jmFile.setMnemonic(KeyEvent.VK_F); // Alt + F to open File menu
        
        // "Open" menu item with mnemonic 'O' and accelerator Ctrl + O
        JMenuItem jmiOpen = new JMenuItem("Open", KeyEvent.VK_O);
        jmiOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));
        jmiOpen.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Open selected"));
        
        // "Close" menu item with mnemonic 'C' and accelerator Ctrl + C
        JMenuItem jmiClose = new JMenuItem("Close", KeyEvent.VK_C);
        jmiClose.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));
        jmiClose.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Close selected"));
        
        // "Save" menu item with mnemonic 'S' and accelerator Ctrl + S
        JMenuItem jmiSave = new JMenuItem("Save", KeyEvent.VK_S);
        jmiSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));
        jmiSave.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Save selected"));
        
        // "Exit" menu item with mnemonic 'E' and accelerator Ctrl + E
        JMenuItem jmiExit = new JMenuItem("Exit", KeyEvent.VK_E);
        jmiExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.CTRL_DOWN_MASK));
        jmiExit.addActionListener(e -> System.exit(0));
        
        // Add menu items to menu
        jmFile.add(jmiOpen);
        jmFile.add(jmiClose);
        jmFile.add(jmiSave);
        jmFile.addSeparator();
        jmFile.add(jmiExit);
        
        // Add menu to menu bar
        menuBar.add(jmFile);
        
        // Set menu bar in frame
        frame.setJMenuBar(menuBar);
        frame.setVisible(true);
    }
}