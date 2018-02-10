package chapter16;

public class Example_03 {
	static void staticMethod(){
		System.out.println("执行staticMethod()");
	}
	public int publicMethod( int i){
		System.out.println("执行publicMethod()");
		return i*100;
	}
	protected int protectedMethod(String s,int i) throws NumberFormatException{
		System.out.println("执行protectedMethod()");
		return Integer.parseInt(s)+i;
	}
	private String privateMethod(String...strings){
		System.out.println("执行privateMethod()方法");
		StringBuffer stringBuffer=new StringBuffer();
		for(int i=0;i<strings.length;i++){
			stringBuffer.append(strings[i]);
		}
		return stringBuffer.toString();
	}
}
