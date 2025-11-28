package interview;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void ALM1() {
		
	
	ArrayList<Object> al = new ArrayList();
	
	al.add(10);
	al.add("Sohel");
	al.add(12.5);
	al.add(true);
	
	System.out.println(al);
	
	ArrayList<Object> al1 = new ArrayList();
	al1.add(10);
	
	System.out.println(al1);
	
	System.out.println(al1.retainAll(al1));
	
	
	}
}
