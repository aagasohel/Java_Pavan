package setCollection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void LinkedHashSetM1() {
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet(); //Homogeneous data
		//LinkedHashSet linkedHashSet = new LinkedHashSet();//Heterogeneous data
		//HashSet linkedHashSet = new HashSet(); 
		
		//HashSet does not maintain insertion order
		// LinkedHashSet maintain insertion order as it contains HashTable and doubly linkedList data structure
		
		linkedHashSet.add(10);
		linkedHashSet.add(20);
		linkedHashSet.add(30);
		linkedHashSet.add(40);
		linkedHashSet.add(50);
		linkedHashSet.add(null);
		linkedHashSet.add(null);
		
		System.out.println(linkedHashSet);
		
	}
}
