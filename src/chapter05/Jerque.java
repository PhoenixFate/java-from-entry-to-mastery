package chapter05;

public class Jerque {
	public static void main(String[] args) {
//		String str="";
//		long startTime=System.currentTimeMillis();
//		for(int i=0;i<10000;i++){
//			str=str+i;
//		}
//		long endTime=System.currentTimeMillis();
//		System.out.println("消耗时间:"+(endTime-startTime));
//		StringBuilder builder=new StringBuilder("");
//		startTime=System.currentTimeMillis();
//		for(int i=0;i<10000;i++){
//			builder.append(i);
//		}
//		endTime=System.currentTimeMillis();
//		System.out.println(builder.toString());
//		System.out.println("StringBuilder耗时:"+(endTime-startTime));
//		
		StringBuilder sb=new StringBuilder("hello");
		sb.insert(4,"word");
		System.out.println(sb);
		sb.delete(5, 7);
		System.out.println(sb);
		                                                                                                                                                                                                                                                  
	}
}
