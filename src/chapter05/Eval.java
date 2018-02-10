package chapter05;

import java.util.Date;

public class Eval {
	public static void main(String[] args) {
		Date date=new Date();
		String year=String.format("%ty", date);
		System.out.println("年"+year);
		String month=String.format("%tm", date);
		System.out.println("月"+month);
		String day=String.format("%td", date);
		System.out.println("日"+day);
	}
}
