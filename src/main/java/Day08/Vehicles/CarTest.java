package Day08.Vehicles;

import java.util.Scanner;

public class CarTest {
	
	public static void main(String[] args) {
		Car car1 = new Car();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is the brand of your car?");
		car1.brandName = input.nextLine();
		
		System.out.println("What is the color of your car?");
		car1.color = input.nextLine();
		
		System.out.println("What is you current speed?");
		car1.currentSpeed = input.nextInt();
		
		System.out.println("What is the year of your car?");
		car1.year = input.nextInt();
		
		/*
		 * your car brand is:
		 * Your car color is:
		 * Your speed is: 30
		 * Year of the car: 1999		
		 */
		System.out.println("Your car brand is: "+car1.brandName.toUpperCase() );
		System.out.println("Your car color is: "+car1.color.toUpperCase() );
		System.out.println("Your car speed is: "+car1.currentSpeed );
		System.out.println("Year of the car: "+car1.year );
		
		car1.accelarate(10); // return type is void
		
                          		
	//	System.out.println(car1.accelarate(10));
		                  // int 
		System.out.println(car1.getCurrentSpeed());
		
		
		
	}
	

}
