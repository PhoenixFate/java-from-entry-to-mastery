package chapter17;

public class ConstantsTest {
	enum Constants2{
		Constants_A,Constants_B
	}
	//使用接口定义常量
	public static void doit(int c){
		switch(c){
		case Constants.Constants_A:
			System.out.println("doit() Constants_A");
			break;
		case Constants.Constants_B:
			System.out.println("doit() Constatns_B");
			break;
		}
	}
	public static void doit2(Constants2 c){
		switch(c){
		case Constants_A:
			System.out.println("doit2() Constants_A");
			break;
		case Constants_B:
			System.out.println("doit2() Constants_B");
			break;
		}
	}
	public static void main(String[] args) {
		ConstantsTest.doit(Constants.Constants_A);
		ConstantsTest.doit(Constants.Constants_B);
		ConstantsTest.doit2(Constants2.Constants_A);
		ConstantsTest.doit2(Constants2.Constants_B);
		ConstantsTest.doit(3);
//		ConstantsTest.doit2(3);
	}
}
