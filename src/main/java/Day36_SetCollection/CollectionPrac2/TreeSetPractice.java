package Day36_SetCollection.CollectionPrac2;

import java.util.Arrays;
import java.util.Iterator;
//import java.util.*;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetPractice {
	
	public static void main(String[] args) {
		
		Set<String> names = new TreeSet<>();  
		//  --> Left side will decide which methods to call.
		// right side new TreeSet<>(); will decide the implementation 
		// Polymorphism
		names.add("Askat"); // add from set class
		names.add("Volodymyr");
		names.add("Nicole");
		names.add("Murat");
		System.out.println(names);
		
	    //	System.out.println(names.first());   --->We can not call first() method from Set class has not first method
		// Cuz methods come from Set class
		
		
		TreeSet<String> flowers = new TreeSet<>();
		flowers.add("Rose"); // add from TreeSet class
		flowers.add("Tulip");
		flowers.add("Orchid");
		flowers.add("Sunflower");
		flowers.add("Violet");
		flowers.add("Aster");
		System.out.println(flowers);
		System.out.println(flowers.first());
		System.out.println(flowers.last());
		
		System.out.println("====1");
		
		// pollFirst();  ---> It takes first element and delete it
		// pollLast();   ---> It takes last element and delete it
		System.out.println(flowers.pollFirst());
		System.out.println(flowers.pollLast());
		System.out.println(flowers);
		
		System.out.println("====2");
		
	//	TreeSet<String> f= (TreeSet<String>) flowers.descendingSet();
		
		TreeSet<String> fll = (TreeSet<String>) flowers.descendingSet();
		System.out.println(fll);
		
		System.out.println(flowers.descendingSet()); // prints the flowers collection in descending order 
		
		System.out.println(flowers);
		
		System.out.println("====3");
		
		Iterator <String> it=flowers.descendingIterator(); 
		// DescendingIterator convert your TreeSet to Iterator object in descending way
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("====4");
		
		for(String flower: flowers) {
			if(flower.startsWith("R"))
				System.out.println(flower);
		}
		System.out.println("====5");
		
		Integer[] arr = {1995,12,1,3,2,1995,77,5,9,1,77,2,3};
		System.out.println(ascendingOrder(arr));
		
	}
	
	/**
	 *TASK:
	 * Create the method takes one Integer [] array
	 * This method return the values of array in Ascending and duplicate will be removed
	 * return type of this method must be TreeSet
	 * 
	 */
	
	public static TreeSet<Integer> ascendingOrder(Integer[] arr){
		
		TreeSet<Integer> result = new TreeSet<>(Arrays.asList(arr));
		return result;
		 // My result has not duplicate
		 // My result has not ascending order
	}
	
	
	
		

}
