<<<<<<< HEAD
package PaintApp.src;
=======
>>>>>>> 279f075307efa0b74cc92ea9a7bc671760eecea7
import java.io.DataOutputStream;
import java.net.Socket;

public class Sender
{
    private static final String HOST = "localhost";
    private static final int PORT = 6666;

    // send action
    public static void send(String action) {
        if (action == null)
            action = "EMPTY";
        String msg = action;
        sendRaw(msg);
    }

    // send mouse coordinates
    public static void send (int x, int y) {
        String msg = x + "," + y;
        sendRaw(msg);
    }

    private static void sendRaw (String msg) {
        try (
            Socket socket = new Socket(HOST, PORT);
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
        ) {
            out.writeUTF(msg);
            out.flush();
            System.out.println("Sent: " + msg);
    } catch (Exception e) {
            System.out.println("Sender error:");
            e.printStackTrace();
    }

}
}
