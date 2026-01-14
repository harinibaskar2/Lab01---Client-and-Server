import java.io.DataOutputStream;
import java.net.Socket;

public class Sender
{
    private static final String HOST = "localhost";
    private static final int PORT = 6666;

    // send mouse coordinates
    public static void send(int x, int y)
    {
        try (
            Socket socket = new Socket(HOST, PORT);
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
        ) {
            // format: "x,y"
            String msg = x + "," + y;
            out.writeUTF(msg);
            out.flush();

            System.out.println("Sent: " + msg);

        } catch (Exception e) {
            System.out.println("Sender error:");
            e.printStackTrace();
        }
    }
}
