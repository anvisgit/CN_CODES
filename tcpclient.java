import java.net.*; 
import java.io.*;
import java.util.*;
public class main{
  public static void main(String args[]){
    Socket socket=new Socket("localhost", 5000); 
    PrintWriter out=newPrintWriter(socket.getOutputStream(), true); 
    out.println("client: hi");
    InputStream input=new InputStream(socket.getInputStream());
    BufferedReader in=new BufferedReader(input); 
    System.out.println("server:hi");
    socket.close();
    
  }
}

    
