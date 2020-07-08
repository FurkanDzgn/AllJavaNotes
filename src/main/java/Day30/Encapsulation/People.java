package Day30.Encapsulation;

public class People {
	
	public static void main(String[] args) {
		
		Person person1 = new Person();  // Default empty constructor
		person1.setName("David");
		person1.setAge(20);
		person1.setGender('M');
		person1.setIsEmployed(true);
		
		System.out.println(person1.getName());
	
		System.out.println(person1.toString());
		
		
//		System.out.println(person1.toString()); // (Object Class) Original located in Object class
		
//		String name= "Jhon";
//		System.out.println(name);
//		System.out.println(name.toString()); // (String Class) return the value of String
	
		// println(person1) -> calls String.valueOf(person1) -> returning String and calling toString(person1)
		// -> returning the memory address for this object.
		// -> it will print the value printed in toString() method in Person class.
		
//		System.out.println(person1.toString());
	}

}
