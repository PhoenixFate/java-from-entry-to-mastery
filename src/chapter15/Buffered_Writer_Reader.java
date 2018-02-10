package chapter15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Buffered_Writer_Reader {
	public static void main(String[] args) {
		String content[]={"好久不见","最近好吗","常联系"};
		File file=new File("word.txt");
		try {
			FileWriter fw=new FileWriter(file);
			BufferedWriter bw=new BufferedWriter(fw);
			for(int i=0;i<content.length;i++	){
				bw.write(content[i]);
				bw.newLine();
			}
			bw.close();
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			FileReader fr=new FileReader(file);
			BufferedReader br=new BufferedReader(fr);
			String s=null;
			int i=0;
			while((s=br.readLine())!=null){
				System.out.println("第"+(++i)+"行:"+s);
			}
			br.close();
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
