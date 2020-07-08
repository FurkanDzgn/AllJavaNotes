package Day39_Inheritance.Inheritance;

public class WildAnimal extends Animal { // we can extends only one class
	
	@Override
	public void eat() {
		System.out.println("Wild animal is eating meat.");
	}
	
	public void hunt() {
		System.out.println("Wild animal is hunting.");
	}
	
	public void craw() {
		System.out.println("Wild animal is crawling.");
	}
}
