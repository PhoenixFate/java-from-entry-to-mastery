package chapter09;

public class MathRandom {
	public static int GetEvenNum(double num1,double num2){
		int s=(int)num1+(int)(Math.random()*(num2-num1));
		if(s%2==0){
			return s;
		}
		else{
			return s+1;
		}
	}
	public static void main(String[] args) {
		System.out.println("任意2-32之间的偶数"+GetEvenNum(2, 32));
	}
}
