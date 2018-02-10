package chapter05;

public class Tautog {
	public static void main(String[] args) {
		int arr2[][]=new int[][]{{4,3},{2,1}};
		System.out.println("");
		for(int[] x:arr2){
			
			for(int e:x){
				//System.out.println(x[x.length-1]);
				if(e==x.length){
					System.out.print(e);
				}else{
					System.out.print(e+"、");
				}
			}
		}
	}
}
