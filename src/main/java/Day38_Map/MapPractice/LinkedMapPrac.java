package Day38_Map.MapPractice;

import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedMapPrac {
	
	public static void main(String[] args) {
		
		LinkedHashMap<String,Integer> linkedHashMap = new LinkedHashMap();
		
		linkedHashMap.put("Ajeesh", 33);
		linkedHashMap.put("Gaj", 44);
		linkedHashMap.put("David", 35);
		linkedHashMap.put("Suriya", 32);
		
		System.out.println(linkedHashMap);
		
		Set<String> key = linkedHashMap.keySet(); // return Set of keys.
		System.out.println(key);
		for(String k : key) { 
	//		System.out.println(k); // print all keys
			System.out.println(linkedHashMap.get(k)); // prints all values
		}
	
		
		linkedHashMap.replace("David", 40); // it will help to replace the value
		System.out.println(linkedHashMap);
		
		System.out.println(linkedHashMap.size());
		System.out.println(linkedHashMap.isEmpty());
		linkedHashMap.clear();
		
		
	}

}
