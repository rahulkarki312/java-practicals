import java.io.*;
import java.net.*;

public class ServerSocketServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(5000)) {
            System.out.println("Server is waiting for a client...");
            Socket socket = serverSocket.accept();
            System.out.println("Client connected!");

            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);

            String clientMessage;
            while ((clientMessage = reader.readLine()) != null) {
                System.out.println("Client: " + clientMessage);
                String response = "Server Response: " + clientMessage.toUpperCase();
                writer.println(response);
            }
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
