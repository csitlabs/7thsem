import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeStudent {
    public static void main(String[] args) {
        try {
            FileInputStream fileIn = new FileInputStream("student.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);

            Student student = (Student) in.readObject();
            in.close();
            fileIn.close();

            System.out.println("Deserialized Data:");
            System.out.println("ID: " + student.getId());
            System.out.println("Name: " + student.getName());
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialization error: " + e.getMessage());
        }
    }
}
