import java.io.*;
import java.net.*;
import java.util.Scanner;

public class UDPServer {
	public static void main(String args[]) throws Exception {
		DatagramSocket serverSocket = new DatagramSocket(5000);	//port number here
                DatagramSocket ds1 = new DatagramSocket();
                InetAddress IPAddress = InetAddress.getByName("localhost");
		while (true) {
                    byte[] receiveData = new byte[1024];
			DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
			serverSocket.receive(receivePacket);
			String sentence = new String(receivePacket.getData());
			System.out.println("PROXY SERVER SENT TO THE MAIN SERVER: " + sentence);
                        Scanner input1 = new Scanner(System.in);
                        byte[] sendData2 = new byte[1024];
                        String sentence2 = input1.nextLine();
                        sendData2 = sentence2.getBytes();
                        DatagramPacket rp = new DatagramPacket(sendData2,sendData2.length,IPAddress,5100);
                        ds1.send(rp);
		}
	}
}
