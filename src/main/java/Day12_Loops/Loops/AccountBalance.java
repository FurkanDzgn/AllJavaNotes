package Day12_Loops.Loops;

import java.util.Scanner;

public class AccountBalance {
	
	/*
	 * ask a user for his account balance
	 * 500
	 * Then we will ask for the transaction amount he want to make
	 * 100
	 * Your new balance is: 400
	 * what is your transaction amount:
	 * 300
	 * Your new balance is: 100
	 * 200
	 * Your balance is 100, you can not make transaction for 200
	 * Thank you for using our app.
	 * 
	 */
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("What is your balance?");
	
	int balance = input.nextInt();
	
	//500
	int count=0; 
	
	while(balance>0) {
		System.out.println("What is your transaction?");
		
		int transaction = input.nextInt(); //100
		
		if (balance<transaction) {
		System.out.println("You dont have enough balance to make this transaction.");
	}else {
		balance-=transaction;
		count++;
		System.out.println("Your new balance: "+balance);
	}
	}
	System.out.println("You are out balance now.\n You made "+count+" transactions.");
	}
}
