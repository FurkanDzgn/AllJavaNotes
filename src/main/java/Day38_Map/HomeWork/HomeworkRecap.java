package Day38_Map.HomeWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class HomeworkRecap {
	
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
	public static Map<String,Integer> recap(String str){
		
		Map<String,Integer> map = new LinkedHashMap();
		
    	String[] arr = str.toLowerCase().trim().split(" ");
		List<String> list = new ArrayList<String>();
		
		for(int i=0; i<arr.length-1; i++) {
			list.add(arr[i]+" "+arr[i+1]);			
		}
		
		for(int i=0; i<list.size(); i++) {
			if(map.containsKey(list.get(i))) {
				int count = map.get(list.get(i));
				map.replace(list.get(i), count, ++count);
			}else {
				map.put(list.get(i), 1);
			}
		}
		return map;
	}
	public static void main(String[] args) {
		
		String str = "The quick brown fox and the quick blue hare.";
		System.out.println(recap(str));
	}
	

}
