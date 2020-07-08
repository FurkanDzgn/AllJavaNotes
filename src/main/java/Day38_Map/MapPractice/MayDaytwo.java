package Day38_Map.MapPractice;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MayDaytwo {
	
	public static void main(String[] args) {
		
		// Map is like a dictionary
		
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "Rolex");
		map.put(2, "Diesel");
		map.put(3, "Tag Heuer");
		map.put(4, "Citizen");
	//	map.replace(4, "JungHans");
	    
		System.out.println(map.replace(4, "JungHans"));
		System.out.println(map);
		map.put(3, "Tissot"); // I can do same job with put
		System.out.println(map);
		map.replace(6, "SaaT");
		System.out.println(map);
//		map.put(6, "SaaT"); // put the value This is the diffrence create another value
//		System.out.println(map);
		map.put(5, "River");
		System.out.println(map);
		
		System.out.println(map.containsValue("Rolex")); // true
		System.out.println(map.containsValue("Montana")); // false
		System.out.println(map.containsKey(1)); // true
		System.out.println(map.containsKey(6)); // false
		
		Collection<String> col = map.values(); //  -->> it is returning all values from your map, return type is collection string
		System.out.println(col+"*");
		
		for (String value:col) {
			if(value.startsWith("R"))
			System.out.println(value);
			System.out.println(value);
			
		}
		System.out.println("=====Ent");
		
		Set<Map.Entry<Integer,String>> keyValue= map.entrySet();
		System.out.println(keyValue);
		
		for(Map.Entry<Integer, String> kv:keyValue) {
		//	System.out.println(kv);
			System.out.println(kv.getKey());
			System.out.println(kv.getValue());
//			System.out.println(kv.setValue("Rolex"));
		}
		
		System.out.println(map.size()); // it will return int size of your map.
		System.out.println(map.isEmpty()); // if your map is Empty it will return true else false
		System.out.println(map);
		map.clear(); // it will clear everything from your map.
		System.out.println(map); // empty output 
		System.out.println(map.isEmpty()); // true
		
		System.out.println("================");
		
		// "yesterday"
		// y - 2, e - 2, s - 1 , t- 1 , r-1, d-1, a-1
		// "system"
		// s-2, y-1, t-1, e-1, m-1
		// Create one method it takes one parameter  as String
		// and it will return count of letter from String value
		/*
		 * 1 - convert string to char array to be able get all char from String
		 * 2- Create one HashMap<Character,Integer>
		 * 3- Check the char is inside your map
		 * 4- if it is inside your map increase the count of char
		 * 5- if it is not inside your map then add new entry
		 */
		
		String str = "system";
		System.out.println(getCount(str));
		String str2 = "yesterday";
		System.out.println(getCount(str2));
		
		
	}
	
	// system
	public static HashMap<Character,Integer> getCount(String str){
		
		char[] ch = str.toCharArray(); // [s,y,s,t,e,m]
		
		HashMap<Character,Integer> countLetter = new HashMap();
		
		for(char c:ch) {
	
			if(countLetter.containsKey(c)) {
				int count=countLetter.get(c);
				countLetter.replace(c, ++count);
			}else {				
				countLetter.put(c, 1);
			}
		}
		return countLetter;		
	}

}
