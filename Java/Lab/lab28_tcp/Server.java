package lab28_tcp;

import java.io.*;
import java.net.*;
import java.util.*;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8080);
        Socket cs = ss.accept();
        
        Scanner ins = new Scanner(cs.getInputStream());
        PrintWriter outs = new PrintWriter(cs.getOutputStream(), true);
        

        String s = ins.nextLine();
        System.out.println("From Client: " + s);
        outs.println("Hello Client!");

        ins.close();
        outs.close();
        cs.close();
        ss.close();
    }
}
