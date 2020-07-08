package Day24_MethodsAndInstanceVari.MethodPractice;

import java.util.Scanner;

public class BankApp03 {
	
	public static void main(String[] args) {
		
		Investment02 inv = new Investment02();
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter number of years you want to invest: ");
		inv.years=scan.nextInt();
		
		System.out.println("Enter an amount that you are investing: ");
        inv.amount=scan.nextDouble();
        
        System.out.println("What is rate is given to you: ");
        inv.rate=scan.nextDouble();
	  
		System.out.println("Your rate amount is: "+inv.rateAmount());
		
		System.out.println("Your total amount will be: "+inv.totalAmount());
		
	}

}
