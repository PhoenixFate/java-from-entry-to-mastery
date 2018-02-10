package chapter12;

public class Take {
	public static void main(String[] args) {
		try {
			 String str="lili";
			 System.out.println(str+"年龄是:");
			 int age=Integer.parseInt("20L");
			 System.out.println(age);
		} catch (Exception e) {
			String str=e.getMessage();
			System.out.println(str);
			e.printStackTrace();
			
		}
		System.out.println("program over");
	}
}
