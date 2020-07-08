package Day39_Inheritance.Inheritance;

public class Lion extends WildAnimal {
	
	public void roar() {
		System.out.println("Lion is roaring.");
	}
	
	@Override
	public void hunt() {
		System.out.println("Lion is hunting all night.");
	}
	
    @Override
	public void sleep() {
		System.out.println("Lion sleep at day time, and hunts at night.");
	}
    
   
}
