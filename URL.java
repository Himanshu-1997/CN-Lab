package javaapplication1;
import java.io.*;
import java.net.*;
public class URLdemo {
    public static void main(String args[])
    {
        try{
            URL u1=new URL("http://www.google.com");
            System.out.println("Protocol: "+u1.getProtocol());
            System.out.println("HostName: "+u1.getHost());
            System.out.println("Port Number: "+u1.getPort());
            System.out.println("File name: "+u1.getFile());
        }
        catch(MalformedURLException e)
            System.out.print(e);
    }
}
