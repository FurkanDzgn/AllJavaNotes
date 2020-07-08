package PhoneApp.packApp;

import java.util.Scanner;

public class PhoneAppRunner {

    // in here instantiate the Phone object
	
	static Phone phone = new Phone("Apple", "Iphone 11", 1234567923L, 4545);

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    
    	int i=0;
    	for(; i<4; i++) {
    		 System.out.println("Please enter passCode: ");
    		 int passCode = scanner.nextInt();
    		 if(passCode == 4545) {
    			 
        welcome();
        printOptions();
        
        String option;
        /*
        Implement the logic for passcode.
        You need to first ask the user passcode of the phone
        if the user input is not same with phone.passCode then the user
        should not be able to open the phone and see the below options
         */
        do {
            option=scanner.next();
            makeAChoice(option);
        }while(!option.equals("0"));
        System.out.println("Thank you for working with us");
    		 }else {
    			 System.out.println("Wrong passCode!!!");
    		 }
    	}
    	
    	if(i == 4 ) 
    		System.out.println("Phone is blocked!!!!");
    	
    }
    private static void makeAChoice(String choice) {
        Scanner input = new Scanner(System.in);
        switch (choice) {    
            case "0":
            System.out.println("Thank you for working with us");
                break;
            case "1":
            	System.out.println("FirstName: ");
            	String firstName = input.next();
            	System.out.println("LastName: ");
            	String lastName = input.next();
            	System.out.println("Company: ");
            	String company = input.next();
            	System.out.println("PhoneNUmber: ");
            	long phoneNumber = input.nextLong();
            	System.out.println("Emails: ");
            	String email=input.next();
            	System.out.println("City: ");
            	String city=input.next(); 
             	Contact newCo=Contact.getConcat(firstName, lastName, company, phoneNumber, email, city);
             	System.out.println(phone.addContact(newCo));
                break;
            case "2":
            	phone.printContact();
                break;
            case "3":
            	System.out.println("Please enter oldPhoneNumber: ");
            	long oldPhoneNumber = input.nextLong();
            	System.out.println("Please enter newPhoneNumber: ");
            	long newPhoneNumber = input.nextLong();
            	phone.uptadePhoneNumber(oldPhoneNumber, newPhoneNumber);
                break;
            case "4":
            	System.out.println("Please enter Phone Number: ");
            	long phoneNum = input.nextLong();
            	phone.searchPhoneNumber(phoneNum);
                break;
            case "5":
            	System.out.println("Please enter name: ");
            	String name = input.next();
            	phone.printPhoneNumber(name);
                break;
            case "6":
            	System.out.println("Please enter phoneNumber: ");
            	long phoneNum2 = input.nextLong();
            	System.out.println("Please enter newCity: ");
            	String city2 = input.next();
                phone.updateCity(phoneNum2, city2);
                break;
            case"7":
            	System.out.println("Please enter oldEmail");
            	String oldEmail = input.next();
            	System.out.println("Please enter newEmail: ");
            	String newEmail = input.next();
            	phone.uptadeEmail(oldEmail, newEmail);
            	break;
            case"8":
            	printOptions();
            	break;
            	
        }

    }

    public static void welcome() {

        System.out.println("Welcome to the Phone Application");
    }

    public static void printOptions() {

        System.out.println("Hello. Please choose on of the following options");
        System.out.println("1 - For new Contact");
        System.out.println("2 - To print all Contacts' Full Name  and Phone Number");
        System.out.println("3 - Update Contact Phone number");
        System.out.println("4 - Find Person information with Phone Number");
        System.out.println("5 - Find Phone number with Contact Name");
        System.out.println("6 - Update City information for Contact");
        System.out.println("7 - Update Email address information for Contact");
        System.out.println("0 - To exit");
    }
}
