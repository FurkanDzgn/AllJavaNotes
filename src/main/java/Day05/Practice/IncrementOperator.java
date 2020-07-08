package Day05.Practice;

import java.util.Scanner;

public class IncrementOperator { // package , import , class -> PIC
	
	public static void main(String[] args) {		
		int a =5;
		
		a++;//5
		                // 6==5 ->false
		boolean result = a==5;
		
		System.out.println(result);
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter positive number:");
		
		int number = input.nextInt();
		
		boolean result2 = number >= 0;
		
		System.out.println("Your entered number is positive: "+result2); // true,false
		
		System.out.println("Your entered number is negative: "+!result2); // false,true
		
		System.out.println( !true );
		
	}

}
