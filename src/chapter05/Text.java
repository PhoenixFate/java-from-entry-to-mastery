package chapter05;

public class Text {
	public static void main(String[] args) {
		String str="we are students";
		int size=str.length();
		System.out.println("size:"+size);
		int indexOf=str.indexOf("a");
		System.out.println("indexOf:"+indexOf);
		char charAt=str.charAt(10);
		System.out.println("charAt:"+charAt);
		int lastIndexOf=str.indexOf("u");
		System.out.println("lastIndexOf:"+lastIndexOf);
		size=str.indexOf("");
		System.out.println("size:"+size);
		
	}
}
