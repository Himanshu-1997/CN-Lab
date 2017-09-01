package javaapplication1;
import java.net.*;
import java.io.*;
public class MulticastSocketClient {
    public static void main(String args[]) throws Exception{
        try{
            MulticastSocket ms = new MulticastSocket(6789);
            //MulticastSocket ms1 = new MulticastSocket(6789);
            //MulticastSocket ms2 = new MulticastSocket(6789);
            InetAddress ip= InetAddress.getByName("225.2.3.4");
            ms.joinGroup(ip);
           // ms1.joinGroup(ip);
           // ms2.joinGroup(ip);
            DatagramPacket packet = new DatagramPacket(new byte[1024],1024);
            ms.receive(packet);
            //ms1.receive(packet);
            //ms2.receive(packet);
            String sen = new String(packet.getData());
           // String sen1 = new String(packet.getData());
            //String sen2 = new String(packet.getData());
            System.out.println("From sender to receiver 1: " + sen);
            System.out.println("From sender to receiver 2: " + sen);
            System.out.println("From sender to receiver 3: " + sen);
            ms.leaveGroup(ip);
            //ms1.leaveGroup(ip);
            //ms2.leaveGroup(ip);
            ms.close();
            //ms1.close();
            //ms2.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
