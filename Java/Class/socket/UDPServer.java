package socket;


import java.net.*;

public class UDPServer {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(3001);
        byte[] buffer = new byte[1024];

        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
        socket.receive(packet);

        String message = new String(packet.getData(), 0, packet.getLength());
        System.out.println("Received: " + message);

        String reply = "Hello from server";
        DatagramPacket response = new DatagramPacket(reply.getBytes(), reply.length(), packet.getAddress(), packet.getPort());
        socket.send(response);

        socket.close();
    }
}

