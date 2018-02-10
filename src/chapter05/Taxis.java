package chapter05;

import java.util.Arrays;

public class Taxis {
	public static void main(String[] args) {
		int arr[]=new int[]{23,42,121,8};
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}
