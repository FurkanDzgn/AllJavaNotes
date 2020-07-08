package Day28_ArrayList.ArrayListPractice;

import java.util.ArrayList;

public class RemoveMethod {
	
	public static void main(String[] args) {
	
		ArrayList<Integer> numbers = new ArrayList<>();
		
		numbers.add(5); //0
		numbers.add(0); //1
		numbers.add(1); //2
		numbers.add(3); //3
		numbers.add(2); //4
		System.out.println(numbers);
		
		numbers.remove(0);
		numbers.remove(numbers.indexOf(2));
		
		System.out.println(numbers);
		
		Integer value = 3;
		numbers.remove(value); // int 3 -> Integer 3
		System.out.println(numbers);
		
		numbers.remove(Integer.valueOf(2));
		System.out.println(numbers);
		
		
	}

}
