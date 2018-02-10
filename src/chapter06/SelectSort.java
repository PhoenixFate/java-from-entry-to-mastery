package chapter06;


import java.util.Arrays;

public class SelectSort {
	public static void main(String[] args) {
		int[]array={63,4,24,1,3,15};
		SelectSort sorter=new SelectSort();
		sorter.sort(array);
		System.out.println(Arrays.toString(array));
		
	}
	public void sort(int[] array){
		int index;
		for(int i=1;i<array.length;i++){
			index=0;
			for(int j=1;j<=array.length-i;j++){
				if(array[index]<array[j]){
					index=j;
				}
			}
			int temp=array[array.length-i];
			array[array.length-i]=array[index];
			array[index]=temp;
		}
	}
}
