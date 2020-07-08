package Day11_Loops.WarmUp;

import java.util.Scanner;

public class Login {
	
	/*
	 * This program will log in to your application
	 * Application will ask for username
	 * Then it will Ask for password.
	 * Then it will Ask for captcha.
	 * 
	 * Right credentials: yourName, admin, beam:
	 * 
	 */
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your username");
		String username = input.next();
		if(username.equals("yourName")) {
			System.out.println("Enter your password: ");
			String password=input.next();
			
			if(password.equals("admin")) {
				System.out.println("Enter your captcha: ");
				String captcha=input.next();
				if(captcha.equals("beam")) {
					System.out.println("You are logged in.");
					
				}else {
					System.out.println("Your captcha is incorrect.");
				}
				
			}else {
				System.out.println("Your password is incorrect.");
			}
			}else {
				System.out.println("Your username is incorrect.");
			}
	}

}
