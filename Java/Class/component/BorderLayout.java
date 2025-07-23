import javax.swing.JFrame;

public class BorderLayout {
    public static final Object NORTH = null;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Border Layout");
        frame.setLayout(new BorderLayout());

        frame.add(new JButton("Top (NORTH)"), BorderLayout.NORTH);
        //incomplete
    }
}
