package Programmer.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PracticeMap {

	    /**
	     * Count letters in a given string, this time use more advanced data types (like
	     * Map/HashMap). Please exclude special characters like ',' '.' '!' '?' etc
	     * For Example: 
	     * 		"Hello World!" -> H -> 1, e ->1, l -> 3, o->2, W->1, r->1, d->1
	     *
	     * @param word
	     * @return Map
	     */
	    public static Map<Character, Integer> countLetters(String word) {
	        //TODO
	    
			
	    	Map<Character,Integer> counter = new HashMap();
	    	String str = "";
	    	for(int i=0; i<word.length(); i++) {
	    		if(Character.isLetter(word.charAt(i)) || Character.isDigit(word.charAt(i))) {
	    			str+=""+word.charAt(i);
	    		}
	    	}
	    	for(int i=0; i<str.length(); i++) {
	    		if(counter.containsKey(str.charAt(i))) {
	    			int temp = counter.get(str.charAt(i));
	    			counter.replace(str.charAt(i), ++temp);
	    		}else {
	    			counter.put(str.charAt(i), 1);
	    		}
	    	}
	        return counter;
	    }

	    /**
	     * Get only unique letters from given string
	     * and return them in list data type
	     * For Example: 
	     * 	   "Hello World!" -> H -> 1, e ->1, W->1, r->1, d->1
	     * 
	     * @param word
	     * @return List<Character>
	     */
	    public static List<Character> uniqueLetters(String word) {
	        //TODO
	    
		
	    	Map<Character, Integer> map = countLetters(word);
	    
	    	Set<Map.Entry<Character, Integer>>  set = map.entrySet();
	    	List<Character> list = new ArrayList<Character>();
	    	for(Map.Entry<Character, Integer> kv:set) {
	    		if(kv.getValue()==1) {
	    			list.add(kv.getKey());
	    		}
	    	}
	        return list;
	        
//	    	Set<Character> set = new LinkedHashSet();
//	        char[] arr = word.toCharArray();
//	    	List<Character> list = new ArrayList(Arrays.asList(arr));
//	    	for(int i=0; i<list.size(); i++) {
//	    		for(int k=0; k<list.size(); k++) {
//	    			if()
//	    		}
//	    	}
	    }

	    /**
	     * Every sentence should be separated and stored as a next index of the list
	     * return list of maps:
	     * Map should take 2 parameters and it indicates the position(index) of every word in a given sentence.
	     * You should have as many maps as sentences in a given example are.
	     * Store all you maps in a single List   
	     * for example:
	     *         Hello my name is Patel.Nice to meet you.
	     * 
	     * @param sentences
	     * @return
	     */
	    public static List<Map<String, Integer>> complicatedDataTypes(String sentences) {
	        //TODO
	    	
	    	
	    	String [] arr = sentences.split("\\.");
	    
	        List<Map<String, Integer>> list = new ArrayList();
	    
	    	for(int i=0; i<arr.length; i++) {
	    		String [] arrdi = arr[i].trim().split(" ");
	    		
	    		Map<String,Integer> map = new HashMap();
	    		
	    		for(int k=0; k<arrdi.length; k++) {
	    			map.put(arrdi[k], k);
	    		}
	    		list.add(map);
	    	}
	    	
	        return list;
	    }
}
