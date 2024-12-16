package TCP;
import java.net.*;
import java.io.*;

public class Server {
    public static void main(String[] args) {
        try {
            // Create a server socket bound to port 5000
            // 
            ServerSocket ss = new ServerSocket(6000);

            System.out.println("Server is waiting for connection...");

            // Accept a client connection
            Socket s = ss.accept();
            System.out.println("Client connected: " + s.getInetAddress());

            // Get input stream to read data from client
            DataInputStream dis = new DataInputStream(s.getInputStream());

            // Read the message from the client
            String str = dis.readUTF();
            System.out.println("Message: " + str);

            // Close resources
            dis.close();
            s.close();
            ss.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
