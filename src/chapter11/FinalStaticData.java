package chapter11;
import java.util.Random;
import static java.lang.System.out;
public class FinalStaticData {
	private static Random rand=new Random();
	private final int a1=rand.nextInt(10);
	private final static int a2=rand.nextInt(10);
	public static void main(String[] args) {
		FinalStaticData fdata1=new FinalStaticData();
		out.println("a1	"+fdata1.a1);
		out.println("a2	"+fdata1.a2);
		FinalStaticData fdata2=new FinalStaticData();
		out.println("a1	"+fdata2.a1);
		out.println("a2	"+fdata2.a2);
	}
}
