import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIServer {
    public static void main(String[] args) {
        try {
            Calculator calculator = new CalculatorImpl();
            Registry registry = LocateRegistry.createRegistry(1098);
            registry.rebind("CalculatorService", calculator);
            System.out.println("RMI Server is running...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
