package chapter15;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Example_01 {
	public static void main(String[] args) {
		try {
			FileOutputStream fos=new FileOutputStream("word.txt");
			DataOutputStream dos=new DataOutputStream(fos);
			dos.writeUTF("使用writeUTF()方法写入数据");
			dos.writeChars("使用writeChars()方法写入数据");
			dos.writeBytes("使用writeBytes()方法写入数据");
			dos.close();
			FileInputStream fis=new FileInputStream("word.txt");
			DataInputStream dis=new DataInputStream(fis);
			System.out.println(dis.readUTF());
			dis.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
