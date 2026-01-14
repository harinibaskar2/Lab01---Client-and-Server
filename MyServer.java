import java.io.*;

import java.net.*;


public class MyServer {

    public static void main(String[] args) {
        final int port = 6666;

        System.out.println("SERVER: starting...");

        try (ServerSocket ss = new ServerSocket(port);
             Socket s = ss.accept();
             DataInputStream dis = new DataInputStream(s.getInputStream())) {

            System.out.println("SERVER: client connected: " + s.getRemoteSocketAddress());

            while (true) {//Using DataInputStream.readUTF() to read the data from the client!
                String msg = dis.readUTF();
                System.out.println("SERVER: receiving " + msg);
            }

        } catch (EOFException eof) {
            System.out.println("SERVER: client disconnected. Server exiting.");
        } catch (Exception e) {
            System.out.println("SERVER error: " + e);
        }
    }
}
