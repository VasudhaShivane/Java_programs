import java.io.*;
import java.net.*;
public class FDec
{
 public static void main(String[] args)throws Exception
 {
  byte[] b=new byte[200];
  FileInputStream f=new FileInputStream("C:\\Users\\admin\\Desktop\\ad.java\\CFile.txt");
  DatagramSocket ds=new DatagramSocket();
  int i=0;
  while(f.available()!=0)
  {
    b[i]=(byte)f.read();
	i++;
  }
  f.close();
  ds.send(new DatagramPacket(b,i,InetAddress.getLocalHost(),9999));
 }
}