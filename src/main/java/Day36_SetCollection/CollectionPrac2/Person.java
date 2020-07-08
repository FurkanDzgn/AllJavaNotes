package Day36_SetCollection.CollectionPrac2;

public class Person {
	
	
	/**
    TASK
    Create one class called Person with 3 instance variable (name, age, city)
    Create one constructor with 3 arguments to instantiate the instance variables
    Create one PersonTest class
    Using Person class create three object and store those objects in to TreeSet
    Print name of all persons from TreeSet in PersonTest
     */
	
	public String name;
	public int age;
	public String city;
	
	public Person(String name, int age, String city) {
		
		this.name = name;
		this.age = age;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", city=" + city + "]\n";
	}


}
