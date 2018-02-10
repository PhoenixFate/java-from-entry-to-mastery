package chapter05;

public class Judge {
	public static void main(String[] args) {
		String regex="\\w+@\\w+(\\.\\w{2,3})*\\.\\w{2,3}";
		String str1="aaaa@";
		String str2="aaaaa";
		String str3="wetjwejt@163.com";
		if(str1.matches(regex)){
			System.out.println(str1+"是一个合法的E-mail地址格式");
		}
		if(str2.matches(regex)){
			System.out.println(str2+"是一个合法的E-mail地址格式");
		}
		if(str3.matches(regex)){
			System.out.println(str3+"是一个合法的E-mail地址格式");
		}
	}
}
