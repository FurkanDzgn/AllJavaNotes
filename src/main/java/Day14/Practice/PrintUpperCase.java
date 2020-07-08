package Day14.Practice;

import java.util.Scanner;

public class PrintUpperCase {
	
	/*
	 * Ask a user to enter String value
	 * 
	 * Hello World This Is Me
	 * 
	 * HWTIM
	 */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a String value:");
		
		String value= input.nextLine();
				
		for(int i=0; i<value.length(); i++) {
			
			//H -> 72 <90
			// ASCII number for ' ' -> 50
			if(value.charAt(i) <= 'Z' &&  value.charAt(i)>='A') {
				System.out.print(value.charAt(i));
			}
		}
	}

}
