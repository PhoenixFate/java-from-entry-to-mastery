package chapter09;

public class MathRandomChar {
	public static char GetRandomChar(char char1,char char2){
		return (char)(char1+Math.random()*(char2-char1));
	}
	public static void main(String[] args) {
		System.out.println("任意小写字符："+GetRandomChar('a','z'));
		System.out.println("任意大写字符:"+GetRandomChar('A', 'Z'));
		System.out.println("任意0-9:"+GetRandomChar('0', '9'));
	}
}
