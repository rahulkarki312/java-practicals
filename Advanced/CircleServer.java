import java.io.*;
import java.net.*;

public class CircleServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(6000)) {
            System.out.println("Server is running...");
            Socket socket = serverSocket.accept();
            System.out.println("Client connected!");

            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);

            String radiusString = reader.readLine();
            double radius = Double.parseDouble(radiusString);
            double area = Math.PI * radius * radius;

            writer.println("Computed Area: " + area);
            System.out.println("Radius received: " + radius + ", Area sent: " + area);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
