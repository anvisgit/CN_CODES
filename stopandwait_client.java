import java.net.*;
import java.io.*;
import java.util.Scanner;

public class StopWaitClient {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of frames: ");
        int n = sc.nextInt();

        Socket socket = new Socket("localhost", 8080);
        DataOutputStream out = new DataOutputStream(socket.getOutputStream());
        DataInputStream in = new DataInputStream(socket.getInputStream());

        long start = System.currentTimeMillis();

        for (int frame = 1; frame <= n; frame++) {
            out.writeInt(frame);
            System.out.println("Sent Frame: " + frame);

            int ack = in.readInt();
            System.out.println("Received ACK: " + ack);
        }

        out.writeInt(-1); // signal done

        long end = System.currentTimeMillis();
        double timeSec = (end - start) / 1000.0;
        System.out.println("Total Time: " + timeSec + " seconds");
        System.out.println("Throughput: " + (n / timeSec) + " frames/sec");

        socket.close();
    }
}
