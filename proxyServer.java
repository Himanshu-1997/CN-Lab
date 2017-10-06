import java.io.*;
import java.net.*;

public class ProxyServer {
	public static void main(String args[]) throws Exception {
		DatagramSocket serverSocket = new DatagramSocket(9876);	//port number here
                DatagramSocket serverSocket1 = new DatagramSocket(5100);
                DatagramSocket ds = new DatagramSocket();
                InetAddress IPAddress = InetAddress.getByName("localhost");
		while (true) {
                    byte[] receiveData = new byte[1024];
                     byte[] receiveData1 = new byte[1024];
			DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
			serverSocket.receive(receivePacket);
			String sentence = new String(receivePacket.getData());
			System.out.println("PROXY SERVER RECEIVED: " + sentence);
                        DatagramPacket sendpacket1 = new DatagramPacket(receiveData, receiveData.length, IPAddress, 5000);
                        ds.send(sendpacket1);
                        DatagramPacket receivePacket1 = new DatagramPacket(receiveData1, receiveData1.length);
                        serverSocket1.receive(receivePacket1);
                        String sentence3 = new String(receivePacket1.getData());
                        System.out.println("MAIN SERVER SENT TO THE PROXY SERVER: " + sentence3);  
		}
	}
}
