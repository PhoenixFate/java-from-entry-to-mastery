package chapter05;

public class Division {
	public static void main(String[] args) {
		String str=new String("abc,def,ghi,gki");
		String[] newStr=str.split(",");
		for(int i=0;i<newStr.length;i++){
			System.out.println(newStr[i]);
		}
		System.out.println("------------");
		String[] newStr2=str.split(",", 2);
		for(int i=0;i<newStr2.length;i++){
			System.out.println(newStr2[i]);
		}
	}
}
