package setCollection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void HashSetM1() {
		
		//Declare HashSet
		HashSet hs =new HashSet();// Heterogeneous data
		HashSet<String> cars= new HashSet<String>(); // Homogeneous data
		HashSet<String> cars2 = new HashSet<String>();
		
		//insert element in cars collection
		//Set does not maintain insertion order
		//Duplicates are not allowed
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Maruti");
		cars.add("Audi");
//		cars.add("Audi");
		cars.add(null);
//		cars.add(null);
		
		System.out.println("Elements in the cars collection:"+ cars);// [null, Volvo, Audi, BMW, Maruti]
		
		//insert elements in cars2 collection
		cars2.add("Hyundai");
		cars2.add("Toyota");
		
		//add cars2 collection in cars collection
		cars.addAll(cars2);
		System.out.println("Elements in HashSet cars collection after addAll method: "+cars);//[Volvo, Toyota, Audi, BMW, Maruti, Hyundai]
		
		//remove element from cars collection
		cars.remove("Audi");
		System.out.println("Elements in HashSet cars collection after remove method: "+cars);//[Volvo, BMW, Maruti]
		
		// remove cars2 collection from cars
//		cars.removeAll(cars2);
//		System.out.println("Elements in HashSet cars collection after removeAll method: "+cars);
	
		//search BMW in cars collection using contains() method
		//System.out.println(cars.contains("BMW"));//true
		
		System.out.println(cars.containsAll(cars2));// True
		
		// check collection empty or not using isEmpty() method
		System.out.println(cars.isEmpty());//false
		
		//Size of collection
		System.out.println("Size of cars collection is: "+cars.size());
		
		//clear the collection
		//cars.clear();
		//System.out.println(cars.isEmpty());// true
		
		//Read elements from HashSet using for each loop
		
		/*for(String e:cars) {
			System.out.println(e);
		}*/
		
		Iterator it = cars.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
