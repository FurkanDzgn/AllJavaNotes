package Day11_Loops.Loops;

import java.util.Scanner;

public class PrintMyName {
	
	/*
	 * Program will ask for the name
	 * Then it will ask for then number of times you want to print your name
	 * 
	 * John
	 * 5
	 * 
	 * John John John John John
	 */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your name: ");	
		String name=input.next();
		System.out.println("How many times you want to print your name?");
		int num=input.nextInt();
		
		
		do {
			System.out.print(name+" ");
			--num;
		}while(num >0);
	}

}
