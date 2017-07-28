package javaapplication1;
import java.net.*;
import java.io.*;
import java.util.*;
public class SocketDemo {
    public static void main(String args[]) throws IOException
    {
        Socket socket=new Socket();
        InetAddress ip=InetAddress.getLocalHost();
        for(int i=135;i<445;i++){
            try{
                socket = new Socket(ip.getHostAddress(),i);
                System.out.println("Connected: "+i);
                socket.close();
            }
            catch(Exception e)
            {
                System.out.println("Failed: "+i);
                socket.close();
            }
        }
    }
}
