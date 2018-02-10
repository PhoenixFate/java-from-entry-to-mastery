package chapter05;

public class General {
	public static void main(String[] args) {
		String str=String.format("%d", 400/2);
		System.out.println("400/2:"+str);
		String str2=String.format("%b", 3>5);
		System.out.println("3>5"+str2);
		String str3=String.format("%x", 200);
		System.out.println("200的十六进制数是:"+str3);
	}
}
