package VentraApp3;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class VentraCard {
	
	 /*
    1- Create private instance variables for passenger fullName, phoneNumber, email, cardNumber
    2- Create getter and setter for instance variables
    3- Create the constructor to set the value to the instance variables
    4- Create one method to generate the 16 digit cardNumber. Return type must be long and it will return 16 digit unique number
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
			
		public VentraCard(String fullName, String phoneNumber, String email) {
			super();
			this.fullName = fullName;
			this.phoneNumber = phoneNumber;
			this.email = email;
			this.cardNumber=createCardNumber();
		}
		
		// You need to create private constructor.You must static(public) method also we can't use new
		
		// VentraCard card = new VentraCard(...);
		//VentraCard card1 = VentraCard.createCard(...);
		// ---> if your constructor is private, you can use createCard

    public static VentraCard createCard(String fullName, String phoneNumber, String email){ // I can call with class name

    /*
     * this method need to return VentraCard object according to the parameter
     */
    	VentraCard card = new VentraCard(fullName, phoneNumber, email);
    	return card;
    	
   // 	return new VentraCard (fullName, phoneNumber, email);
    }
	@Override
	public String toString() {
		return "VentraCard {fullName: " + fullName + ", phoneNumber: " + phoneNumber + ", email: " + email
				+ ", cardNumber: " + cardNumber + "}";
	}
	
	public static long createCardNumber(){

        /*
        this method needs to return the 16 digit card number UUID(16 digits and letters)
         1- You can cretae one String and loop 16 times to generate random number between 0-9, add this number to your String after that 
         convert String to long we can convert using parselong method
         */
//		long smallest = 1000_0000_0000_0000L;
//    	long biggest = 9999_9999_9999_9999L;
//    	// return a long between smallest and biggest (+1 to include biggest as well with the upper bound)
//    	long random = ThreadLocalRandom.current().nextLong(smallest, biggest+1);
//    	return random;
//		                          // 0.5646...
		long randomNumber=(long) (Math.random()* 1000000000000000L);
		return randomNumber;
    }
   

	

	
	

}