package Day12_Loops.Loops;

import java.util.Scanner;

public class CountOddNumbers {
	public static void main(String[] args) {
		
		/*
		 * Will ask from the user for number
		 * And program will get sum of odd numbers
		 * between 0 and entered number.
		 * 
		 * Example:
		 *      20
		 *      //1,3,5,7,9,11,13,15,17,19 ->1+3+5+.....=sum
		 */
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int number = input.nextInt();
		int sum=0;
		while(number>0) {
			if(number%2==1) {
			    sum +=number;		   
			}
			--number; // --number , number--;
		}
		 System.out.println(sum);
	}

}
