package Day35_SetCollection.CollectionPractice;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetPractice {
	public static void main(String[] args) {
		
		Set<String> names = new HashSet<>();
		HashSet<String> carNames = new HashSet();
		carNames.add("Acura");
		carNames.add("Toyota");
		carNames.add("Honda");
		carNames.add("Lexus");		
		// Java will check first this value is inserted before or not
		// If the value is inserted then it will not add new element
		// if there is not value it will create the new element
		carNames.add("Acura");
		carNames.add("Audi");
		carNames.add("Alfa-Romeo");
//		carNames.add(null);
//  	carNames.add(null);
		System.out.println(carNames);
		
		/*
		 * NOTE:
		 * Since there is no order in set we do not have get method as well
		 */
	//	 carNames.get(1);  -->> we don't have
		// We don't have get and set method for SET
		
		/*
		 * get all the car name which starts with A
		 * to be able to  loop the Set Collection, we need to use forEach loop
		 */

		for(String str:carNames) {
			
			if(str.startsWith("A")) 
				System.out.println(str);
			// Because null doesn't have startsWith method and cuz of exception
		}
		
		System.out.println("==============");
		
		/*
		 * Create one set collection to store the numbers values are 2,5,3,10,56,33
		 * Create the loop to print the numbers is bigger than 10
		 */
		
		Set<Integer> numbers = new HashSet<>();
		numbers.add(2);
		numbers.add(5);
		numbers.add(3);
		numbers.add(10);
		numbers.add(56);
		numbers.add(33);
		System.out.println(numbers);
		
		// number will be all elements from your collection
		// for each loop works with only collections
		
		for(Integer number:numbers) {
			if(number >10)
				System.out.println(number);
		}
		
		
		Set<Integer> numbers1 = new HashSet<>();
		numbers1.add(44);
		numbers1.add(33);
		numbers1.addAll(numbers);  //  using addAll method we can store other Collections to Set collection
		System.out.println(numbers1+"*");

		
		// Iterator Method --> return type of this method is Iterator
		
		Iterator<Integer> iterator=numbers1.iterator();

		
		while(iterator.hasNext()) {
			
			if(iterator.next() == 10)
			System.out.println(iterator.next());
		}
		
		System.out.println("================");
		
		Set<Integer> ages = new HashSet<Integer>();
		ages.add(25);
		ages.add(34);
		ages.add(47);
		ages.add(18);
		
		// 25 --> int
		System.out.println(ages.contains(25)); // autoboxing
		// Autoboxing convert int to Integer object
		// Contains: it will return boolean, If the element is exist in your set
		// it will return true otherwise it will return false
		
		// isEmpty() ---> it will return boolean
		// if the Set is empty it will return true otherwise it will return false
		System.out.println(ages.isEmpty());
		
		// Clear() ---> This method will clear every value from your set.
		
		ages.clear(); // Set is mutable
		System.out.println(ages);
		System.out.println(ages.isEmpty());
		System.out.println(ages.contains(25));
		
		Set<String> bookNames = new HashSet<>();
		bookNames.add("Big Potential");
		bookNames.add("Rich Dad Poor Dad");
		bookNames.add("10X");
		
		// Remove() --> it will remove the element from your list
		bookNames.remove("Big Potential");
		System.out.println(bookNames);
		
		// RemoveAll() --> it takes parameter as collection and remove this collection values from your set
		
		Set<String> books = new HashSet<>();
		books.add("Rich Dad Poor Dad");
		books.add("10X");
		
		bookNames.removeAll(books);
		System.out.println(bookNames);
		
		System.out.println(books.size());
		System.out.println(bookNames.size());
	
		
		// Interface you can create with interface keyword
		// Class with  class keyword
		
		// OOP
		// you can not instantiate the object from interface
		// but you can instantiate the object from class using new keyword

	}
	
	
}
