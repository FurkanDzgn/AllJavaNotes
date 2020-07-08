package Day12_Loops.Mentoring;

import java.util.Scanner;

public class switchIfStatements {
	public static void main(String[] args) {
		System.out.println("Enter your animal type \nDog \nCat \nHorse");
		Scanner input=new Scanner(System.in);
		String type=input.next();
		
		switch(type) {
		case "Dog":
			System.out.println("Please enter your size");
			String size = input.next();
			if(size.equals("big")) {
				System.out.println("we dont have that size.");
			}else {
				System.out.println("Hi my name is Catty.");
			}
			break;
		case "Cat":
			System.out.println("Please enter your size");
			size = input.next();
			if(size.equals("small")) {
				System.out.println("You can pick me up");
			}else {
				System.out.println("Hi my name is Catty.");
			}
		}
	}

}
