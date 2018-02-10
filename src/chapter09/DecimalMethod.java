package chapter09;

import java.text.DecimalFormat;

public class DecimalMethod {
	public static void main(String[] args) {
		DecimalFormat myFormat=new DecimalFormat();
		myFormat.setGroupingSize(2);
		System.out.println("将数字以分组的形式显示:"+myFormat.format(123456.789));
		myFormat.setGroupingUsed(false);
		System.out.println("不允许数字分组"+myFormat.format(123456.798));
	}
}
