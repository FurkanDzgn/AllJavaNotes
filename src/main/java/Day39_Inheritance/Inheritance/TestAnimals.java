package Day39_Inheritance.Inheritance;

public class TestAnimals {
	public static void main(String[] args) {
		
		Animal animal = new Animal();
		animal.eat();
		animal.fly();
		
		
		DomesticAnimals da = new DomesticAnimals();
		da.fly(); // method comes from Animal class.
		da.eat(); // method comes from DomesticAnimals class.
		System.out.println(da.isFriendly());
		da.sleep();
		da.run();
		
		Dog dog = new Dog();
		dog.numberOfLegs = 4;
		dog.numberOfTails = 1;
		dog.name = "Akush";
		dog.bark();
//		System.out.println(dog.name);
		dog.fly();
		da.fly();
		dog.eat();
				
	}

}
