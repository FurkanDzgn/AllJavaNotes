package Day11_Loops.Loops;

import java.util.Scanner;

public class BetweenNumbers {
	public static void main(String[] args) {
	    
		//We will ask from user to enter two numbers
		//2, 5
		//program will print numbers between 2 and 5.
		//2,3,4,5
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter two numbers: ");
		int num1=input.nextInt();
		int num2=input.nextInt();
		
		if(num2>num1) {
		do {
			System.out.println(num1);
			++num1;
		}while(num1<=num2);
		
		}else {
			do {
				System.out.println(num1);
				--num1;
			}while(num1>=num2);
			
			
		}
			
	}
	

}
