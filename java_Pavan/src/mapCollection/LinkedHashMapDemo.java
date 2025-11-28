package mapCollection;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public static void linkedHashMapM1() {
		
		LinkedHashMap<Integer,String> emp = new LinkedHashMap<>();
		
		emp.put(1, "Krishna");
		emp.put(2, "Kunal");
		emp.put(3, "Sohel");
		//emp.put(3, "Satish");
		emp.put(4, "Sohel");
		emp.put(null, null);
		emp.put(5, null);
		
		
		System.out.println("Elements in the linkedHashMap: "+emp);
	}
}
