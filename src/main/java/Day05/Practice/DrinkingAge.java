package Day05.Practice;

import java.util.Scanner;

public class DrinkingAge {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Plase enter your age:");
		
		int age =input.nextInt();
		int drinkingage  =21;
		
		boolean x = age >= drinkingage;
		System.out.println("You can drink "+x);
		System.out.println("You cant drink "+!x);
	}
	
	
}


/*
 * Write a program that will ask user to enter his age
 * and program will print message like below:
 * 
 * You can drink alcohol: true
 * 
 * If age is less than 21 it will print false
 * 
 */

