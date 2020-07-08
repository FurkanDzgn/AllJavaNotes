package Day05.StringManipulation;

import java.util.Scanner;

public class HomeworkDay05 {
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
	    System.out.println("Enter the price of oranges per pound?");   
	    double oranges = input.nextDouble();
	    
	    System.out.println("How many pounds he/she wants to buy?");
	    int buy = input.nextInt();
	    
	    System.out.println("what is your account balance?");
	    double balance = input.nextDouble();
	    
	    double purchase = oranges*buy;
	    
	    boolean x=balance >=purchase;
	    
	    System.out.println("You can make a purchase:"+x);
	    
	    
	  
	    
	    
	    
	    
	   
	}
	

}