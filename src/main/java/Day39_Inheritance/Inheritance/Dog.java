package Day39_Inheritance.Inheritance;

public class Dog extends DomesticAnimals{
	
	public void bark() {
		System.out.println("Dog is barking.");
	}
	
	@Override
	public void fly() {
		System.out.println("Dog can not fly.");
	}
	

}
