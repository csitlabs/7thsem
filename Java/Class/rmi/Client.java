
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            Adder stub = (Adder) registry.lookup("AdderService");
            int result = stub.add(5, 7);
            System.out.println("Result from server: " + result);
            System.out.println("-----------");
            System.out.println("Name: Bimochan Poudel (20780638)");
            System.out.println("TU Roll: 28555/078");
            System.out.println("-----------");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
