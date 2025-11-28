package mapCollection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void HashMapM1() {

		//create hashmap in java
		HashMap<Integer,String> hm =new HashMap<>(); // key value pair

		//add elements to HashMap
		hm.put(10, "Java"); //Entry 1
		hm.put(2, "Python"); //Entry 2
		hm.put(3, "JavaScript"); //Entry 3
		//hm.put(3, "html"); //keys unique
		//hm.put(4, "Java"); //value can duplicate
		//hm.put(null, null); //can have one null key and multiple null values
		hm.put(4, null);

		System.out.println("HashMap "+hm); //{1=Java, 2=Python, 3=JavaScript}
	

		//get() method to get value
		String value =hm.get(1);
		System.out.println("Value at index 1: "+value);

		// keySet() return Set<Integer> as key are always unique
		System.out.println("KeySet: "+hm.keySet()); //[1, 2, 3]

		// values() returns Collection<String> as values can be duplicate 
		System.out.println("Values: "+hm.values()); // [Java, Python, JavaScript]

		//entrySet() returns Set<Entry<Integer, String>> key value pair
		Set<Entry<Integer, String>> keyValSet = hm.entrySet();
		System.out.println("Key/Value set: "+keyValSet); //[1=Java, 2=Python, 3=JavaScript]

		//replace element with key 3
		hm.replace(3, "C++");
		System.out.println("HashMap after replace key 3 value: "+hm); //{1=Java, 2=Python, 3=C++}

		//remove element from HashMap
		//hm.remove(2);
		//hm.remove(2, "Python");
		//System.out.println("HashMap after renoving key 2 value: "+hm); //{1=Java, 3=C++}

		System.out.println("containsKey() 4: "+hm.containsKey(4));//false

		System.out.println("containsValue() Java: "+hm.containsValue("Java")); //true

		System.out.println("Size of HashMap: "+ hm.size());//3 

		//hm.clear(); //remove all entries from HashMap
		//System.out.println("Is HashMap Empty: "+hm.isEmpty()); //true

		//create 2nd hashmap in java
		/*HashMap<Integer,String> hm1 =new HashMap<>(); // key value pair

		//add elements to HashMap
		hm1.put(4, "Ruby"); //Entry 1
		hm1.put(5, "C#"); //Entry 2
		hm1.put(6, "Html"); //Entry 3

		System.out.println("HashMap 2: "+hm1);
		
		hm.putAll(hm1);
		System.out.println("hm HashMap after putAll() method: "+hm);*/
		
		Set<Integer> keys = hm.keySet();
		
		/*for(int key:keys)
		{
			System.out.println(key);
		}*/
		
		Iterator it = keys.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		Collection<String> values = hm.values();
		
		/*for(String val:values)
		{
			System.out.println(val);
		}*/

		Iterator it1 = values.iterator();
		
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		
		Set<Entry<Integer, String>> entries = hm.entrySet();
		
		/*for(Entry e:entries)
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}*/
		
		Iterator<Entry<Integer, String>> it2 = entries.iterator();
		
		while(it2.hasNext()) {
			Entry<Integer, String> e = it2.next();
			System.out.println(e.getKey()+" "+e.getValue());
		}

	}
}
