import java.io.RandomAccessFile;
import java.io.IOException;

public class RandomAccessDemo {
    public static void main(String[] args) {
        System.out.println("-----------");
        System.out.println("Name: Bimochan Poudel (20780638)");
        System.out.println("TU Roll: 28555/078");
        System.out.println("-----------");
        
        try {
            RandomAccessFile file = new RandomAccessFile("data.txt", "rw");
            file.writeBytes("Hello World");
            file.seek(0);
            String content = "";
            int ch;
            while ((ch = file.read()) != -1) {
                content += (char) ch;
            }
            System.out.println("File content: " + content);
            file.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
