
package Day36_SetCollection.CollectionPrac2;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class LinkedSetPractice {
	
	public static void main(String[] args) {
		
		// it follows insertion order
		LinkedHashSet<String> countries=new LinkedHashSet<String>();
		countries.add("USA");
		countries.add("Canada");
		countries.add("Brazil");
		countries.add("Mexico");
		countries.add("France");
		
		System.out.println(countries);
		// We have all the method HashSet has
		countries.remove("Canada");
		System.out.println(countries);
		System.out.println(countries.isEmpty());
		System.out.println(countries.contains("Brazil"));
		System.out.println(countries.size());
		
		// We don't have index number and we don't have a get method
	
		System.out.println("==============");
		
		Integer[] arr = new Integer[] {15,10,11,45,50,60,50,15};
		
		System.out.println(printUniqueArr(arr));
		
		System.out.println("==============");
		
		Integer[] nums = {1,2,3,4,5,6,7,8,9};
//		System.out.println(Arrays.toString(nums));
		
		System.out.println(duplicateCheck(arr));
		System.out.println(duplicateCheck(nums));
	//	LinkedSetPractice.duplicateCheck(nums);
	
	}
	
	/**
	 * Create one method, it takes one parameter as Integer Array and
	 *  from this it  will convert to linkedHashSet
	 *  this method will return linkedHashSet collection.
	 */
	public static LinkedHashSet<Integer> printUniqueArr(Integer[] arr){
		
		//first convert array to arrayList
		//Arrays.asList();
		LinkedHashSet<Integer> result = new LinkedHashSet<Integer>(Arrays.asList(arr));
		return result;
		
	}
	/**
	 * TASK
	 * Create one method takes Integer array, if this array has not duplicate value
	 * method will return true, has duplicate value method return false
	 */
	
	public static boolean duplicateCheck(Integer[] arr) {
		
//		ArrayList<Integer> arrr =new  ArrayList<Integer>(Arrays.asList(arr));
//		List<Integer> arrr1 =Arrays.asList(arr);
		
		LinkedHashSet<Integer> result = new LinkedHashSet<Integer>(Arrays.asList(arr));
		
		if(arr.length == result.size()) {
			return true;
		}
		return false;
	}

}
