package Day38_Map.MapPractice;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapPrac {
	public static void main(String[] args) {
		
		TreeMap<String,String> books = new TreeMap();
		books.put("Big Potential", "Shawn");
		books.put("OCA", "Boyarsky");
		books.put("10x", "Cardone");
		// TreeMap follows ascending order according to keys 
		System.out.println(books);
		System.out.println(books.firstKey());
		System.out.println(books.lastKey());
		
		   // data type
		
		Set<String> keys = books.keySet();
		System.out.println(keys);
		
		
		Set<Map.Entry<String,String>> keyValue = books.entrySet();
		System.out.println(keyValue);
		// Map.Entry<String,String> it has two method getValue and getKey
		for(Map.Entry<String,String> kV: keyValue) {
			System.out.println(kV.getValue());
			System.out.println(kV.getKey());
			
		}
		
		books.remove("OCA");
		System.out.println(books);
		
				
	}

}
