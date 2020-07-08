package Day09.ConditionalStatement;

import java.util.Scanner;

public class IsHired {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Do you know java? Yes/No");
		
		String knowsJava=input.next();
		
		if (knowsJava.equalsIgnoreCase("Yes")) {
			System.out.println("Do you know Selenium? Yes/No");
			String knowsSelenium=input.next();
			
			if (knowsSelenium.equalsIgnoreCase("Yes")){
			System.out.println("Do you know Database? Yes/No");
			String knowsDatabase=input.next();
			if(knowsDatabase.equalsIgnoreCase("Yes")) {
				System.out.println("You are hired!");
			}
			else {
				System.out.println("You need to learn database.");
			}
			}
		 else {
				System.out.println("You need to know Selenium.");
			}			
		}
          else {
			System.out.println("Please learn java.");
		}
	}

}
