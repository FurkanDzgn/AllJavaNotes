package Day07.Methods;

public class PracticeMethods {
	/*
	 * Create a method named as lastChar
	 * Method will accept one String parameter
	 * and will return char primitive as
	 * last character of String
	 * Example:
	 *       "keyboard" -> 'd'
	 *       
	 */
        //access modifier -> public 
	    public char lastChar(String word) {
	    	// last character of parameter word
	    	//charAt(lastIndex)
	    	int lastIndex = word.length()-1; // Hello -> 5 lastIndex is 4,  
	    	                                 //number -> 6 lastIndex is 5,\
	    	char lastChar = word.charAt(lastIndex);
	    	return lastChar;
	    }
	    
	    /*
	     * Create a method names as firstCharIsA
	     * method will accept one String parameter as word
	     * it will return a boolean 
	     * if word start with A iw will return true, otherwise false
	     * Example:
	     *      Techtorial -> false
	     *      Adam -> true
	     */
	    public boolean firstCharIsA(String name) {
	    	// name.charAt(0);
	    	char firstChar = name.toUpperCase().charAt(0); // apple -> APPLE -> 'A'
	    	boolean result = firstChar == 'A'; // Hello -> H == A -> false
	    	return result;
	    	
	    }
	    public static void main(String[] args) {
	    	PracticeMethods pm = new PracticeMethods(); // pm -> object
	    	
	    	char lastChar = pm.lastChar("SDET");
	    	System.out.println(lastChar);
	    	
	    	boolean firstA = pm.firstCharIsA("apple"); //
	    	System.out.println(firstA);
	    	
	    	boolean firstA2 = pm.firstCharIsA("Software");
	    	
	    	System.out.println(firstA2);
	    	
		}
}
