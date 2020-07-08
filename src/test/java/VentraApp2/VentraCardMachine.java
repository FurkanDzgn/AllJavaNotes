package VentraApp2;

import java.util.ArrayList;

public class VentraCardMachine {
	 public String location;
	    public ArrayList<VentraCard> allCards;

	    public VentraCardMachine(String location){
	        this.location=location;
	        this.allCards=new ArrayList<VentraCard>();
	    
	    }

	    public boolean addCard(VentraCard card){
	        /*
	        This method will take the parameter as a card and if the card is not registered before it will add to the arraylist
	         */
	    	
	    	boolean isExist = false;
	    	for(int i=0; i<allCards.size(); i++) {
	    		if(allCards.get(i).getCardNumber() == card.getCardNumber()) {
	    			isExist = true;
	    		}
	    	}
	    	if(isExist == false) {
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
	    	for(int i=0; i<cards.size(); i++) {
	    		System.out.println(cards.get(i).getCardNumber()+"\n");
	    	}
	    }

	    public boolean updateCard(VentraCard oldCard, VentraCard newCard){

	        /*
	        this method will update the old card with new card, if it is updated return true else return false
	         */
//	    	long oldcard = oldCard.getCardNumber();
//	    	long newcard = newCard.getCardNumber();
//	    	
//	    	oldcard = newcard;
	    		
	    	boolean uptated = true;
	    	
	    	if(oldCard.getCardNumber() == newCard.getCardNumber()) {
	    		uptated = false;
	    	}else {
	    		oldCard.setCardNumber(newCard.getCardNumber());
	    	}
	    	
	        return uptated;
	        
	      
	    }
	    
	    /*
        1-Create the method will take parameter as a list of cards and it will print all the card holders name
        2- Create the method will take one parameter as a email of the card and this method will update the email address with new one
        3- Create the method will take one parameter as a card number and it will remove the card from the list if card number if matching.
        If the card removed it will return true else will return false.
        4- Create the method will take the parameter as a phone number and it will print all card information connected with this phone number.
     */
	    
	    public void printNames(ArrayList<VentraCard> cards) {
	    	 
	    	for(int i=0; i<cards.size(); i++) {
	    		System.out.println(cards.get(i).getFullName());
	    	}
	    	
	    }
	    
	    public void uptadeEmail(String email,String newEmail) {
	    	
	    	
	    	for(int i=0; i<allCards.size(); i++) {
	    		if(allCards.get(i).getEmail().equals(email)) {
	    			
	    			allCards.get(i).setEmail(newEmail);	    
	    		}
	    		
	    		
	    	}
	    	
	    }
	    
	    public boolean removedCard(long cardNumber) {
	    	
	    	boolean removed = false;
	    	
	    	for(int i=0; i<allCards.size(); i++) {
	    		
	    		if(cardNumber == allCards.get(i).getCardNumber()) {
	    			allCards.remove(allCards.get(i));
	    			removed = true;
	    		}
	    	}
	    	
	    	return removed;
	    }
	    
	    public void printPhoneNumber(String phoneNumber) {
	    	
	    	for(int i=0; i<allCards.size();i++) {
	    		if(allCards.get(i).getPhoneNumber().equals(phoneNumber)) {
	    			System.out.println(allCards.get(i).getPhoneNumber());
	    		}
	    	}
	    }



	   
	    
	     

}
