import java.net.*;

public class UDPClient {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket();
            InetAddress address = InetAddress.getByName("127.0.0.1");
            String message = "Hello UDP Server!";

            DatagramPacket packet = new DatagramPacket(message.getBytes(), message.length(), address, 8000);
            socket.send(packet);

            byte[] buffer = new byte[1024];
            DatagramPacket responsePacket = new DatagramPacket(buffer, buffer.length);
            socket.receive(responsePacket);

            String response = new String(responsePacket.getData(), 0, responsePacket.getLength());
            System.out.println("Server Response: " + response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
