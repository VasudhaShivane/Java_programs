import java.io.*;
import java.net.*;
public class InetDemo
{
	public static void main(String args[])
	{
		try
		{
			InetAddress ip = Inet4Address.getByName("localhost");
			System.out.println("host name :"+ip.getHostName());
			System.out.println("IP address :"+ip.getHostAddress());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}