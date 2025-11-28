package ListCollection;

import java.util.Vector;

public class VectorDemo {

	public static void vectorM1() {
		
		//Declare vector
		Vector<String> v = new Vector<>();
		
		//add elements to vector
		v.add("Sohel");
		v.add("Karishma");
		v.add("Amit");
		v.add(null);
		v.add("Karishma");
		v.add(null);
		
		System.out.println("Elements in the vector: "+v);
	}
}
