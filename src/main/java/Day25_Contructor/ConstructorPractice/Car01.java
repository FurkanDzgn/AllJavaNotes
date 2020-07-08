package Day25_Contructor.ConstructorPractice;

public class Car01 {
	
	// Instance variables
	// --> these are the object of constructor
	
	String make;
	String model;
	int year; 
	double price;
	
	// The name of constructor has to be same as class name
	public Car01() { // public --> is access modifier.
		System.out.println("I am no argument constructor.");
	}
	
	// Method overloading --> Constructor overloading
	public Car01(String carMake) {
		make = carMake;
		
	}
	
	public Car01(String carMake, int carYear) {
		make = carMake;
		year = carYear;
	}
	
	public Car01(String carMake, String carModel, int carYear, double carPrice) {
	//	this(carMake, carYear);
		make = carMake;
		model = carModel;
		year = carYear;
		price = carPrice;
	}

}
