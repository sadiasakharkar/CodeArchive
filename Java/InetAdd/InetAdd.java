package InetAdd;
import java.net.*;
import java.io.*;

public class InetAdd {
    public static void main(String[] args) {
        try{
            InetAddress ip = InetAddress.getByName("www.geeksforgeeks.org");
            System.out.println(ip);
            System.out.println("Hostname: " + ip.getHostName());
            System.out.println("IP Address:" + ip.getHostAddress());
        }catch(Exception e){
            System.out.println(e);
    }
}
}
