package Day25_Contructor.ConstructorPractice;

public class CarTest02 {
	
	public static void main(String[] args) {
	
		Car01 car = new Car01();
		
		car.year=2018;
//		System.out.println(car.year);
		car.make="Toyata";
		car.model="Camry";
		car.price=8000;
		
		Car01 car2 = new Car01("Honda");
		System.out.println(car2.make);
	    System.out.println(car2.price); // --> 0.0
		
		Car01 car3 = new Car01("GMC",2019);
		System.out.println(car3.year+"-"+car3.make);
		
		
		// We are giving attribute values rigth away once we are creating an object.
		Car01 car4 = new Car01("Toyata", "Coralla", 2020, 15000);
		System.out.println(car4.price);
		
		System.out.println(car.price);
		
		
		/*
		 * The purpose of constructor is to initialize the variables
		 */
	}

}
