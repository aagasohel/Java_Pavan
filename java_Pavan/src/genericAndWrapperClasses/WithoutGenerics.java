package genericAndWrapperClasses;

import java.util.ArrayList;

public class WithoutGenerics {

	static void withoutGen() {
		
		//creating an arraylist without any type specified
		ArrayList al = new ArrayList();
		
		al.add("Sohel");
		al.add("Mohsin");
		al.add(10);
		
		String s1 =(String) al.get(0); // get method returns object so there is a type mismatch so need to typecast
		String s2 =(String) al.get(1);
		
		//Causes Runtime exception java.lang.ClassCastException
		String i =(String) al.get(2);	
	}
}
