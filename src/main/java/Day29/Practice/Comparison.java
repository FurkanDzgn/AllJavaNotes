package Day29.Practice;

import java.util.ArrayList;
import java.util.List;

public class Comparison {
	
	public static void main(String[] args) {
		
		List<String> bookStore = new ArrayList<>();
		
		bookStore.add("OCA");
		bookStore.add("War and Peace");
		bookStore.add("Sell or be Sold");
		bookStore.add("Wonder");
		
		List<String> bookStore2 = new ArrayList<>();
    //	List<String> bookStore2 = bookStore;
		
		bookStore2.add("OCA");
		bookStore2.add("War and Peace");
		bookStore2.add("Sell or be Sold");
		bookStore2.add("Wonder");
		
		// .equals -> checking values of Lists
		if(bookStore.equals(bookStore2)) {
	        System.out.println("Same books");
		}else {
			System.out.println("Different books");
		}
		
		// == -> checking reference pointing objects
		if(bookStore == bookStore2) {
			System.out.println("Same books");
		}else {
			System.out.println("Different books");
		}
		
		bookStore2.add("Little prince");
		
		System.out.println(bookStore2.equals(bookStore));
		
		// Comparing two arrayList
		if(bookStore2.containsAll(bookStore)) {
			System.out.println("Same Books");
		}
		
		//  list.removeAll(list2) -> removing from list values all list2 values
		//  list.containsAll(list2) -> it is checking if list values has list2 values.
		
		// list.remove(value) -> it will remove value object from list 
		// list.contains(value) -> it is checking if value object is in list
		
	}

}
