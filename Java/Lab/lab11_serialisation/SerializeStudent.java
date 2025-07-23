import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeStudent {
    public static void main(String[] args) {
        Student student = new Student(1, "Bimochan");

        try {
            FileOutputStream fileOut = new FileOutputStream("student.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(student);
            out.close();
            fileOut.close();

            System.out.println("Serialized data is saved in student.ser");
        } catch (IOException e) {
            System.out.println("Serialization error: " + e.getMessage());
        }
    }
}
