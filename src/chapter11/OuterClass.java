package chapter11;

public class OuterClass {
	innerClass in=new innerClass();
	public void ouf(){
		System.out.println("ouf()");
		in.inf();
	}
	class innerClass{
		innerClass(){
			System.out.println("innerClass()");
		}
		public void inf(){
			System.out.println("inf()");
		}
		int y=0;
	}
	public innerClass doit(){
		in.y=4;
		return new innerClass();
	}
	public static void main(String[] args) {
		OuterClass out=new OuterClass();
		OuterClass.innerClass in2=out.new innerClass();
		OuterClass.innerClass inn=out.doit();
	}
}
