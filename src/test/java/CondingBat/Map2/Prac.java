package CondingBat.Map2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Prac {
//	/**
//	 * Given an array of strings, return a Map<String, Integer> containing a key for every different string in the array,
//	 * and the value is that string's length.
//	 * wordLen(["this", "and", "that", "and"]) → {"that": 4, "and": 3, "this": 4}
//	 * @param strings
//	 * @return
//	 */
	public Map<String, Integer> wordLen(String[] strings) {
		  
        Map<String,Integer> map=new HashMap<String, Integer>();	
		for(int i=0;i<strings.length;i++) {	
			map.put(strings[i], strings[i].length());	
		}
		return map;
	}
	
	public Map<String, String> pairs(String[] strings) {
	
		Map<String,String> map=new HashMap<>();
		
		for(int i=0;i<strings.length;i++) {
			map.put(String.valueOf(strings[i].charAt(0)),String.valueOf(strings[i].charAt(strings[i].length()-1)));
				
			}
		return map;
		}
//	/**
//	 * 
//     * The classic word-count algorithm: given an array of strings,
//     * return a Map<String, Integer> with a key for each different string,
//     * with the value the number of times that string appears in the array.
//     * 
//     * wordCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
//     * wordCount(["c", "b", "a"]) → {"a": 1, "b": 1, "c": 1}
//     * wordCount(["c", "c", "c", "c"]) → {"c": 4}
//	 */
	public Map<String, Integer> wordCount(String[] strings){
		
		Map<String,Integer> map=new HashMap<String, Integer>();
		
		for(int i=0; i<strings.length;i++) {
			if(map.containsKey(strings[i])) {
				int temp = map.get(strings[i]);
				map.replace(strings[i], ++temp);
			}else {
				map.put(strings[i], 1);
			}
		}
		return map;
	}
//	/*
//	 *  firstChar(["salt", "tea", "soda", "toast"]) → {"s": "saltsoda", "t": "teatoast"}
//	 */
	public Map<String, String> firstChar(String[] strings) {
		
		Map<String,String> map=new HashMap<String, String>();
		
		for(int i=0; i<strings.length;i++) {
				
				if(!(map.containsKey(""+strings[i].charAt(0)))) {
					map.put(""+strings[i].charAt(0), strings[i]);
				
				}
			else {
				String x =map.get(""+strings[i].charAt(0));
				map.replace(""+strings[i].charAt(0),x+strings[i] );
				 
			}
		}
		return map;
	}
	
	public String wordAppend(String[] strings) {
		
		Map<String,Integer> map=new LinkedHashMap<String, Integer>();
		String result="";
		for(int i=0; i<strings.length;i++) {
			if(map.containsKey(strings[i])) {
				int temp = map.get(strings[i]);
				map.replace(strings[i], ++temp);
				if(map.get(strings[i])%2==0) {
					result+=strings[i];
				}
			}else {
				map.put(strings[i], 1);
			}
		}
//		Set<Map.Entry<String, Integer>> set = map.entrySet();
//		for(Map.Entry<String, Integer> m:set) {
//			if(m.getValue()%2==0) {
//				int x=m.getValue()/2;
//				for(int k=0;k<x;k++) {
//				     result+=m.getKey();
//				}
//			}else if(m.getValue()>1 && m.getValue()%2==1) {
//				int y=m.getValue()/2;
//				for(int l=0;l<y; l++) {
//					result+=m.getKey();
//				}
//			}
//		}
		return result;
	}
	public List<Integer> doubling(List<Integer> nums) {
		  
		 nums.replaceAll(n -> n*2);
		  return nums;
		
//		List<Integer> list = new ArrayList<Integer>();
//	for(int i=0; i<nums.size();i++) {
//	
//		list.add(nums.get(i)*2);
//		
//	}
//		  return list;
	}
	public Map<String, Boolean> wordMultiple(String[] strings) {
	
		Map<String,Boolean> map = new HashMap<String, Boolean>();
		for(int i=0;i<strings.length;i++) {
			if(map.containsKey(strings[i])) {
				map.replace(strings[i], true);
			}else {
				map.put(strings[i], false);
			}
		}
		return map;
	}
	
	// allSwap(["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]) → ["ay", "by", "cy", "cx", "bx", "ax", "azz", "aaa"]
	public String[] allSwap(String[] strings) {
		
	    String[] arr = new String[strings.length];
	    
	    Map<Character,Integer> map=new LinkedHashMap();
	    
	    for(int i=0;i<strings.length;i++) {
	    	if(map.containsKey(strings[i].charAt(0))) {
	    		
	    		int x=map.get(strings[i].charAt(0));
	    		map.remove(strings[i].charAt(0));
	    		arr[i]=arr[x];
	    		arr[x]=strings[i];
	    		
	    	}else {
	    		map.put(strings[i].charAt(0), i);
	    		arr[i]=strings[i];
	    	}
	    	
	    }
	    return arr;
	
	
	
	}
	public String[] allSwap2(String[] strings) {
		  
		String[] arr = new String[strings.length];
		Map<Character,Integer> map = new HashMap();
		
		for(int i=0;i<strings.length;i++) {
			if(map.containsKey(strings[i].charAt(0))) {
				int x=map.get(strings[i].charAt(0));
				map.remove(strings[i].charAt(0));
				arr[i]=arr[x];
				arr[x]=strings[i];
			}else {
				map.put(strings[i].charAt(0), i);
				arr[i]=strings[i];
			}
		}
		return arr;
	}
	public String[] firstSwap(String[] strings) {
		
		String[] arr=new String[strings.length];
		Map<Character,Integer> map = new HashMap<Character, Integer>();
		int c=0;
		for(int i=0;i<strings.length;i++) {
			if(map.containsKey(strings[i].charAt(0))) {
				int x=map.get(strings[i].charAt(0));
				map.remove(strings[i].charAt(0));
			    arr[i]=arr[x];
			    arr[x]=strings[i];
			}else {
				map.put(strings[i].charAt(0), i);
				arr[i]=strings[i];
			}
		}
		
		return arr;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
