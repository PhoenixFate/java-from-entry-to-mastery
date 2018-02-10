package chapter11;
class Parents{
	private final void doit(){
		System.out.println("父类doit");
	}
	final void doit2(){
		System.out.println("父亲doit2");
	}
	public void doit3(){
		System.out.println("父类doit3");
	}
}
class Sub extends Parents{
	public final void doit(){
		System.out.println("子类doit");
	}
//	final void doit2(){
//		System.out.println("子类doit2");
//	}
	public void doit3(){
		System.out.println("子类doit3");
	}
}
public class FinalMethod {
	public static void main(String[] args) {
		Sub s=new Sub();
		s.doit();
		Parents p=s;
		p.doit2();
		p.doit3();
	}
}
