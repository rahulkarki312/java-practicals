import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculator extends Remote {
    int sum(int a, int b) throws RemoteException;
    int difference(int a, int b) throws RemoteException;
}
