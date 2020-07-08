package Day44_ThrowAndThrows.ThrowAndThrows;

import java.util.Scanner;

import javax.management.RuntimeErrorException;

public class AppLogin {
	
	public static final String USERNAME ="user"; 
	public static final String PASSWORD = "java123";
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Username: ");
		String username = input.next();
		
		System.out.println("Enter Password: ");
		String password = input.next();
		
		if(!username.equals(USERNAME)) {
			throw new RuntimeException("Username "+username+" is incorrect.");
		
		}else if (!password.equals(PASSWORD)) {
			throw new RuntimeException("Password "+password+" is incorrect. ");
		}
		
		System.out.println("Logged in successfully.");
	}

}
