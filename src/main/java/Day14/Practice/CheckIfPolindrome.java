package Day14.Practice;

import java.util.Scanner;

public class CheckIfPolindrome {
	
	/*
	 * civic
	 * level
	 * Bob -> boB
	 * car -> not polindrome
	 * table -> elbat not polindrome
	 * 
	 */
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a polindrome word:");
		
		String word = input.next();
		
		/*
		 * 1.I will reverse the word
		 * 2.I will check if that word is equals to entered word.
		 */
		
		String reversed ="";
		int lastIndex=word.length()-1;
		
		for( ; lastIndex>=0; lastIndex--) {
			reversed = reversed + word.charAt(lastIndex);
		}
		if(word.equalsIgnoreCase(reversed)) {
			System.out.println("This is Palindrome word!");
		}else {
			System.out.println("Not Palindrome!");
		}
		System.out.println(reversed);
		
//		boolean result = word.equalsIgnoreCase(reversed);
//		System.out.println(result);
	}

}
