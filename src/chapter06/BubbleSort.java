package chapter06;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] array={63,4,24,1,3,15};
		BubbleSort sorter=new BubbleSort();
		sorter.sort(array);
		System.out.println(Arrays.toString(array));
		
	}
	public void sort(int[] array){
		for(int i=0;i<array.length-1;i++){
			for(int j=i+1;j<array.length;j++){
				if(array[i]>array[j]){
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		showArray(array);
	}
	
	public void showArray(int []array){
		for(int i:array){
			System.out.print(i+",");
		}
		System.out.println();
	}
}
