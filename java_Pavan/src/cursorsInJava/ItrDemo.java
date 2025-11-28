package cursorsInJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ItrDemo {

	public static void itrM1() {
		 List l = new ArrayList();
		 
		 l.add(10);
		 l.add("Sohel");
		 l.add("Kari");
		 
		 System.out.println(l);
		 
		Iterator it = l.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		it.remove();
		System.out.println(l);
	}
}
