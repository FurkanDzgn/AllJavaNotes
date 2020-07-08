package Day06.StringMethods;

import java.util.Scanner;

public class StrIsEmpty {
	public static void main(String[] args) {
		
		String name = "";
		String name2 = "Techtorial";
		
		System.out.println(name.isEmpty()); //.isEmpty(); -> will check is empty or not, and returns boolean
		System.out.println(name2.isEmpty());
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your fullname: ");
		
		String fullName = input.nextLine(); // John Doe
		
		//John Doe -> substring(5)
		//find index of space ' '
		
		int spaceIndex=fullName.indexOf(' ');
		
		/*
		 * Once user will enter his/her print out his/her last name in console.
		 * 
		 * John Doe
		 * Your last name is Doe
		 * 
		 * Sarah Connor
		 * 
		 */
		  System.out.println(fullName.substring(spaceIndex+1)); //.trim()
		  
		
		
		
		
		 
	}

}
