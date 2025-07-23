package socket;


import java.net.*;

public class UDPClient {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket();
        String message = "Hello from client";
        InetAddress address = InetAddress.getByName("localhost");

        DatagramPacket packet = new DatagramPacket(message.getBytes(), message.length(), address, 3001);
        socket.send(packet);

        byte[] buffer = new byte[1024];
        DatagramPacket reply = new DatagramPacket(buffer, buffer.length);
        socket.receive(reply);

        String response = new String(reply.getData(), 0, reply.getLength());
        System.out.println("Server says: " + response);

        socket.close();
    }
}
