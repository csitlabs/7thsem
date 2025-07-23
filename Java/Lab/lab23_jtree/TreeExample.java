// Write a Java program to demonstrate the use of JTree in a
// Swing application. Your program should meet the following
// requirements:
// ● Create a JFrame titled "JTree Example".
// ● Construct a tree structure using DefaultMutableTreeNode

package Lab.lab23_jtree;

import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class TreeExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTree Example - Bimo 28555");
        
        // Creating tree nodes
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        DefaultMutableTreeNode folder1 = new DefaultMutableTreeNode("Folder1");
        DefaultMutableTreeNode folder2 = new DefaultMutableTreeNode("Folder2");
        DefaultMutableTreeNode folder3 = new DefaultMutableTreeNode("Folder3");
        
        // Building tree structure
        root.add(folder1);
        root.add(folder2);
        folder1.add(folder3);
        folder3.add(new DefaultMutableTreeNode("File3.txt"));
        folder1.add(new DefaultMutableTreeNode("File1.txt"));
        folder2.add(new DefaultMutableTreeNode("File2.txt"));
        
        // Create and add JTree
        JTree tree = new JTree(root);
        frame.add(tree);
        
        // Frame settings
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}