package ListCollection;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class LinkedListDemo01 {
	public static void LinkedListM2() {
		//create linked list for string
		//LinkedList<String> cars = new LinkedList<String>();
		LinkedList cars = new LinkedList();

		
		//add elements to linkedlist
		cars.add("Volvo");//0
		cars.add("BMW");//1
		cars.add("Ford");//2
		
		System.out.println("Before addfirst method:" + cars);//[Volvo, BMW, Ford]
		cars.addFirst("Mercedes");
		System.out.println("After addfirst method:" + cars);//[Mercedes,Volvo, BMW, Ford]
		
		cars.addLast("Maruti");
		System.out.println("After addLast method:" + cars);//[Mercedes,Volvo, BMW, Ford,Maruti]
		System.out.println(cars.removeFirst());
		
		System.out.println("After removeFirst method:" + cars);//[Volvo, BMW, Ford,Maruti]
		cars.removeLast();
		System.out.println("After removeLast method:" + cars);//[Volvo, BMW, Ford]

		System.out.println("GetFirst() Method:" + cars.getFirst()); //Volvo
		System.out.println("GetLast() Method:" + cars.getLast()); // Ford

	
		System.out.println("Before push method:" + cars);//[Volvo, BMW, Ford]
		//push operation
		cars.push("new car"); // insert the element at the front of the list
		System.out.println("After push method:" + cars);//[new car, Volvo, BMW, Ford]

		System.out.println("pop operation : " + cars.pop()); //new car removes and returns the first element of this list.

		System.out.println("After pop method list contains :" + cars); //[Volvo, BMW, Ford]


		/*********************peek()************************/

		System.out.println("peek():" + cars.peek()); // Retrieves, but does not remove, the head (first element) of this list.
		System.out.println("List contains after peek() methods:" + cars);


		System.out.println("peekFirst():" + cars.peekFirst());
		System.out.println("List contains after peekFisrt() methods:" + cars);

		System.out.println("peekLast():" + cars.peekLast());
		System.out.println("List contains after peekLast() methods:" + cars);

		//Reading elements from linkedlist using for loop

		for(int i=0; i<cars.size();i++)
		{
			System.out.println(cars.get(i));//i=0=volvo,1=BMW,2=Ford
		}

		//Reading linked list elements using for..each loop 

		for(Object e:cars)
		{
			System.out.println(e);
		}

		//Iterator method
		Iterator it = cars.iterator();

		while(it.hasNext())
		{
			System.out.println(it.next());
		}
					
		//sort linked list
		System.out.println("Before sorting: "+ cars);
		Collections.sort(cars);
		System.out.println("After sorting: "+ cars);

		//sort in reverse order
		Collections.sort(cars,Collections.reverseOrder());
		System.out.println("After sorting in reverse order: "+ cars);

		Collections.shuffle(cars);

		System.out.println("After shuffling: "+ cars);

	}
}
