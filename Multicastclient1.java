import java.net.*;
import java.io.*;
public class client1 {
    public static void main(String args[]) throws Exception{
        try{
            MulticastSocket ms = new MulticastSocket(6789);
            InetAddress ip= InetAddress.getByName("225.2.3.4");
            ms.joinGroup(ip);
            DatagramPacket packet = new DatagramPacket(new byte[1024],1024);
            ms.receive(packet);
            String sen = new String(packet.getData());
            System.out.println("From sender to receiver 1: " + sen);
            String s1;
            BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
            s1=br1.readLine();
            DatagramSocket ds =new DatagramSocket();
            byte[] sendData1 = new byte[1024];
            sendData1=s1.getBytes();
            DatagramPacket dp = new DatagramPacket(sendData1,sendData1.length,InetAddress.getByName("localhost"),2000);
            ds.send(dp);
            ms.leaveGroup(ip);
            ms.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
