package URL;
import java.net.*;
import java.io.*;

public class URLManipulation {
    public static void main(String[] args) {
        try {
            // Corrected URL class name
            URL url = new URL("https://www.google.com");

            // Get and print the different components of the URL
            System.out.println(url.getProtocol());  // Protocol (https)
            System.out.println(url.getHost());      // Host (www.google.com)
            System.out.println(url.getPort());      // Port (default is -1 if not specified, as no port is provided in the URL)
            System.out.println(url.getFile());      // File (returns path and query if present, in this case it's empty)

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
