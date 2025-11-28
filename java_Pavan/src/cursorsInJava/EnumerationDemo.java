package cursorsInJava;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {

	public static void enumerationM1() {
		
		Vector v = new Vector();
		
		v.add(10);
		v.add("Sohel");
		v.add(12.5);
		
		System.out.println(v);
		
		Enumeration e =v.elements();
		
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
	}
}
