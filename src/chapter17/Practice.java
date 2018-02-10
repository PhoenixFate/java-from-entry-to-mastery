package chapter17;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Practice {
	public static void main(String[] args) {
		A<? extends List<Object>> a=null;
		a=new A<ArrayList<Object>>();
		a=new A<LinkedList<Object>>();
		a.getClass();
		
		List<String> l1=new ArrayList<String>();
		l1.add("成员");
		List<?>l2=l1;//使用通配符声明的名称实例化的对象不能对其加入新的信息，只能获取或删除
		List<?>l3=new LinkedList<Integer>();
		l1.set(1, "新成员");
//		l2.set(2, "");
	}
	public void doSomething(A<?extends List<Object>> a){
		
	}
}
