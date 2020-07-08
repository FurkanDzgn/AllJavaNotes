package Day09.ConditionalStatement;

import java.util.Scanner;

public class ConditionalStatement {
	
	/*
	 * Write a program that will ask for the number
	 * of month and output will be like below
	 * input: 2
	 * output: February has 29 days
	 */
         public static void main(String[] args) {
	         Scanner scan = new Scanner(System.in);
	         
	         System.out.println("Please enter number of month: ");
	         
	         int mounthNum = scan.nextInt();
	         
	         if (mounthNum == 1) {
	        	 System.out.println("January has 31 days.");        	 
	         }
	         else if(mounthNum == 2) {
	        	 System.out.println("February has 29 days.");
	         }
	         else if(mounthNum == 3) {
	        	 System.out.println("March has 31 days.");
	         }
	         else if(mounthNum == 4) {
	        	 System.out.println("April has 30 days.");
	         }
	         else if(mounthNum == 5) {
	        	 System.out.println("May has 31 days.");
	         }
	         else if(mounthNum == 6) {
	        	 System.out.println("June has 30 days.");
	         }
	         else if(mounthNum == 7) {
	        	 System.out.println("July has 31 days.");
	         }
	         else if(mounthNum == 8) {
	        	 System.out.println("August has 30 days.");
	         }
	         else if(mounthNum == 9) {
	        	 System.out.println("September has 31 days.");
	         }
	         else if(mounthNum == 10) {
	        	 System.out.println("October has 30 days.");
	         }
	         else if(mounthNum == 11) {
	        	 System.out.println("November has 31 days.");
	         }
	         else if(mounthNum == 12) {
	        	 System.out.println("December has 30 days.");
	         }
	         else {
	        	 System.out.println("Your entry is invalid.");
	         }
	         
	       }
         
         
}
