package Day11_Loops.Loops;

import java.util.Scanner;

public class Number1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
	//	System.out.println("Enter number 1");
		
		int number;
		do {
			System.out.println("Enter number 1");
			number=scan.nextInt();
			
		}while(number != 1); // 5 !=1 -> true , 1 !=1 -> false
		
		System.out.println("Thank you");
		
		
	}

}
