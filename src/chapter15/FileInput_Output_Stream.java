package chapter15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInput_Output_Stream {
	public static void main(String[] args) {
		File file=new File("word.txt");
		FileOutputStream fos;
		try {
			fos=new FileOutputStream(file);
			byte[] lv="我有一只小毛驴，我从来也不骑".getBytes();
			System.out.println(lv.length);
			fos.write(lv);
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			FileInputStream fis=new FileInputStream(file	);
			byte[] b=new byte[1024];
			int length=fis.read(b);
			String message=new String(b,0,length);
			System.out.println("文本中的信息:"+message);
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
