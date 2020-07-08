package Day36_SetCollection.CollectionPrac2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class PersonTest extends Object {
	
	public static void main(String[] args) {
		
		Person person1 = new Person("Furkan", 25, "Manisa");
		Person person2 = new Person("Patel", 44, "New York");
		Person person3 = new Person("Tyler", 19, "Chicaho");
		Person person4 = new Person("Tyler", 19, "Chicaho");
		Person person5 = person1;
		
		// Since ThreeSet follows the ascending order, and in implementation Java
		// was not able to decide according which value to order, that's why we can not
		// use TreeSet to store Person object. It will throw ClassException
		HashSet<Person> people = new HashSet();
		
		people.add(person1);
		people.add(person2);
		people.add(person3);
		people.add(person4);
		people.add(person5);
		people.add(new Person("Patel", 44, "Los Angeles"));
		
		System.out.println(people);
		
		
		ArrayList<Person> arList = new ArrayList<>(people);
		System.out.println(arList);
		
		TreeSet<String> names = new TreeSet();
		
		for(Person pr: people) {		
			names.add(pr.name);
			System.out.println(pr.name);
		}
		System.out.println(names);
	}

}
