import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {

        try {

            // Connect to Server
            Socket s = new Socket("localhost", 5000);

            // Input from user
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter String:");

            String str = sc.nextLine();

            // Send data to server
            DataOutputStream dos =
                new DataOutputStream(s.getOutputStream());

            dos.writeUTF(str);

            // Close Connection
            s.close();
        }

        catch(Exception e) {

            System.out.println(e);
        }
    }
}
