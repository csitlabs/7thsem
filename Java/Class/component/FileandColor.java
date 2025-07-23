import javax.swing.*;
import java.awt.*;

public class FileandColor {
    public static void main(String[] args) {
        JFrame frame = new JFrame("FilePick & Color Pick Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JButton fileButton = new JButton("Open File");

        JLabel resultJLabel = new JLabel("Selected file and color will appear here: ");
        resultJLabel.setPreferredSize(new Dimension(350, 30));

        // file button
        fileButton.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            int result = fileChooser.showOpenDialog(frame);
            if (result == JFileChooser.APPROVE_OPTION) {
                java.io.File selectedFile = fileChooser.getSelectedFile();
                resultJLabel.setText("Selected file: " + selectedFile.getName());
            }
        });

        frame.add(fileButton);
        frame.add(resultJLabel);
        frame.setVisible(true);

        JButton colorButton = new JButton("Color");
        colorButton.addActionListener(e ->{
            Color color = JColorChooser.showDialog(frame,"Choose a color", Color.WHITE);
            if (color != null ) {
                frame.getContentPane().setBackground(color);
                resultJLabel.setText("Color Selected");
            }
        });

        frame.add(colorButton);
        frame.add(resultJLabel);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

    }
}
