package VentraApp2;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class VentraCard {
	
	 /*
    1- Create private instance variables for passenger fullName, phoneNumber, email, cardNumber
    2- Create getter and setter for instance variables
    3- Create the constructor to set the value to the instance variables
    4- Create one method to create the 16 digit cardNumber. Return type must be long and it will return 16 digit unique number
     */
	
	private String fullName;
	private String phoneNumber;
	private String email;
	private long cardNumber;
	
	public String getFullName() {
		return fullName;
		}
	public void setFullName(String fullName) {
		this.fullName = fullName;
		}
	public String getPhoneNumber() {
		return phoneNumber;
		}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		}
	public String getEmail() {
		return email;
		}
	public void setEmail(String email) {
		this.email = email;
		}
	public long getCardNumber() {
		return cardNumber;
		}
	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
		}
		
		public String toString() {
			return "{\n fullName=" + fullName + ",\n phoneNumber : " + phoneNumber + ",\n email : " + email
					+ ",\n cardNumber : " + cardNumber + "}";
		}

		
		public VentraCard(String fullName, String phoneNumber, String email, long cardNumber) {
			
			this.fullName = fullName;
			this.phoneNumber = phoneNumber;
			this.email = email;
			this.cardNumber = cardNumber;
			
		}


    public VentraCard createCard(String fullName, String phoneNumber, String email){

//    	this.fullName=fullName;
//    	this.phoneNumber=phoneNumber;
//    	this.email=email;
    	   VentraCard ventraCard = new VentraCard(fullName, phoneNumber, email, createCardNumber());
           return ventraCard;

    	
    /*
    this method need to return VentraCard according to the parameter
     */
    
    }

    public static long createCardNumber(){

//    	Random rand = new Random();
//    	long rand = rand.nextLong(9999_9999_9999_9999);
//    	
//        /*
//        this method needs to return the 16 digit card number
//         */
//        return rand;
    	
    	long smallest = 1000_0000_0000_0000L;
    	long biggest = 9999_9999_9999_9999L;
    	// return a long between smallest and biggest (+1 to include biggest as well with the upper bound)
    	long random = ThreadLocalRandom.current().nextLong(smallest, biggest+1);
    //	long random = ThreadLocalRandom.current().nextLong(smallest, biggest+1);
    	return random;
    }

}
