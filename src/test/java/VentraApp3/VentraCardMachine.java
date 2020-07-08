package VentraApp3;

import java.util.ArrayList;

public class VentraCardMachine {

	private String location;
    private ArrayList<VentraCard> allCards;  //    private ArrayList<VentraCard> allCards = new ArrayList<VentraCard>();
    
    public ArrayList<VentraCard> getAllCards(){
    	return allCards;
    }

    public VentraCardMachine(String location){
        this.location=location;
        this.allCards=new ArrayList<VentraCard>();
    }

    public boolean addCard(VentraCard card){
        /*
        This method will take the parameter as a card and if the card is not registered before it will add to the arraylist
         */
    	boolean isExist = true;
    	
    	for(int i=0; i<allCards.size(); i++ ) {
    		if(card.getCardNumber() == allCards.get(i).getCardNumber()
    	    	&& card.getPhoneNumber().equals(allCards.get(i).getPhoneNumber())) {
    			isExist = false;
    		}	
    	}
    	if(isExist == true) { // if(isExist)
    		allCards.add(card);	
    		return true;
    	}
    	
        return false;
    }

    public void printCardNumbers(ArrayList <VentraCard> cards){

        /*
        this method is taking one parameter as a list of cards and it will print all the card number
         which is available in this list
         */
    	
    	for(int i=0; i<cards.size();i++) {
    		System.out.println(cards.get(i).getCardNumber()+"\n");
    	}
    	
    }

    public boolean updateCard(long cardNumber, VentraCard newCard) {
    	/*
         * this method is taking two parameter cardNumber and it will replace this card with newCard.
         */
    	for(int i=0; i<allCards.size(); i++) {
    		if(allCards.get(i).getCardNumber() == cardNumber) {
    			allCards.set(i, newCard);
    			return true;
    		}
    	}
    	return false;
    }
    // 1-Create the method will take parameter as a list of cards and it will print all the card holders name
    public void printCardHoldersName(ArrayList<VentraCard> cards) {
    	
    	for(int i=0; i<cards.size(); i++) {
    		System.out.println("Name "+ cards.get(i).getFullName()+" Cardnumber: "+cards.get(i).getCardNumber());
    	}
    }
    
    public boolean uptadeEmailAddress(long cardNumber, String newEmail) {
    	
    	for(int i=0; i<allCards.size(); i++) {
    		if(allCards.get(i).getCardNumber() == cardNumber) {
    			allCards.get(i).setEmail(newEmail);
    			return true;
    		}
    	}
    	return false;
    }
    
    public boolean removeCard(long cardNumber) {
    	
    		
    	for(int i=0; i<allCards.size(); i++) {
    		if(allCards.get(i).getCardNumber() == cardNumber) {
    			allCards.remove(allCards.get(i)); //  allCards.remove(i);
    			return true;
    		}
    	}
    	return false;
    }
    
    public void printCardInfo(String phoneNumber) {
    	
    	for(int i=0; i<allCards.size(); i++) {
    		if(allCards.get(i).getPhoneNumber().equals(phoneNumber)) {
    			 System.out.println(allCards.get(i)); //  allCards.get(i).toString()  java automatically call toString()
    		}
    	}
    }
    
    public void uptadeCardNumber(long oldCardNumber, long newCardNumber) {
    	
    	for(int i=0; i<allCards.size(); i++) {
    		if(allCards.get(i).getCardNumber() == oldCardNumber) {
    			allCards.get(i).setCardNumber(newCardNumber);
    		}
    	}
    }
    

    /*
     *  1-Create the method will take parameter as a list of cards and it will print all the card holders name
        2- Create the method will take two parameter as an email of the card and this method will update the email address with new one. One parameter is old email one is for new email address.
        3- Create the method will take one parameter as a card number and it will remove the card from the list if card number if matching.
        If the card removed it will return true else will return false.
        4- Create the method will take the parameter as a phone number and it will print all card information connected with this phone number.
        5- Create the method will take two parameter as an OldCardNumber and newCardNumber.
        This method will uptade the old card number with new card number
     */

}
