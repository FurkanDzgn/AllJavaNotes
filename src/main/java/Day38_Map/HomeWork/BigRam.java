package Day38_Map.HomeWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;



public class BigRam {
	
	/**
	 * A bigram is any two adjacent words in the text disregarding case and punctuation. 
	 * A histogram is the count of how many times that particular bigram occurred in the text.
	 * Write the method will take String and it will return the map with count of particular bigram occurred in the text. 
	 */
	
	/**
	 * Given the text: �The quick brown fox and the quick blue hare.�
	 *  The bigrams with their counts would be.
        �the quick� 2 
        �quick brown� 1
        �brown fox� 1
        �fox and� 1 
        �and the� 1 
        �quick blue� 1 
        �blue hare� 1
	 */
	
	public static LinkedHashMap<String,Integer> method(String str){
		
		String [] arr = str.toLowerCase().trim().split(" ");
		List<String> list = Arrays.asList(arr);
		
		LinkedHashMap<String,Integer> linked = new LinkedHashMap<String, Integer>();
		
		for(int i=0; i<list.size()-1; i++) {
			
			if(linked.containsKey(list.get(i)+" "+list.get(i+1))) {
				int temp = linked.get(list.get(i)+" "+list.get(i+1));
				linked.replace(list.get(i)+" "+list.get(i+1), temp, ++temp);
			}else {
				linked.put(list.get(i)+" "+list.get(i+1), 1);
			}	
		}
	   
		return linked;
			
	}
	
//	public static Map<String, Integer> method(String str){
//		Map<String, Integer> map =  new HashMap();
//		
//		String [] arr = str.split(" ");
//		ArrayList<String> arr1 = new ArrayList();
//	
//		
//		for(int i=0; i<arr.length-1; i++) {
//				arr1.add(arr[i]+" "+arr[i+1]);		
//		}
//		
//		for(int i=0; i<arr1.size(); i++) {	
//			
//		
//			for(int k=0; k<arr1.size(); k++) {
//				int count=1;
//				if(arr1.get(i).equals(arr1.get(i))) {
//					count++;
//				}
//				 map.put(arr1.get(i), count);
//			}
//		   
//	}
//		return map;
//			
//	}
	
	public static void main(String[] args) {
		
	//	System.out.println(method("The quick brown fox and the quick blue hare."));
				
		String str = "The quick brown fox and the quick blue hare.";
		
        Map<String, Integer> map = new LinkedHashMap();
		
		String [] arr = str.toLowerCase().split(" ");
		System.out.println(Arrays.toString(arr));
		System.out.println(arr.length);
		
		for(int i=0; i<arr.length-1; i++) {
			String temp =(arr[i]+" "+arr[i+1]).trim().toLowerCase();
			if(!map.containsKey(temp))
			map.put(temp, 1);
			else {
				int count = map.get(temp);
				map.replace(temp, count, ++count);
			}
		}
		System.out.println(map);
		System.out.println(method(str));
		
		
//		   Map<String, Integer> map2 =   new LinkedHashMap();
//		   
//		   map2.put("1", 18);
//		   map2.put("1", 22);
//		   System.out.println(map2);
		
	}
	public static Map<String,Integer> determine(String text){
		 
		  text=text.toUpperCase();
		  text=text.replace(" ", "/");
		  System.out.println(text);
		  String[] textConvert=text.split("/");
		  System.out.println(Arrays.toString(textConvert));
		 
		  ArrayList<String> kad=new ArrayList<>();
		 
		  for(int b=0 ; b<textConvert.length;b++) {
		  if(b==textConvert.length-1) {
		
		  }else {
			  kad.add(textConvert[b]+" "+textConvert[b+1]);
		  }
		  }
		  System.out.println(kad);
		System.out.println(kad.get(0).equals(kad.get(5)));
	    Map<String,Integer> texto = new HashMap<>();
	    for(int i=0;i<kad.size();i++) {
	    	if(texto.containsKey(kad.get(i))) {
	    		 int count2=texto.get(kad.get(i));
	    		 texto.replace(kad.get(i),++count2);
	    	}else {
	    		texto.put(kad.get(i), 1);
	    	}
	    }
		return texto;
	}
}
