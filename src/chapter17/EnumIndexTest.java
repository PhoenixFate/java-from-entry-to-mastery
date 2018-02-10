package chapter17;
import static java.lang.System.out;
public class EnumIndexTest {
	enum Constants2{
		Constants_A,Constants_B,Constants_C
	}
	public static void main(String[] args) {
		for(int i=0;i<Constants2.values().length;i++){
			out.println(Constants2.values()[i]+"在枚举类型中位置索引值:"+Constants2.values()[i].ordinal());
		}
	}
	
}
