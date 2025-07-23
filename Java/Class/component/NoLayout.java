import javax.swing.JFrame;
import javax.swing.JLabel;

public class NoLayout {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Layout Example");
        jFrame.setSize(400, 300);

        JLabel jLabel = new JLabel("Hello");
        jLabel.setBounds(50, 50, 100, 30);

        jFrame.setLayout(null);
        jFrame.add(jLabel);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
