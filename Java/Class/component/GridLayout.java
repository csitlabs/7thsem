import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Grid Example");
        frame.setLayout(new java.awt.GridLayout(3,3));

        for (int i =1; i<= 4; i++){
            frame.add(new JButton("Button " + i));
        }

        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    }
}
