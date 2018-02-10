package chapter17;

public class ArrayClass<T> {
	private T[] array;
	
	public T[] getArray() {
		return array;
	}

	public void setArray(T[] array) {
		this.array = array;
	}
	public static void main(String[] args) {
		ArrayClass<String> str=new ArrayClass<String>();
		String[] array={"成员1","成员2","成员3"};
		str.setArray(array);
		for(int i=0;i<str.getArray().length;i++){
			System.out.println(str.getArray()[i]);
		}
	}
}
