import java.io.*;
import java.net.*;

public class TCPServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(7000)) {
            System.out.println("TCP Server is running...");
            Socket socket = serverSocket.accept();

            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);

            String message = reader.readLine();
            System.out.println("Received (TCP): " + message);
            writer.println("Echo (TCP): " + message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
