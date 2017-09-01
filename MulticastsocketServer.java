package javaapplication1;
import java.io.*;
import java.net.*;
import java.util.*;
public class MulticastSocketServer {
    public static void main(String args[]) throws Exception
    {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            DatagramSocket clientsocket = new DatagramSocket();
            byte[] sendData = new byte[1024];
            String msg = br.readLine();
            sendData=msg.getBytes();
            InetAddress ip =InetAddress.getByName("225.2.3.4");
            DatagramPacket sendpacket = new DatagramPacket(sendData,sendData.length,ip,6789);
            clientsocket.send(sendpacket);
        }
        catch(Exception e)
        {
           e.printStackTrace();
        }
    }
}
