package Programmer.Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class recap {
	 /**
     * Count letters in a given string, this time use more advanced data types (like
     * Map/HashMap). Please exclude special characters like ',' '.' '!' '?' etc
     * For Example: 
     * 		"Hello World!" -> H -> 1, e ->1, l -> 3, o->2, W->1, r->1, d->1
     *
     * @param word
     * @return Map
     */
	
	public static Map<Character,Integer> method1(String str){
		
		String str2="";
		
		for(int i=0; i<str.length();i++) {
			if(Character.isLetter(str.charAt(i)) || Character.isDigit(str.charAt(i))) {
				str2+=""+str.charAt(i);
			}
		}
		
		
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		
		for(int i=0;i<str2.length();i++) {
			if(map.containsKey(str2.charAt(i))) {
				int temp=map.get(str2.charAt(i));
				map.replace(str2.charAt(i), ++temp);
				
			}else {
				map.put(str2.charAt(i),1);
			}
		}
		
		return map;
		
//		Map<Character,Integer> map = new HashMap();
//		
//		String str2="";
//		
//		for(int i=0;i<str.length();i++) {
//			if(Character.isLetter(str.charAt(i)) || Character.isDigit(str.charAt(i))) {
//				str2 += str.charAt(i);
//			}
//		}
//		
//		for(int i=0; i<str2.length(); i++) {
//			if(map.containsKey(str2.charAt(i))){
//				int temp = map.get(str2.charAt(i));
//				map.replace(str2.charAt(i), ++temp);
//			}else {
//				map.put(str2.charAt(i), 1);
//			}	
//		}
//		return map;
		
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
		
		 Map<Character,Integer> map = method1(word);
		 
		 List<Character> list=new ArrayList<>();
		 
		 Set<Map.Entry<Character, Integer>> set=map.entrySet();
		 
		 for(Map.Entry<Character, Integer> st:set) {
			 if(st.getValue()==1) {
				 list.add(st.getKey());
			 }
		 }
		 
		 return list;
		 
//		 Map<Character,Integer> map = method1(word);
//		 Set<Map.Entry<Character, Integer>> set = map.entrySet();
//		 List<Character> list = new ArrayList<Character>();
//		 for(Map.Entry<Character, Integer> kv:set) {
//			 if(kv.getValue()==1) {
//				 list.add(kv.getKey());
//			 }
//		 }
//				 return list;
	 }
	 
	 /**
	     * Every sentence should be separated and stored as a next index of the list
	     * return list of maps:
	     * Map should take 2 parameters and it indicates the position(index) of every word in a given sentence.
	     * You should have as many maps as sentences in a given example are.
	     * Store all you maps in a single List   
	     * for example:
	     *         Hello my name is Patel.Nice to meet you.
	     *          0    1   2   3   4    0    1   2    3 ............ index number
	     * @param sentences
	     * @return
	     */
	 public static List<Map<String, Integer>> complicatedDataTypes(String sentences) {
		 
		 String[] str=sentences.split("\\.");
		 
		 List< Map<String,Integer>> list=new ArrayList<Map<String,Integer>>();
		 
		 for(int i=0;i<str.length;i++) {
			 String[] arr=str[i].trim().split(" ");
			 Map<String,Integer> map=new HashMap<String, Integer>();
			 for(int k=0;k<arr.length;k++) {
				 map.put(arr[k], k);
			 }
			 list.add(map);
		 }
		 
		 return list;
		 
	
//		 String[] arr=sentences.split("\\.");
//		 
//		 List<Map<String,Integer>> list = new ArrayList<Map<String,Integer>>();
//		 
//		 for(int i=0;i<arr.length;i++) {
//			 String[] arr1 = arr[i].trim().split(" ");
//			 Map<String,Integer> map = new HashMap<String, Integer>();
//			 for(int k=0;k<arr1.length;k++) {
//				 map.put(arr1[k], k);
//			 }
//			 list.add(map);
//		 }
//		 return list;
		 
		 
	 }
	

}
