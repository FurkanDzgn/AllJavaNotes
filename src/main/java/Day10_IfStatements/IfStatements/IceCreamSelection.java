package Day10_IfStatements.IfStatements;

import java.util.Scanner;

public class IceCreamSelection {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please select your ice cream? \nStrawbery \nChocolate \nVanilla \nBanana \nPistacho");
		
		String iceCream = input.next();
		
		switch(iceCream) {
		case"Strawbery":
			System.out.println("You selected Strawbery.");
		    break;
		case"Chocolate":
			System.out.println("You selected Chocolate.");
		    break;
		case"Vanilla":
			System.out.println("You selected Strawbery.");
		    break;
		case"Banana":
			System.out.println("You selected Banana.");
		    break;
		default: // we can put default anywhere.
	    	System.out.println("Your selection is invalid.");
	    	break;
		case"Pistacho":
			System.out.println("You selected Pistacho.");
		    break;
//		    default:  
//		    	System.out.println("Your selection is invalid.");
		}
	}

}
