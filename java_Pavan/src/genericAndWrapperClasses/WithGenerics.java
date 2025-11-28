package genericAndWrapperClasses;

import java.util.ArrayList;

public class WithGenerics {

	static void withGen() {
		
		//creating an arraylist with String specified
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("Sohel");
		al.add("Mohsin");
		
		//Now compiler doesn't allow this
		//al.add(10);
		
		String s1 =(String) al.get(0); 
		String s2 = (String) al.get(1);
		System.out.println(s1);
		System.out.println(s2);
		
	}
}
