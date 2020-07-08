package Day13_Loops.PracticeLoops;

import java.util.Scanner;

public class TwoLetters {
	
	/*
	 * Word will be entered with scanner
	 * Ex:Computer
	 * 
	 * Co
	 * mp
	 * ut
	 * er
	 */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a word: ");
		String str=input.next();
		
		//01234567
		//COmputer
		//str.substring(0,2), str.substring(2,4),str.substring(4,6),str.substring(6,8)
		
		
		int secondIndex=2; // secondIndex -2 = 0,
		
		for(; secondIndex<=str.length(); secondIndex+=2) {
			System.out.println(str.substring(secondIndex-2,secondIndex));
		}
		if(str.length()%2==1) {
			System.out.println(str.charAt(str.length()-1));
		}
		
	}

}
