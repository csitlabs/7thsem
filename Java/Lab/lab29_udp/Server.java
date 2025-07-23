package lab29_udp;

import java.net.*;
import java.io.*;

public class Server {
    public static void main(String[] args) throws IOException {
        byte[] buf = new byte[256];

        DatagramSocket socket = new DatagramSocket(4445);

        DatagramPacket packet = new DatagramPacket(buf, buf.length);
        socket.receive(packet);
        InetAddress address = packet.getAddress();
        int port = packet.getPort();
        String s = "Hello World!";
        buf = s.getBytes();

        packet = new DatagramPacket(buf, buf.length, address, port);
        socket.send(packet);
        socket.close();
    }

}
