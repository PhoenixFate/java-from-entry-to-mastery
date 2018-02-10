package chapter05;

import java.util.Date;

public class GetDate {
	public static void main(String[] args) {
		Date date=new Date();
		String hour=String.format("%tH", date);
		System.out.println("时:"+hour);
		String minute=String.format("%tM", date);
		System.out.println("分"+minute);
		String second=String.format("%tS", date);
		System.out.println("秒"+second);
		
		long currentTime=System.currentTimeMillis();
		System.out.println("currentTime:"+currentTime);
		String seconds=String.format("%tQ",date);
		System.out.println("currentTime2:"+seconds);
	}
}
