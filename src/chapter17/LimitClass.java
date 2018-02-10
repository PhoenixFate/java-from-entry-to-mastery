package chapter17;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LimitClass<T extends List<Object>>{
	public static void main(String[] args) {
		LimitClass<ArrayList<Object>> l1=new LimitClass<ArrayList<Object>>();
		LimitClass<LinkedList<Object>> l2=new LimitClass<LinkedList<Object>>();
		
		l1.getClass();
		l2.getClass();
		//LimitClass<HashMap> l3=new LimitClass<HashMap>();
	}
}
