package chapter05;

public class Wordbook {
	public static void main(String[] args) {
		String str=new String("b");
		String str2=new String("a");
		String str3=new String("c");
		System.out.println(str+"compare to "+str2+":"+str.compareTo(str2));
		System.out.println(str2+"compare to "+str3+":"+str2.compareTo(str3));
	}
}
