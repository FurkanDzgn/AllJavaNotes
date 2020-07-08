package Day09.ConditionalStatement;

import java.util.Scanner;

public class VoteEligibility {
	 
	/*
	 * Write a program that ask for an age
	 * then if age is less than 18 it will print
	 * you are not eligible to vote
	 * 
	 * if it is equals or more than 18
	 * You are eligible to vote
	 */
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is your age:");
		int age = input.nextInt();
		
		if (age<18 && age>0) {
			System.out.println("You are not eligible to vote");
		}else if (age >= 18) {
			System.out.println("You are to eligible to vote");
		}
		else {
			System.out.println("Hey, your entry is invalid!");
		}
		
		//-numbers , 0 , +numbers
		
	}
	

}
