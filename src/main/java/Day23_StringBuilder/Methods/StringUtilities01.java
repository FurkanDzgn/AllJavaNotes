package Day23_StringBuilder.Methods;

public class StringUtilities01 {
	
	/*
	 * Create a method that will accept String as a parameter 
	 * Then will check if that String is in upper or not
	 *if Uppercase it will return true
	 *if lowecase it will return false
	 */
	
	// Once method reach to any return statement it will terminate the method completely
	
	/**===(Documention comment)===
	 * This method will accept a String word as a parameter 
	 * and will check if that word is in check 
	 * 
	 * @param word
	 * @return boolean
	 */
	public boolean isUppercase(String word) {
		
		if(word.equals(word.toUpperCase())) 
			return true;  // if will work until semicolon
		
		
		return false;
		
//		return word.equals(word.toUpperCase()); // --> 2.way
	}
	//If word is starts with uppercase and  the letters in lowercase
	// Google, Hello, Government, ...... -> capatialized letters
	
	
	/**
	 * This method will accept a word and will check if that word is capitialized word.
	 * @param word
	 * @return
	 */
	public boolean isCapatializedWord(String word) {
	//     G              equals            G      ->    G	
	if(word.substring(0,1).equals(word.substring(0,1).toUpperCase()) &&
			//  oogle        equals       oogle       ->  oogle
			word.substring(1).equals(word.substring(1).toLowerCase()) ) {
		return true;
	}		
	return false;
	}
	
	
	
}
