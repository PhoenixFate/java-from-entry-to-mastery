package chapter06;

import java.util.Arrays;

public class ReverseSort {
	public static void main(String[] args) {
		int[] array={10,30,20,60,50};
		ReverseSort sorter=new ReverseSort();
		System.out.println(Arrays.toString(array));
		sorter.sort(array);
		
	}
	public void sort(int[] array){
		int temp;
		for(int i=0;i<array.length/2;i++){
			temp=array[i];
			array[i]=array[array.length-i-1];
			array[array.length-i-1]=temp;
		}
		System.out.println(Arrays.toString(array));
	}
}
