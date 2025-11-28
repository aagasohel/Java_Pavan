package setCollection;

import java.util.HashSet;

public class HashSetOperationDemo {

	public static void HashSetM2() {

		HashSet<Integer> setA=new HashSet<Integer>();
		setA.add(0);
		setA.add(2);
		setA.add(4);
		setA.add(6);
		setA.add(8);

		HashSet<Integer> setB= new HashSet<Integer>();
		//setB.add(1);
		setB.add(2);
		//setB.add(3);
		setB.add(4);
		//setB.add(5);

		System.out.println(setA);
		System.out.println(setB);

		//Union of two sets setA and setB //all values duplicate only once
		//		setB.addAll(setA);
		//		System.out.println("Union of setA and setB: "+setB);

		//intersection of setA and setB //common values
		//		setB.retainAll(setA);
		//		System.out.println("Intersection of setA and setB: "+setB);

		//difference of setA and setB (A-B)
		//		setA.removeAll(setB);
		//		System.out.println("Difference of setA and setB: "+setA);
		
		//subset operation
		System.out.println(setA.containsAll(setB));
	}
}
