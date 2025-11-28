package cursorsInJava;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListItrDemo {

	public static void listItrM1() {
		List l= new ArrayList();
		
		l.add(10);
		l.add("Rohit");
		l.add("Virat");
		
		System.out.println(l);
		
		ListIterator li = l.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		
		System.out.println("-------------------------------------");
		
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
		
		//li.add(30);
		//System.out.println(l);
		
		//li.remove();
		//System.out.println(l);
		
		li.set(10);
		System.out.println(l);
		
	}
}
