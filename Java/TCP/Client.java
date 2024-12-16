package TCP;
import java.net.*;
import java.io.*;

public class Client {
    public static void main(String[] args) {
        try {
            // Create a socket and connect to the server at localhost on port 5000
            // Socket s = new Socket("localhost", 5000);
            Socket s = new Socket("localhost", 6000);

            DataOutputStream dout = new DataOutputStream(s.getOutputStream());


            // Send message to server
            dout.writeUTF("Hello Server");
            dout.flush();
            dout.close();
            s.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
