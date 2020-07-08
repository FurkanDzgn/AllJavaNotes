package Day28_ArrayList.ArrayListPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysToList {
	public static void main(String[] args) {
		
		// Array to ArrayList
		
		List<Integer> values = new ArrayList<>(); //  ArrayList<Integer> values = new ArrayList<>();
		
		values.add(5);
		values.add(10);
		values.add(25);
	
		//	int x= Integer.valueOf((values.get(0)));
		// Converting ArrayList to Array 
		
		
//		int [] x = new int[values.size()];
//		int count = 0;
//		for(Integer value:values) {
//			x[count++] = Integer.parseInt(""+value);
//		}
				
		Object[] arrayValues = values.toArray();
		
		System.out.println(arrayValues[2]);
		System.out.println(Arrays.toString(arrayValues));
		
		// Converting Array to ArrayList
		
		String[] words = {"Hello", "This is","Java","And","I","love you"};
		
		List<String> wordList = Arrays.asList(words);
		System.out.println(wordList);
		
		Integer[] nums = {5,10,3};
		
		List<Integer> numsList = Arrays.asList(nums);
		System.out.println(numsList);
		
		// Array of primitive type like int, double ,long are not convertable to List
		// We can convert only object type of array to List like String, Integer, Double.....
			
	}

}
