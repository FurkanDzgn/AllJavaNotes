package Day28_ArrayList.ArrayListPractice;

import java.util.ArrayList;
import java.util.Collections;

public class SpecificTypeList {
	
	public static void main(String[] args) {
		
		ArrayList<String> progLan = new ArrayList<>();
		ArrayList<Integer> numbers = new ArrayList<>();
		
		progLan.add("Java");
		progLan.add("C#");
		progLan.add("Python");
		progLan.add("JavaScript");
		
		numbers.add(10);
		numbers.add(15);
		numbers.add(3);
		numbers.add(66);
		numbers.add(11);
		numbers.add(54);
		
		// Python -> R
		
		progLan.set(progLan.indexOf("Python"), "R");
		System.out.println(progLan.get(progLan.indexOf("R")));
		System.out.println(progLan);
		
		for(int i=0; i< numbers.size(); i++) {
			if(numbers.get(i)%2 == 0) {
				System.out.println(numbers.get(i));
			}
		}
		System.out.println(numbers);
		
		// max number from arraylist
		// Arrays.sort(array);  Arrays.toString(array);
		
		Collections.sort(numbers);
		System.out.println(numbers);
		System.out.println(numbers.get(numbers.size()-1));
		
		System.out.println("==================");
		
		ArrayList<String> shoppingList = new ArrayList<>();
		
		shoppingList.add("Bread");
		shoppingList.add("Eggs");
		shoppingList.add("Milk");
		shoppingList.add("Apple");
		shoppingList.add("Chocolate");
		shoppingList.add("Toilet Papers");
		System.out.println(shoppingList);
		
		shoppingList.remove("Eggs");
		System.out.println(shoppingList);
		if(shoppingList.contains("Apple")) {
			System.out.println("Apple is bougth.");
			shoppingList.remove("Apple");
		}
		System.out.println(shoppingList);
		
		shoppingList.remove("Bread");
		
		System.out.println(shoppingList);
		if(shoppingList.isEmpty()) {
			System.out.println("Done");
		}else {
			System.out.println("Keep Shopping");
		}
		
		shoppingList.clear();
		System.out.println(shoppingList);
		
		if(shoppingList.isEmpty()) {
			System.out.println("Done");
		}else {
			System.out.println("Keep Shopping");
		}
		
		
	}

}
