import java.net.*;
import java.io.*;

public class StopWaitServer {
    public static void main(String[] args)  {
        ServerSocket server = new ServerSocket(8080);
        Socket socket = server.accept();
        DataInputStream in = new DataInputStream(socket.getInputStream());
        DataOutputStream out = new DataOutputStream(socket.getOutputStream());

        while (true) {
            int frame = in.readInt();
            if (frame == -1) break;

            System.out.println("Received Frame: " + frame);
            out.writeInt(frame); // send ACK
            System.out.println("Sent ACK: " + frame);
        }

        socket.close();
        server.close();
    }
}
