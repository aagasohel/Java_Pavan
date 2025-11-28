package ListCollection;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void LinkedListM1() {
		//Declare Linked List
		//collection1
		LinkedList<String> ll = new LinkedList<String>();

		//add elements to the end of the link list
		ll.add("Ravi");//0 element
		ll.add("Rajesh");//1 element
		ll.add("Ram");//2 element
		//ll.add("Rajesh");
		//ll.add(null);
		//ll.add(null);

		System.out.println("After adding elements:" + ll);

		ll.add(1,"Uma");
		System.out.println("After adding Uma at 1st Position:" + ll);

		//collection2
		LinkedList<String> ll2 = new LinkedList<String>();
		ll2.add("Sita");
		ll2.add("Radha");
		ll2.add("Rohit");

		//add collection2 ll2 to the end of collection1 ll
		ll.addAll(ll2);
		System.out.println("After adding collection2 to collection1:" + ll);

		//Remove methods
		ll.remove("Ravi");
		System.out.println("After removing Ravi from collection1" + ll);

		ll.remove(2);
		System.out.println("After removing 2nd position element from collection1" + ll);

		//remove collection2 from collection1
		ll.removeAll(ll2);
		System.out.println("After removing collection2 from collection1:" + ll);

		//get & print element of position 1st
		System.out.println("element at 1st position is:" + ll.get(1));//Rajesh

		//Replace  1st position element by "Radha"

		ll.set(1,"Radha");
		System.out.println("After replacing Rajesh by Radha:" + ll);//[Uma, Radha]

		//contains method- check if Radha exists in the collection1
		System.out.println(ll.contains("Radha"));//true

		//remove all the elements from the collection1
		ll.clear();
		System.out.println("After removing all the element from collection1:" + ll);
	}

	
}
