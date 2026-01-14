package PaintApp.src;// import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class Sender {
    public static void send(String msg) {
        final String host = "localhost"; // Server IP addr
        final int port = 6666;
        try (Socket socket = new Socket(host, port);
             DataOutputStream out = new DataOutputStream(socket.getOutputStream())) {
//            String msg = (args != null && args.length > 0) ? args[0] : "EMPTY"; // connect to paint app

            out.writeUTF(msg);
            out.flush();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}