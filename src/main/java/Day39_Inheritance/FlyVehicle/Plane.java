package Day39_Inheritance.FlyVehicle;

import Day39_Inheritance.Vehicle.Vehicle1;
//import Vehicle.Vehicle1;
// Package.Class
public class Plane extends Vehicle1 {
	
	public void setPlaneInfo() {
	// 	super.year = 2015; //  we can not use default access modifier out of package
    	super.make = "Boeing"; // access modifier is protect
	//	super.drive(); // driver() has default access modifier
		super.accelerate(); // accelerate() has protected access modifier.
		super.stop();
		
	}
	
//	public void stop() {
//		System.out.println("Vehicle is stopping.");
//	}
//	
//	protected Number accelerate() { // we changed from private to protected
//		System.out.println("Vehicle is accelerating by 20 miles in 10 seconds.");
//		return 20;
//	}
}
