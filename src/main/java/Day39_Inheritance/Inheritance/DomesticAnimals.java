package Day39_Inheritance.Inheritance;

public class DomesticAnimals extends Animal {
	
	public boolean isFriendly() {
		return true;
	}
	
	@Override // In order to make sure overriding the method use @Override annotation.
	public void sleep() {
		System.out.println("Domestic animals are sleeping in cage.");
	}
	@Override
	public void eat() {
		System.out.println("Domestic animals are eating.");
	}
	

}
