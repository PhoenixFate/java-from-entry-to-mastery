package chapter05;

public class Subs {
	public static void main(String[] args) {
		String  str="hello world";
		String subStr=str.substring(3);
		System.out.println("subStr:"+subStr);
		String subStr2=str.substring(3, 7);
		System.out.println("subStr2:"+subStr2);
	}
}
