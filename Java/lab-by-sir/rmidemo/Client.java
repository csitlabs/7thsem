package swing.project.rmidemo;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            Adder stub = (Adder) registry.lookup("AdderService");
            int result = stub.add(8, 7);
            System.out.println("Result from server: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

