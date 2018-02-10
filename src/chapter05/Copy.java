package chapter05;

import java.util.Arrays;

public class Copy {
	public static void main(String[] args) {
		int arr[]=new int[]{23,25,99};
		int newArr[]=Arrays.copyOf(arr, 5);
		for(int i=0;i<newArr.length;i++){
			System.out.println(newArr[i]);
		}
	}
}	
