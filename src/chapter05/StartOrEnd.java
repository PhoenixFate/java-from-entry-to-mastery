package chapter05;

public class StartOrEnd {
	public static void main(String[] args) {
		String num1="22045612";
		String num2="21304578";
		boolean b1=num1.startsWith("22");
		boolean b2=num1.endsWith("78");
		boolean b3=num2.startsWith("22");
		boolean b4=num2.endsWith("78");
		System.out.println("num1是以22开始的吗？"+b1);
		System.out.println("num1是以78结束的吗？"+b2);
		System.out.println("num2是以22开始的吗？"+b3);
		System.out.println("num2是以78结束的吗?"+b4);
	}
}
