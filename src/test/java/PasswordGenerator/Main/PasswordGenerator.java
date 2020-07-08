package PasswordGenerator.Main;

	/**
	 * This is utility class which will generate random password
	 * and will encrypt and decrypt passwords.
	 */
public class PasswordGenerator {
	
	public static void main(String[] args) {
		PasswordGenerator pg = new PasswordGenerator();
		System.out.println("------getRandomUppercaseLetters-----");
		System.out.println(pg.getRandomUppercaseLetters(3));

		System.out.println("------getRandomLowercaseLetters-----");
		System.out.println(pg.getRandomLowercaseLetters(3));

		System.out.println("------getRandomSpecialChars-----");
		System.out.println(pg.getRandomSpecialChars(3));

		System.out.println("------getRandomNumbers-----");
		System.out.println(pg.getRandomNumbers(3));

		System.out.println("------generatePassword-----");
		System.out.println(pg.generatePassword(2, 5, 2, 3));
		
		System.out.println("------encryptChar-----");
		System.out.println(pg.encryptChar("AAaa"));

		System.out.println("------encryptText-----");
		System.out.println(pg.encryptText("abc123_@gmail.com"));

		System.out.println("------decryptText-----");
		System.out.println(pg.encryptText("HELLO"));

	}
	
	public String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	public String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
	public String specialChars = "!@#$%^&*(_";
	public String numbers = "0123456789";
	
	String upperCipherAlphabet = "PHQGIUMEAYLNOFDXJKRCVSTZWB";	
	String lowerCipherAlphabet = "phqgiumeaylnofdxjkrcvstzwb";


	/**
	 * Method that accepts a int count and returns that many random 
	 * letters taken from upperCaseLetters variable above that 
	 * count number is. 
	 * 
	 * For example:
	 * 		getRandomUppercaseLetters(5) -> "WIGTO"; returns random 5 letters as a String
	 * 
	 * @param count
	 * @return String
	 */
	
	NumbersUtil numsUtil = new NumbersUtil();
	// Use numsUtil object to get random number that will be
	// random index for char from upperCaseLetters variable above.
	
	public String getRandomUppercaseLetters(int count) { //count 10 ->"HTRRUFKSY"
		//TODO
		// You can generate some random number
		// call the method getRandomInt() --> 5
		// upperCaseLettes.charAt(5) --> F
		// call the method getRandomInt() --> 0
		// upperCaseLettes.charAt(0) --> A
		// FANJSFNKJ
		
		String result="";
		for(int i=0; i<count; i++) {
			result+= upperCaseLetters.charAt(numsUtil.getRandomInt(26));
		}
		
		return result;
	}
	
	/**
	 * Method that accepts a int count and returns that many random 
	 * letters taken from lowerCaseLetters variable above that
	 * count number is.
	 * For Example:
	 * 		getRandomLowercaseLetters(4) -> yvth; return random 4 letters as parameter is 4
	 * 
	 * @param count
	 * @return String
	 */

	public String getRandomLowercaseLetters(int count) {
		
		
		String result="";
		for(int i=0; i<count; i++) {
			result+= lowerCaseLetters.charAt(numsUtil.getRandomInt(26));
		}
		
		return result;
	}
	/**
	 * Method that accepts int count and returns that many random 
	 * characters taken from specialChars variable above that
	 * count number is.
	 * For Example:
	 * 		getRandomSpecialChars(3) -> ?.\; -> return 3 random special chars as parameter is 3
	 * 
	 * @param count
	 * @return String
	 */
	public String getRandomSpecialChars(int count) {
		//TODO
		//public String specialChars = "!@#$%^&*(_";
		
		String result="";
		for(int i=0; i<count; i++) {
			result+= specialChars.charAt(numsUtil.getRandomInt(10));
		}
		
		return result;
		
		
	}
	
	/**
	 * Method that accepts int count and returns that many random 
	 * numbers taken from numbers variable above that 
	 * count number is.
	 * 
	 * For Example:
	 * 		getRandomNumbers(6) -> 763298; -> return 6 random number as parameter is \
	 * 
	 * @param count
	 * @return String
	 */
	
	public String getRandomNumbers(int count) {
		
		String result="";
		for(int i=0; i<count; i++) {
			result+=numbers.charAt(numsUtil.getRandomInt(9));
		}
		return result;
		
		
	
	}

	/**
	 * Write a method that returns a password which is 
	 * mix of uppercase and lowercase letters and special characters,numbers.
	 * This method calls 4 other methods.
	 * 
	 * @param upper - how many uppercase letters -> pass to getRandomUppercaseLetters
	 * @param lower - how many lowercase letters -> pass to getRandomLowercaseLetters
	 * @param special - how many special characters -> pass to getRandomSpecialChars
	 * @param num - how many numbers -> pass to getRandomNumbers
	 * @return String - generated password by using methods above
	 */
	                                 // 2      3             1          2   --> HSytb
	public String generatePassword(int upper, int lower, int special, int num) {
		// getRandomUppercaseLetters(upper), getRandomLowercaseLetters(3)
		
		String result="";
		
		result= getRandomUppercaseLetters(upper)+ getRandomLowercaseLetters(lower)+
				getRandomSpecialChars(special)+ getRandomNumbers(num);
	
		return result;
	}

	
	
	/**
	    Accepts a character and returns encrypted version.
	    Take a character and covert to corresponding character by index
	    upperCaseLetters -> upperCipherAlphabet
		lowerCaseLetters -> lowerCipherAlphabet
		specialChars -> numbers
		numbers -> specialChars
			public String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
				String upperCipherAlphabet = "PHQGIUMEAYLNOFDXJKRCVSTZWB";
				
			public String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
				String lowerCipherAlphabet = "phqgiumeaylnofdxjkrcvstzwb";
				
					public String specialChars = "!@#$%^&*(_";
					     public String numbers = "0123456789";
		For example:
			If letter is "A" -> it will return "P"
			If letter is "T" -> it will return "C"
			If letter is "b" -> it will return "h"
			If letter is "m" -> it will return "o"
			If letter is "5" -> it will return "^"
			If letter is "7" -> it will return "*"
			If letter is "_" -> it will return "9"
			If letter is "$" -> it will return "3"
	 * 
	 * 
	 * @param sChar - character to encrypt
	 * @return
	 */
	public String encryptChar(String sChar) { // A --> P,    E --> I,     Z --> B,     O --> D,   g --> m,     @ --> 1,    8 --> (
		
		String result="";
		
		for(int i=0; i<sChar.length(); i++) {
			if(sChar.charAt(i)>='A' && sChar.charAt(i)<='Z') {
				for(int x=0; x<upperCaseLetters.length(); x++) {
					if(sChar.charAt(i)==upperCaseLetters.charAt(x))
					result+= upperCipherAlphabet.charAt(x);
				}
				
			}else if(sChar.charAt(i)>='a' && sChar.charAt(i)<='z') {
				for(int x=0; x<lowerCaseLetters.length(); x++) {
					if(sChar.charAt(i)==lowerCaseLetters.charAt(x))
						result+= lowerCipherAlphabet.charAt(x);
				}
					
			}else if(sChar.charAt(i)>='0' && sChar.charAt(i)<='9') {
				for(int x=0; x<numbers.length(); x++) {
					if(sChar.charAt(i)==numbers.charAt(x))
						result+= specialChars.charAt(x);
				}
				
			}else {
				for(int a=0; a<specialChars.length(); a++ ) {
						if(sChar.charAt(i)==specialChars.charAt(a)) {
							result+= numbers.charAt(a);
						}			
				}
			}
		}
		
	
		
		return result;
//		(sChar.charAt(i)>='!' && sChar.charAt(i)<='_')
	}
	/**
	 *  Accepts a text and returns encrypted version.
	 *  Take each character and covert to corresponding character by index
	    upperCaseLetters -> upperCipherAlphabet
		lowerCaseLetters -> lowerCipherAlphabet
		specialChars -> numbers
		numbers -> specialChars
		
		For Example:
			encryptText("HELLO") -> it will return "EINND";
			encryptText("345") -> it will return "$%^";
			encryptText("3a5&w") -> it will return "$p^6t";
	 * 
	 * 
	 * @param password
	 * @return
	 */
	public String encryptText(String text) {
       String result="";
		
		for(int i=0; i<text.length(); i++) {
			
			if(text.charAt(i)>='A' && text.charAt(i)<='Z') {
				for(int x=0; x<upperCaseLetters.length(); x++) {
					if(text.charAt(i)==upperCaseLetters.charAt(x))
					result+= upperCipherAlphabet.charAt(x);
				}
				
			}else if(text.charAt(i)>='a' && text.charAt(i)<='z') {
				for(int x=0; x<lowerCaseLetters.length(); x++) {
					if(text.charAt(i)==lowerCaseLetters.charAt(x))
						result+= lowerCipherAlphabet.charAt(x);
				}
					
			}else if(text.charAt(i)>='0' && text.charAt(i)<='9') {
				for(int x=0; x<numbers.length(); x++) {
					if(text.charAt(i)==numbers.charAt(x))
						result+= specialChars.charAt(x);
				}
				
			}else {
				for(int a=0; a<specialChars.length(); a++ ) {
						if(text.charAt(i)==specialChars.charAt(a)) {
							result+= numbers.charAt(a);
						}			
				}
			}
		}
		
		return result;
	}
		/**
	    Accepts a text and returns decrypted version.
	    Take each character and covert to corresponding character by index
	    upperCipherAlphabet -> upperCaseLetters
		lowerCipherAlphabet -> lowerCaseLetters
		numbers -> specialChars
		specialChars -> numbers
		For Example:
			decryptText("EINND") -> it will return "HELLO";
			decryptText("$%^") -> it will return "345";
			decryptText("$p^6t") -> it will return "3a5&w";
	 * 
	 * 
	 * @param encryptedText - characters to decrypt
	 * @return
	 */
	public String decryptText(String encryptedText) {
		 String result="";
			
			for(int i=0; i<encryptedText.length(); i++) {
				if(encryptedText.charAt(i)>='A' && encryptedText.charAt(i)<='Z') {
					for(int x=0; x<upperCaseLetters.length(); x++) {
						if(encryptedText.charAt(i)==upperCipherAlphabet.charAt(x))
						result+= upperCaseLetters.charAt(x);
					}
					
				}else if(encryptedText.charAt(i)>='a' && encryptedText.charAt(i)<='z') {
					for(int x=0; x<lowerCaseLetters.length(); x++) {
						if(encryptedText.charAt(i)==lowerCipherAlphabet.charAt(x))
							result+= lowerCaseLetters.charAt(x);
					}
						
				}else if(encryptedText.charAt(i)>='0' && encryptedText.charAt(i)<='9') {
					for(int x=0; x<numbers.length(); x++) {
						if(encryptedText.charAt(i)==numbers.charAt(x))
							result+= specialChars.charAt(x);
					}
					
				}else {
					for(int a=0; a<specialChars.length(); a++ ) {
							if(encryptedText.charAt(i)==specialChars.charAt(a)) {
								result+= numbers.charAt(a);
							}			
					}
				}
			}
			
			return result;
    }
}
