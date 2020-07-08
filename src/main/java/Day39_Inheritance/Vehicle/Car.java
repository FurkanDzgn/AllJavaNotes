package Day39_Inheritance.Vehicle;

public class Car extends Vehicle1 {

	@Override
	public void drive() { // public is more accesible than default  // we can write (default) protected and public
		System.out.println("Car is driving");
	}
	
	@Override
	public Double accelerate() { // we can write also protected
		System.out.println("Car accelerates by 30 miles in 10 seconds.");
		return 30.0;
	}
	
}
