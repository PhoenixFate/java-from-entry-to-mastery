package chapter15;

import java.io.File;

public class FileTest2 {
	public static void main(String[] args) {
		File file=new File("word.txt");
		if(file.exists()){
			System.out.println("getName:"+file.getName());
			System.out.println("length:"+file.length());
			System.out.println("canRead:"+file.canRead());
			System.out.println("canWrite:"+file.canWrite());
			System.out.println("getAbsolutePath:"+file.getAbsolutePath());
			System.out.println("getPath:"+file.getPath()	);
			System.out.println("isFile"+file.isFile());
			System.out.println("isDirectory"+file.isDirectory());
			System.out.println("isHidden"+file.isHidden());
			System.out.println("lastModified"+file.lastModified());
		}else{
			System.out.println("文件不存在");
		}
		
	}
}
