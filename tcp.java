import java.util.*; 
import java.net.*; 
import java.io.*; 
public class tcpserver{
  public static void main(String args[]){
    ServerSocket server=new ServerSocket(5000);
    System.out.println("waiting for client"); 
  //read from client 
    InputStreamReader input=new InputSreamReader(socket.getInputStream());
    BufferedReader in=new BufferedReader(input);
    System.out.println("client:" in.readLine()); 
    // txt from server 
    PrintWriter out=new PrintWriter(socket.getOutputStream()); 
    out.println("server: yo");
    socket.close(); 
    server.close();
  }
  
    
