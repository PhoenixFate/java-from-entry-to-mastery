package chapter19;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Address {
	public static void main(String[] args) {
		try {
			InetAddress localHost=InetAddress.getLocalHost();
			System.out.println("localHost:"+localHost);
			String hostName=localHost.getHostName();
			System.out.println("hostName:"+hostName);
			String hostAddress=localHost.getHostAddress();
			System.out.println("hostAddress:"+hostAddress); 
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
