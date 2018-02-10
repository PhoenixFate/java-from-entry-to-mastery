package chapter05;

public class Matrix {
	public static void main(String[] args) {
		int a[][]=new int[3][4];
		System.out.println("a.length:"+a.length);
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				System.out.println(a[i][j]);
			}
		}
	}
}
