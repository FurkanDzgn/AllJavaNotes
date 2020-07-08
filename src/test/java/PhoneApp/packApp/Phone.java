package PhoneApp.packApp;

import java.util.ArrayList;

public class Phone {

    /*
       1- Create instance variables
       phoneBrand, phoneModel, SerialNumber, passCode and ArrayList<Contact> allContact
       2- Create constructor to initialize this variables
       3- Create the method to add new contact this method take one parameter as Contact
       4- Create the method to print all Contacts' first and last name with phone number
       5- Create the method to update person's phone number. This method takes two parameter old phone number and new phone number
       6- Create the method to search with phone number and print all other information for person
       7- create the method to search with name of person and print phone number of person
       8- Create the method to update city of person with new city, you need two parameter one is phone number of person another is new email address.
       9- Create the method to update email address for person with new email address, you need two parameter oldEmail and newEmail

       In this contact list only two things are unique Phone number and email address. You can not store same phone number and email address two times
       because of that before adding the new contact you need to make sure this phone number is not exist in your Contact arraylist.
     */
	
	String phoneBrand;
	String phoneModel;
	long SerialNumber;
	int passCode;
	ArrayList<Contact> allContact;
	
	public Phone(String phoneBrand, String phoneModel, long serialNumber, int passCode) {
		super();
		this.phoneBrand = phoneBrand;
		this.phoneModel = phoneModel;
		this.SerialNumber = serialNumber;
		this.passCode = passCode;
		this.allContact = new ArrayList<Contact>();
	}
	
	// Create the method to add new contact this method take one parameter as Contact
	public boolean addContact(Contact newCo) {
		
		boolean isExist=false;
		
		for(int i=0; i<allContact.size(); i++) {
			if(allContact.get(i).getPhoneNumber() == newCo.getPhoneNumber())
			isExist=true;
			break;
		}
		if(isExist==false) {
		  allContact.add(newCo);
		  return true;
		}
		return false;
	}
	
	//Create the method to print all Contacts' first and last name with phone number	
	public void printContact() {
		
		for(int i=0; i<allContact.size(); i++) {
			System.out.println(allContact.get(i).getFirstName()+" "+allContact.get(i).getLastName()+" "+
					allContact.get(i).getPhoneNumber()+"\n");
		}
	}
	
	//Create the method to update person's phone number.This method takes two parameter old phone number and new phone number
	
	public void uptadePhoneNumber(long oldPhoneNumber, long newPhoneNumber) {
		
		for(int i=0; i<allContact.size(); i++) {
			if(allContact.get(i).getPhoneNumber() == oldPhoneNumber) {
				allContact.get(i).setPhoneNumber(newPhoneNumber);
			}
		}
		
	}
	
	// Create the method to search with phone number and print all other information for person
	
	public void searchPhoneNumber(long phoneNumber) {
		
		for(int i=0; i<allContact.size(); i++) {
			if(allContact.get(i).getPhoneNumber() == phoneNumber) {
				System.out.println(allContact.get(i).toString());
						
			}
		}
	}
	// Create the method to search with name of person and print phone number of person
	
	public void printPhoneNumber(String name) {
		
		for(int i=0; i<allContact.size(); i++) {
			if(allContact.get(i).getFirstName().equals(name)) {
				System.out.println(allContact.get(i).getPhoneNumber());
			}
		}
	}
	
	// Create the method to update city of person with new city,
	// you need two parameter one is phone number of person another is new email address.
	public boolean updateCity(long phoneNumber, String newCity) {
        boolean updated = false;
        
        for(int i=0; i<allContact.size(); i++) {
        	if(allContact.get(i).getPhoneNumber() == phoneNumber) {
        		allContact.get(i).setCity(newCity);
        		updated=true;
        	}
        }
     
     return updated;

	}	
//	public void uptadeCity(long phoneNumber, String email) {
//		
//		for(int i=0; i< allContact.size(); i++) {
//			if(allContact.get(i).getPhoneNumber()==phoneNumber) {
//				allContact.get(i).setEmails(email);			
//			}
//		}
//	}
	
	// Create the method to update email address for person with new email address,
	// you need two parameter oldEmail and newEmail

	public boolean uptadeEmail(String oldEmail, String newEmail) {
		
		boolean isUptade = false;
		
		for(int i=0; i<allContact.size(); i++) {
			if(allContact.get(i).getEmails() == newEmail) {
				isUptade = true;
				break;
			}		
		}
		if(isUptade == false) {
			for(int i=0; i<allContact.size(); i++) {
				if(allContact.get(i).getEmails() == oldEmail) {
					allContact.get(i).setEmails(newEmail);
				}
			}
			return true;
		}else {
			return false;
		}
		
		
		
	}
//	public void uptadeEmail(String oldEmail,String newEmail) {
//		
//		for(int i=0; i<allContact.size(); i++) {
//			if(allContact.get(i).getEmails() == oldEmail) {
//				allContact.get(i).setEmails(newEmail);
//			}
//		}
//		
//	}
		
}
