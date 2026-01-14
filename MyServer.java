import java.io.*;
import java.net.*;


public class MyServer {
    public static void main(String[] args) {
        final int port = 6666;
        System.out.println("SERVER: starting on port " + port);

        try (ServerSocket ss = new ServerSocket(port)) {
            while (true) {
                System.out.println("SERVER: waiting for connection...");

                try (Socket s = ss.accept();
                     DataInputStream dis = new DataInputStream(s.getInputStream())) {

                    String msg = dis.readUTF();
                    System.out.println("SERVER: receiving " + msg);

                } catch (EOFException eof) {
                    
                }
            }
        } catch (Exception e) {
            System.out.println("SERVER error: " + e);
            e.printStackTrace();
        }
    }
}
