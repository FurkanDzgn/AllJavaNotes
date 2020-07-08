package VentraApp2;

import java.util.Scanner;

public class VentraAppRunner {
	
	static VentraCardMachine machine = new VentraCardMachine("Chicago");
	
	public static void main(String[] args){
		
        welcome();
        printOptions();
        Scanner scanner = new Scanner(System.in);
        String option;
        /*
        implement the choice logic
         */
        do {
            option=scanner.next();
            makeAChoice(option);
        }while(!option.equals("0"));
    }

    private static void makeAChoice(String choice){
    	
    	Scanner scan = new Scanner(System.in);
    	
        switch (choice){
            case "0":
                System.out.println("Thank you for working with us");
                break;
            case "1":
            	System.out.println("FullName: ");
            	String fullName = scan.next();
            	System.out.println("PhoneNumber: ");
            	String phoneNumber = scan.next();
            	System.out.println("e-mail: ");
            	String email = scan.next();
            	VentraCard nb = new VentraCard(fullName, phoneNumber, email, VentraCard.createCardNumber());
                System.out.println(nb);
                machine.addCard(nb);
                break;
            case "2":
            	machine.printNames(machine.allCards);
            	machine.printCardNumbers(machine.allCards);
                break;
            case "3":
            case "4":
            case "5":
            case "6":

        }
    }

    private static long createCardNumber() {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void welcome(){

        System.out.println("Welcome to the Ventra card");
    }

    public static void printOptions(){

        System.out.println("Hello. Please choose on of the following options");
        System.out.println("1 - For new card");
        System.out.println("2 - To print all card holders name and card number");
        System.out.println("3 - To print ventra card numbers");
        System.out.println("4 - To update the card number");
        System.out.println("4 - To update existing card email address");
        System.out.println("5 - To search the card with phone number and print all card information");
        System.out.println("6 - To print available options");
        System.out.println("0 - To exit");
    }

}
