package Day37_Map.MapPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExamples {
	
	public static void main(String[] args) {
		
		Map<String,String> phoneMap = new HashMap();
		
		phoneMap.put("123456789HGF963", "IPHONE 7S");
		phoneMap.put("111456789HGF963", "IPHONE 11 PRO MAX");
		phoneMap.put("100456789HGF963", "IPHONE 8+");
		System.out.println(phoneMap);
		
		phoneMap.put("100456789HGF963", "IPHONE 9+"); // same key different value
		System.out.println(phoneMap);
		
		phoneMap.put("109456789HGF963", "IPHONE 9+"); // different key same value
		System.out.println(phoneMap);
		
		// Key must be unique and value can be duplicate
		
		phoneMap.put(null, "Samsung Note 8");
		phoneMap.put(null, "Samsung Note 9"); // Value uptaded and old null key deleted
		phoneMap.put("109456789HGF963", null);
		phoneMap.put("666456789HGF777", null);
		System.out.println(phoneMap);
		
		System.out.println("================putAll");
	    
		// .putAll method
		Map<String,String> phoneSF = new HashMap<>();
		phoneSF.put("12433", "Motorola");
		phoneSF.put("12444", "Motorola");
	//	System.out.println(phoneSF);
		phoneMap.putAll(phoneSF);
		System.out.println(phoneMap);
		
	
		System.out.println("================get(key)");

		// get(key); --->> it will return the value matching with your key
		// do not use get method to make sure you  have key or not in your map
		System.out.println(phoneMap.get("12433"));
		// in your method if you are returning the object, in negative scenario you need to return null;
		System.out.println(phoneMap.get("11111"));
		System.out.println(phoneMap.get("666456789HGF777"));
		System.out.println(phoneMap.get(null));
		
		System.out.println("==================REMOVE");
		
		// REMOVE Method -->> it will key and value from your map
		
		phoneMap.remove(null);
		phoneMap.remove("12444", "Motorola");
		// We can remove using key or using key and value
		System.out.println(phoneMap);
		
		System.out.println("============KeySet()");
		
		// KeySet() -->> unique key 
		// return type is Set  -->> it will return all keys from map as a Set.
		
		HashMap<Integer,String> driverLicences = new HashMap();
		driverLicences.put(123, "Kushal");
		driverLicences.put(124, "Ajeesh"); // we can start with 0 ex: 024
		driverLicences.put(125, "Patel");
		driverLicences.put(126, "Priyanha");
		
		Set<Integer> licenceId = driverLicences.keySet();
		System.out.println(licenceId+"*");
		
		for(Integer id:licenceId) {
			System.out.println("id is "+ id);
		}
		
		/*
		 * Task
		 * Print only the value from map
		 * keySet , get(key);
		 */
		
		for(Integer key: licenceId) {
			if(driverLicences.get(key).startsWith("P"))
			System.out.println(driverLicences.get(key));
		}
		
		/*
		 * Create one class Camel Class with name, age location create getters and setters.
		 * Create another class called CamelClass with main method 
		 * Create new object and store with camelId inside the map 
		 * key will be String and Value will be camel object 
		 */
		
		
	
	}

}
