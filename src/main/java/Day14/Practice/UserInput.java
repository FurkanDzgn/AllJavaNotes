package Day14.Practice;

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		do {
			System.out.println("Please say Yes.");
			String answer=scan.next();
			if(answer.equalsIgnoreCase("Yes"))
				break;
				
		}while(true);
		
		//break -> will terminate the loop.
		
		System.out.println("Weldone");
		
		// break can be used in while, do while, for loop and switch statement.
		//continue can be used only in loops (while, do while, for loop).
	}

}
