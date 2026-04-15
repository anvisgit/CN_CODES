import java.net.*;

public class UDPServer {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(9090);
        byte[] buffer = new byte[1024];

        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
        socket.receive(packet);

        String msg = new String(packet.getData(), 0, packet.getLength());
        System.out.println("Client: " + msg);

        // reply back to same client
        String reply = "Hello from UDP Server!";
        byte[] replyBytes = reply.getBytes();
        DatagramPacket replyPacket = new DatagramPacket(
            replyBytes, replyBytes.length,
            packet.getAddress(), packet.getPort()
        );
        socket.send(replyPacket);

        socket.close();
    }
}
