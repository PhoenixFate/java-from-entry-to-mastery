package chapter19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MyTcp {
	private BufferedReader reader;
	private ServerSocket server;
	private Socket socket;
	public void getServer(){
		try {
			server=new ServerSocket(8998);
			System.out.println("服务器套接字已经创建成功");
			while(true){
				System.out.println("等待客户机的连接");
				socket=server.accept();
				reader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
				getClientMessage();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private void getClientMessage(){
		try {
			while(true){
				System.out.println("客户端："+reader.readLine());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			if(reader!=null){
				reader.close();
				System.out.println("reader已经关闭");
			}
			if(socket!=null)	{
				System.out.println("socket已经关闭");
				socket.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		MyTcp tcp=new MyTcp();
		tcp.getServer();
	}
}
