// Write a program to handle item events in a Swing component using an ItemEvent listener.

package Lab.lab16_itemlistener;

import java.awt.event.*;
// import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class ItemListenerExample {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setSize(400, 100);
        jFrame.setTitle("Action Event Demo - Bimo 28555");
        JCheckBox checkBox = new JCheckBox("Accept Terms");
        jFrame.add(checkBox);
        checkBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    System.out.println("Checkbox selected");
                } else {
                    System.out.println("Checkbox deselected");
                }
            }
        });
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}