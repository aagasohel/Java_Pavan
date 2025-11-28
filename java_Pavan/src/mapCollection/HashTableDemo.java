package mapCollection;

import java.util.Hashtable;

public class HashTableDemo {

	public static void HashTableM1() {
		
		Hashtable<String, String> ht = new Hashtable<String,String>();
		
		ht.put("emp01", "Amit");
		ht.put("emp02", "sandy");
		ht.put("emp03", "Tehreen");
		ht.put("emp04", "Amit");
		//ht.put("emp01", "Mandy");
		//ht.put(null, null);
		
		System.out.println(ht);
		
	}
}
