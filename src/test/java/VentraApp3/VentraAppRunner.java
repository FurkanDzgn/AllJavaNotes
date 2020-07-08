package VentraApp3;

import java.util.Scanner;

public class VentraAppRunner {
	
	
	static VentraCardMachine machine = new VentraCardMachine("Chicago"); // helps to instantiate the ArrayList<VentraCard>();
	
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
            System.out.println("Please select another option. To see all options 9");
        }while(!option.equals("0"));
    }

    private static void makeAChoice(String choice){
    	Scanner scan = new Scanner(System.in);
        switch (choice){
            case "0":
                System.out.println("Thank you for working with us");
                break;
            case "1":
            	/*
            	 * 1- Using scanner get the information of user(FullName, PhoneNumber, Email)
            	 * 2- Create new card According to this information(Call createCard method)
            	 * 3- Call addCard method from VentraCard Machine and add new card
            	 */
            	System.out.println("FullName: ");
            	String fullName = scan.nextLine();
            	System.out.println("PhoneNumber: ");
            	String phoneNumber = scan.next();
            	System.out.println("e-mail: ");
            	String email = scan.next();
			    VentraCard card = VentraCard.createCard(fullName, phoneNumber, email);
            	machine.addCard(card);
          //  	System.out.println(card);
                break;
            case "2":
            	machine.printCardHoldersName(machine.getAllCards());
                break;
            case "3":
            	machine.printCardNumbers(machine.getAllCards());
            	break;
            
            case "4":
            	long cardNumber=scan.nextLong();
                System.out.println("Please provide full name");
                scan =new Scanner(System.in);
                String fullName1=scan.nextLine();
                System.out.println("Please provide phone Number: ");
                String phoneNumber1=scan.next();
                System.out.println("Please provide email: ");
                String email1=scan.next();
                
                VentraCard card1=VentraCard.createCard(fullName1, phoneNumber1, email1);
                
                machine.addCard(card1);
                
                machine.updateCard(cardNumber, card1);
                break;            	            	            	
            case "5":
            	 long oldCardNumber=scan.nextLong();
                 System.out.println("Please enter 16 digit new Card Number: ");
                 long newCardNumber=scan.nextLong();
                 
                 machine.uptadeCardNumber(oldCardNumber, newCardNumber);
                 break;
            case "6":
            	System.out.println("Please enter your card number: ");
            	long cardNum = scan.nextLong();
            	System.out.println("Please enter your new email address");
            	String newEmail = scan.next();
            	machine.uptadeEmailAddress(cardNum, newEmail);
            	break;
            case "7":
            	System.out.println("Please enter phone number: ");
            	String phoneNum = scan.next();
            	machine.printCardInfo(phoneNum);
            		break;
            case "8":
            	System.out.println("Please provide card number: ");
            	long cardNum1 = scan.nextLong();
            	machine.removeCard(cardNum1);
            	break;
            case "9":
            	printOptions();
            	break;

        }
    }
   
  

	public static void welcome(){

        System.out.println("Welcome to the Ventra card");
    }

    public static void printOptions(){

    	System.out.println("Hello. Please choose one of the following options");
        System.out.println("1 - For new card");
        System.out.println("2 - To print all card holders name and card number");
        System.out.println("3 - To print ventra card numbers");
        System.out.println("4 - To update the Ventra Card with New Card");
        System.out.println("5 - To update the card number");
        System.out.println("6 - To update existing card email address");
        System.out.println("7 - To search the card with phone number and print all card information");
        System.out.println("8 - To remove the card from list");
        System.out.println("9 - To print available options");
        System.out.println("0 - To exit");
    }


}
