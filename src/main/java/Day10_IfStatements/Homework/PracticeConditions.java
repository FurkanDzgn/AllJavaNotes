package Day10_IfStatements.Homework;

import java.util.Scanner;

public class PracticeConditions {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please choose number of vehicle on the list\n1)Passenger Car\n2)Bus\n3)Truck");
		
		int num=input.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("Passenger Car.Car fee $2.50");
			break;
		case 2:
			System.out.println("Bus.Car fee $5.0");
			break;
		case 3:
			System.out.println("Truck.Car fee $6.50");
			break;
		default:
			System.out.println("Invalid value");
			
		
		
		}
		
		
	}

}
