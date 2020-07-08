package Day06.StringMethods;

public class StrMethods2 {
	public static void main(String[] args) {
		
		String learn = "I am learning Java";
		
		System.out.println(learn.substring(5,13));
		
		// Convert it to Java learning amm I
		
		String word1 = learn.substring(0, 1);
		String word2 = learn.substring(1, 5);
		String word3 = learn.substring(4, 13);
		String word4 = learn.substring(14);
		
        String reversedSentence = word4+ word3 + word2 + word1;		
		System.out.println(reversedSentence);
		
		String javaProgram = "Java Programming Language";
		// PROGRAMMING
		//Method Chaining
		
		//Java Programming Language->Programming -> PROGRAMMING
		System.out.println(javaProgram.substring(5,16).toUpperCase());
		//Java Programming Language->JAVA PROGRAMMING LANGUAGE->PROGRAMMING
		System.out.println(javaProgram.toUpperCase().substring(5,16));
		
		System.out.println(javaProgram.replace("Java","Phyton"));
		
		
	}

}
