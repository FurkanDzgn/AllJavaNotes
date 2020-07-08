package Day10_IfStatements.IfStatements;

import java.util.Scanner;

public class CarChoice {
	public static void main(String[] args) {
		/*
		 * Write an application that will ask a user to choose a car type
		 * 1.German car
		 * 2.American car
		 * 3.Japanese car
		 * User will enter then country name like: German,American or japanese
		 * 
		 * if German car is selected.
		 * Program will ask for user budget
		 * if it is more than $1000 then program will print.YOu can buy German car.
		 * Otherwise.it will print you dont have enough budget for German car
		 * 
		 * if Americancar is selected 
		 * Program will ask for user budget
		 * if it is more than $3000 then program will print.YOu can buy American car.
		 * 
		 * If japanese is selected
		 * Program will print.You can buy any car for any budget
		 */
	     
		 Scanner input=new Scanner(System.in);
		 System.out.println("choose a car type: \n1.German car \n2.American car\n3.Japanese car ");
		 
		
		 String car=input.next();
		 
		 if(car.equalsIgnoreCase("German")) {
			 System.out.println("What is your budget?");
			 int budget=input.nextInt();
			 if( budget>1000 ) {
				 System.out.println("You have enough budget to buy the German car.");
			 }else {
				 System.out.println("You dont have enough budget to buy German car.");
			 }
		 }
		 else if(car.equalsIgnoreCase("American")) {
			 System.out.println("What is your budget?");
			 int budget=input.nextInt();
		     if(budget>3000) {
			 System.out.println("You have enough budget to buy the German car.");
		     }
		     else {
		    	 System.out.println("You dont have enough budget to buy German car.");
		     }
		 }
		 else if(car.equalsIgnoreCase("Japanese")){
			 System.out.println("You can buy any car for any budget");
		 }
		 else
		 {
			 System.out.println("Your entry is invalid.");
		 }
		 
	}
	
	

}
