package Day28_ArrayList.ArrayListPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StoreValueList {
	public static void main(String[] args) {
		
		// List and ArrayList are doing the same job.
		// List is Interface, ArrayList is Class
		
		List<Integer> list = Arrays.asList(5,6,10,8,20);
		
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println(list);
		
		
		List<Object> list2 = Arrays.asList("Hello", 5, true, 10, 1, 'A');
		
	//	Collections.sort(list2); it doesn't work for objects
		
		System.out.println(list2);
		
		// ArrayList is an object? 
		
		ArrayList < List<Integer> > nestedList = new ArrayList<>();
		
		List<Integer> numbers = Arrays.asList(10,20,30,50);
	//	List<Integer> numbers = Arrays.asList(4,5,4,8,5);
		
		nestedList.add(numbers);
		
		System.out.println(nestedList.get(0).get(3));
		
		// Data Scientist -> works a lot with datas 
		
		System.out.println(nestedList);
		
	}

}
