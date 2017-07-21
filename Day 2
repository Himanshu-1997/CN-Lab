package javaapplication1;
import java.net.*;
import java.io.*;
import java.util.*;
import java.lang.*;
public class InetDemo {
    public static void main(String args[])
    {
        try{
        InetAddress i =InetAddress.getLocalHost();
        InetAddress rn=InetAddress.getByName("www.google.com");
        InetAddress ra=InetAddress.getByName("172.16.85.67");
        InetAddress ip = InetAddress.getLocalHost();

		NetworkInterface network = NetworkInterface.getByInetAddress(ip);
		byte[] mac = network.getHardwareAddress();
		System.out.print("Current MAC address : ");
		StringBuilder sb = new StringBuilder();
		for (int j = 0; j < mac.length; j++) {
		sb.append(String.format("%02X%s", mac[j], (j < mac.length - 1) ? "-" : ""));
		}
		System.out.println(sb.toString());
        System.out.println("Local Host Name: "+i.getHostName());
        System.out.println("Local ip Address: "+i.getHostAddress());
        System.out.println("Remote ip Address: "+rn.getHostAddress());
        System.out.println("Remote Host Name: "+ra.getHostName());
        }
        catch(Exception e)
        {
        System.out.println(e);
        }
        System.out.print("Enter the IP address: ");
        int a[]=new int[4];
        for(int k=0;k<4;k++)
        {
            Scanner sc=new Scanner(System.in);
            a[k]=sc.nextInt();
        }
        if(a[0]>=0 && a[0]<=127)
        System.out.println("Class A");
        if(a[0]>127 && a[0]<=191)
        System.out.println("Class B");
        if(a[0]>191 && a[0]<=224)
        System.out.println("Class C");
        if(a[0]>224 && a[0]<=239)
        System.out.println("Class D");
        if(a[0]>239)
        System.out.println("Class E");
    }
}

