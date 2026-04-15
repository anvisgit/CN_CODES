import java.net.*;

public class UDPClient {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket();
        InetAddress addr = InetAddress.getByName("localhost");

        String msg = "Hello from UDP Client!";
        byte[] sendBytes = msg.getBytes();
        DatagramPacket packet = new DatagramPacket(sendBytes, sendBytes.length, addr, 9090);
        socket.send(packet);

        byte[] buffer = new byte[1024];
        DatagramPacket reply = new DatagramPacket(buffer, buffer.length);
        socket.receive(reply);

        System.out.println("Server: " + new String(reply.getData(), 0, reply.getLength()));
        socket.close();
    }
}
