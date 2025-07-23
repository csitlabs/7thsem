package eventlisteners;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class ItemListener {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setSize(600, 400);
        jFrame.setLocation(300, 300);
        jFrame.setTitle("Terms & Conditions - Action Event Demo");

        JCheckBox checkBox = new JCheckBox("Accept Terms");
        jFrame.add(checkBox);

        checkBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged (ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED) {
                    System.out.println("Checkbox Selected.");
                }
                else {
                    System.out.println("Checkbox Unselected.");
                }
            }
        });

        
        
    }
}
