import java.net.*;
import java.io.*;
public class client2 {
    public static void main(String args[]) throws Exception{
        try{
            MulticastSocket ms = new MulticastSocket(6789);
            InetAddress ip= InetAddress.getByName("225.2.3.4");
            ms.joinGroup(ip);
            DatagramPacket packet = new DatagramPacket(new byte[1024],1024);
            ms.receive(packet);
            String sen = new String(packet.getData());
            System.out.println("From sender to receiver 2: " + sen);
            String s2;
            BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
            s2=br2.readLine();
            DatagramSocket ds1 =new DatagramSocket();
            byte[] sendData2 = new byte[1024];
            sendData2=s2.getBytes();
            DatagramPacket dp = new DatagramPacket(sendData2,sendData2.length,InetAddress.getByName("localhost"),2000);
            ds1.send(dp);
            ms.leaveGroup(ip);
           ms.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
