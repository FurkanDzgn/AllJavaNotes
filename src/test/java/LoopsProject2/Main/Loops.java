package LoopsProject2.Main;

public class Loops {
	
	/**
	 * Concatenate odd numbers to a String from 0 to 30 with comma in between
	 * and then return that String
	 * Example: 1,3,5,7...
	 * @return String
	 */
	
	public String getOddNumbers() {
	    String sum="";
		for(int i=0; i<=30 ; i++) {
			
			if(i%2==1) {
				sum += i+",";
			}	
		}
		return sum;
				  	
	}
	
	
	/**
	 * Reverse a given String and return it, if they have
	 * space in the beginning and at the end then remove it.
	 * Example:
	 * " Job" -> "boJ"
	 * " Happy " -> "yppaH"
	 * "Sun " -> "nuS"
	 * " Dream Job!" -> "!boJ maerD"
	 * 
	 * @param String
	 * @return String
	 */
	
	public String reverse(String word) {
		String reverseWord="";
	
		for(int i=word.trim().length()-1; i>=0 ; i-- ) {
			reverseWord +=""+word.charAt(i);		
		}
		return reverseWord;
	}
	
	/**
	 * Write a method that will calculate the sum of numbers 
	 * between the range of min and max and those that can 
	 * only be divided by 3 and 5. 
	 * (min and max numbers are included)
	 * 
	 * Example:
	 * 	canDivide3And5(0, 50) -> 15 + 30 + 45 = 90
	 * 
	 * @param min
	 * @param max
	 * @return
	 */
	
	public int canDivide3And5(int min, int max) {
	  int sum=0;
		for( int i=min; i<=max; i++) {
			if(i%3==0 && i%5==0) {
				sum+=i;
			}
		}
		return sum;
	}
	
	/**
	 * Method will accept a sentence which is not separated 
	 * by space and each word starts with upper case.
	 * Method will return separated words with spaces.
	 * Example:
	 * 	separateWords("IWantToLearnJava") -> return "I Want To Learn Java";
	 * 	separateWords("ItIsSunnyOutside") -> return "It Is Sunny Outside";
	 * 
	 * @param sentence
	 * @return 
	 */
	
	public String separateWords(String sentence) {
		String result=""+sentence.charAt(0);;
		String capital=sentence.toUpperCase();
		
		for(int i=1; i<sentence.length(); i++) {
			if(capital.charAt(i)==sentence.charAt(i)) {
				result +=" "+sentence.charAt(i);
			}else {
				result+=sentence.charAt(i);
			}	
		}
		
		return result;
	}
	
	/**
	 * Method will accept a string and will return
	 * only unique letters combined as String.
	 * (return without any space in the beginning and at the end.)
	 * Example:
	 * 	getUniqueLetters("i am happy") -> return "i am hpy";
	 * 	getUniqueLetters(" contribute") -> return "contribue";
	 *  getUniqueLetters(" i want cup of coffee ") -> return "i want cup of e";
	 * 
	 * @param word
	 * @return
	 */
	
	public String getUniqueLetters(String word) {
		String result ="";
		String lowerCase=word.toLowerCase();
		for(int i=0; i<word.length(); i++) {
			String letter = "" + word.charAt(i);
			if(result.contains(letter) && !(letter.equals(" "))) {
				
			}else {
				result+=letter;
			}
			
			
		}
		return result.trim();
	}

}
