package lab30_url;

import java.net.URL;

public class URLExample {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://example.com:444/index.html?name=test#section1");

        System.out.println("Protocol: " + url.getProtocol());
        System.out.println("Host: " + url.getHost());
        System.out.println("Port: " + url.getPort());
        System.out.println("Path: " + url.getPath());
        System.out.println("Query: " + url.getQuery());
        System.out.println("Ref (Fragment): " + url.getRef());

        System.out.println("-----------");
        System.out.println("-----------");
        System.out.println("Name: Bimochan Poudel (20780638)");
        System.out.println("TU Roll: 28555/078");
        System.out.println("-----------");
    }
}
