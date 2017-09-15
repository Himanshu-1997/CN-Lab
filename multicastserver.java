import java.io.*;
import java.net.*;
import java.util.*;
public class server1{
    public static void main(String args[]) throws Exception
    {
        int t=2;
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            DatagramSocket clientsocket = new DatagramSocket();
            byte[] sendData = new byte[1024];
            String msg = br.readLine();
            sendData=msg.getBytes();
            InetAddress ip =InetAddress.getByName("225.2.3.4");
            DatagramPacket sendpacket = new DatagramPacket(sendData,sendData.length,ip,6789);
            clientsocket.send(sendpacket);
            DatagramSocket ds = new DatagramSocket(2000);
            while(t>=0){
                DatagramPacket p = new DatagramPacket(new byte[1024],1024);
                ds.receive(p);
                String s=new String(p.getData());
                System.out.println(s);
                t--;
            }
        }
        catch(Exception e)
        {
           e.printStackTrace();
        }
    }
}
