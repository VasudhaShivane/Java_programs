import java.io.*;
import java.net.*;
public class FSource
{
 public static void main(String[] args)throws Exception
 {
  byte[] b=new byte[200];
  DatagramSocket ds=new DatagramSocket(1010);
  FileOutputStream f=new FileOutputStream("C:\\Users\\admin\\Desktop\\ad.java\\File.txt");
  DatagramPacket dp=new DatagramPacket(b,b.length);
  ds.receive(dp);
  String data=new String(dp.getData(),0,dp.getLength());
  f.write(data.getBytes(),0,data.length());
 }
}