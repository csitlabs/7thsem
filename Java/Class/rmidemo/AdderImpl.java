

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class AdderImpl extends UnicastRemoteObject implements Adder {

    protected AdderImpl() throws RemoteException {
        super();
    }

    @Override
    public int add(int a, int b) throws RemoteException {
        return a + b;
    }
}
