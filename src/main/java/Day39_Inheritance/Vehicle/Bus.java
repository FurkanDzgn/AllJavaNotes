package Day39_Inheritance.Vehicle;

public class Bus extends Vehicle1 {
	
	@Override
	public void stop() {
		System.out.println("Bus is stopping");
	}
	
	@Override
	protected void drive() { // or public -->> more accesible than default
		System.out.println("");
	}
	
	@Override
	protected Integer accelerate() { // we can not private override // Integer, Long , Short , Float ,.....
		System.out.println("Bus is accelarating for 15 miles per 10 second.");
		return 10;
	}
	
	// return type is same or Covariant
	// Covariant --> subclass of that return type
    // Method signature has to be same
	// access modifier has to be same or more accessible
	// return type has to be same or covariant
}
