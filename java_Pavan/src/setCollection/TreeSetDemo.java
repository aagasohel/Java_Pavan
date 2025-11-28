package setCollection;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void TreeSetM1() {
	TreeSet<String> ts = new TreeSet<>();
	
	//add element in Treeset
	ts.add("Volvo");
	ts.add("BMW");
	ts.add("Mercedes");
	ts.add("Hyundai");
	
	System.out.println("Element in the treeSet: "+ts);
	}
}
