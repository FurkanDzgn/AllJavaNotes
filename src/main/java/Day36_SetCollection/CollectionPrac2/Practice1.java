package Day36_SetCollection.CollectionPrac2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Practice1 {
	public static void main(String[] args) {
		
		HashSet<String> cities = new HashSet<>();
	
		cities.add("Chicago");
		cities.add("Los Angeles");
		cities.add("New York");
		cities.add("Atlanta");
		cities.add("San Francisco");
		cities.add("Dallas");
		
		System.out.println(cities);
		
		HashSet<String> californiaCities = new HashSet<>();
		californiaCities.add("Los Angeles");
		californiaCities.add("San Francisco");
		californiaCities.add("San Diego");
		
		cities.removeAll(californiaCities);
		System.out.println(cities);
		
		System.out.println("================");
		// --> How we can convert ArrayList to HashSet?
		// While we are creating HashSet inside the paranthesis we need to provide arraList name
		
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(1);
		numbers.add(20);
		numbers.add(30);
		numbers.add(20);
		
		System.out.println(numbers); // [1, 1, 20, 30, 20]
		
		HashSet<Integer> hashNumbers = new HashSet<>(numbers);
		System.out.println(hashNumbers);// [1, 20, 30]
		
		System.out.println("================*");
		
		Integer[] arrNumbers = {1,1,20,30,20};
		System.out.println(Arrays.toString(arrNumbers));
		HashSet<Integer> hashSet=new HashSet(Arrays.asList(arrNumbers));
		System.out.println(hashSet); // [1, 20, 30]
		
		ArrayList<Integer> integers = new ArrayList<>(hashSet);
		System.out.println(integers);
		ArrayList<Integer> integers1 = new ArrayList<>(hashNumbers);
		System.out.println(integers1);

		
		System.out.println("====================");
		
		System.out.println(uniqe("Techtorial"));	
		printUniqe("istanbul");
	    printUniqe1("Local Date");
	}
	
	/**
	 * 	 Task
         Create one method takes String value and this method print all unique letter from
         String	
	 */
	public static HashSet<Character> uniqe(String str) {
		
		ArrayList<Character> list = new ArrayList<>();
		
		for(int i=0; i<str.length(); i++) {
			list.add(str.charAt(i));
		}
		HashSet<Character> hashLetters = new HashSet<>(list);
		
		return hashLetters;
	}
	
	public static void printUniqe(String str) {
//		// toCharArray() --> It will convert your String to char array
//		char [] ch=str.toCharArray();
//		// Arrays.asList() --> will convert array to ArrayList
		
		ArrayList<Character> characters = new ArrayList<>();
		for(int i=0; i<str.length(); i++) {
			characters.add(str.charAt(i));
		}
		
		HashSet<Character> unique = new HashSet(characters); // HashSet unique = new HashSet(Arrays.asList(ch));
		System.out.println(unique);
			
	}
	
	public static void printUniqe1(String str) {
		HashSet<Character> characters = new HashSet();
		for(int i=0; i< str.length(); i++) {
			characters.add(str.charAt(i));
		}
		System.out.println(characters);
	}
	

}
