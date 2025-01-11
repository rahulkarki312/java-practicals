import java.io.*;
import java.net.*;

public class CircleClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("127.0.0.1", 6000)) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);

            BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter radius of circle: ");
            String radius = consoleReader.readLine();
            writer.println(radius);

            String areaResponse = reader.readLine();
            System.out.println(areaResponse);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
