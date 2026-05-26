import java.io.*;
import java.net.*;

public class Server {

    public static void main(String[] args) {

        try {

            // Create Server Socket
            ServerSocket ss = new ServerSocket(5000);

            System.out.println("Server Waiting...");

            // Accept Client Connection
            Socket s = ss.accept();

            System.out.println("Client Connected");

            // Receive data from client
            DataInputStream dis =
                new DataInputStream(s.getInputStream());

            String str = dis.readUTF();

            // Reverse String
            String rev = "";

            for(int i = str.length() - 1; i >= 0; i--) {

                rev = rev + str.charAt(i);
            }

            // Display Output
            System.out.println("Original String : " + str);

            System.out.println("Reversed String : " + rev);

            System.out.println("Length : " + str.length());

            // Close Connections
            s.close();

            ss.close();
        }

        catch(Exception e) {

            System.out.println(e);
        }
    }
}
