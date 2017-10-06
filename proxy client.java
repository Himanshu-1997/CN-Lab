import java.net.*;
import java.util.*;

public class UDPclient {
	public static void main(String args[]) throws Exception {
            while(true){
		Scanner input = new Scanner(System.in);
		DatagramSocket clientSocket = new DatagramSocket();	// no need for port number here
		InetAddress IPAddress = InetAddress.getByName("localhost");
		byte[] sendData = new byte[1024];
		String sentence = input.nextLine();
		sendData = sentence.getBytes();
		DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, IPAddress, 9876);
		clientSocket.send(sendPacket);
		clientSocket.close();
                System.out.println("HI");
            }
	}
}
