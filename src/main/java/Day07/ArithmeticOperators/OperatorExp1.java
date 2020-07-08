package Day07.ArithmeticOperators;

import java.util.Scanner;

public class OperatorExp1 {
	public static void main(String[] args) {
		
		// Please enter even number or number that is less than 100
		//true , false
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter a number: ");
		int number=input.nextInt();
		
		boolean lessThan100 = number < 100; // true
		boolean evenNumber = number%2==0; // true
		
		// 99-> lessThan100 = true, evenNumber = false
		//true
		
		// 102-> lessThan100 = false, evenNumber = true
		//true
		
		// 105-> lessThan100 = false, evenNumber = false
		//false
		
		// 50-> lessThan100 = true, evenNumber = true
		//true
		
		/*
		 * true false -> true
		 * false true -> true
		 * true true -> true
		 * false false ->fasle
		 */
		
		 boolean result = lessThan100 || evenNumber;
	     System.out.println(result);
		//System.out.println(lessThan100 || evenNumber);
		//System.out.println(lessThan100 && evenNumber);
		
		
		
		
	}

}
