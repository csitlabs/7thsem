package swing.project.rmidemo;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class AddServer {
    public static void main(String[] args) {
        try {
            AdderImpl obj = new AdderImpl();
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("AdderService", obj);
            System.out.println("AdderService is running...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
