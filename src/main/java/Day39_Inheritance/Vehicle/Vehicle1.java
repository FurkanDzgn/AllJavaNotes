package Day39_Inheritance.Vehicle;
            // Vehicle extends Object
public class Vehicle1 {
	
	/*
	 * public
	 * protected
	 * default
	 * private
	 */
	
	protected String make;  // private
	int year; //  default modifier 
	
	void drive() {
		System.out.println("Vehicle is driving.");
	}
	
	public void stop() {
		System.out.println("Vehicle is stopping.");
	}
	
	protected Number accelerate() { // we changed from private to protected
		System.out.println("Vehicle is accelerating by 20 miles in 10 seconds.");
		return 20;
	}

}
