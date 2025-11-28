package ListCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo01 {

	public static void ArrayListM1() {
		//Declare ArrayList
		List al = new ArrayList();//for heterogenous data

		//ArrayList<String> cars = new ArrayList<String>();//Homogenous data

		//add data to arraylist
		al.add("Java");//index=0
		al.add(66);//index=1
		al.add('H');//index=2
		al.add(true);//index=3
		al.add(12.4);//index4
		al.add(null);
		al.add(null);
		al.add(66);
		//print array list
		System.out.println(al);

		//size method
		System.out.println("Size of ArrayList:" + al.size());//5

		//Remove element
		//		al.remove(1);//remove index =1 i;e 66
		//		System.out.println("After removing 66:" + al);

		//get method -  to access values /element from array list

		System.out.println("Access element of index 1:" + al.get(1));//66

		//set method - used to replace/change element of array list
		al.set(0, "C++");
		System.out.println("After set method:" + al);

		//insert elemetn in arraylist
		al.add(1, 65);
		System.out.println("After insert method:" + al);

		//contains- to search element in array list

		System.out.println(al.contains("C++"));//True
		System.out.println("Is arraylist empty:" + al.isEmpty());//false

		//		//clear method- removes all the elements from list
		al.clear();
		System.out.println("After clear method:" + al);
	}

	
}
