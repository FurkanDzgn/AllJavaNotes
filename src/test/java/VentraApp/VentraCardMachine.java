package VentraApp;

//import java.util.ArrayList;
//
//public class VentraCardMachine {
//
//    private String location;
//    private ArrayList<VentraCard> allCards;
//
//    public VentraCardMachine(String location){
//        this.location=location;
//        this.allCards=new ArrayList<VentraCard>();
//
//    }
//
//    public boolean addCard(VentraCard card){
//        /*
//        This method will take the parameter as a card and if the card is not registered before it will add to the arraylist
//         */
//
//    	boolean isExist = false;
//    	for(int i=0; i<allCards.size(); i++) {
//    		if(allCards.get(i).cardNumber() == card.cardNumber()) {
//    			isExist = true;
//    		}
//    	}
//    	if(isExist == false) {
//    		allCards.add(card);
//    		return true;
//    	}
//        return false;
//    }
//
//    public void printCardNumbers(ArrayList <VentraCard> cards){
//
//        /*
//        this method is taking one parameter as a list of cards and it will print all the card number
//         which is available in this list
//         */
//    }
//
//    public boolean updateCard(VentraCard oldCard, VentraCard newCard){
//
//        /*
//        this method will update the old card with new card, if it is updated return true else return false
//         */
//        return false;
//    }
//
//
//
//    /*
//        1-Create the method will take parameter as a list of cards and it will print all the card holders name
//        2- Create the method will take one parameter as a email of the card and this method will update the email address with new one
//        3- Create the method will take one parameter as a card number and it will remove the card from the list if card number if matching.
//        If the card removed it will return true else will return false.
//        4- Create the method will take the parameter as a phone number and it will print all card information connected with this phone number.
//     */
//}
